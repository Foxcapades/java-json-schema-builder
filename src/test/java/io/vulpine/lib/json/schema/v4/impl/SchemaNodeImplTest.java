package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

public class SchemaNodeImplTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private ObjectNode node;

  private SchemaNodeImpl test;

  @BeforeEach
  void setUp()
  {
    node = JSON.createObjectNode();
    test = new SchemaNodeImpl(JSON, node);
  }

  @Test
  @DisplayName("sets the type to 'array' if no type is present")
  void sets_type1()
  {
    var b = test.orAsArray().build();
    assertNotNull(b);
    assertTrue(b.has(TYPE));
    assertEquals(JsonType.ARRAY.toJson(), b.get(TYPE));
  }

  @Test
  @DisplayName("sets the type to 'boolean' if no type is present")
  void sets_type2()
  {
    var b = test.orAsBoolean().build();
    assertNotNull(b);
    assertTrue(b.has(TYPE));
    assertEquals(JsonType.BOOLEAN.jsonName(), b.get(TYPE).textValue());
  }

  @Test
  @DisplayName("sets the type to 'integer' if no type is present")
  void sets_type3()
  {
    var b = test.orAsInteger().build();
    assertNotNull(b);
    assertTrue(b.has(TYPE));
    assertEquals(JsonType.INTEGER.jsonName(), b.get(TYPE).textValue());
  }

  @Test
  @DisplayName("sets the type to 'null' if no type is present")
  void sets_type4()
  {
    var b = test.orAsNull().build();
    assertNotNull(b);
    assertTrue(b.has(TYPE));
    assertEquals(JsonType.NULL.jsonName(), b.get(TYPE).textValue());
  }

  @Test
  @DisplayName("sets the type to 'number' if no type is present")
  void sets_type5()
  {
    var b = test.orAsNumber().build();
    assertNotNull(b);
    assertTrue(b.has(TYPE));
    assertEquals(JsonType.NUMBER.toJson(), b.get(TYPE));
  }

  @Test
  @DisplayName("sets the type to 'object' if no type is present")
  void sets_type6()
  {
    var b = test.orAsObject().build();
    assertNotNull(b);
    assertTrue(b.has(TYPE));
    assertEquals(JsonType.OBJECT.jsonName(), b.get(TYPE).textValue());
  }

  @Test
  @DisplayName("sets the type to 'string' if no type is present")
  void sets_type7()
  {
    var b = test.orAsString().build();
    assertNotNull(b);
    assertTrue(b.has(TYPE));
    assertEquals(JsonType.STRING.jsonName(), b.get(TYPE).textValue());
  }

  @Test
  void enumArr()
  {
    assertNotNull(test.enumArr());
    assertEquals("{\"enum\":[]}", test.toString());
  }

  @Test
  void removeEnum()
  {
    test.enumArr();
    assertNotNull(test.removeEnum());
    assertEquals("{}", test.toString());
  }
}
