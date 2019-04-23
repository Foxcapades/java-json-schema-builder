package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Format
{
  DATE_TIME("date-time"),
  EMAIL("email"),
  HOSTNAME("hostname"),
  IPV4("ipv4"),
  IPV6("ipv6"),
  URI("uri");

  public final String jsonValue;

  Format(String jsonValue)
  {
    this.jsonValue = jsonValue;
  }

  @JsonValue
  public String jsonValue()
  {
    return this.jsonValue;
  }
}
