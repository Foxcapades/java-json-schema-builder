package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.ArrayChildSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayChildSchemaImplTest extends ArraySchemaImplTest
{
  public static final ObjectMapper JSON = new ObjectMapper();

  private SchemaBuilder parent;
  private ArrayChildSchema test;
  private SchemaBuilder setVal;

  @Override
  protected ArrayChildSchema test()
  {
    return test;
  }

  @Override
  @BeforeEach
  void setUp()
  {
    parent = new SchemaBuilderImpl(JSON, JSON.createObjectNode());
    test = new ArrayChildSchemaImpl<>(parent, JSON, JSON.createObjectNode(),
      v -> setVal = v);
  }

  @Test
  void close()
  {
    assertSame(parent, test().close());
    assertSame(test(), setVal);
  }
}
