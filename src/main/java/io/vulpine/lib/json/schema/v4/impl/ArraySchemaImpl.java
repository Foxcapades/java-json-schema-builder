package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.JsonType;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

class ArraySchemaImpl extends SchemaNodeImpl implements ArraySchema
{
  ArraySchemaImpl(ObjectMapper mapper, ObjectNode schema)
  {
    super(mapper, schema, JsonType.ARRAY);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public ArraySchema defaultValue(ArrayNode node)
  {
    return put(DEFAULT, node);
  }

  @Override
  public ArraySchema defaultValue(String... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(Object[] node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(jax().valueToTree(b));
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(boolean... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(byte... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(double... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(float... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(int... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(long... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(short... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(BigInteger... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema defaultValue(BigDecimal... node)
  {
    final var o = newArr();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public ArraySchema maxItems(BigInteger val)
  {
    return put(MAX_ITEMS, val);
  }

  @Override
  public ArraySchema maxItems(long val)
  {
    return put(MAX_ITEMS, val);
  }

  @Override
  public ArraySchema maxItems(int val)
  {
    return put(MAX_ITEMS, val);
  }

  @Override
  public ArraySchema removeMaxItems()
  {
    return remove(MAX_ITEMS);
  }

  @Override
  public ArraySchema minItems(BigInteger val)
  {
    return put(MIN_ITEMS, val);
  }

  @Override
  public ArraySchema minItems(long val)
  {
    return put(MIN_ITEMS, val);
  }

  @Override
  public ArraySchema minItems(int val)
  {
    return put(MIN_ITEMS, val);
  }

  public ArraySchema removeMinItems()
  {
    return remove(MIN_ITEMS);
  }

  @Override
  public UntypedChildSchema<? extends ArraySchema> additionalItems()
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      this::additionalItems);
  }

  @Override
  public ArraySchema additionalItems(SchemaBuilder val)
  {
    return put(ADDTL_ITEMS, val);
  }

  @Override
  public ArraySchema removeAdditionalItems()
  {
    return remove(ADDTL_ITEMS);
  }

  @Override
  public UntypedChildSchema<? extends ArraySchema> items()
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      this::items);
  }

  @Override
  public SchemaSet<? extends ArraySchema> itemsArray()
  {
    return new SchemaSetImpl<>(this, jax(), newArr(), this::items);
  }

  @Override
  public ArraySchema items(SchemaBuilder val)
  {
    return put(ITEMS, val);
  }

  @Override
  public ArraySchema removeItems()
  {
    return remove(ITEMS);
  }

  @Override
  public ArraySchema enumValues(ArrayNode... vals)
  {
    if (vals.length < 1)
      return this;

    var en = enumArr();

    for (var a : vals)
      en.add(a);

    return this;
  }

  @Override
  public ArraySchema uniqueItems(boolean flag)
  {
    return put(UNIQUE, flag);
  }

  @Override
  public ArraySchema removeUniqueItems()
  {
    return remove(UNIQUE);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public ArraySchema id(String id)
  {
    return (ArraySchema) super.id(id);
  }

  @Override
  public ArraySchema removeId()
  {
    return (ArraySchema) super.removeId();
  }

  @Override
  public ArraySchema $schema(String path)
  {
    return (ArraySchema) super.$schema(path);
  }

  @Override
  public ArraySchema remove$Schema()
  {
    return (ArraySchema) super.remove$Schema();
  }

  @Override
  public ArraySchema $ref(String path)
  {
    return (ArraySchema) super.$ref(path);
  }

  @Override
  public ArraySchema remove$Ref()
  {
    return (ArraySchema) super.remove$Ref();
  }

  @Override
  public ArraySchema description(String desc)
  {
    return (ArraySchema) super.description(desc);
  }

  @Override
  public ArraySchema removeDescription()
  {
    return (ArraySchema) super.removeDescription();
  }

  @Override
  public ArraySchema title(String title)
  {
    return (ArraySchema) super.title(title);
  }

  @Override
  public ArraySchema removeTitle()
  {
    return (ArraySchema) super.removeTitle();
  }

  @Override
  public ArraySchema removeDefault()
  {
    return (ArraySchema) super.removeDefault();
  }

  @Override
  public ArraySchema removeEnum()
  {
    return (ArraySchema) super.removeEnum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends ArraySchema> definition(String name)
  {
    return (UntypedChildSchema<? extends ArraySchema>)
      super.definition(name);
  }

  @Override
  public ArraySchema definition(String name, SchemaBuilder schema)
  {
    return (ArraySchema) super.definition(name, schema);
  }

  @Override
  public ArraySchema removeDefinition(String name)
  {
    return (ArraySchema) super.removeDefinition(name);
  }

  @Override
  public ArraySchema removeDefinitions()
  {
    return (ArraySchema) super.removeDefinitions();
  }

  @Override
  public ArraySchema defaultValue(JsonNode val)
  {
    return (ArraySchema) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends ArraySchema> not()
  {
    return (UntypedChildSchema<? extends ArraySchema>) super.not();
  }

}
