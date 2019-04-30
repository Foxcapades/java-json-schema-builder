package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.v4.impl.lib.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;

class ArrayChildSchemaImpl<P extends SchemaBuilder>
extends ArraySchemaImpl
implements ArrayChildSchema<P>
{
  private final Setter setter;
  private final P parent;

  ArrayChildSchemaImpl(
    P            parent,
    ObjectMapper mapper,
    ObjectNode   schema,
    Setter       setter
  ) {
    super(mapper, schema);
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
  public ArrayChildSchema<P> defaultValue(ArrayNode node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(String... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(Object[] node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(boolean... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(byte... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(double... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(float... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(int... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(long... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(short... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(BigInteger... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(BigDecimal... node)
  {
    return (ArrayChildSchema<P>) super.defaultValue(node);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> maxItems(BigInteger val)
  {
    return (ArrayChildSchema<P>) super.maxItems(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> maxItems(long val)
  {
    return (ArrayChildSchema<P>) super.maxItems(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> maxItems(int val)
  {
    return (ArrayChildSchema<P>) super.maxItems(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeMaxItems()
  {
    return (ArrayChildSchema<P>) super.removeMaxItems();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> minItems(BigInteger val)
  {
    return (ArrayChildSchema<P>) super.minItems(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> minItems(long val)
  {
    return (ArrayChildSchema<P>) super.minItems(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> minItems(int val)
  {
    return (ArrayChildSchema<P>) super.minItems(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeMinItems()
  {
    return (ArrayChildSchema<P>) super.removeMinItems();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends ArrayChildSchema<P>> additionalItems()
  {
    return (UntypedChildSchema<? extends ArrayChildSchema<P>>) super.additionalItems();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> additionalItems(SchemaBuilder val)
  {
    return (ArrayChildSchema<P>) super.additionalItems(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeAdditionalItems()
  {
    return (ArrayChildSchema<P>) super.removeAdditionalItems();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends ArrayChildSchema<P>> items()
  {
    return (UntypedChildSchema<? extends ArrayChildSchema<P>>) super.items();
  }

  @Override
  @SuppressWarnings("unchecked")
  public SchemaSet<? extends ArrayChildSchema<P>> itemsArray()
  {
    return (SchemaSet<? extends ArrayChildSchema<P>>) super.itemsArray();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> items(SchemaBuilder val)
  {
    return (ArrayChildSchema<P>) super.items(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeItems()
  {
    return (ArrayChildSchema<P>) super.removeItems();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> enumValues(ArrayNode... vals)
  {
    return (ArrayChildSchema<P>) super.enumValues(vals);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> uniqueItems(boolean flag)
  {
    return (ArrayChildSchema<P>) super.uniqueItems(flag);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeUniqueItems()
  {
    return (ArrayChildSchema<P>) super.removeUniqueItems();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> id(String id)
  {
    return (ArrayChildSchema<P>) super.id(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeId()
  {
    return (ArrayChildSchema<P>) super.removeId();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> $schema(String path)
  {
    return (ArrayChildSchema<P>) super.$schema(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> remove$Schema()
  {
    return (ArrayChildSchema<P>) super.remove$Schema();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> $ref(String path)
  {
    return (ArrayChildSchema<P>) super.$ref(path);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> remove$Ref()
  {
    return (ArrayChildSchema<P>) super.remove$Ref();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> description(String desc)
  {
    return (ArrayChildSchema<P>) super.description(desc);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeDescription()
  {
    return (ArrayChildSchema<P>) super.removeDescription();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> title(String title)
  {
    return (ArrayChildSchema<P>) super.title(title);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeTitle()
  {
    return (ArrayChildSchema<P>) super.removeTitle();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeDefault()
  {
    return (ArrayChildSchema<P>) super.removeDefault();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeEnum()
  {
    return (ArrayChildSchema<P>) super.removeEnum();
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
  public UntypedChildSchema<? extends ArrayChildSchema<P>>
  definition(String name)
  {
    return (UntypedChildSchema<? extends ArrayChildSchema<P>>)
      super.definition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> definition(
    String name, SchemaBuilder schema
  )
  {
    return (ArrayChildSchema<P>) super.definition(name, schema);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeDefinition(String name)
  {
    return (ArrayChildSchema<P>) super.removeDefinition(name);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> removeDefinitions()
  {
    return (ArrayChildSchema<P>) super.removeDefinitions();
  }

  @Override
  @SuppressWarnings("unchecked")
  public ArrayChildSchema<P> defaultValue(JsonNode val)
  {
    return (ArrayChildSchema<P>) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends ArrayChildSchema<P>> not()
  {
    return (UntypedChildSchema<? extends ArrayChildSchema<P>>) super.not();
  }
}
