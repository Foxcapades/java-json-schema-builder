package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.ChildStringBuilder;
import io.vulpine.lib.json.schema.v4.SchemaNode;

class StdChildStringBuilder<P extends SchemaNode>
extends StdStringBuilder<ChildStringBuilder<P>>
implements ChildStringBuilder<P>
{
  private final P parent;

  StdChildStringBuilder(P parent, ObjectMapper mapper, ObjectNode schema) {
    super(mapper, schema);
    this.parent = parent;
  }

  @Override
  public P close() {
    return parent;
  }
}
