package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;

public interface BooleanChildSchema<P extends SchemaBuilder>
extends BooleanSchema, ChildSchema<P>
{
  // Return type overrides
  @Override
  BooleanChildSchema<P> defaultValue(boolean val);

  @Override
  BooleanChildSchema<P> id(String id);

  @Override
  BooleanChildSchema<P> removeId();

  @Override
  BooleanChildSchema<P> $schema(String path);

  @Override
  BooleanChildSchema<P> remove$Schema();

  @Override
  BooleanChildSchema<P> $ref(String path);

  @Override
  BooleanChildSchema<P> remove$Ref();

  @Override
  BooleanChildSchema<P> description(String desc);

  @Override
  BooleanChildSchema<P> removeDescription();

  @Override
  BooleanChildSchema<P> title(String title);

  @Override
  BooleanChildSchema<P> removeTitle();

  @Override
  BooleanChildSchema<P> removeDefault();

  @Override
  ArrayChildSchema<P> orAsArray();

  @Override
  IntegerChildSchema<P> orAsInteger();

  @Override
  NullChildSchema<P> orAsNull();

  @Override
  NumberChildSchema<P> orAsNumber();

  @Override
  ObjectChildSchema<P> orAsObject();

  @Override
  StringChildSchema<P> orAsString();

  @Override
  UntypedChildSchema<? extends BooleanChildSchema<P>> definition(String name);

  @Override
  BooleanChildSchema<P> definition(String name, SchemaBuilder schema);

  @Override
  BooleanChildSchema<P> removeDefinition(String name);

  @Override
  BooleanChildSchema<P> removeDefinitions();

  @Override
  BooleanChildSchema<P> defaultValue(JsonNode val);

  @Override
  UntypedChildSchema<? extends BooleanChildSchema<P>> not();
}
