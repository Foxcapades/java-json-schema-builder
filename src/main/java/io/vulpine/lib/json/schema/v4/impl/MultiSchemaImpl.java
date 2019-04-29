package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

class MultiSchemaImpl extends SchemaNodeImpl implements MultiSchema
{
  private final String key;

  private ArrayNode ctx;

  MultiSchemaImpl(ObjectMapper jax, ObjectNode raw, String type)
  {
    super(jax, raw);
    key = type;
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public MultiSchema add(SchemaBuilder... vals)
  {
    // Prevent empty array in output
    if (vals.length < 1)
      return this;

    var c = ctx();
    for (var j : vals)
      c.add(strip(j.build()));

    return this;
  }

  @Override
  public ArrayChildSchema<? extends MultiSchema> addArray()
  {
    return new ArrayChildSchemaImpl<>(this, jax(), newObj(), this::add);
  }

  @Override
  public BooleanChildSchema<? extends MultiSchema> addBoolean()
  {
    return new BooleanChildSchemaImpl<>(this, jax(), newObj(), this::add);
  }

  @Override
  public IntegerChildSchema<? extends MultiSchema> addInteger()
  {
    return new IntegerChildSchemaImpl<>(this, jax(), newObj(), this::add);
  }

  @Override
  public NullChildSchema<? extends MultiSchema> addNull()
  {
    return new NullChildSchemaImpl<>(this, jax(), newObj(), this::add);
  }

  @Override
  public NumberChildSchema<? extends MultiSchema> addNumber()
  {
    return new NumberChildSchemaImpl<>(this, jax(), newObj(), this::add);
  }

  @Override
  public ObjectChildSchema<? extends MultiSchema> addObject()
  {
    return new ObjectChildSchemaImpl<>(this, jax(), newObj(), this::add);
  }

  @Override
  public StringChildSchema<? extends MultiSchema> addString()
  {
    return new StringChildSchemaImpl<>(this, jax(), newObj(), this::add);
  }

  @Override
  public UntypedChildSchema<? extends MultiSchema> add()
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(), this::add);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public MultiSchema id(String id)
  {
    return (MultiSchema) super.id(id);
  }

  @Override
  public MultiSchema removeId()
  {
    return (MultiSchema) super.removeId();
  }

  @Override
  public MultiSchema $schema(String path)
  {
    return (MultiSchema) super.$schema(path);
  }

  @Override
  public MultiSchema remove$Schema()
  {
    return (MultiSchema) super.remove$Schema();
  }

  @Override
  public MultiSchema $ref(String path)
  {
    return (MultiSchema) super.$ref(path);
  }

  @Override
  public MultiSchema remove$Ref()
  {
    return (MultiSchema) super.remove$Ref();
  }

  @Override
  public MultiSchema description(String desc)
  {
    return (MultiSchema) super.description(desc);
  }

  @Override
  public MultiSchema removeDescription()
  {
    return (MultiSchema) super.removeDescription();
  }

  @Override
  public MultiSchema title(String title)
  {
    return (MultiSchema) super.title(title);
  }

  @Override
  public MultiSchema removeTitle()
  {
    return (MultiSchema) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends MultiSchema> definition(String name)
  {
    return (UntypedChildSchema<? extends MultiSchema>) super.definition(name);
  }

  @Override
  public MultiSchema definition(String name, SchemaBuilder schema)
  {
    return (MultiSchema) super.definition(name, schema);
  }

  @Override
  public MultiSchema removeDefinition(String name)
  {
    return (MultiSchema) super.removeDefinition(name);
  }

  @Override
  public MultiSchema removeDefinitions()
  {
    return (MultiSchema) super.removeDefinitions();
  }

  @Override
  public MultiSchema defaultValue(JsonNode val)
  {
    return (MultiSchema) super.defaultValue(val);
  }

  @Override
  public MultiSchema removeDefault()
  {
    return (MultiSchema) super.removeDefault();
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Internal helpers                                    │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  private ArrayNode ctx()
  {
    if (ctx == null)
      ctx = raw().putArray(key);

    return ctx;
  }
}
