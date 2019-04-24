package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.Format;
import io.vulpine.lib.json.schema.v4.JsonType;
import io.vulpine.lib.json.schema.v4.StringBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdStringBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();
  private ObjectNode raw;
  private StringBuilder<?> type;

  @BeforeEach
  void setUp()
  {
    raw = JSON.createObjectNode();
    type = new StdStringBuilder(JSON, raw);
  }

  @Test
  void constructor1()
  {
    var a = new StdStringBuilder<>(JSON).render();
    assertTrue(a.has(TYPE));
    assertEquals(JsonType.STRING.jsonName(), a.get(TYPE).asText());
  }

  @Test
  void constructor2()
  {
    var a = new StdStringBuilder<>(JSON, JSON.createObjectNode()).render();
    assertTrue(a.has(TYPE));
    assertEquals(JsonType.STRING.jsonName(), a.get(TYPE).asText());
  }

  @Test
  void defaultValue()
  {
    var a = "test";
    var b = type.defaultValue(a).render();
    assertTrue(b.has(DEFAULT));
    assertEquals(a, b.get(DEFAULT).asText());
  }

  @Test
  void maxLength_int()
  {
    var a = 1;
    var b = type.maxLength(a).render();
    assertTrue(b.has(MAX_LENGTH));
    assertEquals(a, b.get(MAX_LENGTH).intValue());
  }

  @Test
  void maxLength_long()
  {
    var a = 1L;
    var b = type.maxLength(a).render();
    assertTrue(b.has(MAX_LENGTH));
    assertEquals(a, b.get(MAX_LENGTH).longValue());
  }

  @Test
  void maxLength_bigInt()
  {
    var a = new BigInteger("1");
    var b = type.maxLength(a).render();
    assertTrue(b.has(MAX_LENGTH));
    assertEquals(a, b.get(MAX_LENGTH).bigIntegerValue());
  }

  @Test
  void clearMaxLength()
  {
    assertFalse(type.maxLength(1).clearMaxLength().render().has(MAX_LENGTH));
  }

  @Test
  void removeMaxLength()
  {
    assertFalse(type.maxLength(1).removeMaxLength().render().has(MAX_LENGTH));
  }

  @Test
  void minLength_int()
  {
    var a = 1;
    var b = type.minLength(a).render();
    assertTrue(b.has(MIN_LENGTH));
    assertEquals(a, b.get(MIN_LENGTH).intValue());
  }

  @Test
  void minLength_long()
  {
    var a = 1L;
    var b = type.minLength(a).render();
    assertTrue(b.has(MIN_LENGTH));
    assertEquals(a, b.get(MIN_LENGTH).longValue());
  }

  @Test
  void minLength_bigInt()
  {
    var a = new BigInteger("1");
    var b = type.minLength(a).render();
    assertTrue(b.has(MIN_LENGTH));
    assertEquals(a, b.get(MIN_LENGTH).bigIntegerValue());
  }

  @Test
  void clearMinLength()
  {
    assertFalse(type.minLength(1).clearMinLength().render().has(MIN_LENGTH));
  }

  @Test
  void removeMinLength()
  {
    assertFalse(type.minLength(1).removeMinLength().render().has(MIN_LENGTH));
  }

  @Test
  void pattern()
  {
    var a = "a";
    var b = type.pattern(a).render();
    assertTrue(b.has(PATTERN));
    assertEquals(a, b.get(PATTERN).textValue());
  }

  @Test
  void clearPattern()
  {
    assertFalse(type.pattern("a").clearPattern().render().has(PATTERN));
  }

  @Test
  void removePattern()
  {
    assertFalse(type.pattern("a").removePattern().render().has(PATTERN));
  }

  @Test
  void enumValues()
  {
    assertNotNull(type.enumValues("a", "b"));
    assertTrue(raw.has(ENUM));
    assertTrue(raw.get(ENUM).isArray());
    assertEquals(2, raw.get(ENUM).size());
    assertEquals("a", raw.get(ENUM).get(0).textValue());
    assertEquals("b", raw.get(ENUM).get(1).textValue());
  }

  @Nested
  @DisplayName("format(Format)")
  class format_format
  {
    @DisplayName("Appends the string value for the named format to the schema object")
    @ParameterizedTest(name = "Appends the string value for the named format {0} to the schema object")
    @EnumSource(Format.class)
    void format(Format format)
    {
      assertNotNull(type.format(format));
      assertEquals(format.jsonValue(), raw.get(FORMAT).textValue());
    }
  }

  @Nested
  @DisplayName("format(String)")
  class format_string
  {
    @Test
    @DisplayName("Appends the string value for the named format to the schema object")
    void format()
    {
      assertNotNull(type.format("foo"));
      assertEquals("foo", raw.get(FORMAT).textValue());
    }
  }

  @Nested
  @DisplayName("removeFormat()")
  class clearFormat
  {
    @BeforeEach
    void setUp()
    {
      raw.put(FORMAT, "something");
    }

    @Test
    @DisplayName("Removes the \"format\" property from the schema object")
    void test()
    {
      assertNotNull(type.removeFormat());
      assertFalse(raw.has(FORMAT));
    }

    @Test
    @DisplayName("Removes the \"format\" property from the schema object")
    void test1()
    {
      assertNotNull(type.clearFormat());
      assertFalse(raw.has(FORMAT));
    }
  }
}
