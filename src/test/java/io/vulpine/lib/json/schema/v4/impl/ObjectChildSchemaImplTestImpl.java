package io.vulpine.lib.json.schema.v4.impl;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.ObjectChildSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ObjectChildSchemaImplTestImpl extends ObjectSchemaImplTest
{
  private ObjectChildSchema x;

  private SchemaBuilder parent;

  private SchemaBuilder setVal;

  @Override
  protected ObjectChildSchema test()
  {
    return x;
  }

  @Override
  @BeforeEach
  void setUp()
  {
    parent = new SchemaBuilderImpl(JSON, JSON.createObjectNode());
    x = new ObjectChildSchemaImpl<>(parent, JSON, JSON.createObjectNode(),
      v -> setVal = v);
  }

  @Test
  void close()
  {
    assertSame(parent, test().close());
    assertSame(test(), setVal);
  }
}
