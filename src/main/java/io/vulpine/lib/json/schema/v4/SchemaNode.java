package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;

/**
 * @since 2.0
 */
public interface SchemaNode extends SchemaBuilder
{
  /**
   * Sets the {@code "id"} value for the current.
   *
   * @param id
   *   id value to set
   *
   * @return an updated schema builder
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "id"} property does not permit
   *   null values
   *
   * @since 2.0
   */
  SchemaNode id(String id);

  /**
   * Removes the {@code "id"} property from the schema (if present).
   *
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNode removeId();

  /**
   * Sets the {@code "$schema"} value for the current.
   *
   * @param path {@code "$schema"} link path
   *
   * @return an updated schema builder
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "$schema"} property does not
   *   permit null values
   *
   * @since 2.0
   */
  SchemaNode $schema(String path);

  /**
   * Removes the {@code "$schema"} property from the schema (if present).
   *
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNode remove$Schema();

  /**
   * Sets the {@code "$ref"} value for the current.
   *
   * @param path {@code "$ref"} link path
   *
   * @return an updated schema builder
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "$ref"} property does not
   *   permit null values
   *
   * @since 2.0
   */
  SchemaNode $ref(String path);

  /**
   * Removes the {@code "$ref"} property from the schema (if present).
   *
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNode remove$Ref();

  /**
   * Sets the {@code "description"} value for the current.
   *
   * @param desc {@code "description"} link path
   *
   * @return an updated schema builder
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "description"} property does not
   *   permit null values
   *
   * @since 2.0
   */
  SchemaNode description(String desc);

  /**
   * Removes the {@code "description"} property from the schema (if present).
   *
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNode removeDescription();

  /**
   * Sets the {@code "title"} value for the current.
   *
   * @param title {@code "title"} link path
   *
   * @return an updated schema builder
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "title"} property does not
   *   permit null values
   *
   * @since 2.0
   */
  SchemaNode title(String title);

  /**
   * Removes the {@code "title"} property from the schema (if present).
   *
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNode removeTitle();

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
   * @return a new {@link UntypedChildSchema}
   *
   * @since 2.0
   */
  UntypedChildSchema<? extends SchemaNode> definition(String name);

  /**
   * Sets the named definition type to the given {@link SchemaBuilder} value.
   * <p>
   * If the {@code "definitions"} object was not already present in the current
   * schema builder then it will be added.
   *
   * @param name
   *   name of the property to add to the {@code "definitions"} object
   * @param schema
   *   schema type to add to the {@code "definitions"} object
   *
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNode definition(String name, SchemaBuilder schema);

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
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNode removeDefinition(String name);

  /**
   * Removes the {@code "definitions"} property from the current schema.
   *
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNode removeDefinitions();

  SchemaNode defaultValue(JsonNode val);

  /**
   * Removes the {@code "default"} property from the schema.
   *
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNode removeDefault();
}
