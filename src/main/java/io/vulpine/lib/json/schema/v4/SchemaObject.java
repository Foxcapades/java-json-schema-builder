package io.vulpine.lib.json.schema.v4;

public interface SchemaObject<T extends SchemaObject<T>>
extends SchemaNode
{
  /**
   * Removes the {@code "default"} property from the schema (if present).
   *
   * @return a modified instance of {@link SchemaObject}
   */
  T clearDefaultValue();

  /**
   * Sets the {@code "id"} value for the current {@link SchemaObject}.
   *
   * @param id
   *   id value to set
   *
   * @return a modified instance of {@link SchemaObject}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "id"} property does not permit
   *   null values
   */
  T id(String id);

  /**
   * Removes the {@code "id"} property from the schema (if present).
   *
   * @return a modified instance of {@link SchemaObject}
   */
  T clearId();

  /**
   * Sets the {@code "$schema"} value for the current {@link SchemaObject}.
   *
   * @param path {@code "$schema"} link path
   *
   * @return a modified instance of {@link SchemaObject}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "$schema"} property does not
   *   permit null values
   */
  T $schema(String path);

  /**
   * Removes the {@code "$schema"} property from the schema (if present).
   *
   * @return a modified instance of {@link SchemaObject}
   */
  T clear$Schema();

  /**
   * Sets the {@code "$ref"} value for the current {@link SchemaObject}.
   *
   * @param path {@code "$ref"} link path
   *
   * @return a modified instance of {@link SchemaObject}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "$ref"} property does not
   *   permit null values
   */
  T $ref(String path);

  /**
   * Removes the {@code "$ref"} property from the schema (if present).
   *
   * @return a modified instance of {@link SchemaObject}
   */
  T clear$Ref();

  /**
   * Sets the {@code "description"} value for the current {@link SchemaObject}.
   *
   * @param desc {@code "description"} link path
   *
   * @return a modified instance of {@link SchemaObject}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "description"} property does not
   *   permit null values
   */
  T description(String desc);

  /**
   * Removes the {@code "description"} property from the schema (if present).
   *
   * @return a modified instance of {@link SchemaObject}
   */
  T clearDescription();

  /**
   * Sets the {@code "title"} value for the current {@link SchemaObject}.
   *
   * @param title {@code "title"} link path
   *
   * @return a modified instance of {@link SchemaObject}
   *
   * @throws NullPointerException
   *   if the input string is null.  The {@code "title"} property does not
   *   permit null values
   */
  T title(String title);

  /**
   * Removes the {@code "title"} property from the schema (if present).
   *
   * @return a modified instance of {@link SchemaObject}
   */
  T clearTitle();
}
