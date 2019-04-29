package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.trait.*;

/**
 * @since 1.0
 */
public interface NullSchema
extends
  SchemaNode,
  HasOrArray<NullSchema>,
  HasOrBoolean<NullSchema>,
  HasOrInteger<NullSchema>,
  HasOrNumber<NullSchema>,
  HasOrObject<NullSchema>,
  HasOrString<NullSchema>
{
  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  NullSchema id(String id);

  @Override
  NullSchema removeId();

  @Override
  NullSchema $schema(String path);

  @Override
  NullSchema remove$Schema();

  @Override
  NullSchema $ref(String path);

  @Override
  NullSchema remove$Ref();

  @Override
  NullSchema description(String desc);

  @Override
  NullSchema removeDescription();

  @Override
  NullSchema title(String title);

  @Override
  NullSchema removeTitle();

  @Override
  UntypedChildSchema<? extends NullSchema> definition(String name);

  @Override
  NullSchema definition(String name, SchemaBuilder schema);

  @Override
  NullSchema removeDefinition(String name);

  @Override
  NullSchema removeDefinitions();

  @Override
  NullSchema defaultValue(JsonNode val);

  @Override
  NullSchema removeDefault();

  @Override
  UntypedChildSchema<? extends NullSchema> not();
}
