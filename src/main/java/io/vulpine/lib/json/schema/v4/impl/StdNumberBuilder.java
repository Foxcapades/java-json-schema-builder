package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.JsonType;
import io.vulpine.lib.json.schema.v4.NumberBuilder;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

@SuppressWarnings("unchecked")
class StdNumberBuilder<T extends NumberBuilder<T>> extends StdSchemaObject<T>
implements NumberBuilder<T>
{
  StdNumberBuilder(ObjectMapper mapper)
  {
    super(mapper);
    this.schema.put(TYPE, JsonType.NUMBER.jsonName());
  }

  StdNumberBuilder(ObjectMapper mapper, ObjectNode schema)
  {
    super(mapper, schema);
    this.schema.put(TYPE, JsonType.NUMBER.jsonName());
  }

  @Override
  public T defaultValue(byte x)
  {
    return put(DEFAULT, x);
  }

  @Override
  public T defaultValue(short x)
  {
    return put(DEFAULT, x);
  }

  @Override
  public T defaultValue(int x)
  {
    return put(DEFAULT, x);
  }

  @Override
  public T defaultValue(long x)
  {
    return put(DEFAULT, x);
  }

  @Override
  public T defaultValue(float x)
  {
    return put(DEFAULT, x);
  }

  @Override
  public T defaultValue(double x)
  {
    return put(DEFAULT, x);
  }

  @Override
  public T defaultValue(BigInteger x)
  {
    return put(DEFAULT, x);
  }

  @Override
  public T defaultValue(BigDecimal x)
  {
    return put(DEFAULT, x);
  }

  @Override
  public T maximum(byte x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public T maximum(short x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public T maximum(int x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public T maximum(long x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public T maximum(float x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public T maximum(double x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public T maximum(BigInteger x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public T maximum(BigDecimal x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public T clearMaximum()
  {
    return clear(MAXIMUM);
  }

  @Override
  public T exclusiveMaximum(boolean b)
  {
    return put(EXCL_MAX, b);
  }

  @Override
  public T clearExclusiveMaximum()
  {
    return clear(EXCL_MAX);
  }

  @Override
  public T minimum(byte x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public T minimum(short x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public T minimum(int x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public T minimum(long x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public T minimum(float x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public T minimum(double x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public T minimum(BigInteger x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public T minimum(BigDecimal x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public T clearMinimum()
  {
    return clear(MINIMUM);
  }

  @Override
  public T exclusiveMinimum(boolean b)
  {
    return put(EXCL_MIN, b);
  }

  @Override
  public T clearExclusiveMinimum()
  {
    return clear(EXCL_MIN);
  }

  @Override
  public T multipleOf(byte x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(short x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(int x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(long x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(float x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(double x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(BigInteger x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(BigDecimal x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T clearMultipleOf()
  {
    return clear(MULTIPLE);
  }

  @Override
  public T enumValues(Number... vals)
  {
    var en = enumArr();

    for (var n : vals) {
      if (n instanceof Integer)
        en.add(n.intValue());
      else if (n instanceof Double)
        en.add(n.doubleValue());
      else if (n instanceof Long)
        en.add(n.longValue());
      else if (n instanceof Float)
        en.add(n.floatValue());
      else if (n instanceof BigInteger)
        en.add((BigInteger) n);
      else if (n instanceof BigDecimal)
        en.add((BigDecimal) n);
      else if (n instanceof Byte)
        en.add(n.byteValue());
      else if (n instanceof Short)
        en.add(n.shortValue());
      en.add(n.doubleValue()); // safest bet?
    }

    return (T) this;
  }
}
