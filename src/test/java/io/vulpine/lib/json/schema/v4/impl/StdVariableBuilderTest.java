package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import io.vulpine.lib.json.schema.v4.Draft4;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdVariableBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private ArrayNode raw;
  private StdVariableBuilder<?> type;

  @BeforeEach
  void setUp()
  {
    var tmp = JSON.createObjectNode();
    type = new StdVariableBuilder<>(JSON, tmp, ALL_OF);
    raw  = (ArrayNode) tmp.get(ALL_OF);
  }

  @Test
  void addArray()
  {
    var a = type.addArray();
    assertNotNull(a);
    assertEquals(raw.get(0), a.build());
    assertEquals(JsonType.ARRAY.jsonName(), raw.get(0).get(TYPE).textValue());
  }

  @Test
  void addBoolean()
  {
    var a = type.addBoolean();
    assertNotNull(a);
    assertEquals(raw.get(0), a.build());
    assertEquals(JsonType.BOOLEAN.jsonName(), raw.get(0).get(TYPE).textValue());
  }

  @Test
  void addInteger()
  {
    var a = type.addInteger();
    assertNotNull(a);
    assertEquals(raw.get(0), a.build());
    assertEquals(JsonType.INTEGER.jsonName(), raw.get(0).get(TYPE).textValue());
  }

  @Test
  void addNull()
  {
    var a = type.addNull();
    assertNotNull(a);
    assertEquals(raw.get(0), a.build());
    assertEquals(JsonType.NULL.jsonName(), raw.get(0).get(TYPE).textValue());
  }

  @Test
  void addNumber()
  {
    var a = type.addNumber();
    assertNotNull(a);
    assertEquals(raw.get(0), a.build());
    assertEquals(JsonType.NUMBER.jsonName(), raw.get(0).get(TYPE).textValue());
  }

  @Test
  void addObject()
  {
    var a = type.addObject();
    assertNotNull(a);
    assertEquals(raw.get(0), a.build());
    assertEquals(JsonType.OBJECT.jsonName(), raw.get(0).get(TYPE).textValue());
  }

  @Test
  void addString()
  {
    var a = type.addString();
    assertNotNull(a);
    assertEquals(raw.get(0), a.build());
    assertEquals(JsonType.STRING.jsonName(), raw.get(0).get(TYPE).textValue());
  }

  @Test
  @DisplayName("add(SchemaObject)")
  void add1()
  {
    var a = Draft4.newBuilder().asObject().additionalProperties(true);
    type.add(a);
    assertEquals(1, raw.size());
    assertEquals(a.build(), raw.get(0));
  }

  @Test
  @DisplayName("add()")
  void add2()
  {
    type.add().asObject();
    assertEquals(1, raw.size());
    assertEquals(new StdObjectBuilder<>(JSON, JSON.createObjectNode()).build(),
      raw.get(0));
  }

  @Test
  void render()
  {
    var a = type.build();
    type.addString();
    assertEquals(0, a.get(ALL_OF).size());
  }
}
