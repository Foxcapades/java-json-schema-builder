package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.SchemaNodeArray;

public interface MultiSchema
extends
  SchemaNode,
  SchemaNodeArray<MultiSchema>
{
  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  MultiSchema add(SchemaBuilder... vals);

  @Override
  MultiSchema id(String id);

  @Override
  MultiSchema removeId();

  @Override
  MultiSchema $schema(String path);

  @Override
  MultiSchema remove$Schema();

  @Override
  MultiSchema $ref(String path);

  @Override
  MultiSchema remove$Ref();

  @Override
  MultiSchema description(String desc);

  @Override
  MultiSchema removeDescription();

  @Override
  MultiSchema title(String title);

  @Override
  MultiSchema removeTitle();

  @Override
  UntypedChildSchema<? extends MultiSchema> definition(String name);

  @Override
  MultiSchema definition(String name, SchemaBuilder schema);

  @Override
  MultiSchema removeDefinition(String name);

  @Override
  MultiSchema removeDefinitions();

  @Override
  MultiSchema defaultValue(JsonNode val);

  @Override
  MultiSchema removeDefault();
}
