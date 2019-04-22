package io.vulpine.lib.json.schema.v4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonTypeTest
{
  @Test
  void isJsonName()
  {
    for (var a : JsonType.values())
      assertTrue(JsonType.isJsonName(a.jsonName()));
    assertFalse(JsonType.isJsonName("something"));
  }

  @Test
  void fromJsonName()
  {
    assertSame(JsonType.BOOLEAN,
      JsonType.fromJsonName(JsonType.BOOLEAN.jsonName()));
  }
}
