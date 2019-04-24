package io.vulpine.lib.json.schema.v4;

import java.math.BigInteger;

/**
 * @param <T>
 *   extension type
 */
public interface StringBuilder<T extends StringBuilder<T>>
extends SchemaObject<T>
{
  /**
   * Sets the {@code "default"} property
   *
   * @param val the new value for the {@code "default"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T defaultValue(String val);

  /**
   * Sets the {@code "maxLength"} property
   *
   * @param val the new value for the {@code "maxLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T maxLength(int val);

  /**
   * Sets the {@code "maxLength"} property
   *
   * @param val the new value for the {@code "maxLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.3
   */
  T maxLength(long val);

  /**
   * Sets the {@code "maxLength"} property
   *
   * @param val the new value for the {@code "maxLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T maxLength(BigInteger val);

  /**
   * Removes the {@code "maxLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T removeMaxLength();

  /**
   * Removes the {@code "maxLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   * @deprecated removing "clear" methods in favor of "remove" methods
   */
  @Deprecated
  default T clearMaxLength()
  {
    return removeMaxLength();
  }

  /**
   * Sets the {@code "minLength"} property
   *
   * @param val the new value for the {@code "minLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T minLength(int val);

  /**
   * Sets the {@code "minLength"} property
   *
   * @param val the new value for the {@code "minLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T minLength(long val);

  /**
   * Sets the {@code "minLength"} property
   *
   * @param val the new value for the {@code "minLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T minLength(BigInteger val);

  /**
   * Removes the {@code "minLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T removeMinLength();

  /**
   * Removes the {@code "minLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   * @deprecated removing "clear" methods in favor of "remove" methods
   */
  @Deprecated
  default T clearMinLength()
  {
    return removeMinLength();
  }

  /**
   * Sets the {@code "pattern"} property
   *
   * @param pattern the new value for the {@code "pattern"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T pattern(String pattern);

  /**
   * Removes the {@code "pattern"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   */
  T removePattern();

  /**
   * Removes the {@code "pattern"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.0
   * @deprecated removing "clear" methods in favor of "remove" methods
   */
  @Deprecated
  default T clearPattern()
  {
    return removePattern();
  }

  /**
   * Sets the {@code "enum"} property to an array of the given values.
   *
   * @param vals the new values for the {@code "enum"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.1
   */
  T enumValues(String... vals);

  /**
   * Sets the {@code "format"} property
   *
   * @param format the new value for the {@code "format"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.1
   */
  T format(Format format);

  /**
   * Sets the {@code "format"} property
   *
   * @param format the new value for the {@code "format"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.1
   */
  T format(String format);

  /**
   * Removes the {@code "format"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.1
   */
  T removeFormat();

  /**
   * Removes the {@code "format"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 1.1
   * @deprecated removing "clear" methods in favor of "remove" methods
   */
  @Deprecated
  default T clearFormat()
  {
    return removeFormat();
  }
}
