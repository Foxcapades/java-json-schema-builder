package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.ObjectChildSchema;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.ObjectSchema;
import io.vulpine.lib.json.schema.v4.UntypedChildSchema;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

import java.math.BigInteger;

class ObjectChildSchemaImpl<P extends SchemaBuilder>
extends ObjectSchemaImpl
implements ObjectChildSchema<P>
{
  private final P parent;

  private final Setter setter;

  ObjectChildSchemaImpl(
    P            parent,
    ObjectMapper jax,
    ObjectNode   raw,
    Setter       setter
  )
  {
    super(jax, raw);
    this.parent = parent;
    this.setter = setter;
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementation                            │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public P close()
  {
    setter.accept(this);
    return parent;
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public UntypedChildSchema<? extends ObjectChildSchema<P>>
  optionalProperty(String name)
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      v -> optionalProperty(name, v));
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> optionalProperty(String name, SchemaBuilder node)
  {
    return (ObjectChildSchemaImpl<P>) super.optionalProperty(name, node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeOptionalProperties()
  {
    return (ObjectChildSchemaImpl<P>) super.removeOptionalProperties();
  }

  @Override
  public UntypedChildSchema<? extends ObjectChildSchema<P>>
  requiredProperty(String k)
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      v -> requiredProperty(k, v));
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> requiredProperty(String k, SchemaBuilder v)
  {
    return (ObjectChildSchemaImpl<P>) super.requiredProperty(k, v);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeRequiredProperties()
  {
    return (ObjectChildSchemaImpl<P>) super.removeRequiredProperties();
  }

  @Override
  public UntypedChildSchema<? extends ObjectChildSchema<P>>
  patternProperty(String x)
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      v -> patternProperty(x, v));
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> patternProperty(String k, SchemaBuilder v)
  {
    return (ObjectChildSchemaImpl<P>) super.patternProperty(k, v);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removePatternProperties()
  {
    return (ObjectChildSchemaImpl<P>) super.removePatternProperties();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> additionalProperties(boolean val)
  {
    return (ObjectChildSchemaImpl<P>) super.additionalProperties(val);
  }

  @Override
  public UntypedChildSchema<? extends ObjectChildSchema<P>> additionalProperties()
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      this::additionalProperties);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> additionalProperties(SchemaBuilder node)
  {
    return (ObjectChildSchemaImpl<P>) super.additionalProperties(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeAdditionalProperties()
  {
    return (ObjectChildSchemaImpl<P>) super.removeAdditionalProperties();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> enumValues(ObjectNode... types)
  {
    return (ObjectChildSchemaImpl<P>) super.enumValues(types);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> maxProperties(int val)
  {
    return (ObjectChildSchemaImpl<P>) super.maxProperties(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> maxProperties(long val)
  {
    return (ObjectChildSchemaImpl<P>) super.maxProperties(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> maxProperties(BigInteger val)
  {
    return (ObjectChildSchemaImpl<P>) super.maxProperties(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeMaxProperties()
  {
    return (ObjectChildSchemaImpl<P>) super.removeMaxProperties();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> minProperties(int val)
  {
    return (ObjectChildSchemaImpl<P>) super.minProperties(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> minProperties(long val)
  {
    return (ObjectChildSchemaImpl<P>) super.minProperties(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> minProperties(BigInteger val)
  {
    return (ObjectChildSchemaImpl<P>) super.minProperties(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeMinProperties()
  {
    return (ObjectChildSchemaImpl<P>) super.removeMinProperties();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> id(String id)
  {
    return (ObjectChildSchemaImpl<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeId()
  {
    return (ObjectChildSchemaImpl<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> $schema(String path)
  {
    return (ObjectChildSchemaImpl<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> remove$Schema()
  {
    return (ObjectChildSchemaImpl<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> $ref(String path)
  {
    return (ObjectChildSchemaImpl<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> remove$Ref()
  {
    return (ObjectChildSchemaImpl<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> description(String desc)
  {
    return (ObjectChildSchemaImpl<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeDescription()
  {
    return (ObjectChildSchemaImpl<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> title(String title)
  {
    return (ObjectChildSchemaImpl<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeTitle()
  {
    return (ObjectChildSchemaImpl<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeDefault()
  {
    return (ObjectChildSchemaImpl<P>) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeEnum()
  {
    return (ObjectChildSchemaImpl<P>) super.removeEnum();
  }

  @Override
  public UntypedChildSchema<? extends ObjectChildSchema<P>> definition(String k)
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      v -> definition(k, v));
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> definition(String name, SchemaBuilder schema)
  {
    return (ObjectChildSchemaImpl<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeDefinition(String name)
  {
    return (ObjectChildSchemaImpl<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchemaImpl<P> removeDefinitions()
  {
    return (ObjectChildSchemaImpl<P>) super.removeDefinitions();
  }

  @Override
  public ArrayChildSchemaImpl<P> orAsArray()
  {
    return new ArrayChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public BooleanChildSchemaImpl<P> orAsBoolean()
  {
    return new BooleanChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public IntegerChildSchemaImpl<P> orAsInteger()
  {
    return new IntegerChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public NullChildSchemaImpl<P> orAsNull()
  {
    return new NullChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public NumberChildSchemaImpl<P> orAsNumber()
  {
    return new NumberChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public StringChildSchemaImpl<P> orAsString()
  {
    return new StringChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchema<P> defaultValue(JsonNode val)
  {
    return (ObjectChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends ObjectChildSchema<P>> not()
  {
    return (UntypedChildSchema<? extends ObjectChildSchema<P>>) super.not();
  }
}
