package io.vulpine.lib.json.schema.v4.impl;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.StringChildSchema;
import io.vulpine.lib.json.schema.v4.StringSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class StringChildSchemaImplTestImpl extends StringSchemaImplTest
{
  private StringChildSchema x;

  private SchemaBuilder parent;
  private SchemaBuilder setVal;

  @Override
  @BeforeEach
  void setUp()
  {
    parent = new SchemaBuilderImpl(JSON, JSON.createObjectNode());
    x = new StringChildSchemaImpl<>(parent, JSON, JSON.createObjectNode(),
      v -> setVal = v);
  }

  @Override
  protected StringChildSchema test()
  {
    return x;
  }

  @Test
  void close()
  {
    assertSame(parent, test().close());
    assertSame(test(), setVal);
  }
}
