package io.vulpine.lib.json.schema.v4;

/**
 * @param <T>
 *
 * @since 1.1
 */
public interface VariableBuilder<T extends VariableBuilder<T>>
extends SchemaNode
{
  /**
   * Create and append a new array value schema to the current type set
   *
   * @return the created array schema builder
   *
   * @since 1.1
   */
  ChildArrayBuilder<T> addArray();

  /**
   * Create and append a new boolean value schema to the current type set
   *
   * @return the created boolean schema builder
   *
   * @since 1.1
   */
  ChildBooleanBuilder<T> addBoolean();

  /**
   * Create and append a new integer value schema to the current type set
   *
   * @return the created integer schema builder
   *
   * @since 1.1
   */
  ChildIntegerBuilder<T> addInteger();

  /**
   * Create and append a new null value schema to the current type set
   *
   * @return the created null schema builder
   *
   * @since 1.1
   */
  ChildNullBuilder<T> addNull();

  /**
   * Create and append a new number value schema to the current type set
   *
   * @return the created number schema builder
   *
   * @since 1.1
   */
  ChildNumberBuilder<T> addNumber();

  /**
   * Create and append a new object value schema to the current type set
   *
   * @return the created object schema builder
   *
   * @since 1.1
   */
  ChildObjectBuilder<T> addObject();

  /**
   * Create and append a new string value schema to the current type set
   *
   * @return the created string schema builder
   *
   * @since 1.1
   */
  ChildStringBuilder<T> addString();

  /**
   * Create and append a new value schema to the current type set
   *
   * @return the created schema builder
   *
   * @since 1.1
   */
  ChildSchemaBuilder<T> add();

  /**
   * Create and append a new schema to the current type set
   *
   * @return an updated {@link TypeArrayBuilder}
   *
   * @since 1.1
   */
  T add(SchemaObject val);
}
