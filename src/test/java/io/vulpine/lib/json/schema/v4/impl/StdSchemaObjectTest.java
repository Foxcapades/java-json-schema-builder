package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.SchemaObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdSchemaObjectTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private ObjectNode raw;
  private SchemaObject<?> type;

  @BeforeEach
  void setUp()
  {
    raw = JSON.createObjectNode();
    type = new StdSchemaObject<>(JSON, raw);
  }

  @Test
  void clearDefaultValue()
  {
    raw.put(DEFAULT, "a");
    type.clearDefaultValue();
    assertFalse(raw.has(DEFAULT));
  }

  @Test
  void id()
  {
    var a = "a";
    type.id(a);
    assertTrue(raw.has(ID));
    assertEquals(a, raw.get(ID).textValue());
  }

  @Test
  void clearId()
  {
    raw.put(ID, "a");
    type.clearId();
    assertFalse(raw.has(ID));
  }

  @Test
  void $schema()
  {
    var a = "a";
    type.$schema(a);
    assertTrue(raw.has($SCHEMA));
    assertEquals(a, raw.get($SCHEMA).textValue());
  }

  @Test
  void clear$Schema()
  {
    raw.put($SCHEMA, "a");
    type.clear$Schema();
    assertFalse(raw.has($SCHEMA));
  }

  @Test
  void $ref()
  {
    var a = "a";
    type.$ref(a);
    assertTrue(raw.has($REF));
    assertEquals(a, raw.get($REF).textValue());
  }

  @Test
  void clear$Ref()
  {
    raw.put($REF, "a");
    type.clear$Ref();
    assertFalse(raw.has($REF));
  }

  @Test
  void description()
  {
    var a = "a";
    type.description(a);
    assertTrue(raw.has(DESC));
    assertEquals(a, raw.get(DESC).textValue());
  }

  @Test
  void clearDescription()
  {
    raw.put(DESC, "a");
    type.clearDescription();
    assertFalse(raw.has(DESC));
  }

  @Test
  void title()
  {
    var a = "a";
    type.title(a);
    assertTrue(raw.has(TITLE));
    assertEquals(a, raw.get(TITLE).textValue());
  }

  @Test
  void clearTitle()
  {
    raw.put(TITLE, "a");
    type.clearTitle();
    assertFalse(raw.has(TITLE));
  }

  @Test
  void render()
  {
    raw.put("A", "B");
    assertEquals("B", type.render().get("A").textValue());
  }

  @Test
  void clearEnum()
  {
    raw.put(ENUM, "");
    type.clearEnumValues();
    assertFalse(raw.has(ENUM));
  }
}
