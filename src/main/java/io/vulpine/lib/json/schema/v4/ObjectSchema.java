package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.math.BigInteger;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.trait.*;

/**
 * @since 2.0
 */
public interface ObjectSchema
extends SchemaNode,
  HasRemoveEnum<ObjectSchema>,
  HasOrArray<ObjectSchema>,
  HasOrBoolean<ObjectSchema>,
  HasOrInteger<ObjectSchema>,
  HasOrNull<ObjectSchema>,
  HasOrNumber<ObjectSchema>,
  HasOrString<ObjectSchema>
{
  /**
   * Creates a builder for an entry in the {@code "properties"} block of the
   * current {@link ObjectSchema}.
   * <p>
   * Properties added via this method <b>will not</b> appear in the {@code
   * "required"} properties array.  If a required property is desired, see
   * {@link #requiredProperty(String)}.
   *
   * @param name
   *   name of the property to build
   *
   * @return an instance of a builder that can be used to construct the details
   * of the property.
   *
   * @since 2.0
   */
  UntypedChildSchema<? extends ObjectSchema> optionalProperty(String name);

  /**
   * Sets an entry in the {@code "properties"} block of the current {@link
   * ObjectSchema} by creating a copy of the input {@link SchemaBuilder}.
   * <p>
   * <b>NOTE</b>: Properties added via this method <b>will not</b> appear in
   * the {@code "required"} properties array.  If a required property is
   * desired, see {@link #requiredProperty(String)}.
   * <p>
   * <b>WARNING</b>: Modifications to the input {@link SchemaBuilder} after
   * calling this method will not be reflected in the internal state of this
   * {@link ObjectSchema}
   *
   * @param name
   *   name of the property
   * @param node
   *   schema definition for the property
   *
   * @return a modified instance of the current {@link ObjectSchema}.
   *
   * @since 2.0
   */
  ObjectSchema optionalProperty(String name, SchemaBuilder node);

  /**
   * Removes all entries in the {@code "properties"} object from this {@link
   * ObjectSchema} that do not appear in the {@code "required"} properties
   * array.
   * <p>
   * If there are no properties remaining in the {@code "properties"} object
   * after this action, the {@code "properties"} object itself will be removed.
   *
   * @return a modified instance of the current {@link ObjectSchema}.
   *
   * @since 2.0
   */
  ObjectSchema removeOptionalProperties();

  /**
   * Creates a builder for an entry in the {@code "properties"} block of the
   * current {@link ObjectSchema}.
   * <p>
   * Additionally, properties added via this method will also be added to the
   * {@code "required"} properties array.  If an optional property is desired,
   * see {@link #optionalProperty(String)}.
   *
   * @param name
   *   name of the property to build
   *
   * @return an instance of a builder that can be used to construct the details
   * of the property.
   *
   * @since 2.0
   */
  UntypedChildSchema<? extends ObjectSchema> requiredProperty(String name);

  /**
   * Sets an entry in the {@code "properties"} object and the {@code "required"}
   * array of the current {@link ObjectSchema}.
   *
   * @param name
   *   name of the property to build
   * @param node
   *   constructed property details
   *
   * @return an instance of a builder that can be used to construct the details
   * of the property.
   *
   * @since 2.0
   */
  ObjectSchema requiredProperty(String name, SchemaBuilder node);

  /**
   * Removes all entries in the {@code "properties"} object from this {@link
   * ObjectSchema} that also appear in the {@code "required"} properties array
   * then removes the {@code "required"} array itself.
   * <p>
   * If there are no properties remaining in the {@code "properties"} object
   * after this action, the {@code "properties"} object itself will be removed.
   *
   * @return a modified instance of the current {@link ObjectSchema}.
   *
   * @since 2.0
   */
  ObjectSchema removeRequiredProperties();

  /**
   * Creates a builder for an entry in the {@code "patternProperties"} block of
   * the current {@link ObjectSchema}.
   *
   * @param pattern
   *   matching pattern of the property to build
   *
   * @return an instance of a builder that can be used to construct the details
   * of the property.
   *
   * @since 2.0
   */
  UntypedChildSchema<? extends ObjectSchema> patternProperty(String pattern);

  /**
   * Sets an entry in the {@code "patternProperties"} block of the current
   * {@link ObjectSchema} by creating a copy of the input {@link
   * SchemaBuilder}.
   * <p>
   * <b>WARNING</b>: Modifications to the input {@link SchemaBuilder} after
   * calling this method will not be reflected in the internal state of this
   * {@link ObjectSchema}
   *
   * @param pattern
   *   matching pattern for this property
   * @param node
   *   schema definition for the property
   *
   * @return a modified instance of the current {@link ObjectSchema}.
   *
   * @since 2.0
   */
  ObjectSchema patternProperty(String pattern, SchemaBuilder node);

  /**
   * Removes the {@code "patternProperties"} object from the current {@link
   * ObjectSchema}.
   *
   * @return a modified instance of the current {@link ObjectSchema}.
   *
   * @since 2.0
   */
  ObjectSchema removePatternProperties();

  /**
   * Sets the {@code "additionalProperties"} field to the given boolean value.
   *
   * @param val
   *   {@code "additionalProperties"} flag setting
   *
   * @return a modified instance of the current {@link ObjectSchema}.
   *
   * @since 2.0
   */
  ObjectSchema additionalProperties(boolean val);

  /**
   * Creates a new builder to create the schema definition for the the {@code
   * "additionalProperties"} field.
   *
   * @return an instance of a builder that can be used to construct the details
   * of the {@code "additionalProperties"} type.
   *
   * @since 2.0
   */
  UntypedChildSchema<? extends ObjectSchema> additionalProperties();

  /**
   * Sets the {@code "additionalProperties"} field to be a copy of the given
   * schema definition.
   *
   * @param node
   *   {@code "additionalProperties"} type definition
   *
   * @return a modified instance of the current {@link ObjectSchema}.
   *
   * @since 2.0
   */
  ObjectSchema additionalProperties(SchemaBuilder node);

  /**
   * Removes the {@code "additionalProperties"} field from the current {@link
   * ObjectSchema}
   *
   * @return a modified instance of the current {@link ObjectSchema}.
   *
   * @since 2.0
   */
  ObjectSchema removeAdditionalProperties();

  ObjectSchema enumValues(ObjectNode... types);

  /**
   * Sets the {@code "maxProperties"} object schema property
   *
   * @param val
   *   value for the {@code "maxProperties"} property
   *
   * @return a modified {@link ObjectSchema}
   *
   * @since 2.0
   */
  ObjectSchema maxProperties(int val);

  /**
   * Sets the {@code "maxProperties"} object schema property
   *
   * @param val
   *   value for the {@code "maxProperties"} property
   *
   * @return a modified {@link ObjectSchema}
   *
   * @since 2.0
   */
  ObjectSchema maxProperties(long val);

  /**
   * Sets the {@code "maxProperties"} object schema property
   *
   * @param val
   *   value for the {@code "maxProperties"} property
   *
   * @return a modified {@link ObjectSchema}
   *
   * @since 2.0
   */
  ObjectSchema maxProperties(BigInteger val);

  /**
   * Removes the {@code "maxProperties"} property
   *
   * @return a modified {@link ObjectSchema}
   *
   * @since 2.0
   */
  ObjectSchema removeMaxProperties();

  /**
   * Sets the {@code "minProperties"} object schema property
   *
   * @param val
   *   value for the {@code "minProperties"} property
   *
   * @return a modified {@link ObjectSchema}
   *
   * @since 2.0
   */
  ObjectSchema minProperties(int val);

  /**
   * Sets the {@code "minProperties"} object schema property
   *
   * @param val
   *   value for the {@code "minProperties"} property
   *
   * @return a modified {@link ObjectSchema}
   *
   * @since 2.0
   */
  ObjectSchema minProperties(long val);

  /**
   * Sets the {@code "minProperties"} object schema property
   *
   * @param val
   *   value for the {@code "minProperties"} property
   *
   * @return a modified {@link ObjectSchema}
   *
   * @since 2.0
   */
  ObjectSchema minProperties(BigInteger val);

  /**
   * Removes the {@code "minProperties"} property
   *
   * @return a modified {@link ObjectSchema}
   *
   * @since 2.0
   */
  ObjectSchema removeMinProperties();

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  ObjectSchema id(String id);

  @Override
  ObjectSchema removeId();

  @Override
  ObjectSchema $schema(String path);

  @Override
  ObjectSchema remove$Schema();

  @Override
  ObjectSchema $ref(String path);

  @Override
  ObjectSchema remove$Ref();

  @Override
  ObjectSchema description(String desc);

  @Override
  ObjectSchema removeDescription();

  @Override
  ObjectSchema title(String title);

  @Override
  ObjectSchema removeTitle();

  @Override
  UntypedChildSchema<? extends ObjectSchema> definition(String name);

  @Override
  ObjectSchema definition(String name, SchemaBuilder schema);

  @Override
  ObjectSchema removeDefinition(String name);

  @Override
  ObjectSchema removeDefinitions();

  @Override
  ObjectSchema defaultValue(JsonNode val);

  @Override
  ObjectSchema removeDefault();
}
