package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.BooleanBuilder;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.DEFAULT;
import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

class StdBooleanBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();
  private BooleanBuilder<?> type;

  @BeforeEach
  void setUp()
  {
    type = new StdBooleanBuilder<>(JSON);
  }

  @Test
  void constructor1()
  {
    assertEquals(JsonType.BOOLEAN.jsonName(),
      new StdBooleanBuilder(JSON).build().get(TYPE).asText());
  }

  @Test
  void constructor2()
  {
    assertEquals(JsonType.BOOLEAN.jsonName(),
      new StdBooleanBuilder(JSON, JSON.createObjectNode())
        .build().get(TYPE).asText());
  }

  @Test
  void defaultValue()
  {
    assertTrue(type.defaultValue(true).build().get(DEFAULT).asBoolean());
    assertFalse(type.defaultValue(false).build().get(DEFAULT).asBoolean());
  }
}
