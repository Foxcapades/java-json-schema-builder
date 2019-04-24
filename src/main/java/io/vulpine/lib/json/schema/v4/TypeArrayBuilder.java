package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P>
 *   Parent object type
 *
 * @since 1.0
 */
public interface TypeArrayBuilder<P extends SchemaNode>
extends SchemaNode, ChildBuilder<P>
{
  /**
   * Create and append a new array value schema to the current type set
   *
   * @return the created array schema builder
   *
   * @since 1.0
   */
  ChildArrayBuilder<TypeArrayBuilder<P>> addArray();

  /**
   * Create and append a new boolean value schema to the current type set
   *
   * @return the created boolean schema builder
   *
   * @since 1.0
   */
  ChildBooleanBuilder<TypeArrayBuilder<P>> addBoolean();

  /**
   * Create and append a new integer value schema to the current type set
   *
   * @return the created integer schema builder
   *
   * @since 1.0
   */
  ChildIntegerBuilder<TypeArrayBuilder<P>> addInteger();

  /**
   * Create and append a new null value schema to the current type set
   *
   * @return the created null schema builder
   *
   * @since 1.0
   */
  ChildNullBuilder<TypeArrayBuilder<P>> addNull();

  /**
   * Create and append a new number value schema to the current type set
   *
   * @return the created number schema builder
   *
   * @since 1.0
   */
  ChildNumberBuilder<TypeArrayBuilder<P>> addNumber();

  /**
   * Create and append a new object value schema to the current type set
   *
   * @return the created object schema builder
   *
   * @since 1.0
   */
  ChildObjectBuilder<TypeArrayBuilder<P>> addObject();

  /**
   * Create and append a new string value schema to the current type set
   *
   * @return the created string schema builder
   *
   * @since 1.0
   */
  ChildStringBuilder<TypeArrayBuilder<P>> addString();

  /**
   * Create and append a new schema to the current type set
   *
   * @return an updated {@link TypeArrayBuilder}
   *
   * @since 1.0
   */
  TypeArrayBuilder<P> add(SchemaObject val);
}
