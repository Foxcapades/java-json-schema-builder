package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.SchemaNode;
import io.vulpine.lib.json.schema.v4.SchemaObject;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static java.util.Objects.requireNonNull;

@SuppressWarnings("unchecked")
class StdSchemaObject<T extends SchemaObject<T>> implements SchemaObject<T>
{
  protected final ObjectMapper mapper;
  protected final ObjectNode schema;

  public StdSchemaObject(ObjectMapper mapper)
  {
    this(mapper, mapper.createObjectNode());
  }

  protected StdSchemaObject(ObjectMapper mapper, ObjectNode schema)
  {
    this.mapper = mapper;
    this.schema = schema;
  }

  @Override
  public T clearDefaultValue()
  {
    return clear(DEFAULT);
  }

  @Override
  public T id(String id)
  {
    return put(ID, id);
  }

  @Override
  public T clearId()
  {
    return clear(ID);
  }

  @Override
  public T $schema(String path)
  {
    return put($SCHEMA, path);
  }

  @Override
  public T clear$Schema()
  {
    return clear($SCHEMA);
  }

  @Override
  public T $ref(String path)
  {
    return put($REF, path);
  }

  @Override
  public T clear$Ref()
  {
    return clear($REF);
  }

  @Override
  public T description(String desc)
  {
    return put(DESC, desc);
  }

  @Override
  public T clearDescription()
  {
    return clear(DESC);
  }

  @Override
  public T title(String title)
  {
    return put(TITLE, title);
  }

  @Override
  public T clearTitle()
  {
    return clear(TITLE);
  }

  @Override
  public JsonNode render()
  {
    return schema.deepCopy();
  }

  protected T clear(String key)
  {
    schema.remove(key);
    return (T) this;
  }

  protected T put(String key, boolean val)
  {
    schema.put(key, val);
    return (T) this;
  }

  protected T put(String key, JsonNode val)
  {
    schema.set(key, requireNonNull(val));
    return (T) this;
  }

  protected T put(String key, int val)
  {
    schema.put(key, val);
    return (T) this;
  }

  protected T put(String key, long val)
  {
    schema.put(key, val);
    return (T) this;
  }

  protected T put(String key, double val)
  {
    schema.put(key, val);
    return (T) this;
  }

  protected T put(String key, float val)
  {
    schema.put(key, val);
    return (T) this;
  }

  protected T put(String key, String val)
  {
    schema.put(key, requireNonNull(val));
    return (T) this;
  }

  protected T put(String key, BigInteger val)
  {
    schema.put(key, requireNonNull(val));
    return (T) this;
  }

  protected T put(String key, BigDecimal val)
  {
    schema.put(key, requireNonNull(val));
    return (T) this;
  }

  protected T put(String key, SchemaNode node)
  {
    schema.set(key, strip$Schema(requireNonNull(node).render()));
    return (T) this;
  }

  protected JsonNode strip$Schema(JsonNode node)
  {
    ((ObjectNode) node).remove($SCHEMA);
    return node;
  }

  protected boolean hasEnum()
  {
    return schema.has(ENUM);
  }

  protected ArrayNode enumArr()
  {
    return hasEnum() ? (ArrayNode) schema.get(ENUM) : schema.putArray(ENUM);
  }

  public T clearEnumValues()
  {
    return clear(ENUM);
  }
}
