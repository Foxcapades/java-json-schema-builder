package io.vulpine.lib.json.schema;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class JsonTypeTest
{

  @ParameterizedTest
  @EnumSource(JsonType.class)
  void jsonName(JsonType type)
  {
    assertEquals(type.name().toLowerCase(), type.jsonName());
  }

  @ParameterizedTest
  @EnumSource(JsonType.class)
  void isJsonName(JsonType type)
  {
    assertTrue(JsonType.isJsonName(type.jsonName()));
  }

  @ParameterizedTest
  @EnumSource(JsonType.class)
  void fromJsonName(JsonType type)
  {
    assertSame(type, JsonType.fromJsonName(type.jsonName()));
  }

  @ParameterizedTest
  @EnumSource(JsonType.class)
  void toJson(JsonType type)
  {
    assertEquals('"' + type.jsonName() + '"', type.toJson().toString());
  }
}
