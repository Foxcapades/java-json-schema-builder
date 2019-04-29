package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @since 2.0
 */
public interface NumberChildSchema<P extends SchemaBuilder>
extends NumberSchema, ChildSchema<P>
{
  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  NumberChildSchema<P> defaultValue(int val);

  @Override
  NumberChildSchema<P> defaultValue(long val);

  @Override
  NumberChildSchema<P> defaultValue(double val);

  @Override
  NumberChildSchema<P> defaultValue(float val);

  @Override
  NumberChildSchema<P> defaultValue(BigInteger val);

  @Override
  NumberChildSchema<P> defaultValue(BigDecimal val);

  @Override
  NumberChildSchema<P> maximum(double val);

  @Override
  NumberChildSchema<P> maximum(float val);

  @Override
  NumberChildSchema<P> maximum(int val);

  @Override
  NumberChildSchema<P> maximum(long val);

  @Override
  NumberChildSchema<P> maximum(BigInteger val);

  @Override
  NumberChildSchema<P> maximum(BigDecimal val);

  @Override
  NumberChildSchema<P> removeMaximum();

  @Override
  NumberChildSchema<P> exclusiveMaximum(boolean val);

  @Override
  NumberChildSchema<P> removeExclusiveMaximum();

  @Override
  NumberChildSchema<P> minimum(double val);

  @Override
  NumberChildSchema<P> minimum(float val);

  @Override
  NumberChildSchema<P> minimum(int val);

  @Override
  NumberChildSchema<P> minimum(long val);

  @Override
  NumberChildSchema<P> minimum(BigDecimal val);

  @Override
  NumberChildSchema<P> minimum(BigInteger val);

  @Override
  NumberChildSchema<P> removeMinimum();

  @Override
  NumberChildSchema<P> exclusiveMinimum(boolean val);

  @Override
  NumberChildSchema<P> removeExclusiveMinimum();

  @Override
  NumberChildSchema<P> multipleOf(int val);

  @Override
  NumberChildSchema<P> multipleOf(long val);

  @Override
  NumberChildSchema<P> multipleOf(float val);

  @Override
  NumberChildSchema<P> multipleOf(double val);

  @Override
  NumberChildSchema<P> multipleOf(BigInteger val);

  @Override
  NumberChildSchema<P> multipleOf(BigDecimal val);

  @Override
  NumberChildSchema<P> removeMultipleOf();

  @Override
  NumberChildSchema<P> enumValues(Number... vals);

  @Override
  NumberChildSchema<P> id(String id);

  @Override
  NumberChildSchema<P> removeId();

  @Override
  NumberChildSchema<P> $schema(String path);

  @Override
  NumberChildSchema<P> remove$Schema();

  @Override
  NumberChildSchema<P> $ref(String path);

  @Override
  NumberChildSchema<P> remove$Ref();

  @Override
  NumberChildSchema<P> description(String desc);

  @Override
  NumberChildSchema<P> removeDescription();

  @Override
  NumberChildSchema<P> title(String title);

  @Override
  NumberChildSchema<P> removeTitle();

  @Override
  ArrayChildSchema<P> orAsArray();

  @Override
  BooleanChildSchema<P> orAsBoolean();

  @Override
  IntegerChildSchema<P> orAsInteger();

  @Override
  NullChildSchema<P> orAsNull();

  @Override
  ObjectChildSchema<P> orAsObject();

  @Override
  StringChildSchema<P> orAsString();

  @Override
  NumberChildSchema<P> removeDefault();

  @Override
  NumberChildSchema<P> removeEnum();

  @Override
  UntypedChildSchema<? extends NumberChildSchema<P>> definition(String name);

  @Override
  NumberChildSchema<P> definition(String name, SchemaBuilder schema);

  @Override
  NumberChildSchema<P> removeDefinition(String name);

  @Override
  NumberChildSchema<P> removeDefinitions();

  @Override
  NumberChildSchema<P> defaultValue(JsonNode val);

  @Override
  UntypedChildSchema<? extends NumberChildSchema<P>> not();
}
