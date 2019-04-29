package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.ID;
import static org.junit.jupiter.api.Assertions.*;

class NullSchemaImplTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private ObjectNode node;

  private NullSchemaImpl test;

  @BeforeEach
  void setUp()
  {
    node = JSON.createObjectNode();
    test = new NullSchemaImpl(JSON, node);
  }

  @Test
  void id()
  {
    assertNotNull(test.id("foo"));
    assertTrue(node.has(ID));
    assertEquals("foo", node.get(ID).textValue());
  }

  @Test
  void removeId()
  {
    node.put(ID, "foo");
    assertNotNull(test.removeId());
    assertFalse(node.has(ID));
  }

  @Test
  void $schema()
  {
  }

  @Test
  void remove$Schema()
  {
  }

  @Test
  void $ref()
  {
  }

  @Test
  void remove$Ref()
  {
  }

  @Test
  void description()
  {
  }

  @Test
  void removeDescription()
  {
  }

  @Test
  void title()
  {
  }

  @Test
  void removeTitle()
  {
  }

  @Test
  void removeDefault()
  {
  }

  @Test
  void removeEnum()
  {
  }

  @Test
  void definition()
  {
  }

  @Test
  void definition1()
  {
  }

  @Test
  void removeDefinition()
  {
  }

  @Test
  void removeDefinitions()
  {
  }

  @Test
  void defaultValue()
  {
  }
}
