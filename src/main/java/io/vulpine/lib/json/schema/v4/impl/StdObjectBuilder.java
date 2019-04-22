package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.*;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

@SuppressWarnings("unchecked")
class StdObjectBuilder<T extends ObjectBuilder<T>>
extends StdSchemaObject<T>
implements ObjectBuilder<T>
{
  StdObjectBuilder(ObjectMapper mapper, ObjectNode schema) {
    super(mapper, schema);
    this.schema.put(TYPE, JsonType.OBJECT.jsonName());
  }

  @Override
  public ChildSchemaBuilder<T> optionalProperty(String name) {
    return new StdChildSchemaBuilder<>((T) this, mapper,
      props().putObject(name));
  }

  @Override
  public T optionalProperty(String name, SchemaObject node)
  {
    props().set(name, strip$Schema(node.render()));
    return (T) this;
  }

  @Override
  public T clearOptionalProperties()
  {
    if (!hasReq())
      return clear(PROPS);

    final var out = mapper.createObjectNode();
    final var old = props();

    required().forEach(n -> out.set(n.asText(), old.get(n.asText())));
    return put(PROPS, out);
  }

  @Override
  public ChildSchemaBuilder<T> requiredProperty(String name)
  {
    required().add(name);
    return optionalProperty(name);
  }

  @Override
  public T requiredProperty(String name, SchemaObject node)
  {
    required().add(name);
    props().set(name, strip$Schema(node.render()));
    return (T) this;
  }

  @Override
  public T clearRequiredProperties()
  {
    // If there are no required properties then there is nothing to do.
    if (!hasReq())
      return (T) this;

    final var req = required();
    final var props = props();

    // If all the properties are required then clear both fields.
    if (req.size() == props.size()) {
      clear(REQ);
      return clear(PROPS);
    }

    required().forEach(p -> props.remove(p.asText()));
    return clear(REQ);
  }

  @Override
  public ChildSchemaBuilder<T> patternProperty(String a)
  {
    return new StdChildSchemaBuilder<>((T) this, mapper,
      patternProps().putObject(a));
  }

  @Override
  public T patternProperty(String a, SchemaObject b)
  {
    patternProps().set(a, strip$Schema(b.render()));
    return (T) this;
  }

  @Override
  public T clearPatternProperties()
  { return clear(PATT_PROPS); }

  @Override
  public ChildSchemaBuilder<T> additionalProperties()
  {
    return new StdChildSchemaBuilder<>((T) this, mapper,
      schema.putObject(ADDTL_PROPS));
  }

  @Override
  public T additionalProperties(SchemaObject v)
  { return put(ADDTL_PROPS, v); }

  @Override public T additionalProperties(boolean f)
  { return put(ADDTL_PROPS, f); }

  @Override public T clearAdditionalProperties()
  { return clear(ADDTL_PROPS); }

  @Override
  public T enumValues(ObjectNode... types)
  {
    var en = enumArr();
    for (final var a : types)
      en.add(a);
    return (T) this;
  }

  private ObjectNode patternProps() {
    return schema.has(PATT_PROPS)
      ? (ObjectNode) schema.get(PATT_PROPS)
      : schema.putObject(PATT_PROPS);
  }

  private ArrayNode required()
  { return hasReq() ? (ArrayNode) schema.get(REQ) : schema.putArray(REQ); }

  private ObjectNode props() {
    return hasProps()
      ? (ObjectNode) schema.get(PROPS)
      : schema.putObject(PROPS);
  }

  private boolean hasReq()
  { return schema.has(REQ); }

  private boolean hasProps()
  { return schema.has(PROPS); }

}
