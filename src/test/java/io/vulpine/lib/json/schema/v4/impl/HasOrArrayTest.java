package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.JsonType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

class HasOrArrayTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  static SchemaNodeImpl[] orArray()
  {
    return new SchemaNodeImpl[] {
      new BooleanSchemaImpl(JSON, JSON.createObjectNode()),
      new BooleanChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new IntegerSchemaImpl(JSON, JSON.createObjectNode()),
      new IntegerChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new NullSchemaImpl(JSON, JSON.createObjectNode()),
      new NullChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new NumberSchemaImpl(JSON, JSON.createObjectNode()),
      new NumberChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new ObjectSchemaImpl(JSON, JSON.createObjectNode()),
      new ObjectChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new StringSchemaImpl(JSON, JSON.createObjectNode()),
      new StringChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
    };
  }

  @ParameterizedTest
  @MethodSource("orArray")
  @DisplayName("converts the type property to an array containing the " +
    "original value in addition to the value 'array'")
  void converts_to_array(SchemaNodeImpl test)
  {
    test.raw().set(TYPE, JsonType.BOOLEAN.toJson());
    var a = test.orAsArray().build();
    assertNotNull(a);
    assertTrue(a.has(TYPE));
    assertTrue(a.get(TYPE).isArray());
    assertEquals(2, a.get(TYPE).size());
    assertEquals(JsonType.BOOLEAN.jsonName(), a.get(TYPE).get(0).textValue());
    assertEquals(JsonType.ARRAY.jsonName(), a.get(TYPE).get(1).textValue());
  }

  @ParameterizedTest
  @MethodSource("orArray")
  @DisplayName("appends the value 'array' to the array of types")
  void appends_to_array(SchemaNodeImpl test)
  {
    test.raw().putArray(TYPE).add(JsonType.BOOLEAN.toJson());
    var a = test.orAsArray().build();
    assertNotNull(a);
    assertTrue(a.has(TYPE));
    assertTrue(a.get(TYPE).isArray());
    assertEquals(2, a.get(TYPE).size());
    assertEquals(JsonType.BOOLEAN.toJson(), a.get(TYPE).get(0));
    assertEquals(JsonType.ARRAY.toJson(), a.get(TYPE).get(1));
  }
}
