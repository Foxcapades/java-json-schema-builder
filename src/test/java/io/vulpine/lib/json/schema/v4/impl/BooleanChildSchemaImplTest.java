package io.vulpine.lib.json.schema.v4.impl;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.BooleanChildSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class BooleanChildSchemaImplTest extends BooleanSchemaImplTest
{
  private BooleanChildSchema test;
  private SchemaBuilder parent;
  private SchemaBuilder setVal;

  @Override
  protected BooleanChildSchema test()
  {
    return test;
  }

  @BeforeEach
  void setUp()
  {
    parent = new SchemaBuilderImpl(JSON, JSON.createObjectNode());
    test = new BooleanChildSchemaImpl<>(parent, JSON, JSON.createObjectNode(),
      v -> setVal = v);
  }

  @Test
  void close()
  {
    assertSame(parent, test().close());
    assertSame(test(), setVal);
  }
}
