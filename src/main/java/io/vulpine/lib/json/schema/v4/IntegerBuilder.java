package io.vulpine.lib.json.schema.v4;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface IntegerBuilder<T extends IntegerBuilder<T>>
  extends SchemaObject<T>
{
  T defaultValue(int val);

  T defaultValue(BigInteger val);

  T maximum(int val);

  T maximum(long val);

  T maximum(BigInteger val);

  T clearMaximum();

  T exclusiveMaximum(boolean val);

  T clearExclusiveMaximum();

  T minimum(int val);

  T minimum(long val);

  T minimum(BigInteger val);

  T clearMinimum();

  T exclusiveMinimum(boolean val);

  T clearExclusiveMinimum();

  T multipleOf(byte val);

  T multipleOf(double val);

  T multipleOf(float val);

  T multipleOf(int val);

  T multipleOf(short val);

  T multipleOf(long val);

  T multipleOf(BigInteger val);

  T multipleOf(BigDecimal val);

  T clearMultipleOf();

  T enumValues(int... val);

  T enumValues(long... val);

  T enumValues(BigInteger... val);
}
