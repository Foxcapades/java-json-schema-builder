package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.ChildArrayBuilder;
import io.vulpine.lib.json.schema.v4.SchemaNode;

class StdChildArrayBuilder<P extends SchemaNode>
extends StdArrayBuilder<ChildArrayBuilder<P>>
implements ChildArrayBuilder<P>
{
  private final P parent;

  StdChildArrayBuilder(P parent, ObjectMapper mapper, ObjectNode schema)
  {
    super(mapper, schema);
    this.parent = parent;
  }

  @Override
  public P close()
  {
    return parent;
  }
}
