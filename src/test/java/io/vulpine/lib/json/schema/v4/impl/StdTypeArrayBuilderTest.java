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
    type = new StdTypeArrayBuilder<>(new StdSchemaObject<>(JSON), JSON);
  }

  @Test
  void addArray()
  {
    var a = type.addArray();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.ARRAY.jsonName(),
      type.build().get(0).get(TYPE).textValue());
  }

  @Test
  void addBoolean()
  {
    var a = type.addBoolean();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.BOOLEAN.jsonName(),
      type.build().get(0).get(TYPE).textValue());
  }

  @Test
  void addInteger()
  {
    var a = type.addInteger();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.INTEGER.jsonName(),
      type.build().get(0).get(TYPE).textValue());
  }

  @Test
  void addNull()
  {
    var a = type.addNull();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.NULL.jsonName(),
      type.build().get(0).get(TYPE).textValue());
  }

  @Test
  void addNumber()
  {
    var a = type.addNumber();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.NUMBER.jsonName(),
      type.build().get(0).get(TYPE).textValue());
  }

  @Test
  void addObject()
  {
    var a = type.addObject();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.OBJECT.jsonName(),
      type.build().get(0).get(TYPE).textValue());
  }

  @Test
  void addString()
  {
    var a = type.addString();
    assertNotNull(a);
    assertSame(type, a.close());
    assertEquals(JsonType.STRING.jsonName(),
      type.build().get(0).get(TYPE).textValue());
  }

  @Test
  void add()
  {
    type.add(Draft4.newBuilder().asObject());
    var a = type.build();
    assertTrue(a.has(0));
    assertEquals(JsonType.OBJECT.jsonName(), a.get(0).get(TYPE).textValue());
    assertFalse(a.get(0).has($SCHEMA));
  }

  @Test
  void close()
  {
    var a = new StdSchemaObject<>(JSON);
    assertSame(a, new StdTypeArrayBuilder<>(a, JSON).close());
  }

  @Test
  void render()
  {
    var a = type.build();
    type.addString();
    assertEquals(0, a.size());
  }
}
