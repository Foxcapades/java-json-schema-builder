package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.math.BigInteger;

/**
 * @param <T>
 *   extension type
 */
public interface ObjectBuilder<T extends ObjectBuilder<T>>
extends SchemaObject<T>
{
  /**
   * Creates a builder for an entry in the {@code "properties"} block of the
   * current {@link ObjectBuilder}.
   * <p>
   * Properties added via this method <b>will not</b> appear in the {@code
   * "required"} properties array.  If a required property is desired, see
   * {@link #requiredProperty(String)}.
   *
   * @param name
   *   name of the property to build
   *
   * @return an instance of a builder that can be used to construct the details
   * of the property.
   *
   * @since 1.0
   */
  ChildSchemaBuilder<T> optionalProperty(String name);

  /**
   * Sets an entry in the {@code "properties"} block of the current {@link
   * ObjectBuilder} by creating a copy of the input {@link SchemaNode}.
   * <p>
   * <b>NOTE</b>: Properties added via this method <b>will not</b> appear in
   * the
   * {@code "required"} properties array.  If a required property is desired,
   * see {@link #requiredProperty(String)}.
   * <p>
   * <b>WARNING</b>: Modifications to the input {@link SchemaNode} after
   * calling
   * this method will not be reflected in the internal state of this {@link
   * ObjectBuilder}
   *
   * @param name
   *   name of the property
   * @param node
   *   schema definition for the property
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   *
   * @since 1.0
   */
  T optionalProperty(String name, SchemaObject node);

  /**
   * Removes all entries in the {@code "properties"} object from this {@link
   * ObjectBuilder} that do not appear in the {@code "required"} properties
   * array.
   * <p>
   * If there are no properties remaining in the {@code "properties"} object
   * after this action, the {@code "properties"} object itself will be removed.
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   *
   * @since 1.0
   */
  T clearOptionalProperties();

  /**
   * Creates a builder for an entry in the {@code "properties"} block of the
   * current {@link ObjectBuilder}.
   * <p>
   * Additionally, properties added via this method will also be added to the
   * {@code "required"} properties array.  If an optional property is desired,
   * see {@link #optionalProperty(String)}.
   *
   * @param name
   *   name of the property to build
   *
   * @return an instance of a builder that can be used to construct the details
   * of the property.
   *
   * @since 1.0
   */
  ChildSchemaBuilder<T> requiredProperty(String name);

  /**
   * Sets an entry in the {@code "properties"} object and the {@code "required"}
   * array of the current {@link ObjectBuilder}.
   *
   * @param name
   *   name of the property to build
   * @param node
   *   constructed property details
   *
   * @return an instance of a builder that can be used to construct the details
   * of the property.
   *
   * @since 1.0
   */
  T requiredProperty(String name, SchemaObject node);

  /**
   * Removes all entries in the {@code "properties"} object from this {@link
   * ObjectBuilder} that also appear in the {@code "required"} properties array
   * then removes the {@code "required"} array itself.
   * <p>
   * If there are no properties remaining in the {@code "properties"} object
   * after this action, the {@code "properties"} object itself will be removed.
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   *
   * @since 1.0
   */
  T clearRequiredProperties();

  /**
   * Creates a builder for an entry in the {@code "patternProperties"} block of
   * the current {@link ObjectBuilder}.
   *
   * @param pattern
   *   matching pattern of the property to build
   *
   * @return an instance of a builder that can be used to construct the details
   * of the property.
   *
   * @since 1.0
   */
  ChildSchemaBuilder<T> patternProperty(String pattern);

  /**
   * Sets an entry in the {@code "patternProperties"} block of the current
   * {@link ObjectBuilder} by creating a copy of the input {@link SchemaNode}.
   * <p>
   * <b>WARNING</b>: Modifications to the input {@link SchemaNode} after
   * calling
   * this method will not be reflected in the internal state of this {@link
   * ObjectBuilder}
   *
   * @param pattern
   *   matching pattern for this property
   * @param node
   *   schema definition for the property
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   *
   * @since 1.0
   */
  T patternProperty(String pattern, SchemaObject node);

  /**
   * Removes the {@code "patternProperties"} object from the current {@link
   * ObjectBuilder}.
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   *
   * @since 1.0
   */
  T clearPatternProperties();

  /**
   * Sets the {@code "additionalProperties"} field to the given boolean value.
   *
   * @param val
   *   {@code "additionalProperties"} flag setting
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   *
   * @since 1.0
   */
  T additionalProperties(boolean val);

  /**
   * Creates a new builder to create the schema definition for the the {@code
   * "additionalProperties"} field.
   *
   * @return an instance of a builder that can be used to construct the details
   * of the {@code "additionalProperties"} type.
   *
   * @since 1.0
   */
  ChildSchemaBuilder<T> additionalProperties();

  /**
   * Sets the {@code "additionalProperties"} field to be a copy of the given
   * schema definition.
   *
   * @param node
   *   {@code "additionalProperties"} type definition
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   *
   * @since 1.0
   */
  T additionalProperties(SchemaObject node);

  /**
   * Removes the {@code "additionalProperties"} field from the current {@link
   * ObjectBuilder}
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   *
   * @since 1.0
   */
  T clearAdditionalProperties();

  T enumValues(ObjectNode... types);

  /**
   * Sets the {@code "maxProperties"} object schema property
   *
   * @param val
   *   value for the {@code "maxProperties"} property
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T maxProperties(int val);

  /**
   * Sets the {@code "maxProperties"} object schema property
   *
   * @param val
   *   value for the {@code "maxProperties"} property
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T maxProperties(long val);

  /**
   * Sets the {@code "maxProperties"} object schema property
   *
   * @param val
   *   value for the {@code "maxProperties"} property
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T maxProperties(BigInteger val);

  /**
   * Removes the {@code "maxProperties"} property
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T clearMaxProperties();

  /**
   * Sets the {@code "minProperties"} object schema property
   *
   * @param val
   *   value for the {@code "minProperties"} property
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T minProperties(int val);

  /**
   * Sets the {@code "minProperties"} object schema property
   *
   * @param val
   *   value for the {@code "minProperties"} property
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T minProperties(long val);

  /**
   * Sets the {@code "minProperties"} object schema property
   *
   * @param val
   *   value for the {@code "minProperties"} property
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T minProperties(BigInteger val);

  /**
   * Removes the {@code "minProperties"} property
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T clearMinProperties();

  /**
   * Creates a builder which can be used to create a definition type at the
   * given name property.
   * <p>
   * If the {@code "definitions"} object was not already present in the current
   * schema builder then it will be added.
   *
   * @param name
   *   name of the definition to build
   *
   * @return a new {@link ChildObjectBuilder}
   *
   * @since 1.2
   */
  ChildObjectBuilder<T> definition(String name);

  /**
   * Sets the named definition type to the given {@link SchemaObject} value.
   * <p>
   * If the {@code "definitions"} object was not already present in the current
   * schema builder then it will be added.
   *
   * @param name
   *   name of the property to add to the {@code "definitions"} object
   * @param schema
   *   schema type to add to the {@code "definitions"} object
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T definition(String name, SchemaObject schema);

  /**
   * Removes the definition type keyed at the given name from the {@code
   * "definitions"} object.
   * <p>
   * If the there are no definitions remaining in the schema after this removal
   * the {@code "definitions"} property itself will be removed.
   *
   * @param name
   *   name of the definition type to remove
   *
   * @return a modified {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T clearDefinition(String name);

  /**
   * Removes the {@code "definitions"} property from the current schema.
   *
   * @return a modifed {@link ObjectBuilder}
   *
   * @since 1.2
   */
  T clearDefinitions();
}
