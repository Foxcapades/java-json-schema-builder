package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.v4.lib.Keys;

class StdTypeArrayBuilder<P extends SchemaNode>
implements TypeArrayBuilder<P>
{
  private final ArrayNode schema;
  private final ObjectMapper mapper;
  private final P parent;

  public StdTypeArrayBuilder(P parent, ObjectMapper mapper) {
    this.mapper = mapper;
    this.parent = parent;
    this.schema = mapper.createArrayNode();
  }

  public StdTypeArrayBuilder(P parent, ObjectMapper mapper, ArrayNode schema) {
    this.mapper = mapper;
    this.parent = parent;
    this.schema = schema;
  }

  @Override
  public ChildArrayBuilder<TypeArrayBuilder<P>> addArray() {
    return new StdChildArrayBuilder<>(this, mapper, schema.addObject());
  }

  @Override
  public ChildBooleanBuilder<TypeArrayBuilder<P>> addBoolean() {
    return new StdChildBooleanBuilder<>(this, mapper, schema.addObject());
  }

  @Override
  public ChildIntegerBuilder<TypeArrayBuilder<P>> addInteger() {
    return new StdChildIntegerBuilder<>(this, mapper, schema.addObject());
  }

  @Override
  public ChildNullBuilder<TypeArrayBuilder<P>> addNull() {
    return new StdChildNullBuilder<>(this, mapper, schema.addObject());
  }

  @Override
  public ChildNumberBuilder<TypeArrayBuilder<P>> addNumber() {
    return new StdChildNumberBuilder<>(this, mapper, schema.addObject());
  }

  @Override
  public ChildObjectBuilder<TypeArrayBuilder<P>> addObject() {
    return new StdChildObjectBuilder<>(this, mapper, schema.addObject());
  }

  @Override
  public ChildStringBuilder<TypeArrayBuilder<P>> addString() {
    return new StdChildStringBuilder<>(this, mapper, schema.addObject());
  }

  /**
   * @inheritDoc
   * @since 1.3
   */
  @Override
  public ChildSchemaBuilder<TypeArrayBuilder<P>> add() {
    return new StdChildSchemaBuilder<>(this, mapper, schema.addObject());
  }

  @Override
  public TypeArrayBuilder<P> add(SchemaObject val) {
    schema.add(strip(val.build()));
    return this;
  }

  private JsonNode strip(JsonNode node) {
    ((ObjectNode) node).remove(Keys.$SCHEMA);
    return node;
  }

  @Override
  public JsonNode build() {
    return schema.deepCopy();
  }

  @Override
  public P close() {
    return parent;
  }
}
