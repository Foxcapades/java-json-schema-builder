package io.vulpine.lib.json.schema.v4;

import java.math.BigInteger;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.trait.*;

/**
 * @since 2.0
 */
public interface StringSchema
extends SchemaNode,
  HasRemoveEnum<StringSchema>,
  HasOrArray<StringSchema>,
  HasOrBoolean<StringSchema>,
  HasOrInteger<StringSchema>,
  HasOrNull<StringSchema>,
  HasOrNumber<StringSchema>,
  HasOrObject<StringSchema>
{
  /**
   * Sets the {@code "default"} property
   *
   * @param val
   *   the new value for the {@code "default"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema defaultValue(String val);

  /**
   * Sets the {@code "maxLength"} property
   *
   * @param val
   *   the new value for the {@code "maxLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema maxLength(int val);

  /**
   * Sets the {@code "maxLength"} property
   *
   * @param val
   *   the new value for the {@code "maxLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema maxLength(long val);

  /**
   * Sets the {@code "maxLength"} property
   *
   * @param val
   *   the new value for the {@code "maxLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema maxLength(BigInteger val);

  /**
   * Removes the {@code "maxLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema removeMaxLength();

  /**
   * Sets the {@code "minLength"} property
   *
   * @param val
   *   the new value for the {@code "minLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema minLength(int val);

  /**
   * Sets the {@code "minLength"} property
   *
   * @param val
   *   the new value for the {@code "minLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema minLength(long val);

  /**
   * Sets the {@code "minLength"} property
   *
   * @param val
   *   the new value for the {@code "minLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema minLength(BigInteger val);

  /**
   * Removes the {@code "minLength"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema removeMinLength();

  /**
   * Sets the {@code "pattern"} property
   *
   * @param pattern
   *   the new value for the {@code "pattern"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema pattern(String pattern);

  /**
   * Removes the {@code "pattern"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema removePattern();

  /**
   * Sets the {@code "enum"} property to an array of the given values.
   *
   * @param vals
   *   the new values for the {@code "enum"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema enumValues(String... vals);

  /**
   * Sets the {@code "format"} property
   *
   * @param format
   *   the new value for the {@code "format"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema format(Format format);

  /**
   * Sets the {@code "format"} property
   *
   * @param format
   *   the new value for the {@code "format"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema format(String format);

  /**
   * Removes the {@code "format"} property
   *
   * @return an updated {@link StringBuilder}
   *
   * @since 2.0
   */
  StringSchema removeFormat();

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  StringSchema id(String id);

  @Override
  StringSchema removeId();

  @Override
  StringSchema $schema(String path);

  @Override
  StringSchema remove$Schema();

  @Override
  StringSchema $ref(String path);

  @Override
  StringSchema remove$Ref();

  @Override
  StringSchema description(String desc);

  @Override
  StringSchema removeDescription();

  @Override
  StringSchema title(String title);

  @Override
  StringSchema removeTitle();

  @Override
  UntypedChildSchema<? extends StringSchema> definition(String name);

  @Override
  StringSchema definition(String name, SchemaBuilder schema);

  @Override
  StringSchema removeDefinition(String name);

  @Override
  StringSchema removeDefinitions();

  @Override
  StringSchema defaultValue(JsonNode val);

  @Override
  StringSchema removeDefault();
}
