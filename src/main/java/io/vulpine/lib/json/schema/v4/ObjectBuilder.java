package io.vulpine.lib.json.schema.v4;

/**
 * @param <T> extension type
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
   */
  ChildSchemaBuilder<T> optionalProperty(String name);

  /**
   * Sets an entry in the {@code "properties"} block of the current {@link
   * ObjectBuilder} by creating a copy of the input {@link SchemaNode}.
   * <p>
   * <b>NOTE</b>: Properties added via this method <b>will not</b> appear in the
   * {@code "required"} properties array.  If a required property is desired,
   * see {@link #requiredProperty(String)}.
   * <p>
   * <b>WARNING</b>: Modifications to the input {@link SchemaNode} after calling
   * this method will not be reflected in the internal state of this {@link
   * ObjectBuilder}
   *
   * @param name
   *   name of the property
   * @param node
   *   schema definition for the property
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
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
   */
  ChildSchemaBuilder<T> patternProperty(String pattern);

  /**
   * Sets an entry in the {@code "patternProperties"} block of the current
   * {@link ObjectBuilder} by creating a copy of the input {@link SchemaNode}.
   * <p>
   * <b>WARNING</b>: Modifications to the input {@link SchemaNode} after calling
   * this method will not be reflected in the internal state of this {@link
   * ObjectBuilder}
   *
   * @param pattern
   *   matching pattern for this property
   * @param node
   *   schema definition for the property
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   */
  T patternProperty(String pattern, SchemaObject node);

  /**
   * Removes the {@code "patternProperties"} object from the current {@link
   * ObjectBuilder}.
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   */
  T clearPatternProperties();

  /**
   * Sets the {@code "additionalProperties"} field to the given boolean value.
   *
   * @param val
   *   {@code "additionalProperties"} flag setting
   *
   * @return a modified instance of the current {@link ObjectBuilder}.
   */
  T additionalProperties(boolean val);

  /**
   * Creates a new builder to create the schema definition for the the
   * {@code "additionalProperties"} field.
   *
   * @return an instance of a builder that can be used to construct the details
   * of the {@code "additionalProperties"} type.
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
   */
  T additionalProperties(SchemaObject node);

  /**
   * Removes the {@code "additionalProperties"} field from the current {@link
   * ObjectBuilder}
   *

   * @return a modified instance of the current {@link ObjectBuilder}.
   */
  T clearAdditionalProperties();
}
