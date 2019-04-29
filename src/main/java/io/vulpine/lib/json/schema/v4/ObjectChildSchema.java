package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;

import java.math.BigInteger;

public interface ObjectChildSchema<P extends SchemaBuilder>
extends ObjectSchema, ChildSchema<P>
{
  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  UntypedChildSchema<? extends ObjectChildSchema<P>> optionalProperty(String name);

  @Override
  ObjectChildSchema<P> optionalProperty(String name, SchemaBuilder node);

  @Override
  ObjectChildSchema<P> removeOptionalProperties();

  @Override
  UntypedChildSchema<? extends ObjectChildSchema<P>> requiredProperty(String name);

  @Override
  ObjectChildSchema<P> requiredProperty(String name, SchemaBuilder node);

  @Override
  ObjectChildSchema<P> removeRequiredProperties();

  @Override
  UntypedChildSchema<? extends ObjectChildSchema<P>> patternProperty(String pattern);

  @Override
  ObjectChildSchema<P> patternProperty(String pattern, SchemaBuilder node);

  @Override
  ObjectChildSchema<P> removePatternProperties();

  @Override
  ObjectChildSchema<P> additionalProperties(boolean val);

  @Override
  UntypedChildSchema<? extends ObjectChildSchema<P>> additionalProperties();

  @Override
  ObjectChildSchema<P> additionalProperties(SchemaBuilder node);

  @Override
  ObjectChildSchema<P> removeAdditionalProperties();

  @Override
  ObjectChildSchema<P> enumValues(ObjectNode... types);

  @Override
  ObjectChildSchema<P> maxProperties(int val);

  @Override
  ObjectChildSchema<P> maxProperties(long val);

  @Override
  ObjectChildSchema<P> maxProperties(BigInteger val);

  @Override
  ObjectChildSchema<P> removeMaxProperties();

  @Override
  ObjectChildSchema<P> minProperties(int val);

  @Override
  ObjectChildSchema<P> minProperties(long val);

  @Override
  ObjectChildSchema<P> minProperties(BigInteger val);

  @Override
  ObjectChildSchema<P> removeMinProperties();

  @Override
  UntypedChildSchema<? extends ObjectChildSchema<P>> definition(String name);

  @Override
  ObjectChildSchema<P> definition(String name, SchemaBuilder schema);

  @Override
  ObjectChildSchema<P> removeDefinition(String name);

  @Override
  ObjectChildSchema<P> removeDefinitions();

  @Override
  ObjectChildSchema<P> id(String id);

  @Override
  ObjectChildSchema<P> removeId();

  @Override
  ObjectChildSchema<P> $schema(String path);

  @Override
  ObjectChildSchema<P> remove$Schema();

  @Override
  ObjectChildSchema<P> $ref(String path);

  @Override
  ObjectChildSchema<P> remove$Ref();

  @Override
  ObjectChildSchema<P> description(String desc);

  @Override
  ObjectChildSchema<P> removeDescription();

  @Override
  ObjectChildSchema<P> title(String title);

  @Override
  ObjectChildSchema<P> removeTitle();

  @Override
  ArrayChildSchema<P> orAsArray();

  @Override
  BooleanChildSchema<P> orAsBoolean();

  @Override
  IntegerChildSchema<P> orAsInteger();

  @Override
  NullChildSchema<P> orAsNull();

  @Override
  NumberChildSchema<P> orAsNumber();

  @Override
  StringSchema orAsString();

  @Override
  ObjectChildSchema<P> removeDefault();

  @Override
  ObjectChildSchema<P> removeEnum();

  @Override
  ObjectChildSchema<P> defaultValue(JsonNode val);

  @Override
  UntypedChildSchema<? extends ObjectChildSchema> not();
}
