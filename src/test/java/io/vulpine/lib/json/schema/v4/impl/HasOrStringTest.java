package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

class HasOrStringTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  static SchemaNodeImpl[] orString()
  {
    return new SchemaNodeImpl[] {
      new ArraySchemaImpl(JSON, JSON.createObjectNode()),
      new ArrayChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
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
    };
  }

  @ParameterizedTest
  @MethodSource("orString")
  @DisplayName("converts the type property to an array containing the " +
    "original value in addition to the value 'string'")
  void converts_to_array(SchemaNodeImpl test)
  {
    test.raw().put(TYPE, "foo");
    var a = test.orAsString().build();
    assertNotNull(a);
    assertTrue(a.has(TYPE));
    assertTrue(a.get(TYPE).isArray());
    assertEquals(2, a.get(TYPE).size());
    assertEquals("foo", a.get(TYPE).get(0).textValue());
    assertEquals(JsonType.STRING.jsonName(), a.get(TYPE).get(1).textValue());
  }

  @ParameterizedTest
  @MethodSource("orString")
  @DisplayName("appends the value 'string' to the array of types")
  void appends_to_array(SchemaNodeImpl test)
  {
    test.raw().putArray(TYPE).add("foo");
    var a = test.orAsString().build();
    assertNotNull(a);
    assertTrue(a.has(TYPE));
    assertTrue(a.get(TYPE).isArray());
    assertEquals(2, a.get(TYPE).size());
    assertEquals("foo", a.get(TYPE).get(0).textValue());
    assertEquals(JsonType.STRING.jsonName(), a.get(TYPE).get(1).textValue());
  }
}
