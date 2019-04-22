package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.JsonType;
import io.vulpine.lib.json.schema.v4.StringBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdStringBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();
  private StringBuilder<?> type;

  @BeforeEach
  void setUp()
  {
    type = new StdStringBuilder(JSON);
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
  void minLength_int()
  {
    var a = 1;
    var b = type.minLength(a).render();
    assertTrue(b.has(MIN_LENGTH));
    assertEquals(a, b.get(MIN_LENGTH).intValue());
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
}
