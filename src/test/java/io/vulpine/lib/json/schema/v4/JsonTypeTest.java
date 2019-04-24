package io.vulpine.lib.json.schema.v4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class JsonTypeTest
{
  @ParameterizedTest()
  @EnumSource(JsonType.class)
  void isJsonName(final JsonType type)
  {
    for (var a : JsonType.values())
      assertTrue(JsonType.isJsonName(a.jsonName()));
  }

  @Test
  void isJsonName()
  {
    assertFalse(JsonType.isJsonName("something"));
    assertFalse(JsonType.isJsonName(null));
  }


  @Test
  void fromJsonName()
  {
    assertSame(JsonType.BOOLEAN,
      JsonType.fromJsonName(JsonType.BOOLEAN.jsonName()));
  }
}
