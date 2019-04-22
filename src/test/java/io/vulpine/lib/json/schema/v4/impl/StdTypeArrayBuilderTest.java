package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.Draft4;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.$SCHEMA;
import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

class StdTypeArrayBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private StdTypeArrayBuilder<?> type;

  @BeforeEach
  void setUp()
  {
    type = new StdTypeArrayBuilder<>(new StdSchemaNode<>(JSON), JSON);
  }

  @Test
  void addArray()
  {
    var a = type.addArray();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.ARRAY.jsonName(),
      type.render().get(0).get(TYPE).textValue());
  }

  @Test
  void addBoolean()
  {
    var a = type.addBoolean();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.BOOLEAN.jsonName(),
      type.render().get(0).get(TYPE).textValue());
  }

  @Test
  void addInteger()
  {
    var a = type.addInteger();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.INTEGER.jsonName(),
      type.render().get(0).get(TYPE).textValue());
  }

  @Test
  void addNull()
  {
    var a = type.addNull();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.NULL.jsonName(),
      type.render().get(0).get(TYPE).textValue());
  }

  @Test
  void addNumber()
  {
    var a = type.addNumber();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.NUMBER.jsonName(),
      type.render().get(0).get(TYPE).textValue());
  }

  @Test
  void addObject()
  {
    var a = type.addObject();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.OBJECT.jsonName(),
      type.render().get(0).get(TYPE).textValue());
  }

  @Test
  void addString()
  {
    var a = type.addString();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.STRING.jsonName(),
      type.render().get(0).get(TYPE).textValue());
  }

  @Test
  void add()
  {
    var a = type.internal();
    type.add(Draft4.newBuilder().asObject());
    assertTrue(a.has(0));
    assertEquals(JsonType.OBJECT.jsonName(), a.get(0).get(TYPE).textValue());
    assertFalse(a.get(0).has($SCHEMA));
  }

  @Test
  void close()
  {
    var a = new StdSchemaNode<>(JSON);
    assertSame(a, new StdTypeArrayBuilder<>(a, JSON).close());
  }

  @Test
  void internal()
  {
    var a = type.internal();
    type.addString();
    assertEquals(JsonType.STRING.jsonName(), a.get(0).get(TYPE).textValue());
  }

  @Test
  void render()
  {
    var a = type.render();
    type.addString();
    assertEquals(0, a.size());
  }
}
