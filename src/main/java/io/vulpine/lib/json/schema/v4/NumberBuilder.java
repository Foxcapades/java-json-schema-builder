package io.vulpine.lib.json.schema.v4;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @param <T>
 *   Extending class type
 *
 * @since 1.0
 */
public interface NumberBuilder<T extends NumberBuilder<T>>
extends SchemaObject<T>
{
  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T defaultValue(byte val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T defaultValue(short val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T defaultValue(int val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T defaultValue(long val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T defaultValue(double val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T defaultValue(float val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "default"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T defaultValue(BigInteger val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "default"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T defaultValue(BigDecimal val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T maximum(byte val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T maximum(double val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T maximum(float val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T maximum(int val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T maximum(long val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T maximum(short val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "maximum"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T maximum(BigInteger val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "maximum"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T maximum(BigDecimal val);

  /**
   * Removes the {@code "maximum"} property from the schema (if present).
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.3
   */
  T removeMaximum();

  /**
   * Removes the {@code "maximum"} property from the schema (if present).
   *
   * @return an updated {@link NumberBuilder}
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
   * Sets the {@code "exclusiveMaximum"} value for the current {@link
   * NumberBuilder}.
   *
   * @param val
   *   exclusiveMaximum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T exclusiveMaximum(boolean val);

  /**
   * Removes the {@code "exclusiveMaximum"} property from the schema (if
   * present).
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.3
   */
  T removeExclusiveMaximum();

  /**
   * Removes the {@code "exclusiveMaximum"} property from the schema (if
   * present).
   *
   * @return an updated {@link NumberBuilder}
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
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T minimum(byte val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T minimum(double val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T minimum(float val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T minimum(int val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T minimum(long val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T minimum(short val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "minimum"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T minimum(BigDecimal val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "minimum"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T minimum(BigInteger val);

  /**
   * Removes the {@code "minimum"} property from the schema (if present).
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.3
   */
  T removeMinimum();

  /**
   * Removes the {@code "minimum"} property from the schema (if present).
   *
   * @return an updated {@link NumberBuilder}
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
   * Sets the {@code "exclusiveMinimum"} value for the current {@link
   * NumberBuilder}.
   *
   * @param val
   *   exclusiveMinimum value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T exclusiveMinimum(boolean val);

  /**
   * Removes the {@code "exclusiveMinimum"} property from the schema (if
   * present).
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.3
   */
  T removeExclusiveMinimum();

  /**
   * Removes the {@code "exclusiveMinimum"} property from the schema (if
   * present).
   *
   * @return an updated {@link NumberBuilder}
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
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T multipleOf(byte val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T multipleOf(short val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T multipleOf(int val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T multipleOf(long val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T multipleOf(float val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.0
   */
  T multipleOf(double val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "multipleOf"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T multipleOf(BigInteger val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "multipleOf"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T multipleOf(BigDecimal val);

  /**
   * Removes the {@code "multipleOf"} property from the schema (if present).
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.3
   */
  T removeMultipleOf();

  /**
   * Removes the {@code "multipleOf"} property from the schema (if present).
   *
   * @return an updated {@link NumberBuilder}
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
   * Sets an array of values to the {@code "default"} property
   *
   * @param vals {@code "default"} array values
   *
   * @return an updated {@link NumberBuilder}
   *
   * @since 1.1
   */
  T enumValues(Number... vals);
}
