package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

class SchemaNodeImpl extends SchemaBuilderImpl implements SchemaNode
{
  SchemaNodeImpl(ObjectMapper jax, ObjectNode raw, JsonType type)
  {
    super(jax, raw);
    pushType(type);
  }

  SchemaNodeImpl(ObjectMapper jax, ObjectNode raw)
  {
    super(jax, raw);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public SchemaNode id(String id)
  {
    return put(ID, id);
  }

  @Override
  public SchemaNode removeId()
  {
    return remove(ID);
  }

  @Override
  public SchemaNode $schema(String path)
  {
    return put($SCHEMA, path);
  }

  @Override
  public SchemaNode remove$Schema()
  {
    return remove($SCHEMA);
  }

  @Override
  public SchemaNode $ref(String path)
  {
    return put($REF, path);
  }

  @Override
  public SchemaNode remove$Ref()
  {
    return remove($REF);
  }

  @Override
  public SchemaNode description(String desc)
  {
    return put(DESC, desc);
  }

  @Override
  public SchemaNode removeDescription()
  {
    return remove(DESC);
  }

  @Override
  public SchemaNode title(String title)
  {
    return put(TITLE, title);
  }

  @Override
  public SchemaNode removeTitle()
  {
    return remove(TITLE);
  }

  @Override
  public UntypedChildSchema<? extends SchemaNode> definition(String name)
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      x -> definition(name, x));
  }

  @Override
  public SchemaNode definition(String name, SchemaBuilder schema)
  {
    put(defs(), name, schema.build());
    return this;
  }

  @Override
  public SchemaNode removeDefinition(String name)
  {
    return remove(DEFINITIONS, name);
  }

  @Override
  public SchemaNode removeDefinitions()
  {
    return remove(DEFINITIONS);
  }

  @Override
  public SchemaNode defaultValue(JsonNode val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public UntypedChildSchema<? extends SchemaNode> not()
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      x -> put(NOT, x));
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Indirect implementations                            │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  public SchemaNode removeDefault()
  {
    return remove(DEFAULT);
  }

  public SchemaNode removeEnum()
  {
    return remove(ENUM);
  }

  public ArraySchema orAsArray()
  {
    return new ArraySchemaImpl(jax(), copy());
  }

  public BooleanSchema orAsBoolean()
  {
    return new BooleanSchemaImpl(jax(), copy());
  }

  public IntegerSchema orAsInteger()
  {
    return new IntegerSchemaImpl(jax(), copy());
  }

  public NullSchema orAsNull()
  {
    return new NullSchemaImpl(jax(), copy());
  }

  public NumberSchema orAsNumber()
  {
    return new NumberSchemaImpl(jax(), copy());
  }

  public ObjectSchema orAsObject()
  {
    return new ObjectSchemaImpl(jax(), copy());
  }

  public StringSchema orAsString()
  {
    return new StringSchemaImpl(jax(), copy());
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Builder helpers                                     │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  final ArrayNode enumArr()
  {
    return has(ENUM) ? (ArrayNode) get(ENUM) : raw().putArray(ENUM);
  }

  final JsonNode strip(JsonNode node)
  {
    if (node.isObject())
      ((ObjectNode) node).remove($SCHEMA);
    return node;
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Internal helpers                                    │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  private ObjectNode defs()
  {
    return has(DEFINITIONS)
      ? (ObjectNode) get(DEFINITIONS)
      : raw().putObject(DEFINITIONS);
  }

  /**
   * Either sets the type as a string, or if a type is already set, makes sure
   * the {@code "type"} key is an array containing any old values and the new
   * pushed type.
   *
   * @param type type to push.
   */
  private void pushType(JsonType type)
  {
    if (!has(TYPE)) {
      put(TYPE, type.jsonName());
      return;
    }

    var n = get(TYPE);

    if (n.isArray()) {
      ((ArrayNode) n).add(type.jsonName());
      return;
    }

    raw().putArray(TYPE)
      .add(n)
      .add(type.jsonName());
  }
}
