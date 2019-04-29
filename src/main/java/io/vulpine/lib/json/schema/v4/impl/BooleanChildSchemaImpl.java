package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

class BooleanChildSchemaImpl<P extends SchemaBuilder>
extends BooleanSchemaImpl
implements BooleanChildSchema<P>
{
  private final P parent;

  private final Setter setter;

  BooleanChildSchemaImpl(
    P            parent,
    ObjectMapper jax,
    ObjectNode   raw,
    Setter       setter
  ) {
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
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> defaultValue(boolean val)
  {
    return (BooleanChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> id(String id)
  {
    return (BooleanChildSchema<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> removeId()
  {
    return (BooleanChildSchema<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> $schema(String path)
  {
    return (BooleanChildSchema<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> remove$Schema()
  {
    return (BooleanChildSchema<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> $ref(String path)
  {
    return (BooleanChildSchema<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> remove$Ref()
  {
    return (BooleanChildSchema<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> description(String desc)
  {
    return (BooleanChildSchema<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> removeDescription()
  {
    return (BooleanChildSchema<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> title(String title)
  {
    return (BooleanChildSchema<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> removeTitle()
  {
    return (BooleanChildSchema<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> removeDefault()
  {
    return (BooleanChildSchema<P>) super.removeDefault();
  }

  @Override
  public ArrayChildSchema<P> orAsArray()
  {
    return new ArrayChildSchemaImpl<>(parent, jax(), copy(), setter);
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
  public StringChildSchema<P> orAsString()
  {
    return new StringChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends BooleanChildSchema<P>>
  definition(String name)
  {
    return (UntypedChildSchema<? extends BooleanChildSchema<P>>)
      super.definition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> definition(String name, SchemaBuilder schema)
  {
    return (BooleanChildSchema<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> removeDefinition(String name)
  {
    return (BooleanChildSchema<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> removeDefinitions()
  {
    return (BooleanChildSchema<P>) super.removeDefinitions();
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<P> defaultValue(JsonNode val)
  {
    return (BooleanChildSchema<P>) super.defaultValue(val);
  }
}
