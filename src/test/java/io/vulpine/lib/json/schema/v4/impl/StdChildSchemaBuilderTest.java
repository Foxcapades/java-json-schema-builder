package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

class StdChildSchemaBuilderTest
{

  private static final ObjectMapper JSON = new ObjectMapper();

  StdSchemaObject<?> parent;
  StdChildSchemaBuilder<?> type;
  ObjectNode raw;

  @BeforeEach
  void setUp()
  {
    parent = new StdSchemaObject<>(JSON);
    raw = JSON.createObjectNode();
    type = new StdChildSchemaBuilder<>(parent, JSON, raw);
  }

  @Test
  void asArray()
  {
    type.schema.put("A", "B");
    var a = type.asArray().render();
    assertEquals(JsonType.ARRAY.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
    assertSame(parent, type.close());
  }

  @Test
  void asBoolean()
  {
    type.schema.put("A", "B");
    var a = type.asBoolean().render();
    assertEquals(JsonType.BOOLEAN.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
    assertSame(parent, type.close());
  }

  @Test
  void asInteger()
  {
    type.schema.put("A", "B");
    var a = type.asInteger().render();
    assertEquals(JsonType.INTEGER.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
    assertSame(parent, type.close());
  }

  @Test
  void asNull()
  {
    type.schema.put("A", "B");
    var a = type.asNull().render();
    assertEquals(JsonType.NULL.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
    assertSame(parent, type.close());
  }

  @Test
  void asNumber()
  {
    type.schema.put("A", "B");
    var a = type.asNumber().render();
    assertEquals(JsonType.NUMBER.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
    assertSame(parent, type.close());
  }

  @Test
  void asObject()
  {
    type.schema.put("A", "B");
    var a = type.asObject().render();
    assertEquals(JsonType.OBJECT.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
    assertSame(parent, type.close());
  }

  @Test
  void asString()
  {
    type.schema.put("A", "B");
    var a = type.asString().render();
    assertEquals(JsonType.STRING.jsonName(), a.get(TYPE).textValue());
    assertEquals("B", a.get("A").textValue());
    assertSame(parent, type.close());
  }
}
