package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

class ObjectSchemaImpl
extends SchemaNodeImpl
implements ObjectSchema
{
  ObjectSchemaImpl(ObjectMapper jax, ObjectNode raw)
  {
    super(jax, raw, JsonType.OBJECT);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public UntypedChildSchema<? extends ObjectSchema> optionalProperty(String name)
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      x -> optionalProperty(name, x));
  }

  @Override
  public ObjectSchema optionalProperty(String name, SchemaBuilder node)
  {
    props().set(name, strip(node.build()));
    return this;
  }

  @Override
  public ObjectSchema removeOptionalProperties()
  {
    if (!has(PROPS))
      return this;

    if (!has(REQ))
      return remove(PROPS);

    var r = req();
    var n = newObj();
    var o = props();

    for (var p : r)
      n.set(p.textValue(), o.get(p.textValue()));

    return put(PROPS, n);
  }

  @Override
  public UntypedChildSchema<? extends ObjectSchema> requiredProperty(String k)
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      v -> requiredProperty(k, v));
  }

  @Override
  public ObjectSchema requiredProperty(String k, SchemaBuilder v)
  {
    props().set(k, strip(v.build()));
    req().add(k);
    return this;
  }

  @Override
  public ObjectSchema removeRequiredProperties()
  {
    if (!has(REQ))
      return this;

    var n = props();
    for (var r : req())
      n.remove(r.textValue());

    remove(REQ);
    return n.size() < 1 ? remove(PROPS) : this;
  }

  @Override
  public UntypedChildSchema<? extends ObjectSchema> patternProperty(String x)
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      y -> patternProperty(x, y));
  }

  @Override
  public ObjectSchema patternProperty(String pattern, SchemaBuilder node)
  {
    patProps().set(pattern, strip(node.build()));
    return this;
  }

  @Override
  public ObjectSchema removePatternProperties()
  {
    return remove(PATT_PROPS);
  }

  @Override
  public ObjectSchema additionalProperties(boolean val)
  {
    return put(ADDTL_PROPS, val);
  }

  @Override
  public UntypedChildSchema<? extends ObjectSchema> additionalProperties()
  {
    return new UntypedChildSchemaImpl<>(this, jax(), newObj(),
      this::additionalProperties);
  }

  @Override
  public ObjectSchema additionalProperties(SchemaBuilder node)
  {
    return put(ADDTL_PROPS, strip(node.build()));
  }

  @Override
  public ObjectSchema removeAdditionalProperties()
  {
    return remove(ADDTL_PROPS);
  }

  @Override
  public ObjectSchema enumValues(ObjectNode... types)
  {
    if (types.length < 1)
      return this;

    var e = enumArr();
    for (var t : types)
      e.add(t);
    return this;
  }

  @Override
  public ObjectSchema maxProperties(int val)
  {
    return put(MAX_PROPS, val);
  }

  @Override
  public ObjectSchema maxProperties(long val)
  {
    return put(MAX_PROPS, val);
  }

  @Override
  public ObjectSchema maxProperties(BigInteger val)
  {
    return put(MAX_PROPS, val);
  }

  @Override
  public ObjectSchema removeMaxProperties()
  {
    return remove(MAX_PROPS);
  }

  @Override
  public ObjectSchema minProperties(int val)
  {
    return put(MIN_PROPS, val);
  }

  @Override
  public ObjectSchema minProperties(long val)
  {
    return put(MIN_PROPS, val);
  }

  @Override
  public ObjectSchema minProperties(BigInteger val)
  {
    return put(MIN_PROPS, val);
  }

  @Override
  public ObjectSchema removeMinProperties()
  {
    return remove(MIN_PROPS);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public ObjectSchema id(String id)
  {
    return (ObjectSchemaImpl) super.id(id);
  }

  @Override
  public ObjectSchema removeId()
  {
    return (ObjectSchemaImpl) super.removeId();
  }

  @Override
  public ObjectSchema $schema(String path)
  {
    return (ObjectSchemaImpl) super.$schema(path);
  }

  @Override
  public ObjectSchema remove$Schema()
  {
    return (ObjectSchemaImpl) super.remove$Schema();
  }

  @Override
  public ObjectSchema $ref(String path)
  {
    return (ObjectSchemaImpl) super.$ref(path);
  }

  @Override
  public ObjectSchema remove$Ref()
  {
    return (ObjectSchemaImpl) super.remove$Ref();
  }

  @Override
  public ObjectSchema description(String desc)
  {
    return (ObjectSchemaImpl) super.description(desc);
  }

  @Override
  public ObjectSchema removeDescription()
  {
    return (ObjectSchemaImpl) super.removeDescription();
  }

  @Override
  public ObjectSchema title(String title)
  {
    return (ObjectSchemaImpl) super.title(title);
  }

  @Override
  public ObjectSchema removeTitle()
  {
    return (ObjectSchemaImpl) super.removeTitle();
  }

  @Override
  public ObjectSchema removeDefault()
  {
    return (ObjectSchemaImpl) super.removeDefault();
  }

  @Override
  public ObjectSchema removeEnum()
  {
    return (ObjectSchemaImpl) super.removeEnum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends ObjectSchema> definition(String name)
  {
    return (UntypedChildSchema<? extends ObjectSchema>) super.definition(name);
  }

  @Override
  public ObjectSchema definition(String name, SchemaBuilder schema)
  {
    return (ObjectSchema) super.definition(name, schema);
  }

  @Override
  public ObjectSchema removeDefinition(String name)
  {
    return (ObjectSchema) super.removeDefinition(name);
  }

  @Override
  public ObjectSchema removeDefinitions()
  {
    return (ObjectSchema) super.removeDefinitions();
  }

  @Override
  public ObjectSchema defaultValue(JsonNode val)
  {
    return (ObjectSchema) super.defaultValue(val);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Internal Methods                                    │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  private ObjectNode props()
  {
    return has(PROPS) ? (ObjectNode) get(PROPS) : raw().putObject(PROPS);
  }

  private ArrayNode req()
  {
    return has(REQ) ? (ArrayNode) get(REQ) : raw().putArray(REQ);
  }

  private ObjectNode patProps()
  {
    return has(PATT_PROPS)
      ? (ObjectNode) get(PATT_PROPS)
      : raw().putObject(PATT_PROPS);
  }
}
