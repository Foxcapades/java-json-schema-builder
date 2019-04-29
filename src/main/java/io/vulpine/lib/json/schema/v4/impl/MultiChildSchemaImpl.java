package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

class MultiChildSchemaImpl<P extends SchemaBuilder>
extends MultiSchemaImpl
implements MultiChildSchema<P>
{
  private final P parent;

  private final Setter setter;

  MultiChildSchemaImpl(P a, ObjectMapper b, ObjectNode c, String d, Setter e)
  {
    super(b, c, d);
    parent = a;
    setter = e;
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
  public MultiChildSchema<P> add(SchemaBuilder... vals)
  {
    return (MultiChildSchema<P>) super.add(vals);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<MultiChildSchema<P>> addArray()
  {
    return (ArrayChildSchema<MultiChildSchema<P>>) super.addArray();
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanChildSchema<MultiChildSchema<P>> addBoolean()
  {
    return (BooleanChildSchema<MultiChildSchema<P>>) super.addBoolean();
  }

  @Override
  @SuppressWarnings("unchecked")
  public IntegerChildSchema<MultiChildSchema<P>> addInteger()
  {
    return (IntegerChildSchema<MultiChildSchema<P>>) super.addInteger();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NullChildSchema<MultiChildSchema<P>> addNull()
  {
    return (NullChildSchema<MultiChildSchema<P>>) super.addNull();
  }

  @Override
  @SuppressWarnings("unchecked")
  public NumberChildSchema<MultiChildSchema<P>> addNumber()
  {
    return (NumberChildSchema<MultiChildSchema<P>>) super.addNumber();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectChildSchema<MultiChildSchema<P>> addObject()
  {
    return (ObjectChildSchema<MultiChildSchema<P>>) super.addObject();
  }

  @Override
  @SuppressWarnings("unchecked")
  public StringChildSchema<MultiChildSchema<P>> addString()
  {
    return (StringChildSchema<MultiChildSchema<P>>) super.addString();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<MultiChildSchema<P>> add()
  {
    return (UntypedChildSchema<MultiChildSchema<P>>) super.add();
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> id(String id)
  {
    return (MultiChildSchema<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> removeId()
  {
    return (MultiChildSchema<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> $schema(String path)
  {
    return (MultiChildSchema<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> remove$Schema()
  {
    return (MultiChildSchema<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> $ref(String path)
  {
    return (MultiChildSchema<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> remove$Ref()
  {
    return (MultiChildSchema<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> description(String desc)
  {
    return (MultiChildSchema<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> removeDescription()
  {
    return (MultiChildSchema<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> title(String title)
  {
    return (MultiChildSchema<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> removeTitle()
  {
    return (MultiChildSchema<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends MultiChildSchema<P>> definition(String k)
  {
    return (UntypedChildSchema<? extends MultiChildSchema<P>>)
      super.definition(k);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> definition(String name, SchemaBuilder schema)
  {
    return (MultiChildSchema<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> removeDefinition(String name)
  {
    return (MultiChildSchema<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> removeDefinitions()
  {
    return (MultiChildSchema<P>) super.removeDefinitions();
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> defaultValue(JsonNode val)
  {
    return (MultiChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultiChildSchema<P> removeDefault()
  {
    return (MultiChildSchema<P>) super.removeDefault();
  }
}
