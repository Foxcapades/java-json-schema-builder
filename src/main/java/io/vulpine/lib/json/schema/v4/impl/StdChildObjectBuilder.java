package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.ChildObjectBuilder;
import io.vulpine.lib.json.schema.v4.SchemaNode;

class StdChildObjectBuilder<P extends SchemaNode>
extends StdObjectBuilder<ChildObjectBuilder<P>>
implements ChildObjectBuilder<P>
{
  private final P parent;

  StdChildObjectBuilder(P parent, ObjectMapper mapper, ObjectNode schema) {
    super(mapper, schema);
    this.parent = parent;
  }

  @Override
  public P close() {
    return parent;
  }
}
