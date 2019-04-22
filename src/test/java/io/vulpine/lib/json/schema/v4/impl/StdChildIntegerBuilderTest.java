package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.*;

class StdChildIntegerBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  @Test
  void constructor1()
  {
    var a = JSON.createObjectNode().put("A", "B");
    var b = new StdChildIntegerBuilder<>(new StdSchemaObject<>(JSON), JSON, a);
    assertEquals(JsonType.INTEGER.jsonName(), b.schema.get(TYPE).textValue());
    assertEquals(a, b.schema);
  }

  @Test
  void close()
  {
    var a = new StdSchemaBuilder<>(JSON).id("foo");
    var b = new StdChildIntegerBuilder<>(a, JSON, JSON.createObjectNode());
    assertSame(a, b.close());
  }
}
