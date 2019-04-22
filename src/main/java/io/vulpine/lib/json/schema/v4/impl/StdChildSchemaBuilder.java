package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.*;

class StdChildSchemaBuilder<P extends SchemaNode>
  extends StdSchemaObject<ChildSchemaBuilder<P>>
implements ChildSchemaBuilder<P>
{
  private final P parent;

  StdChildSchemaBuilder(P parent, ObjectMapper mapper, ObjectNode schema) {
    super(mapper, schema);
    this.parent = parent;
  }

  @Override
  public ChildArrayBuilder<P> asArray() {
    return new StdChildArrayBuilder<>(parent, mapper, schema);
  }

  @Override
  public ChildBooleanBuilder<P> asBoolean() {
    return new StdChildBooleanBuilder<>(parent, mapper, schema);
  }

  @Override
  public ChildIntegerBuilder<P> asInteger() {
    return new StdChildIntegerBuilder<>(parent, mapper, schema);
  }

  @Override
  public ChildNullBuilder<P> asNull() {
    return new StdChildNullBuilder<>(parent, mapper, schema);
  }

  @Override
  public ChildNumberBuilder<P> asNumber() {
    return new StdChildNumberBuilder<>(parent, mapper, schema);
  }

  @Override
  public ChildObjectBuilder<P> asObject() {
    return new StdChildObjectBuilder<>(parent, mapper, schema);
  }

  @Override
  public ChildStringBuilder<P> asString() {
    return new StdChildStringBuilder<>(parent, mapper, schema);
  }

  @Override
  public P close() {
    return parent;
  }
}
