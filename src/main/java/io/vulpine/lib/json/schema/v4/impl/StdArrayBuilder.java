package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

@SuppressWarnings("unchecked")
class StdArrayBuilder<T extends ArrayBuilder<T>>
extends StdSchemaObject<T>
implements ArrayBuilder<T>
{
  StdArrayBuilder(ObjectMapper mapper, ObjectNode schema)
  {
    super(mapper, schema);
    this.schema.put(TYPE, JsonType.ARRAY.jsonName());
  }

  @Override
  public T defaultValue(ArrayNode node)
  {
    return put(DEFAULT, node);
  }

  @Override
  public T defaultValue(String... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(Object... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(mapper.valueToTree(b));
    return defaultValue(o);
  }

  @Override
  public T defaultValue(boolean[] node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(Boolean... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(byte[] node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(Byte... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(double[] node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(Double... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(float[] node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(Float... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(int[] node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(Integer... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(long[] node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(Long... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(short[] node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(Short... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(BigInteger... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T defaultValue(BigDecimal... node)
  {
    final var o = mapper.createArrayNode();
    for (final var b : node)
      o.add(b);
    return defaultValue(o);
  }

  @Override
  public T maxItems(BigInteger val)
  {
    return put(MAX_ITEMS, val);
  }

  @Override
  public T maxItems(int val)
  {
    return put(MAX_ITEMS, val);
  }

  @Override
  public T clearMaxItems()
  {
    return clear(MAX_ITEMS);
  }

  @Override
  public T minItems(BigInteger val)
  {
    return put(MIN_ITEMS, val);
  }

  @Override
  public T minItems(int val)
  {
    return put(MIN_ITEMS, val);
  }

  public T clearMinItems()
  {
    return clear(MIN_ITEMS);
  }

  @Override
  public ChildSchemaBuilder<T> additionalItems()
  {
    return new StdChildSchemaBuilder<>((T) this,
      mapper,
      schema.putObject(ADDTL_ITEMS));
  }

  @Override
  public T additionalItems(SchemaObject val)
  {
    return put(ADDTL_ITEMS, val);
  }

  @Override
  public T clearAdditionalItems()
  {
    return clear(ADDTL_ITEMS);
  }

  @Override
  public ChildSchemaBuilder<T> items()
  {
    return new StdChildSchemaBuilder<>((T) this,
      mapper,
      schema.putObject(ITEMS));
  }

  @Override
  public TypeArrayBuilder<T> itemsArray()
  {
    return new StdTypeArrayBuilder<>((T) this, mapper, schema.putArray(ITEMS));
  }

  @Override
  public T items(SchemaObject val)
  {
    return put(ITEMS, val);
  }

  @Override
  public T clearItems()
  {
    return clear(ITEMS);
  }

  @Override
  public T enumValues(ArrayNode... vals)
  {
    var en = enumArr();

    for (var a : vals)
      en.add(a);

    return (T) this;
  }

  @Override
  public T uniqueItems(boolean flag)
  {
    return put(UNIQUE, flag);
  }

  @Override
  public T clearUniqueItems()
  {
    return clear(UNIQUE);
  }
}
