package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import io.vulpine.lib.json.schema.SchemaBuilder;

/**
 * @since 2.0
 */
public interface UntypedSchema extends SchemaNode
{
  /**
   * Types the current schema node as {@code "array"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  ArraySchema asArray();

  /**
   * Types the current schema node as {@code "boolean"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  BooleanSchema asBoolean();

  /**
   * Types the current schema node as {@code "integer"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  IntegerSchema asInteger();

  /**
   * Types the current schema node as {@code "null"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   *
   * @since 2.0
   */
  NullSchema asNull();

  /**
   * Types the current schema node as {@code "number"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  NumberSchema asNumber();

  /**
   * Types the current schema node as {@code "object"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  ObjectSchema asObject();

  /**
   * Types the current schema node as {@code "string"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  StringSchema asString();

  /**
   * Switches schema type to an {@code "allOf"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  MultiSchema allOf();

  /**
   * Switches schema type to an {@code "anyOf"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  MultiSchema anyOf();

  /**
   * Switches schema type to an {@code "oneOf"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  MultiSchema oneOf();

  /**
   * Switches schema type to an {@code "not"}
   *
   * @return updated schema builder for the current node
   *
   * @since 2.0
   */
  MultiSchema not();

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  UntypedSchema id(String id);

  @Override
  UntypedSchema removeId();

  @Override
  UntypedSchema $schema(String path);

  @Override
  UntypedSchema remove$Schema();

  @Override
  UntypedSchema $ref(String path);

  @Override
  UntypedSchema remove$Ref();

  @Override
  UntypedSchema description(String desc);

  @Override
  UntypedSchema removeDescription();

  @Override
  UntypedSchema title(String title);

  @Override
  UntypedSchema removeTitle();

  @Override
  UntypedChildSchema<? extends UntypedSchema> definition(String name);

  @Override
  UntypedSchema definition(String name, SchemaBuilder schema);

  @Override
  UntypedSchema removeDefinition(String name);

  @Override
  UntypedSchema removeDefinitions();

  @Override
  UntypedSchema defaultValue(JsonNode val);

  @Override
  UntypedSchema removeDefault();
}
