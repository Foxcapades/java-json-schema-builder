package io.vulpine.lib.json.schema.v4;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.trait.*;

/**
 * @since 2.0
 */
public interface IntegerSchema
extends
  SchemaNode,
  HasRemoveEnum<IntegerSchema>,
  HasOrArray<IntegerSchema>,
  HasOrBoolean<IntegerSchema>,
  HasOrNull<IntegerSchema>,
  HasOrNumber<IntegerSchema>,
  HasOrObject<IntegerSchema>,
  HasOrString<IntegerSchema>
{
  /**
   * Sets the {@code "default"} property to the given value
   *
   * @param val
   *   schema {@code "default"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema defaultValue(int val);

  /**
   * Sets the {@code "default"} property to the given value
   *
   * @param val
   *   schema {@code "default"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema defaultValue(long val);

  /**
   * Sets the {@code "default"} property to the given value
   *
   * @param val
   *   schema {@code "default"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema defaultValue(BigInteger val);

  /**
   * Sets the {@code "maximum"} property to the given value
   *
   * @param val
   *   schema maximum value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema maximum(int val);

  /**
   * Sets the {@code "maximum"} property to the given value
   *
   * @param val
   *   schema maximum value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema maximum(long val);

  /**
   * Sets the {@code "maximum"} property to the given value
   *
   * @param val
   *   schema maximum value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema maximum(BigInteger val);

  /**
   * Removes the {@code "maximum"} property
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema removeMaximum();

  /**
   * Sets the {@code "exclusiveMaximum"} property to the given value
   *
   * @param val
   *   schema {@code "exclusiveMaximum"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema exclusiveMaximum(boolean val);

  /**
   * Removes the {@code "exclusiveMaximum"} property
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema removeExclusiveMaximum();

  /**
   * Sets the {@code "minimum"} property to the given value
   *
   * @param val
   *   schema minimum value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema minimum(int val);

  /**
   * Sets the {@code "minimum"} property to the given value
   *
   * @param val
   *   schema minimum value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema minimum(long val);

  /**
   * Sets the {@code "minimum"} property to the given value
   *
   * @param val
   *   schema minimum value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema minimum(BigInteger val);

  /**
   * Removes the {@code "minimum"} property
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema removeMinimum();

  /**
   * Sets the {@code "exclusiveMinimum"} property to the given value
   *
   * @param val
   *   schema {@code "exclusiveMinimum"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema exclusiveMinimum(boolean val);

  /**
   * Removes the {@code "exclusiveMinimum"} property
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema removeExclusiveMinimum();

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema multipleOf(double val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema multipleOf(float val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema multipleOf(int val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema multipleOf(long val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema multipleOf(BigInteger val);

  /**
   * Sets the {@code "multipleOf"} property to the given value
   *
   * @param val
   *   schema {@code "multipleOf"} value
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema multipleOf(BigDecimal val);

  /**
   * Removes the {@code "multipleOf"} property
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema removeMultipleOf();

  /**
   * Sets the {@code "enum"} property to the given array
   *
   * @param val
   *   schema {@code "enum"} array
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema enumValues(int... val);

  /**
   * Sets the {@code "enum"} property to the given array
   *
   * @param val
   *   schema {@code "enum"} array
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema enumValues(long... val);

  /**
   * Sets the {@code "enum"} property to the given array
   *
   * @param val
   *   schema {@code "enum"} array
   *
   * @return a modified {@link IntegerSchema}
   *
   * @since 2.0
   */
  IntegerSchema enumValues(BigInteger... val);

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  IntegerSchema id(String id);

  @Override
  IntegerSchema removeId();

  @Override
  IntegerSchema $schema(String path);

  @Override
  IntegerSchema remove$Schema();

  @Override
  IntegerSchema $ref(String path);

  @Override
  IntegerSchema remove$Ref();

  @Override
  IntegerSchema description(String desc);

  @Override
  IntegerSchema removeDescription();

  @Override
  IntegerSchema title(String title);

  @Override
  IntegerSchema removeTitle();

  @Override
  UntypedChildSchema<? extends IntegerSchema> definition(String name);

  @Override
  IntegerSchema definition(String name, SchemaBuilder schema);

  @Override
  IntegerSchema removeDefinition(String name);

  @Override
  IntegerSchema removeDefinitions();

  @Override
  IntegerSchema defaultValue(JsonNode val);

  @Override
  IntegerSchema removeDefault();

  @Override
  UntypedChildSchema<? extends IntegerSchema> not();
}
