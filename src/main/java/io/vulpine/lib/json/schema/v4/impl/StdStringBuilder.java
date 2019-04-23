package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.Format;
import io.vulpine.lib.json.schema.v4.JsonType;
import io.vulpine.lib.json.schema.v4.StringBuilder;

import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

class StdStringBuilder<T extends StringBuilder<T>>
extends StdSchemaObject<T>
implements StringBuilder<T>
{
  StdStringBuilder(ObjectMapper mapper)
  {
    super(mapper);
    this.schema.put(TYPE, JsonType.STRING.jsonName());
  }

  StdStringBuilder(ObjectMapper mapper, ObjectNode schema)
  {
    super(mapper, schema);
    this.schema.put(TYPE, JsonType.STRING.jsonName());
  }

  @Override
  public T defaultValue(String val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public T maxLength(BigInteger val)
  {
    return put(MAX_LENGTH, val);
  }

  @Override
  public T maxLength(int val)
  {
    return put(MAX_LENGTH, val);
  }

  @Override
  public T clearMaxLength()
  {
    return clear(MAX_LENGTH);
  }

  @Override
  public T minLength(BigInteger val)
  {
    return put(MIN_LENGTH, val);
  }

  @Override
  public T minLength(int val)
  {
    return put(MIN_LENGTH, val);
  }

  @Override
  public T clearMinLength()
  {
    return clear(MIN_LENGTH);
  }

  @Override
  public T pattern(String val)
  {
    return put(PATTERN, val);
  }

  @Override
  public T clearPattern()
  {
    return clear(PATTERN);
  }

  @Override
  @SuppressWarnings("unchecked")
  public T enumValues(String... vals)
  {
    var en = enumArr();
    for (final var a : vals)
      en.add(a);
    return (T) this;
  }

  @Override
  public T format(Format format)
  {
    return put(FORMAT, format.jsonValue);
  }

  @Override
  public T format(String format)
  {
    return put(FORMAT, format);
  }

  @Override
  public T clearFormat()
  {
    return clear(FORMAT);
  }
}
