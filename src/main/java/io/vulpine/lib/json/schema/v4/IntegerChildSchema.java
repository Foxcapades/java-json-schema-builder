package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface IntegerChildSchema<P extends SchemaBuilder>
extends IntegerSchema, ChildSchema<P>
{
  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  IntegerChildSchema<P> defaultValue(int val);

  @Override
  IntegerChildSchema<P> defaultValue(long val);

  @Override
  IntegerChildSchema<P> defaultValue(BigInteger val);

  @Override
  IntegerChildSchema<P> maximum(int val);

  @Override
  IntegerChildSchema<P> maximum(long val);

  @Override
  IntegerChildSchema<P> maximum(BigInteger val);

  @Override
  IntegerChildSchema<P> removeMaximum();

  @Override
  IntegerChildSchema<P> exclusiveMaximum(boolean val);

  @Override
  IntegerChildSchema<P> removeExclusiveMaximum();

  @Override
  IntegerChildSchema<P> minimum(int val);

  @Override
  IntegerChildSchema<P> minimum(long val);

  @Override
  IntegerChildSchema<P> minimum(BigInteger val);

  @Override
  IntegerChildSchema<P> removeMinimum();

  @Override
  IntegerChildSchema<P> exclusiveMinimum(boolean val);

  @Override
  IntegerChildSchema<P> removeExclusiveMinimum();

  @Override
  IntegerChildSchema<P> multipleOf(double val);

  @Override
  IntegerChildSchema<P> multipleOf(float val);

  @Override
  IntegerChildSchema<P> multipleOf(int val);

  @Override
  IntegerChildSchema<P> multipleOf(long val);

  @Override
  IntegerChildSchema<P> multipleOf(BigInteger val);

  @Override
  IntegerChildSchema<P> multipleOf(BigDecimal val);

  @Override
  IntegerChildSchema<P> removeMultipleOf();

  @Override
  IntegerChildSchema<P> enumValues(int... val);

  @Override
  IntegerChildSchema<P> enumValues(long... val);

  @Override
  IntegerChildSchema<P> enumValues(BigInteger... val);

  @Override
  IntegerChildSchema<P> id(String id);

  @Override
  IntegerChildSchema<P> removeId();

  @Override
  IntegerChildSchema<P> $schema(String path);

  @Override
  IntegerChildSchema<P> remove$Schema();

  @Override
  IntegerChildSchema<P> $ref(String path);

  @Override
  IntegerChildSchema<P> remove$Ref();

  @Override
  IntegerChildSchema<P> description(String desc);

  @Override
  IntegerChildSchema<P> removeDescription();

  @Override
  IntegerChildSchema<P> title(String title);

  @Override
  IntegerChildSchema<P> removeTitle();

  @Override
  ArrayChildSchema<P> orAsArray();

  @Override
  BooleanChildSchema<P> orAsBoolean();

  @Override
  NullChildSchema<P> orAsNull();

  @Override
  NumberChildSchema<P> orAsNumber();

  @Override
  ObjectChildSchema<P> orAsObject();

  @Override
  StringChildSchema<P> orAsString();

  @Override
  IntegerChildSchema<P> removeDefault();

  @Override
  IntegerChildSchema<P> removeEnum();

  @Override
  UntypedChildSchema<? extends IntegerChildSchema<P>> definition(String name);

  @Override
  IntegerChildSchema<P> definition(String name, SchemaBuilder schema);

  @Override
  IntegerChildSchema<P> removeDefinition(String name);

  @Override
  IntegerChildSchema<P> removeDefinitions();

  @Override
  IntegerChildSchema<P> defaultValue(JsonNode val);

  @Override
  UntypedChildSchema<? extends IntegerChildSchema<P>> not();
}
