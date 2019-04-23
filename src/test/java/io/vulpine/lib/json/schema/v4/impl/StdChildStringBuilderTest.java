package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

class StdChildStringBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  @Test
  void constructor()
  {
    var a = new StdChildStringBuilder<>(new StdSchemaObject<>(JSON), JSON,
      JSON.createObjectNode()).render();
    assertTrue(a.has(TYPE));
    assertEquals(JsonType.STRING.jsonName(), a.get(TYPE).textValue());
  }

  @Test
  void close()
  {
    var a = new StdSchemaObject<>(JSON);
    assertSame(a, new StdChildStringBuilder<>(a, JSON, JSON.createObjectNode())
      .close());
  }
}
