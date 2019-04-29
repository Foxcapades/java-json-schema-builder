package io.vulpine.lib.json.schema.v4.impl;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.IntegerChildSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class IntegerChildSchemaImplTest extends IntegerSchemaImplTest
{
  private IntegerChildSchema test;
  private SchemaBuilder parent;
  private SchemaBuilder setVal;

  @Override
  protected IntegerChildSchema test()
  {
    return test;
  }

  @Override
  @BeforeEach
  void setUp()
  {
    parent = new SchemaBuilderImpl(JSON, JSON.createObjectNode());
    test   = new IntegerChildSchemaImpl<>(parent, JSON, JSON.createObjectNode(),
      v -> setVal = v);
  }

  @Test
  void close()
  {
    assertSame(parent, test().close());
    assertSame(test(), setVal);
  }
}
