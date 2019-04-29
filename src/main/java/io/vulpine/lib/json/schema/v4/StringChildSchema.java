package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;

import java.math.BigInteger;

public interface StringChildSchema<P extends SchemaBuilder>
extends StringSchema, ChildSchema<P>
{
  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  StringChildSchema<P> defaultValue(String val);

  @Override
  StringChildSchema<P> maxLength(int val);

  @Override
  StringChildSchema<P> maxLength(long val);

  @Override
  StringChildSchema<P> maxLength(BigInteger val);

  @Override
  StringChildSchema<P> removeMaxLength();

  @Override
  StringChildSchema<P> minLength(int val);

  @Override
  StringChildSchema<P> minLength(long val);

  @Override
  StringChildSchema<P> minLength(BigInteger val);

  @Override
  StringChildSchema<P> removeMinLength();

  @Override
  StringChildSchema<P> pattern(String pattern);

  @Override
  StringChildSchema<P> removePattern();

  @Override
  StringChildSchema<P> enumValues(String... vals);

  @Override
  StringChildSchema<P> format(Format format);

  @Override
  StringChildSchema<P> format(String format);

  @Override
  StringChildSchema<P> removeFormat();

  @Override
  StringChildSchema<P> id(String id);

  @Override
  StringChildSchema<P> removeId();

  @Override
  StringChildSchema<P> $schema(String path);

  @Override
  StringChildSchema<P> remove$Schema();

  @Override
  StringChildSchema<P> $ref(String path);

  @Override
  StringChildSchema<P> remove$Ref();

  @Override
  StringChildSchema<P> description(String desc);

  @Override
  StringChildSchema<P> removeDescription();

  @Override
  StringChildSchema<P> title(String title);

  @Override
  StringChildSchema<P> removeTitle();

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
  ObjectChildSchema<P> orAsObject();

  @Override
  StringChildSchema<P> removeDefault();

  @Override
  StringChildSchema<P> removeEnum();

  @Override
  UntypedChildSchema<? extends StringChildSchema<P>> definition(String name);

  @Override
  StringChildSchema<P> definition(String name, SchemaBuilder schema);

  @Override
  StringChildSchema<P> removeDefinition(String name);

  @Override
  StringChildSchema<P> removeDefinitions();

  @Override
  StringChildSchema<P> defaultValue(JsonNode val);
}
