package io.vulpine.lib.json.schema.v4;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @param <T> Extending class type
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
   * @return a modified instance of {@link NumberBuilder}
   */
  T defaultValue(byte val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T defaultValue(short val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T defaultValue(int val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T defaultValue(long val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T defaultValue(double val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T defaultValue(float val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "default"} property does not
   *   permit null values
   */
  T defaultValue(BigInteger val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   default value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "default"} property does not
   *   permit null values
   */
  T defaultValue(BigDecimal val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T maximum(byte val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T maximum(double val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T maximum(float val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T maximum(int val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T maximum(long val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T maximum(short val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "maximum"} property does not
   *   permit null values
   */
  T maximum(BigInteger val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   maximum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "maximum"} property does not
   *   permit null values
   */
  T maximum(BigDecimal val);

  /**
   * Removes the {@code "maximum"} property from the schema (if present).
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T clearMaximum();

  /**
   * Sets the {@code "exclusiveMaximum"} value for the current {@link
   * NumberBuilder}.
   *
   * @param val
   *   exclusiveMaximum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T exclusiveMaximum(boolean val);

  /**
   * Removes the {@code "exclusiveMaximum"} property from the schema (if
   * present).
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T clearExclusiveMaximum();

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T minimum(byte val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T minimum(double val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T minimum(float val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T minimum(int val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T minimum(long val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T minimum(short val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "minimum"} property does not
   *   permit null values
   */
  T minimum(BigDecimal val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   minimum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "minimum"} property does not
   *   permit null values
   */
  T minimum(BigInteger val);

  /**
   * Removes the {@code "minimum"} property from the schema (if present).
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T clearMinimum();

  /**
   * Sets the {@code "exclusiveMinimum"} value for the current {@link
   * NumberBuilder}.
   *
   * @param val
   *   exclusiveMinimum value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T exclusiveMinimum(boolean val);

  /**
   * Removes the {@code "exclusiveMinimum"} property from the schema (if
   * present).
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T clearExclusiveMinimum();

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T multipleOf(byte val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T multipleOf(short val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T multipleOf(int val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T multipleOf(long val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T multipleOf(float val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T multipleOf(double val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "multipleOf"} property does not
   *   permit null values
   */
  T multipleOf(BigInteger val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberBuilder}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return a modified instance of {@link NumberBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "multipleOf"} property does not
   *   permit null values
   */
  T multipleOf(BigDecimal val);

  /**
   * Removes the {@code "multipleOf"} property from the schema (if present).
   *
   * @return a modified instance of {@link NumberBuilder}
   */
  T clearMultipleOf();
}
