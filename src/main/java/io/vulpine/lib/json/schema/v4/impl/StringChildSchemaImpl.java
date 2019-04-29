package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

import java.math.BigInteger;

class StringChildSchemaImpl<P extends SchemaBuilder>
extends StringSchemaImpl
implements StringChildSchema<P>
{
  private final Setter setter;

  private final P parent;

  StringChildSchemaImpl(
    P                    parent,
    ObjectMapper         jax,
    ObjectNode           raw,
    Setter setter
  ) {
    super(jax, raw);
    this.parent = parent;
    this.setter = setter;
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
  public StringChildSchemaImpl<P> defaultValue(String val)
  {
    return (StringChildSchemaImpl<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> maxLength(int val)
  {
    return (StringChildSchemaImpl<P>) super.maxLength(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> maxLength(long val)
  {
    return (StringChildSchemaImpl<P>) super.maxLength(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> maxLength(BigInteger val)
  {
    return (StringChildSchemaImpl<P>) super.maxLength(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeMaxLength()
  {
    return (StringChildSchemaImpl<P>) super.removeMaxLength();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> minLength(int val)
  {
    return (StringChildSchemaImpl<P>) super.minLength(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> minLength(long val)
  {
    return (StringChildSchemaImpl<P>) super.minLength(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> minLength(BigInteger val)
  {
    return (StringChildSchemaImpl<P>) super.minLength(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeMinLength()
  {
    return (StringChildSchemaImpl<P>) super.removeMinLength();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> pattern(String pattern)
  {
    return (StringChildSchemaImpl<P>) super.pattern(pattern);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removePattern()
  {
    return (StringChildSchemaImpl<P>) super.removePattern();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> enumValues(String... vals)
  {
    return (StringChildSchemaImpl<P>) super.enumValues(vals);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> format(Format format)
  {
    return (StringChildSchemaImpl<P>) super.format(format);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> format(String format)
  {
    return (StringChildSchemaImpl<P>) super.format(format);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeFormat()
  {
    return (StringChildSchemaImpl<P>) super.removeFormat();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> id(String id)
  {
    return (StringChildSchemaImpl<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeId()
  {
    return (StringChildSchemaImpl<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> $schema(String path)
  {
    return (StringChildSchemaImpl<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> remove$Schema()
  {
    return (StringChildSchemaImpl<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> $ref(String path)
  {
    return (StringChildSchemaImpl<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> remove$Ref()
  {
    return (StringChildSchemaImpl<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> description(String desc)
  {
    return (StringChildSchemaImpl<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeDescription()
  {
    return (StringChildSchemaImpl<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> title(String title)
  {
    return (StringChildSchemaImpl<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeTitle()
  {
    return (StringChildSchemaImpl<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeDefault()
  {
    return (StringChildSchemaImpl<P>) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeEnum()
  {
    return (StringChildSchemaImpl<P>) super.removeEnum();
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
  public NumberChildSchema<P> orAsNumber()
  {
    return new NumberChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public ObjectChildSchema<P> orAsObject()
  {
    return new ObjectChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends StringChildSchema<P>>
  definition(String name)
  {
    return (UntypedChildSchema<? extends StringChildSchema<P>>)
      super.definition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> definition(String name, SchemaBuilder schema)
  {
    return (StringChildSchemaImpl<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeDefinition(String name)
  {
    return (StringChildSchemaImpl<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchemaImpl<P> removeDefinitions()
  {
    return (StringChildSchemaImpl<P>) super.removeDefinitions();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchema<P> defaultValue(JsonNode val)
  {
    return (StringChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends StringChildSchema<P>> not()
  {
    return (UntypedChildSchema<? extends StringChildSchema<P>>) super.not();
  }
}
