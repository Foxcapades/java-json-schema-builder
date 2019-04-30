package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.JsonType;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

class NullSchemaImpl extends SchemaNodeImpl implements NullSchema
{
  NullSchemaImpl(ObjectMapper jax, ObjectNode raw)
  {
    super(jax, raw, JsonType.NULL);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public NullSchema id(String id)
  {
    return (NullSchema) super.id(id);
  }

  @Override
  public NullSchema removeId()
  {
    return (NullSchema) super.removeId();
  }

  @Override
  public NullSchema $schema(String path)
  {
    return (NullSchema) super.$schema(path);
  }

  @Override
  public NullSchema remove$Schema()
  {
    return (NullSchema) super.remove$Schema();
  }

  @Override
  public NullSchema $ref(String path)
  {
    return (NullSchema) super.$ref(path);
  }

  @Override
  public NullSchema remove$Ref()
  {
    return (NullSchema) super.remove$Ref();
  }

  @Override
  public NullSchema description(String desc)
  {
    return (NullSchema) super.description(desc);
  }

  @Override
  public NullSchema removeDescription()
  {
    return (NullSchema) super.removeDescription();
  }

  @Override
  public NullSchema title(String title)
  {
    return (NullSchema) super.title(title);
  }

  @Override
  public NullSchema removeTitle()
  {
    return (NullSchema) super.removeTitle();
  }

  @Override
  public NullSchema removeDefault()
  {
    return (NullSchema) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends NullSchema> definition(String name)
  {
    return (UntypedChildSchema<? extends NullSchema>) super.definition(name);
  }

  @Override
  public NullSchema definition(String name, SchemaBuilder schema)
  {
    return (NullSchema) super.definition(name, schema);
  }

  @Override
  public NullSchema removeDefinition(String name)
  {
    return (NullSchema) super.removeDefinition(name);
  }

  @Override
  public NullSchema removeDefinitions()
  {
    return (NullSchema) super.removeDefinitions();
  }

  @Override
  public NullSchema defaultValue(JsonNode val)
  {
    return (NullSchema) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends NullSchema> not()
  {
    return (UntypedChildSchema<? extends NullSchema>) super.not();
  }
}
