package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

import static io.vulpine.lib.json.schema.v4.lib.Keys.DEFAULT;

class BooleanSchemaImpl
extends SchemaNodeImpl
implements BooleanSchema
{
  BooleanSchemaImpl(ObjectMapper jax, ObjectNode raw)
  {
    super(jax, raw, JsonType.BOOLEAN);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public BooleanSchema defaultValue(boolean val)
  {
    return put(DEFAULT, val);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘


  @Override
  public BooleanSchema id(String id)
  {
    return (BooleanSchema) super.id(id);
  }

  @Override
  public BooleanSchema removeId()
  {
    return (BooleanSchema) super.removeId();
  }

  @Override
  public BooleanSchema $schema(String path)
  {
    return (BooleanSchema) super.$schema(path);
  }

  @Override
  public BooleanSchema remove$Schema()
  {
    return (BooleanSchema) super.remove$Schema();
  }

  @Override
  public BooleanSchema $ref(String path)
  {
    return (BooleanSchema) super.$ref(path);
  }

  @Override
  public BooleanSchema remove$Ref()
  {
    return (BooleanSchema) super.remove$Ref();
  }

  @Override
  public BooleanSchema description(String desc)
  {
    return (BooleanSchema) super.description(desc);
  }

  @Override
  public BooleanSchema removeDescription()
  {
    return (BooleanSchema) super.removeDescription();
  }

  @Override
  public BooleanSchema title(String title)
  {
    return (BooleanSchema) super.title(title);
  }

  @Override
  public BooleanSchema removeTitle()
  {
    return (BooleanSchema) super.removeTitle();
  }

  @Override
  public BooleanSchema removeDefault()
  {
    return (BooleanSchema) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends BooleanSchema> definition(String name)
  {
    return (UntypedChildSchema<? extends BooleanSchema>) super.definition(name);
  }

  @Override
  public BooleanSchema definition(String name, SchemaBuilder schema)
  {
    return (BooleanSchema) super.definition(name, schema);
  }

  @Override
  public BooleanSchema removeDefinition(String name)
  {
    return (BooleanSchema) super.removeDefinition(name);
  }

  @Override
  public BooleanSchema removeDefinitions()
  {
    return (BooleanSchema) super.removeDefinitions();
  }

  @Override
  public BooleanSchema defaultValue(JsonNode val)
  {
    return (BooleanSchema) super.defaultValue(val);
  }
}
