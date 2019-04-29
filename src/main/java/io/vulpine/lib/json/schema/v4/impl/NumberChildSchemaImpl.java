package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.SchemaBuilder;
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
  public NumberChildSchema<P> defaultValue(int val)
  {
    return (NumberChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> defaultValue(long val)
  {
    return (NumberChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> defaultValue(double val)
  {
    return (NumberChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> defaultValue(float val)
  {
    return (NumberChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> defaultValue(BigInteger val)
  {
    return (NumberChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> defaultValue(BigDecimal val)
  {
    return (NumberChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> maximum(double val)
  {
    return (NumberChildSchema<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> maximum(float val)
  {
    return (NumberChildSchema<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> maximum(int val)
  {
    return (NumberChildSchema<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> maximum(long val)
  {
    return (NumberChildSchema<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> maximum(BigInteger val)
  {
    return (NumberChildSchema<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> maximum(BigDecimal val)
  {
    return (NumberChildSchema<P>) super.maximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeMaximum()
  {
    return (NumberChildSchema<P>) super.removeMaximum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> exclusiveMaximum(boolean val)
  {
    return (NumberChildSchema<P>) super.exclusiveMaximum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeExclusiveMaximum()
  {
    return (NumberChildSchema<P>) super.removeExclusiveMaximum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> minimum(double val)
  {
    return (NumberChildSchema<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> minimum(float val)
  {
    return (NumberChildSchema<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> minimum(int val)
  {
    return (NumberChildSchema<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> minimum(long val)
  {
    return (NumberChildSchema<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> minimum(BigDecimal val)
  {
    return (NumberChildSchema<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> minimum(BigInteger val)
  {
    return (NumberChildSchema<P>) super.minimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeMinimum()
  {
    return (NumberChildSchema<P>) super.removeMinimum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> exclusiveMinimum(boolean val)
  {
    return (NumberChildSchema<P>) super.exclusiveMinimum(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeExclusiveMinimum()
  {
    return (NumberChildSchema<P>) super.removeExclusiveMinimum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> multipleOf(int val)
  {
    return (NumberChildSchema<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> multipleOf(long val)
  {
    return (NumberChildSchema<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> multipleOf(float val)
  {
    return (NumberChildSchema<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> multipleOf(double val)
  {
    return (NumberChildSchema<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> multipleOf(BigInteger val)
  {
    return (NumberChildSchema<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> multipleOf(BigDecimal val)
  {
    return (NumberChildSchema<P>) super.multipleOf(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeMultipleOf()
  {
    return (NumberChildSchema<P>) super.removeMultipleOf();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> enumValues(Number... vals)
  {
    return (NumberChildSchema<P>) super.enumValues(vals);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> id(String id)
  {
    return (NumberChildSchema<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeId()
  {
    return (NumberChildSchema<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> $schema(String path)
  {
    return (NumberChildSchema<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> remove$Schema()
  {
    return (NumberChildSchema<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> $ref(String path)
  {
    return (NumberChildSchema<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> remove$Ref()
  {
    return (NumberChildSchema<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> description(String desc)
  {
    return (NumberChildSchema<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeDescription()
  {
    return (NumberChildSchema<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> title(String title)
  {
    return (NumberChildSchema<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeTitle()
  {
    return (NumberChildSchema<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeDefault()
  {
    return (NumberChildSchema<P>) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeEnum()
  {
    return (NumberChildSchema<P>) super.removeEnum();
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
  public NumberChildSchema<P> definition(String name, SchemaBuilder schema)
  {
    return (NumberChildSchema<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeDefinition(String name)
  {
    return (NumberChildSchema<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> removeDefinitions()
  {
    return (NumberChildSchema<P>) super.removeDefinitions();
  }

  @Override
  public ArrayChildSchema<P> orAsArray()
  {
    return new ArrayChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public BooleanChildSchema<P> orAsBoolean()
  {
    return new BooleanChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public IntegerChildSchema<P> orAsInteger()
  {
    return new IntegerChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public NullChildSchema<P> orAsNull()
  {
    return new NullChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public ObjectChildSchema<P> orAsObject()
  {
    return new ObjectChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public StringChildSchema<P> orAsString()
  {
    return new StringChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<P> defaultValue(JsonNode val)
  {
    return (NumberChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends NumberChildSchema<P>> not()
  {
    return (UntypedChildSchema<? extends NumberChildSchema<P>>) super.not();
  }
}
