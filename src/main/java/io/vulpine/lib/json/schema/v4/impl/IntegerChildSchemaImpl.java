package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.IntegerChildSchema;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.UntypedChildSchema;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;

class IntegerChildSchemaImpl<P extends SchemaBuilder>
extends IntegerSchemaImpl
implements IntegerChildSchema<P>
{
  private final P parent;

  private final Setter setter;

  IntegerChildSchemaImpl(P a, ObjectMapper b, ObjectNode c, Setter d)
  {
    super(b, c);
    parent = a;
    setter = d;
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
  public IntegerChildSchema<P> defaultValue(int v)
  {
    return (IntegerChildSchema<P>) super.defaultValue(v);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> defaultValue(long v)
  {
    return (IntegerChildSchema<P>) super.defaultValue(v);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> defaultValue(BigInteger v)
  {
    return (IntegerChildSchema<P>) super.defaultValue(v);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> maximum(int x)
  {
    return (IntegerChildSchema<P>) super.maximum(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> maximum(long x)
  {
    return (IntegerChildSchema<P>) super.maximum(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> maximum(BigInteger x)
  {
    return (IntegerChildSchema<P>) super.maximum(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeMaximum()
  {
    return (IntegerChildSchema<P>) super.removeMaximum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> exclusiveMaximum(boolean f)
  {
    return (IntegerChildSchema<P>) super.exclusiveMaximum(f);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeExclusiveMaximum()
  {
    return (IntegerChildSchema<P>) super.removeExclusiveMaximum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> minimum(int x)
  {
    return (IntegerChildSchema<P>) super.minimum(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> minimum(long x)
  {
    return (IntegerChildSchema<P>) super.minimum(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> minimum(BigInteger x)
  {
    return (IntegerChildSchema<P>) super.minimum(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeMinimum()
  {
    return (IntegerChildSchema<P>) super.removeMinimum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> exclusiveMinimum(boolean x)
  {
    return (IntegerChildSchema<P>) super.exclusiveMinimum(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeExclusiveMinimum()
  {
    return (IntegerChildSchema<P>) super.removeExclusiveMinimum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> multipleOf(double x)
  {
    return (IntegerChildSchema<P>) super.multipleOf(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> multipleOf(float x)
  {
    return (IntegerChildSchema<P>) super.multipleOf(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> multipleOf(int x)
  {
    return (IntegerChildSchema<P>) super.multipleOf(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> multipleOf(long x)
  {
    return (IntegerChildSchema<P>) super.multipleOf(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> multipleOf(BigInteger x)
  {
    return (IntegerChildSchema<P>) super.multipleOf(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> multipleOf(BigDecimal x)
  {
    return (IntegerChildSchema<P>) super.multipleOf(x);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeMultipleOf()
  {
    return (IntegerChildSchema<P>) super.removeMultipleOf();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> enumValues(int... val)
  {
    return (IntegerChildSchema<P>) super.enumValues(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> enumValues(long... val)
  {
    return (IntegerChildSchema<P>) super.enumValues(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> enumValues(BigInteger... val)
  {
    return (IntegerChildSchema<P>) super.enumValues(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> id(String id)
  {
    return (IntegerChildSchema<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeId()
  {
    return (IntegerChildSchema<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> $schema(String path)
  {
    return (IntegerChildSchema<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> remove$Schema()
  {
    return (IntegerChildSchema<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> $ref(String path)
  {
    return (IntegerChildSchema<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> remove$Ref()
  {
    return (IntegerChildSchema<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> description(String desc)
  {
    return (IntegerChildSchema<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeDescription()
  {
    return (IntegerChildSchema<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> title(String title)
  {
    return (IntegerChildSchema<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeTitle()
  {
    return (IntegerChildSchema<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeDefault()
  {
    return (IntegerChildSchema<P>) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeEnum()
  {
    return (IntegerChildSchema<P>) super.removeEnum();
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
  public UntypedChildSchema<? extends IntegerChildSchema<P>>
  definition(String name)
  {
    return (UntypedChildSchema<? extends IntegerChildSchema<P>>)
      super.definition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> definition(String name, SchemaBuilder schema)
  {
    return (IntegerChildSchema<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeDefinition(String name)
  {
    return (IntegerChildSchema<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> removeDefinitions()
  {
    return (IntegerChildSchema<P>) super.removeDefinitions();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<P> defaultValue(JsonNode val)
  {
    return (IntegerChildSchema<P>) super.defaultValue(val);
  }
}
