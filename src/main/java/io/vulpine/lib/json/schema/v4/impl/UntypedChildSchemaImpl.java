package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

class UntypedChildSchemaImpl<P extends SchemaBuilder>
extends UntypedSchemaImpl
implements UntypedChildSchema<P>
{
  private final P parent;
  private final Setter setter;

  UntypedChildSchemaImpl(P a, ObjectMapper b, ObjectNode c, Setter d)
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
  public ArrayChildSchema<P> asArray()
  {
    return new ArrayChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public BooleanChildSchema<P> asBoolean()
  {
    return new BooleanChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public IntegerChildSchema<P> asInteger()
  {
    return new IntegerChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public NullChildSchema<P> asNull()
  {
    return new NullChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public NumberChildSchema<P> asNumber()
  {
    return new NumberChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public ObjectChildSchema<P> asObject()
  {
    return new ObjectChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public StringChildSchema<P> asString()
  {
    return new StringChildSchemaImpl<>(parent, jax(), copy(), setter);
  }

  @Override
  public MultiChildSchema<P> allOf()
  {
    return new MultiChildSchemaImpl<>(parent, jax(), copy(), ALL_OF, setter);
  }

  @Override
  public MultiChildSchema<P> anyOf()
  {
    return new MultiChildSchemaImpl<>(parent, jax(), copy(), ANY_OF, setter);
  }

  @Override
  public MultiChildSchema<P> oneOf()
  {
    return new MultiChildSchemaImpl<>(parent, jax(), copy(), ONE_OF, setter);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> id(String id)
  {
    return (UntypedChildSchema<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> removeId()
  {
    return (UntypedChildSchema<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> $schema(String path)
  {
    return (UntypedChildSchema<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> remove$Schema()
  {
    return (UntypedChildSchema<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> $ref(String path)
  {
    return (UntypedChildSchema<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> remove$Ref()
  {
    return (UntypedChildSchema<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> description(String desc)
  {
    return (UntypedChildSchema<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> removeDescription()
  {
    return (UntypedChildSchema<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> title(String title)
  {
    return (UntypedChildSchema<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> removeTitle()
  {
    return (UntypedChildSchema<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends UntypedChildSchema<P>> definition(String name)
  {
    return (UntypedChildSchema<? extends UntypedChildSchema<P>>) super.definition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> definition(String name, SchemaBuilder schema)
  {
    return (UntypedChildSchema<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> removeDefinition(String name)
  {
    return (UntypedChildSchema<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> removeDefinitions()
  {
    return (UntypedChildSchema<P>) super.removeDefinitions();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> defaultValue(JsonNode val)
  {
    return (UntypedChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<P> removeDefault()
  {
    return (UntypedChildSchema<P>) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends UntypedChildSchema<P>> not()
  {
    return (UntypedChildSchema<? extends UntypedChildSchema<P>>) super.not();
  }
}
