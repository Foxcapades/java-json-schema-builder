package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

import static io.vulpine.lib.json.schema.v4.lib.Keys.$SCHEMA;

class SchemaSetImpl<P extends SchemaBuilder>
implements SchemaSet<P>
{
  private final P parent;

  private final Setter setter;

  private final ObjectMapper mapper;

  private final ArrayNode schema;

  SchemaSetImpl(P a, ObjectMapper b, ArrayNode c, Setter d)
  {
    parent = a;
    mapper = b;
    schema = c;
    setter = d;
  }

  @Override
  public ArrayChildSchema<SchemaSet<P>> addArray()
  {
    return new ArrayChildSchemaImpl<>(this, mapper, mapper.createObjectNode(),
      this::add);
  }

  @Override
  public BooleanChildSchema<SchemaSet<P>> addBoolean()
  {
    return new BooleanChildSchemaImpl<>(this, mapper, mapper.createObjectNode(),
      this::add);
  }

  @Override
  public IntegerChildSchema<SchemaSet<P>> addInteger()
  {
    return new IntegerChildSchemaImpl<>(this, mapper, mapper.createObjectNode(),
      this::add);
  }

  @Override
  public NullChildSchema<SchemaSet<P>> addNull()
  {
    return new NullChildSchemaImpl<>(this, mapper, mapper.createObjectNode(),
      this::add);
  }

  @Override
  public NumberChildSchema<SchemaSet<P>> addNumber()
  {
    return new NumberChildSchemaImpl<>(this, mapper, mapper.createObjectNode(),
      this::add);
  }

  @Override
  public ObjectChildSchema<SchemaSet<P>> addObject()
  {
    return new ObjectChildSchemaImpl<>(this, mapper, mapper.createObjectNode(),
      this::add);
  }

  @Override
  public StringChildSchema<SchemaSet<P>> addString()
  {
    return new StringChildSchemaImpl<>(this, mapper, mapper.createObjectNode(),
      this::add);
  }

  @Override
  public UntypedChildSchema<SchemaSet<P>> add()
  {
    return new UntypedChildSchemaImpl<>(this, mapper, mapper.createObjectNode(),
      this::add);
  }

  @Override
  public SchemaSetImpl<P> add(SchemaBuilder... vals)
  {
    for (var v : vals)
      schema.add(strip(v.build()));
    return this;
  }

  @Override
  public P close()
  {
    setter.accept(this);
    return parent;
  }

  @Override
  public JsonNode build()
  {
    return schema.deepCopy();
  }

  @Override
  public String toString()
  {
    return schema.toString();
  }

  private static JsonNode strip(JsonNode node) {
    if (node.isObject())
      ((ObjectNode) node).remove($SCHEMA);
    return node;
  }
}
