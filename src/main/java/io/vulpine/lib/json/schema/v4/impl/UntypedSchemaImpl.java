package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

public class UntypedSchemaImpl
extends SchemaNodeImpl
implements UntypedSchema
{
  public UntypedSchemaImpl(ObjectMapper jax)
  {
    this(jax, jax.createObjectNode());
  }

  UntypedSchemaImpl(ObjectMapper jax, ObjectNode raw)
  {
    super(jax, raw);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public ArraySchema asArray()
  {
    return new ArraySchemaImpl(jax(), copy());
  }

  @Override
  public BooleanSchema asBoolean()
  {
    return new BooleanSchemaImpl(jax(), copy());
  }

  @Override
  public IntegerSchema asInteger()
  {
    return new IntegerSchemaImpl(jax(), copy());
  }

  @Override
  public NullSchema asNull()
  {
    return new NullSchemaImpl(jax(), copy());
  }

  @Override
  public NumberSchema asNumber()
  {
    return new NumberSchemaImpl(jax(), copy());
  }

  @Override
  public ObjectSchema asObject()
  {
    return new ObjectSchemaImpl(jax(), copy());
  }

  @Override
  public StringSchema asString()
  {
    return new StringSchemaImpl(jax(), copy());
  }

  @Override
  public MultiSchema allOf()
  {
    return new MultiSchemaImpl(jax(), copy(), ALL_OF);
  }

  @Override
  public MultiSchema anyOf()
  {
    return new MultiSchemaImpl(jax(), copy(), ANY_OF);
  }

  @Override
  public MultiSchema oneOf()
  {
    return new MultiSchemaImpl(jax(), copy(), ONE_OF);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public UntypedSchema id(String id)
  {
    return (UntypedSchema) super.id(id);
  }

  @Override
  public UntypedSchema removeId()
  {
    return (UntypedSchema) super.removeId();
  }

  @Override
  public UntypedSchema $schema(String path)
  {
    return (UntypedSchema) super.$schema(path);
  }

  @Override
  public UntypedSchema remove$Schema()
  {
    return (UntypedSchema) super.remove$Schema();
  }

  @Override
  public UntypedSchema $ref(String path)
  {
    return (UntypedSchema) super.$ref(path);
  }

  @Override
  public UntypedSchema remove$Ref()
  {
    return (UntypedSchema) super.remove$Ref();
  }

  @Override
  public UntypedSchema description(String desc)
  {
    return (UntypedSchema) super.description(desc);
  }

  @Override
  public UntypedSchema removeDescription()
  {
    return (UntypedSchema) super.removeDescription();
  }

  @Override
  public UntypedSchema title(String title)
  {
    return (UntypedSchema) super.title(title);
  }

  @Override
  public UntypedSchema removeTitle()
  {
    return (UntypedSchema) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends UntypedSchema> definition(String name)
  {
    return (UntypedChildSchema<? extends UntypedSchema>)
      super.definition(name);
  }

  @Override
  public UntypedSchema definition(String name, SchemaBuilder schema)
  {
    return (UntypedSchema) super.definition(name, schema);
  }

  @Override
  public UntypedSchema removeDefinition(String name)
  {
    return (UntypedSchema) super.removeDefinition(name);
  }

  @Override
  public UntypedSchema removeDefinitions()
  {
    return (UntypedSchema) super.removeDefinitions();
  }

  @Override
  public UntypedSchema defaultValue(JsonNode val)
  {
    return (UntypedSchema) super.defaultValue(val);
  }

  @Override
  public UntypedSchema removeDefault()
  {
    return (UntypedSchema) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends UntypedSchema> not()
  {
    return (UntypedChildSchema<? extends UntypedSchema>) super.not();
  }
}
