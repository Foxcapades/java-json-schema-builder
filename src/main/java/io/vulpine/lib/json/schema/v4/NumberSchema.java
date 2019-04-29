package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.trait.*;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @since 2.0
 */
public interface NumberSchema
extends
  SchemaNode,
  HasRemoveEnum<NumberSchema>,
  HasOrArray<NumberSchema>,
  HasOrBoolean<NumberSchema>,
  HasOrInteger<NumberSchema>,
  HasOrNull<NumberSchema>,
  HasOrObject<NumberSchema>,
  HasOrString<NumberSchema>
{
  /**
   * Sets the {@code "default"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema defaultValue(int val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema defaultValue(long val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema defaultValue(double val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema defaultValue(float val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "default"} property does not
   *   permit null values
   * @since 2.0
   */
  NumberSchema defaultValue(BigInteger val);

  /**
   * Sets the {@code "default"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   default value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "default"} property does not
   *   permit null values
   * @since 2.0
   */
  NumberSchema defaultValue(BigDecimal val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema maximum(double val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema maximum(float val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema maximum(int val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema maximum(long val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "maximum"} property does not
   *   permit null values
   * @since 2.0
   */
  NumberSchema maximum(BigInteger val);

  /**
   * Sets the {@code "maximum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   maximum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "maximum"} property does not
   *   permit null values
   * @since 2.0
   */
  NumberSchema maximum(BigDecimal val);

  /**
   * Removes the {@code "maximum"} property from the schema (if present).
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema removeMaximum();

  /**
   * Sets the {@code "exclusiveMaximum"} value for the current {@link
   * NumberSchema}.
   *
   * @param val
   *   exclusiveMaximum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema exclusiveMaximum(boolean val);

  /**
   * Removes the {@code "exclusiveMaximum"} property from the schema (if
   * present).
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema removeExclusiveMaximum();

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema minimum(double val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema minimum(float val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema minimum(int val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema minimum(long val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "minimum"} property does not
   *   permit null values
   * @since 2.0
   */
  NumberSchema minimum(BigDecimal val);

  /**
   * Sets the {@code "minimum"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   minimum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "minimum"} property does not
   *   permit null values
   * @since 2.0
   */
  NumberSchema minimum(BigInteger val);

  /**
   * Removes the {@code "minimum"} property from the schema (if present).
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema removeMinimum();

  /**
   * Sets the {@code "exclusiveMinimum"} value for the current {@link
   * NumberSchema}.
   *
   * @param val
   *   exclusiveMinimum value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema exclusiveMinimum(boolean val);

  /**
   * Removes the {@code "exclusiveMinimum"} property from the schema (if
   * present).
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema removeExclusiveMinimum();

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema multipleOf(int val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema multipleOf(long val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema multipleOf(float val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema multipleOf(double val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "multipleOf"} property does not
   *   permit null values
   * @since 2.0
   */
  NumberSchema multipleOf(BigInteger val);

  /**
   * Sets the {@code "multipleOf"} value for the current {@link NumberSchema}.
   *
   * @param val
   *   multipleOf value to set
   *
   * @return an updated {@link NumberSchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "multipleOf"} property does not
   *   permit null values
   * @since 2.0
   */
  NumberSchema multipleOf(BigDecimal val);

  /**
   * Removes the {@code "multipleOf"} property from the schema (if present).
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema removeMultipleOf();

  /**
   * Sets an array of values to the {@code "default"} property
   *
   * @param vals
   *   {@code "default"} array values
   *
   * @return an updated {@link NumberSchema}
   *
   * @since 2.0
   */
  NumberSchema enumValues(Number... vals);

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  NumberSchema id(String id);

  @Override
  NumberSchema removeId();

  @Override
  NumberSchema $schema(String path);

  @Override
  NumberSchema remove$Schema();

  @Override
  NumberSchema $ref(String path);

  @Override
  NumberSchema remove$Ref();

  @Override
  NumberSchema description(String desc);

  @Override
  NumberSchema removeDescription();

  @Override
  NumberSchema title(String title);

  @Override
  NumberSchema removeTitle();

  @Override
  UntypedChildSchema<? extends NumberSchema> definition(String name);

  @Override
  NumberSchema definition(String name, SchemaBuilder schema);

  @Override
  NumberSchema removeDefinition(String name);

  @Override
  NumberSchema removeDefinitions();

  @Override
  NumberSchema defaultValue(JsonNode val);

  @Override
  NumberSchema removeDefault();
}
