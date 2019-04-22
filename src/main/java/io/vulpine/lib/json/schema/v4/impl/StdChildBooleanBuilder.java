package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.ChildBooleanBuilder;
import io.vulpine.lib.json.schema.v4.SchemaNode;

class StdChildBooleanBuilder<P extends SchemaNode>
extends StdBooleanBuilder<ChildBooleanBuilder<P>>
implements ChildBooleanBuilder<P>
{
  private final P parent;

  StdChildBooleanBuilder(P parent, ObjectMapper mapper, ObjectNode schema)
  {
    super(mapper, schema);
    this.parent = parent;
  }

  @Override
  public P close() {
    return parent;
  }
}
