package io.vulpine.lib.json.schema.v4.impl;

import io.vulpine.lib.json.schema.v4.MultiSchema;

public class MultiSchemaImplTest extends SchemaNodeArrayTest<MultiSchema>
{
  private static final String KEY = "key";

  @Override
  protected MultiSchema newTest()
  {
    return new MultiSchemaImpl(JSON, JSON.createObjectNode(), KEY);
  }

  @Override
  protected String wrap(String in)
  {
    return "{\"" + KEY + "\":" + super.wrap(in) + "}";
  }
}
