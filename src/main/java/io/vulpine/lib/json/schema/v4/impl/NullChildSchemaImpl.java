package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

class NullChildSchemaImpl<P extends SchemaBuilder>
extends NullSchemaImpl
implements NullChildSchema<P>
{
  private final Setter setter;

  private final P parent;

  NullChildSchemaImpl(
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
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> id(String id)
  {
    return (NullChildSchema<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> removeId()
  {
    return (NullChildSchema<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> $schema(String path)
  {
    return (NullChildSchema<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> remove$Schema()
  {
    return (NullChildSchema<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> $ref(String path)
  {
    return (NullChildSchema<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> remove$Ref()
  {
    return (NullChildSchema<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> description(String desc)
  {
    return (NullChildSchema<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> removeDescription()
  {
    return (NullChildSchema<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> title(String title)
  {
    return (NullChildSchema<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> removeTitle()
  {
    return (NullChildSchema<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> removeDefault()
  {
    return (NullChildSchema<P>) super.removeDefault();
  }

  @Override
  public UntypedChildSchema<? extends NullChildSchema<P>> definition(String k)
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      v -> definition(k, v));
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> definition(String name, SchemaBuilder schema)
  {
    return (NullChildSchema<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> removeDefinition(String name)
  {
    return (NullChildSchema<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<P> removeDefinitions()
  {
    return (NullChildSchema<P>) super.removeDefinitions();
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
  public NullChildSchema<P> defaultValue(JsonNode val)
  {
    return (NullChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends NullChildSchema<P>> not()
  {
    return (UntypedChildSchema<? extends NullChildSchema<P>>) super.not();
  }
}
