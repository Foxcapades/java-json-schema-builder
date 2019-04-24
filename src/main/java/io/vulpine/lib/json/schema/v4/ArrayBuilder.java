package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.node.ArrayNode;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @param <T>
 *   extension type
 */
public interface ArrayBuilder<T extends ArrayBuilder<T>> extends SchemaObject<T>
{

  /**
   * Sets the {@code "default"} property to the given {@link ArrayNode} value.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @throws NullPointerException
   *   implementing classes may throw this exception if the input value is
   *   {@code null}.
   *
   * @since 1.0
   */
  T defaultValue(ArrayNode node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code String}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(String... node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code Object}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(Object... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code boolean}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(boolean[] node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code
   * Boolean} values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(Boolean... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code byte}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(byte[] node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code Byte}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(Byte... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code double}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(double[] node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code Double}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(Double... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code float}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(float[] node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code Float}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(Float... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code int}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(int[] node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code
   * Integer} values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(Integer... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code long}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(long[] node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code Long}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(Long... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code short}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(short[] node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code Short}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(Short... node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code
   * BigInteger} values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(BigInteger... node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code
   * BigDecimal} values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T defaultValue(BigDecimal... node);

  /**
   * Sets the {@code "maxItems"} value for the current {@link ArrayBuilder}.
   *
   * @param val
   *   maxItems value to set
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "maxItems"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T maxItems(BigInteger val);

  /**
   * Sets the {@code "maxItems"} value for the current {@link ArrayBuilder}.
   *
   * @param val
   *   maxItems value to set
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T maxItems(int val);

  /**
   * Removes the {@code "maxItems"} property from the schema (if present).
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @since 1.3
   */
  T removeMaxItems();

  /**
   * Removes the {@code "maxItems"} property from the schema (if present).
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @since 1.0
   *
   * @deprecated removing clear methods in favor of remove methods
   */
  @Deprecated
  default T clearMaxItems()
  {
    return removeMaxItems();
  }

  /**
   * Sets the {@code "minItems"} value for the current {@link ArrayBuilder}.
   *
   * @param val
   *   minItems value to set
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "minItems"} property does not
   *   permit null values
   *
   * @since 1.0
   */
  T minItems(BigInteger val);

  /**
   * Sets the {@code "minItems"} value for the current {@link ArrayBuilder}.
   *
   * @param val
   *   minItems value to set
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T minItems(int val);

  /**
   * Removes the {@code "minItems"} property from the schema (if present).
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @since 1.3
   */
  T removeMinItems();

  /**
   * Removes the {@code "minItems"} property from the schema (if present).
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @since 1.0
   *
   * @deprecated removing clear methods in favor of remove methods
   */
  @Deprecated
  default T clearMinItems()
  {
    return removeMinItems();
  }

  /**
   * Creates a builder for the construction of the {@code "additionalItems"}
   * property.
   *
   * @return new SchemaBuilder
   *
   * @since 1.0
   */
  ChildSchemaBuilder<T> additionalItems();

  /**
   * Sets the {@code "additionalItems"} property to a copy of the given {@link
   * SchemaObject}.
   *
   * @param val {@code "additionalItems"} schema type definition.
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @since 1.0
   */
  T additionalItems(SchemaObject val);

  /**
   * Removes the {@code "additionalItems"} property from the {@link
   * ArrayBuilder}.
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @since 1.3
   */
  T removeAdditionalItems();

  /**
   * Removes the {@code "additionalItems"} property from the {@link
   * ArrayBuilder}.
   *
   * @return a modified instance of {@link ArrayBuilder}
   *
   * @since 1.0
   *
   * @deprecated removing clear methods in favor of remove methods
   */
  @Deprecated
  default T clearAdditionalItems()
  {
    return removeAdditionalItems();
  }

  /**
   * Creates a builder for the construction of a single type {@code "items"}
   * schema property.
   *
   * @return a new SchemaBuilder for the {@code "items"} property
   *
   * @since 1.0
   */
  ChildSchemaBuilder<T> items();

  /**
   * Creates a builder for the construction of a single type {@code "items"}
   * schema property.
   *
   * @return a new SchemaBuilder for the {@code "items"} property
   *
   * @since 1.0
   */
  TypeArrayBuilder<T> itemsArray();

  /**
   * Sets the {@code "items"} property to the given schema definition
   *
   * TODO: accept schema node, this could be an array.
   *
   * @param val schema to set at the {@code "items"} property
   *
   * @return a modified {@link ArrayBuilder}
   */
  T items(SchemaObject val);

  /**
   * Removes the {@code "items"} property
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.3
   */
  T removeItems();

  /**
   * Removes the {@code "items"} property
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.0
   *
   * @deprecated removing clear methods in favor of remove methods
   */
  @Deprecated
  default T clearItems()
  {
    return removeItems();
  }

  /**
   * Sets the {@code "enum"} property of the schema to the given set of arrays.
   *
   * @param vals possible array values for the {@code "enum"} property
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.1
   */
  T enumValues(ArrayNode... vals);

  /**
   * Sets the {@code "uniqueItems"} flag to the given boolean value.
   *
   * @param flag
   *   {@code "uniqueItems"} property value to set
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.2
   */
  T uniqueItems(boolean flag);

  /**
   * Removes the {@code "uniqueItems"} property.
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.3
   */
  T removeUniqueItems();

  /**
   * Removes the {@code "uniqueItems"} property.
   *
   * @return a modified {@link ArrayBuilder}
   *
   * @since 1.2
   *
   * @deprecated removing clear methods in favor of remove methods
   */
  @Deprecated
  default T clearUniqueItems()
  {
    return removeUniqueItems();
  }
}
