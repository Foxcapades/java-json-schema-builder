package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.ChildNullBuilder;
import io.vulpine.lib.json.schema.v4.SchemaNode;

class StdChildNullBuilder<P extends SchemaNode>
extends StdNullBuilder<ChildNullBuilder<P>>
implements ChildNullBuilder<P>
{
  private final P parent;

  StdChildNullBuilder(P parent, ObjectMapper mapper, ObjectNode schema) {
    super(mapper, schema);
    this.parent = parent;
  }

  @Override
  public P close() {
    return parent;
  }
}
