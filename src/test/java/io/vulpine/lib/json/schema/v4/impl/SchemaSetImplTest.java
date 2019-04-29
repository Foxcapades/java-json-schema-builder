package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.SchemaSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchemaSetImplTest extends SchemaNodeArrayTest<SchemaSet>
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private SchemaBuilderImpl parent;

  @Override
  protected SchemaSet newTest()
  {
    parent = new SchemaBuilderImpl(JSON, JSON.createObjectNode());
    return new SchemaSetImpl<>(parent, JSON, JSON.createArrayNode(), x -> {});
  }

  @Test
  void close()
  {
    assertSame(parent, test().close());
  }

  @Test
  void build()
  {
    assertEquals(test().toString(), test().build().toString());
  }
}
