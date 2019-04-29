package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.NumberChildSchema;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.NumberSchema;
import io.vulpine.lib.json.schema.v4.UntypedChildSchema;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;

class NumberChildSchemaImpl<P extends SchemaBuilder>
extends NumberSchemaImpl
implements NumberChildSchema<P>
{
  private final P parent;

  private final Setter setter;

  NumberChildSchemaImpl(P a, ObjectMapper b, ObjectNode c, Setter d)
  {
    super(b, c);
    this.parent = a;
    this.setter = d;
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
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
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> defaultValue(int val)
  {
    return (NumberChildSchemaImpl<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> defaultValue(long val)
  {
    return (NumberChildSchemaImpl<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> defaultValue(double val)
  {
    return (NumberChildSchemaImpl<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> defaultValue(float val)
  {
    return (NumberChildSchemaImpl<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> defaultValue(BigInteger val)
  {
    return (NumberChildSchemaImpl<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> defaultValue(BigDecimal val)
  {
    return (NumberChildSchemaImpl<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> maximum(double val)
  {
    return (NumberChildSchemaImpl<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> maximum(float val)
  {
    return (NumberChildSchemaImpl<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> maximum(int val)
  {
    return (NumberChildSchemaImpl<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> maximum(long val)
  {
    return (NumberChildSchemaImpl<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> maximum(BigInteger val)
  {
    return (NumberChildSchemaImpl<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> maximum(BigDecimal val)
  {
    return (NumberChildSchemaImpl<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeMaximum()
  {
    return (NumberChildSchemaImpl<P>) super.removeMaximum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> exclusiveMaximum(boolean val)
  {
    return (NumberChildSchemaImpl<P>) super.exclusiveMaximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeExclusiveMaximum()
  {
    return (NumberChildSchemaImpl<P>) super.removeExclusiveMaximum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> minimum(double val)
  {
    return (NumberChildSchemaImpl<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> minimum(float val)
  {
    return (NumberChildSchemaImpl<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> minimum(int val)
  {
    return (NumberChildSchemaImpl<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> minimum(long val)
  {
    return (NumberChildSchemaImpl<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> minimum(BigDecimal val)
  {
    return (NumberChildSchemaImpl<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> minimum(BigInteger val)
  {
    return (NumberChildSchemaImpl<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeMinimum()
  {
    return (NumberChildSchemaImpl<P>) super.removeMinimum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> exclusiveMinimum(boolean val)
  {
    return (NumberChildSchemaImpl<P>) super.exclusiveMinimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeExclusiveMinimum()
  {
    return (NumberChildSchemaImpl<P>) super.removeExclusiveMinimum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> multipleOf(int val)
  {
    return (NumberChildSchemaImpl<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> multipleOf(long val)
  {
    return (NumberChildSchemaImpl<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> multipleOf(float val)
  {
    return (NumberChildSchemaImpl<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> multipleOf(double val)
  {
    return (NumberChildSchemaImpl<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> multipleOf(BigInteger val)
  {
    return (NumberChildSchemaImpl<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> multipleOf(BigDecimal val)
  {
    return (NumberChildSchemaImpl<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeMultipleOf()
  {
    return (NumberChildSchemaImpl<P>) super.removeMultipleOf();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> enumValues(Number... vals)
  {
    return (NumberChildSchemaImpl<P>) super.enumValues(vals);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> id(String id)
  {
    return (NumberChildSchemaImpl<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeId()
  {
    return (NumberChildSchemaImpl<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> $schema(String path)
  {
    return (NumberChildSchemaImpl<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> remove$Schema()
  {
    return (NumberChildSchemaImpl<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> $ref(String path)
  {
    return (NumberChildSchemaImpl<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> remove$Ref()
  {
    return (NumberChildSchemaImpl<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> description(String desc)
  {
    return (NumberChildSchemaImpl<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeDescription()
  {
    return (NumberChildSchemaImpl<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> title(String title)
  {
    return (NumberChildSchemaImpl<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeTitle()
  {
    return (NumberChildSchemaImpl<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeDefault()
  {
    return (NumberChildSchemaImpl<P>) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeEnum()
  {
    return (NumberChildSchemaImpl<P>) super.removeEnum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends NumberChildSchema<P>>
  definition(String name)
  {
    return (UntypedChildSchema<? extends NumberChildSchema<P>>)
      super.definition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> definition(String name, SchemaBuilder schema)
  {
    return (NumberChildSchemaImpl<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeDefinition(String name)
  {
    return (NumberChildSchemaImpl<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchemaImpl<P> removeDefinitions()
  {
    return (NumberChildSchemaImpl<P>) super.removeDefinitions();
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
  public ObjectChildSchemaImpl<P> orAsObject()
  {
    return new ObjectChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public StringChildSchemaImpl<P> orAsString()
  {
    return new StringChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> defaultValue(JsonNode val)
  {
    return (NumberChildSchema<P>) super.defaultValue(val);
  }
}
