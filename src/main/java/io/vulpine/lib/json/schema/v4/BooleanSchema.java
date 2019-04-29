package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.trait.*;

/**
 * @since 2.0
 */
public interface BooleanSchema
  extends SchemaNode,
  HasOrArray<BooleanSchema>,
  HasOrInteger<BooleanSchema>,
  HasOrNull<BooleanSchema>,
  HasOrNumber<BooleanSchema>,
  HasOrObject<BooleanSchema>,
  HasOrString<BooleanSchema>
{
  BooleanSchema defaultValue(boolean val);

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  BooleanSchema id(String id);

  @Override
  BooleanSchema removeId();

  @Override
  BooleanSchema $schema(String path);

  @Override
  BooleanSchema remove$Schema();

  @Override
  BooleanSchema $ref(String path);

  @Override
  BooleanSchema remove$Ref();

  @Override
  BooleanSchema description(String desc);

  @Override
  BooleanSchema removeDescription();

  @Override
  BooleanSchema title(String title);

  @Override
  BooleanSchema removeTitle();

  @Override
  UntypedChildSchema<? extends BooleanSchema> definition(String name);

  @Override
  BooleanSchema definition(String name, SchemaBuilder schema);

  @Override
  BooleanSchema removeDefinition(String name);

  @Override
  BooleanSchema removeDefinitions();

  @Override
  BooleanSchema defaultValue(JsonNode val);

  @Override
  BooleanSchema removeDefault();
}
