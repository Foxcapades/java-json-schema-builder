package io.vulpine.lib.json.schema.v4.impl;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.MultiChildSchema;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class MultiChildSchemaImplTest extends SchemaNodeArrayTest<MultiChildSchema>
{
  private static final String KEY = "key";

  private SchemaBuilder parent;
  private SchemaBuilder setVal;

  @Override
  protected String wrap(String in)
  {
    return "{\"" + KEY + "\":" + super.wrap(in) + "}";
  }

  @Override
  protected MultiChildSchema newTest()
  {
    parent = new SchemaBuilderImpl(JSON, JSON.createObjectNode());
    return new MultiChildSchemaImpl<>(parent, JSON, JSON.createObjectNode(),
      KEY, x -> setVal = x);
  }

  @Test
  void close()
  {
    assertSame(parent, test().close());
    assertSame(test(), setVal);
  }
}
