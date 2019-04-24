package io.vulpine.lib.json.schema.v4;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface IntegerBuilder<T extends IntegerBuilder<T>>
extends SchemaObject<T>
{
  /**
   * Sets the {@code "default"} property to the given value
   *
   * @param val
   *   schema {@code "default"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T defaultValue(int val);

  /**
   * Sets the {@code "default"} property to the given value
   *
   * @param val
   *   schema {@code "default"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.3
   */
  T defaultValue(long val);

  /**
   * Sets the {@code "default"} property to the given value
   *
   * @param val
   *   schema {@code "default"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T defaultValue(BigInteger val);

  /**
   * Sets the {@code "maximum"} property to the given value
   *
   * @param val
   *   schema maximum value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T maximum(int val);

  /**
   * Sets the {@code "maximum"} property to the given value
   *
   * @param val
   *   schema maximum value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.1
   */
  T maximum(long val);

  /**
   * Sets the {@code "maximum"} property to the given value
   *
   * @param val
   *   schema maximum value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T maximum(BigInteger val);

  /**
   * Removes the {@code "maximum"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.3
   */
  T removeMaximum();

  /**
   * Removes the {@code "maximum"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   * @deprecated removing "clear" methods in favor of "remove" methods.
   */
  @Deprecated
  default T clearMaximum()
  {
    return removeMaximum();
  }

  /**
   * Sets the {@code "exclusiveMaximum"} property to the given value
   *
   * @param val
   *   schema {@code "exclusiveMaximum"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T exclusiveMaximum(boolean val);

  /**
   * Removes the {@code "exclusiveMaximum"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.3
   */
  T removeExclusiveMaximum();

  /**
   * Removes the {@code "exclusiveMaximum"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   * @deprecated removing "clear" methods in favor of "remove" methods.
   */
  @Deprecated
  default T clearExclusiveMaximum()
  {
    return removeExclusiveMaximum();
  }

  /**
   * Sets the {@code "minimum"} property to the given value
   *
   * @param val
   *   schema minimum value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T minimum(int val);

  /**
   * Sets the {@code "minimum"} property to the given value
   *
   * @param val
   *   schema minimum value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.1
   */
  T minimum(long val);

  /**
   * Sets the {@code "minimum"} property to the given value
   *
   * @param val
   *   schema minimum value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T minimum(BigInteger val);

  /**
   * Removes the {@code "minimum"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.3
   */
  T removeMinimum();

  /**
   * Removes the {@code "minimum"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   * @deprecated removing "clear" methods in favor of "remove" methods.
   */
  @Deprecated
  default T clearMinimum()
  {
    return removeMinimum();
  }

  /**
   * Sets the {@code "exclusiveMinimum"} property to the given value
   *
   * @param val
   *   schema {@code "exclusiveMinimum"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T exclusiveMinimum(boolean val);

  /**
   * Removes the {@code "exclusiveMinimum"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T removeExclusiveMinimum();

  /**
   * Removes the {@code "exclusiveMinimum"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   * @deprecated removing "clear" methods in favor of "remove" methods.
   */
  @Deprecated
  default T clearExclusiveMinimum()
  {
    return removeExclusiveMinimum();
  }

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T multipleOf(byte val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T multipleOf(double val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T multipleOf(float val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T multipleOf(int val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T multipleOf(short val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T multipleOf(long val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T multipleOf(BigInteger val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T multipleOf(BigDecimal val);

  /**
   * Removes the {@code "multipleOf"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   */
  T removeMultipleOf();

  /**
   * Removes the {@code "multipleOf"} property
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.0
   * @deprecated removing "clear" methods in favor of "remove" methods.
   */
  @Deprecated
  default T clearMultipleOf()
  {
    return removeMultipleOf();
  }

  /**
   * Sets the {@code "enum"} property to the given array
   *
   * @param val
   *   schema {@code "enum"} array
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.1
   */
  T enumValues(int... val);

  /**
   * Sets the {@code "enum"} property to the given array
   *
   * @param val
   *   schema {@code "enum"} array
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.1
   */
  T enumValues(long... val);

  /**
   * Sets the {@code "enum"} property to the given array
   *
   * @param val
   *   schema {@code "enum"} array
   *
   * @return a modified {@link IntegerBuilder}
   *
   * @since 1.1
   */
  T enumValues(BigInteger... val);
}
