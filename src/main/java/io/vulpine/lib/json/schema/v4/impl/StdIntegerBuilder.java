package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.IntegerBuilder;
import io.vulpine.lib.json.schema.v4.JsonType;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

@SuppressWarnings("unchecked")
class StdIntegerBuilder<T extends IntegerBuilder<T>>
extends StdSchemaObject<T>
implements IntegerBuilder<T>
{
  StdIntegerBuilder(ObjectMapper mapper, ObjectNode schema)
  {
    super(mapper, schema);
    this.schema.put(TYPE, JsonType.INTEGER.jsonName());
  }

  @Override
  public T defaultValue(int v)
  {
    return put(DEFAULT, v);
  }

  @Override
  public T defaultValue(BigInteger v)
  {
    return put(DEFAULT, v);
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
  public T maximum(BigInteger x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public T clearMaximum()
  {
    return clear(MAXIMUM);
  }

  @Override
  public T exclusiveMaximum(boolean f)
  {
    return put(EXCL_MAX, f);
  }

  @Override
  public T clearExclusiveMaximum()
  {
    return clear(EXCL_MAX);
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
  public T minimum(BigInteger x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public T clearMinimum()
  {
    return clear(MINIMUM);
  }

  @Override
  public T exclusiveMinimum(boolean x)
  {
    return put(EXCL_MIN, x);
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
  public T multipleOf(double x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(float x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(int x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(short x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public T multipleOf(long x)
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
  public T enumValues(int... val)
  {
    var en = enumArr();

    for (var i : val)
      en.add(i);

    return (T) this;
  }

  @Override
  public T enumValues(long... val)
  {
    var en = enumArr();

    for (var l : val)
      en.add(l);

    return (T) this;
  }

  @Override
  public T enumValues(BigInteger... val)
  {
    var en = enumArr();

    for (var b : val)
      en.add(b);

    return (T) this;
  }
}
