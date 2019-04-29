package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;

public interface NullChildSchema<P extends SchemaBuilder>
extends NullSchema, ChildSchema<P>
{
  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  NullChildSchema<P> id(String id);

  @Override
  NullChildSchema<P> removeId();

  @Override
  NullChildSchema<P> $schema(String path);

  @Override
  NullChildSchema<P> remove$Schema();

  @Override
  NullChildSchema<P> $ref(String path);

  @Override
  NullChildSchema<P> remove$Ref();

  @Override
  NullChildSchema<P> description(String desc);

  @Override
  NullChildSchema<P> removeDescription();

  @Override
  NullChildSchema<P> title(String title);

  @Override
  NullChildSchema<P> removeTitle();

  @Override
  ArrayChildSchema<P> orAsArray();

  @Override
  BooleanChildSchema<P> orAsBoolean();

  @Override
  IntegerChildSchema<P> orAsInteger();

  @Override
  NumberChildSchema<P> orAsNumber();

  @Override
  ObjectChildSchema<P> orAsObject();

  @Override
  StringChildSchema<P> orAsString();

  @Override
  NullChildSchema<P> removeDefault();

  @Override
  UntypedChildSchema<? extends NullChildSchema<P>> definition(String name);

  @Override
  NullChildSchema<P> definition(String name, SchemaBuilder schema);

  @Override
  NullChildSchema<P> removeDefinition(String name);

  @Override
  NullChildSchema<P> removeDefinitions();

  @Override
  NullChildSchema<P> defaultValue(JsonNode val);
}
