package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.BooleanChildSchema;
import io.vulpine.lib.json.schema.v4.BooleanSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BooleanSchemaImplTest
{
  public static final ObjectMapper JSON = new ObjectMapper();

  private BooleanSchema test;

  protected BooleanSchema test()
  {
    return test;
  }

  @BeforeEach
  void setUp()
  {
    test = new BooleanSchemaImpl(JSON, JSON.createObjectNode());
  }

  @Test
  void defaultValue()
  {
    assertSame(test(), test().defaultValue(true));
    assertEquals("{\"type\":\"boolean\",\"default\":true}", test().toString());
  }

  @Test
  void removeDefault()
  {
    assertSame(test(), test().defaultValue(true).removeDefault());
    assertEquals("{\"type\":\"boolean\"}", test().toString());
  }

}
