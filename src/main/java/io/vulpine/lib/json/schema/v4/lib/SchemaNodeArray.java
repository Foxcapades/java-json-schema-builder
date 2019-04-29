package io.vulpine.lib.json.schema.v4.lib;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

public interface SchemaNodeArray<P extends SchemaBuilder>
{
  /**
   * Create and append a new array value schema to the current type set
   *
   * @return the created array schema builder
   *
   * @since 2.0
   */
  ArrayChildSchema<? extends P> addArray();

  /**
   * Create and append a new boolean value schema to the current type set
   *
   * @return the created boolean schema builder
   *
   * @since 2.0
   */
  BooleanChildSchema<? extends P> addBoolean();

  /**
   * Create and append a new integer value schema to the current type set
   *
   * @return the created integer schema builder
   *
   * @since 2.0
   */
  IntegerChildSchema<? extends P> addInteger();

  /**
   * Create and append a new null value schema to the current type set
   *
   * @return the created null schema builder
   *
   * @since 2.0
   */
  NullChildSchema<? extends P> addNull();

  /**
   * Create and append a new number value schema to the current type set
   *
   * @return the created number schema builder
   *
   * @since 2.0
   */
  NumberChildSchema<? extends P> addNumber();

  /**
   * Create and append a new object value schema to the current type set
   *
   * @return the created object schema builder
   *
   * @since 2.0
   */
  ObjectChildSchema<? extends P> addObject();

  /**
   * Create and append a new string value schema to the current type set
   *
   * @return the created string schema builder
   *
   * @since 2.0
   */
  StringChildSchema<? extends P> addString();

  /**
   * Create and append a new value schema to the current type set
   *
   * @return the created schema builder
   *
   * @since 2.0
   */
  UntypedChildSchema<? extends P> add();

  /**
   * Create and append a new schema to the current type set
   *
   * @return an updated schema builder
   *
   * @since 2.0
   */
  SchemaNodeArray<? extends P> add(SchemaBuilder... vals);
}
