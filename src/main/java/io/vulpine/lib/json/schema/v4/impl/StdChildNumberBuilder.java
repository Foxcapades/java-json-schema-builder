package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.ChildNumberBuilder;
import io.vulpine.lib.json.schema.v4.SchemaNode;

class StdChildNumberBuilder<P extends SchemaNode>
extends StdNumberBuilder<ChildNumberBuilder<P>>
implements ChildNumberBuilder<P>
{
  private final P parent;

  StdChildNumberBuilder(P parent, ObjectMapper mapper, ObjectNode schema) {
    super(mapper, schema);
    this.parent = parent;
  }

  @Override
  public P close() {
    return parent;
  }
}
