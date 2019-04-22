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
  T defaultValue(ArrayNode node);

  T defaultValue(String... node);

  T defaultValue(Object... node);

  T defaultValue(boolean[] node);

  T defaultValue(Boolean... node);

  T defaultValue(byte[] node);

  T defaultValue(Byte... node);

  T defaultValue(double[] node);

  T defaultValue(Double... node);

  T defaultValue(float[] node);

  T defaultValue(Float... node);

  T defaultValue(int[] node);

  T defaultValue(Integer... node);

  T defaultValue(long[] node);

  T defaultValue(Long... node);

  T defaultValue(short[] node);

  T defaultValue(Short... node);

  T defaultValue(BigInteger... node);

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
   */
  T maxItems(BigInteger val);

  /**
   * Sets the {@code "maxItems"} value for the current {@link ArrayBuilder}.
   *
   * @param val
   *   maxItems value to set
   *
   * @return a modified instance of {@link ArrayBuilder}
   */
  T maxItems(int val);

  /**
   * Removes the {@code "maxItems"} property from the schema (if present).
   *
   * @return a modified instance of {@link ArrayBuilder}
   */
  T clearMaxItems();

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
   */
  T minItems(BigInteger val);

  /**
   * Sets the {@code "minItems"} value for the current {@link ArrayBuilder}.
   *
   * @param val
   *   minItems value to set
   *
   * @return a modified instance of {@link ArrayBuilder}
   */
  T minItems(int val);

  /**
   * Removes the {@code "minItems"} property from the schema (if present).
   *
   * @return a modified instance of {@link ArrayBuilder}
   */
  T clearMinItems();

  ChildSchemaBuilder<T> additionalItems();

  T additionalItems(SchemaObject val);

  T clearAdditionalItems();

  ChildSchemaBuilder<T> items();

  TypeArrayBuilder<T> itemsArray();

  T items(SchemaObject val);

  T clearItems();
}
