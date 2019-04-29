package io.vulpine.lib.json.schema.v4.impl;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.UntypedChildSchema;
import io.vulpine.lib.json.schema.v4.UntypedSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class UntypedChildSchemaImplTestImpl extends UntypedSchemaImplTest
{
  private UntypedChildSchema test;
  private SchemaBuilder parent;
  private SchemaBuilder setVal;

  @Override
  protected UntypedChildSchema test()
  {
    return test;
  }

  @Override
  @BeforeEach
  void setUp()
  {
    parent = new SchemaBuilderImpl(JSON, JSON.createObjectNode());
    test = new UntypedChildSchemaImpl<>(parent, JSON, JSON.createObjectNode(),
      x -> setVal = x);
  }

  @Test
  void close()
  {
    assertSame(parent, test().close());
    assertSame(setVal, test());
  }
}
