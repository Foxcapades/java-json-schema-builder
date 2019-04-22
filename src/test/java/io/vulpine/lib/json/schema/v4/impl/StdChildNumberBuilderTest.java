package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

class StdChildNumberBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  @Test
  void constructor()
  {
    var a = new StdChildNumberBuilder<>(new StdSchemaNode<>(JSON), JSON,
      JSON.createObjectNode()).render();
    assertTrue(a.has(TYPE));
    assertEquals(JsonType.NUMBER.jsonName(), a.get(TYPE).textValue());
  }

  @Test
  void close()
  {
    var a = new StdSchemaNode<>(JSON);
    assertSame(a, new StdChildNumberBuilder<>(a, JSON, JSON.createObjectNode())
      .close());
  }
}