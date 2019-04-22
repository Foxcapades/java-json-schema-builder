package io.vulpine.lib.json.schema.v4;

import java.math.BigInteger;

/**
 * @param <T>
 *   extension type
 */
public interface StringBuilder<T extends StringBuilder<T>>
extends SchemaObject<T>
{
  T defaultValue(String val);

  T maxLength(int val);

  T maxLength(BigInteger val);

  T clearMaxLength();

  T minLength(int val);

  T minLength(BigInteger val);

  T clearMinLength();

  T pattern(String pattern);

  T clearPattern();

  T enumValues(String... vals);

  T format(Format format);

  T format(String format);

  T clearFormat();
}
