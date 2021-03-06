package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;

public interface MultiChildSchema<P extends SchemaBuilder>
extends MultiSchema, ChildSchema<P>
{
  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  ArrayChildSchema<? extends MultiChildSchema<P>> addArray();

  @Override
  BooleanChildSchema<? extends MultiChildSchema<P>> addBoolean();

  @Override
  IntegerChildSchema<? extends MultiChildSchema<P>> addInteger();

  @Override
  NullChildSchema<? extends MultiChildSchema<P>> addNull();

  @Override
  NumberChildSchema<? extends MultiChildSchema<P>> addNumber();

  @Override
  ObjectChildSchema<? extends MultiChildSchema<P>> addObject();

  @Override
  StringChildSchema<? extends MultiChildSchema<P>> addString();

  @Override
  UntypedChildSchema<? extends MultiChildSchema<P>> add();

  @Override
  MultiChildSchema<P> add(SchemaBuilder... vals);

  @Override
  MultiChildSchema<P> id(String id);

  @Override
  MultiChildSchema<P> removeId();

  @Override
  MultiChildSchema<P> $schema(String path);

  @Override
  MultiChildSchema<P> remove$Schema();

  @Override
  MultiChildSchema<P> $ref(String path);

  @Override
  MultiChildSchema<P> remove$Ref();

  @Override
  MultiChildSchema<P> description(String desc);

  @Override
  MultiChildSchema<P> removeDescription();

  @Override
  MultiChildSchema<P> title(String title);

  @Override
  MultiChildSchema<P> removeTitle();

  @Override
  UntypedChildSchema<? extends MultiChildSchema<P>> definition(String name);

  @Override
  MultiChildSchema<P> definition(String name, SchemaBuilder schema);

  @Override
  MultiChildSchema<P> removeDefinition(String name);

  @Override
  MultiChildSchema<P> removeDefinitions();

  @Override
  MultiChildSchema<P> defaultValue(JsonNode val);

  @Override
  MultiChildSchema<P> removeDefault();

  @Override
  UntypedChildSchema<? extends MultiChildSchema<P>> not();
}
