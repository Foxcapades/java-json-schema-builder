package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.ChildIntegerBuilder;
import io.vulpine.lib.json.schema.v4.SchemaNode;

class StdChildIntegerBuilder<P extends SchemaNode>
extends StdIntegerBuilder<ChildIntegerBuilder<P>>
implements ChildIntegerBuilder<P>
{
  private final P parent;

  StdChildIntegerBuilder(P parent, ObjectMapper mapper, ObjectNode schema) {
    super(mapper, schema);
    this.parent = parent;
  }

  @Override
  public P close() {
    return parent;
  }
}
