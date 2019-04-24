package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

class StdChildNullBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  @Test
  void constructor()
  {
    var a = new StdChildNullBuilder<>(new StdSchemaObject<>(JSON), JSON,
      JSON.createObjectNode()).build();
    assertTrue(a.has(TYPE));
    assertEquals(JsonType.NULL.jsonName(), a.get(TYPE).textValue());
  }

  @Test
  void close()
  {
    var a = new StdSchemaObject<>(JSON);
    assertSame(a, new StdChildNullBuilder<>(a, JSON, JSON.createObjectNode())
      .close());
  }
}
