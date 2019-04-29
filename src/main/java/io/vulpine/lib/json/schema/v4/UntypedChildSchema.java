package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;

public interface UntypedChildSchema<P extends SchemaBuilder>
extends UntypedSchema, ChildSchema<P>
{
  @Override
  ArrayChildSchema<P> asArray();

  @Override
  BooleanChildSchema<P> asBoolean();

  @Override
  IntegerChildSchema<P> asInteger();

  @Override
  NullChildSchema<P> asNull();

  @Override
  NumberChildSchema<P> asNumber();

  @Override
  ObjectChildSchema<P> asObject();

  @Override
  StringChildSchema<P> asString();

  @Override
  MultiChildSchema<P> allOf();

  @Override
  MultiChildSchema<P> anyOf();

  @Override
  MultiChildSchema<P> oneOf();

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  UntypedChildSchema<P> id(String id);

  @Override
  UntypedChildSchema<P> removeId();

  @Override
  UntypedChildSchema<P> $schema(String path);

  @Override
  UntypedChildSchema<P> remove$Schema();

  @Override
  UntypedChildSchema<P> $ref(String path);

  @Override
  UntypedChildSchema<P> remove$Ref();

  @Override
  UntypedChildSchema<P> description(String desc);

  @Override
  UntypedChildSchema<P> removeDescription();

  @Override
  UntypedChildSchema<P> title(String title);

  @Override
  UntypedChildSchema<P> removeTitle();

  @Override
  UntypedChildSchema<? extends UntypedChildSchema<P>> definition(String name);

  @Override
  UntypedChildSchema<P> definition(String name, SchemaBuilder schema);

  @Override
  UntypedChildSchema<P> removeDefinition(String name);

  @Override
  UntypedChildSchema<P> removeDefinitions();

  @Override
  UntypedChildSchema<? extends UntypedChildSchema<P>> not();
}
