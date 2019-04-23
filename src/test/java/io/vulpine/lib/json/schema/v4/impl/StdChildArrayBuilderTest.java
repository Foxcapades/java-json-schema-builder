package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class StdChildArrayBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  @Test
  void constructor2()
  {
    assertEquals(JsonType.ARRAY.jsonName(), new StdChildArrayBuilder<>(null,
      JSON, JSON.createObjectNode()).render().get(TYPE).asText());
  }

  @Test
  void close()
  {
    final var foo = new StdSchemaObject<>(JSON);
    assertSame(foo, new StdChildArrayBuilder<>(foo, JSON,
      JSON.createObjectNode()).close());
  }
}
