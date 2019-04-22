package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.JsonType;
import io.vulpine.lib.json.schema.v4.lib.Keys;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StdNullBuilderTest {
  private static final ObjectMapper JSON = new ObjectMapper();

  @Test
  void constructor1() {
    assertEquals(JsonType.NULL.jsonName(),
      new StdNullBuilder<>(JSON)
        .render()
        .get(Keys.TYPE)
        .asText());
  }

  @Test
  void constructor2() {
    assertEquals(JsonType.NULL.jsonName(),
      new StdNullBuilder<>(null, JSON.createObjectNode())
        .render()
        .get(Keys.TYPE)
        .asText());
  }
}
