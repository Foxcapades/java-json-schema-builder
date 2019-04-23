package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdSchemaBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  StdSchemaBuilder<?> type;

  @BeforeEach
  void setUp()
  {
    type = new StdSchemaBuilder<>(JSON);
  }

  @Test
  void asArray()
  {
    type.schema.put("A", "B");
    var a = type.asArray().render();
    assertEquals(JsonType.ARRAY.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
  }

  @Test
  void asBoolean()
  {
    type.schema.put("A", "B");
    var a = type.asBoolean().render();
    assertEquals(JsonType.BOOLEAN.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
  }

  @Test
  void asInteger()
  {
    type.schema.put("A", "B");
    var a = type.asInteger().render();
    assertEquals(JsonType.INTEGER.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
  }

  @Test
  void asNull()
  {
    type.schema.put("A", "B");
    var a = type.asNull().render();
    assertEquals(JsonType.NULL.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
  }

  @Test
  void asNumber()
  {
    type.schema.put("A", "B");
    var a = type.asNumber().render();
    assertEquals(JsonType.NUMBER.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
  }

  @Test
  void asObject()
  {
    type.schema.put("A", "B");
    var a = type.asObject().render();
    assertEquals(JsonType.OBJECT.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
  }

  @Test
  void asString()
  {
    type.schema.put("A", "B");
    var a = type.asString().render();
    assertEquals(JsonType.STRING.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
  }

  @Nested
  @DisplayName("oneOf()")
  class oneOf
  {
    @Test
    @DisplayName("Passes previous values to result")
    void test1()
    {
      var a = new StdSchemaBuilder<>(JSON)
        .id("test")
        .oneOf()
        .render();
      assertTrue(a.has(ID));
      assertEquals("test", a.get(ID).textValue());
    }

    @Test
    @DisplayName("Does not allow the return value to mutate own internals")
    void test2()
    {
      type.oneOf().addArray();
      var b = type.render();
      assertFalse(b.has(ONE_OF));
    }
  }

  @Nested
  @DisplayName("allOf()")
  class allOf
  {
    @Test
    @DisplayName("Passes previous values to result")
    void test1()
    {
      var a = new StdSchemaBuilder<>(JSON)
        .id("test")
        .allOf()
        .render();
      assertTrue(a.has(ID));
      assertEquals("test", a.get(ID).textValue());
    }

    @Test
    @DisplayName("Does not allow the return value to mutate own internals")
    void test2()
    {
      type.allOf().addArray();
      var b = type.render();
      assertFalse(b.has(ONE_OF));
    }
  }

  @Nested
  @DisplayName("anyOf()")
  class anyOf
  {
    @Test
    @DisplayName("Passes previous values to result")
    void test1()
    {
      var a = new StdSchemaBuilder<>(JSON)
        .id("test")
        .anyOf()
        .render();
      assertTrue(a.has(ID));
      assertEquals("test", a.get(ID).textValue());
    }

    @Test
    @DisplayName("Does not allow the return value to mutate own internals")
    void test2()
    {
      type.anyOf().addArray();
      var b = type.render();
      assertFalse(b.has(ONE_OF));
    }
  }
}
