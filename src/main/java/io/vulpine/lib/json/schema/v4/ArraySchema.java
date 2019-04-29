package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.trait.*;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @since 2.0
 */
public interface ArraySchema
extends
  SchemaNode,
  HasRemoveEnum<ArraySchema>,
  HasOrBoolean<ArraySchema>,
  HasOrInteger<ArraySchema>,
  HasOrNull<ArraySchema>,
  HasOrNumber<ArraySchema>,
  HasOrObject<ArraySchema>,
  HasOrString<ArraySchema>
{
  /**
   * Sets the {@code "default"} property to the given {@link ArrayNode} value.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @throws NullPointerException
   *   implementing classes may throw this exception if the input value is
   *   {@code null}.
   * @since 2.0
   */
  ArraySchema defaultValue(ArrayNode node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code String}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(String... node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code Object}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(Object[] node);

  /**
   * Sets the {@code "default"} property to the given array of {@code boolean}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(boolean... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code byte}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(byte... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code double}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(double... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code float}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(float... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code int}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(int... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code long}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(long... node);

  /**
   * Sets the {@code "default"} property to the given array of {@code short}
   * values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(short... node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code
   * BigInteger} values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(BigInteger... node);

  /**
   * Sets the {@code "default"} property to an array of the given {@code
   * BigDecimal} values.
   *
   * @param node
   *   new {@code "default"} property value
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema defaultValue(BigDecimal... node);

  /**
   * Sets the {@code "maxItems"} value for the current {@link ArraySchema}.
   *
   * @param val
   *   maxItems value to set
   *
   * @return a modified instance of {@link ArraySchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "maxItems"} property does not
   *   permit null values
   * @since 2.0
   */
  ArraySchema maxItems(BigInteger val);

  /**
   * Sets the {@code "maxItems"} value for the current {@link ArraySchema}.
   *
   * @param val
   *   maxItems value to set
   *
   * @return a modified instance of {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema maxItems(int val);

  /**
   * Removes the {@code "maxItems"} property from the schema (if present).
   *
   * @return a modified instance of {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema removeMaxItems();

  /**
   * Sets the {@code "minItems"} value for the current {@link ArraySchema}.
   *
   * @param val
   *   minItems value to set
   *
   * @return a modified instance of {@link ArraySchema}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "minItems"} property does not
   *   permit null values
   * @since 2.0
   */
  ArraySchema minItems(BigInteger val);

  /**
   * Sets the {@code "minItems"} value for the current {@link ArraySchema}.
   *
   * @param val
   *   minItems value to set
   *
   * @return a modified instance of {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema minItems(int val);

  /**
   * Removes the {@code "minItems"} property from the schema (if present).
   *
   * @return a modified instance of {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema removeMinItems();

  /**
   * Creates a builder for the construction of the {@code "additionalItems"}
   * property.
   *
   * @return new SchemaBuilder
   *
   * @since 2.0
   */
  UntypedChildSchema<? extends ArraySchema> additionalItems();

  /**
   * Sets the {@code "additionalItems"} property to a copy of the given {@link
   * SchemaBuilder}.
   *
   * @param val
   *   {@code "additionalItems"} schema type definition.
   *
   * @return a modified instance of {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema additionalItems(SchemaBuilder val);

  /**
   * Removes the {@code "additionalItems"} property from the {@link
   * ArraySchema}.
   *
   * @return a modified instance of {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema removeAdditionalItems();

  /**
   * Creates a builder for the construction of a single type {@code "items"}
   * schema property.
   *
   * @return a new SchemaBuilder for the {@code "items"} property
   *
   * @since 2.0
   */
  UntypedChildSchema<? extends ArraySchema> items();

  /**
   * Creates a builder for the construction of a single type {@code "items"}
   * schema property.
   *
   * @return a new SchemaBuilder for the {@code "items"} property
   *
   * @since 2.0
   */
  SchemaSet<? extends ArraySchema> itemsArray();

  /**
   * Sets the {@code "items"} property to the given schema definition
   * <p>
   * TODO: accept schema node, this could be an array.
   *
   * @param val
   *   schema to set at the {@code "items"} property
   *
   * @return a modified {@link ArraySchema}
   */
  ArraySchema items(SchemaBuilder val);

  /**
   * Removes the {@code "items"} property
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema removeItems();

  /**
   * Sets the {@code "enum"} property of the schema to the given set of arrays.
   *
   * @param vals
   *   possible array values for the {@code "enum"} property
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema enumValues(ArrayNode... vals);

  /**
   * Sets the {@code "uniqueItems"} flag to the given boolean value.
   *
   * @param flag
   *   {@code "uniqueItems"} property value to set
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema uniqueItems(boolean flag);

  /**
   * Removes the {@code "uniqueItems"} property.
   *
   * @return a modified {@link ArraySchema}
   *
   * @since 2.0
   */
  ArraySchema removeUniqueItems();

  // Return type overrides
  @Override
  ArraySchema id(String id);

  @Override
  ArraySchema removeId();

  @Override
  ArraySchema $schema(String path);

  @Override
  ArraySchema remove$Schema();

  @Override
  ArraySchema $ref(String path);

  @Override
  ArraySchema remove$Ref();

  @Override
  ArraySchema description(String desc);

  @Override
  ArraySchema removeDescription();

  @Override
  ArraySchema title(String title);

  @Override
  ArraySchema removeTitle();

  @Override
  UntypedChildSchema<? extends ArraySchema> definition(String name);

  @Override
  ArraySchema definition(String name, SchemaBuilder schema);

  @Override
  ArraySchema removeDefinition(String name);

  @Override
  ArraySchema removeDefinitions();

  @Override
  ArraySchema defaultValue(JsonNode val);

  @Override
  ArraySchema removeDefault();

  @Override
  UntypedChildSchema<? extends ArraySchema> not();
}
