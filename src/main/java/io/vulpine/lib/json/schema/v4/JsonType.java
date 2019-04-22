package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum JsonType {
  ARRAY,
  BOOLEAN,
  INTEGER,
  NULL,
  NUMBER,
  OBJECT,
  STRING;

  @JsonValue
  public String jsonName() {
    return name().toLowerCase();
  }

  public static boolean isJsonName(String name) {
    return name != null
      && Arrays.stream(values()).map(JsonType::jsonName).anyMatch(name::equals);
  }

  public static JsonType fromJsonName(String name) {
    return JsonType.valueOf(name.toUpperCase());
  }
}
