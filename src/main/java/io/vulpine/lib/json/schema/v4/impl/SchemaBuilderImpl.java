package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

import static io.vulpine.lib.json.schema.v4.lib.Keys.$SCHEMA;

class SchemaBuilderImpl implements SchemaBuilder
{
  private final ObjectMapper jax;
  private final ObjectNode raw;

  SchemaBuilderImpl(ObjectMapper jax, ObjectNode raw)
  {
    this.jax = jax;
    this.raw = raw;
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public JsonNode build()
  {
    return raw.deepCopy();
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Builder helpers                                     │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public String toString()
  {
    return raw.toString();
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Builder helpers                                     │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  protected final ObjectMapper jax()
  {
    return jax;
  }

  protected final ObjectNode raw()
  {
    return raw;
  }

  final ObjectNode copy()
  {
    return raw.deepCopy();
  }

  final boolean has(String key)
  {
    return raw.has(key);
  }

  final JsonNode get(String key)
  {
    return raw.get(key);
  }

  final ArrayNode putArr(String key)
  {
    return raw.putArray(key);
  }

  final ArrayNode newArr()
  {
    return jax.createArrayNode();
  }

  final ObjectNode newObj()
  {
    return jax.createObjectNode();
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T remove(String key)
  {
    raw.remove(key);
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T remove(String map, String key)
  {
    if (raw.has(map)) {
      final var tmp = (ObjectNode) raw.get(map);
      tmp.remove(key);
      if (tmp.size() == 0)
        remove(map);
    }
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, boolean val)
  {
    raw.put(key, val);
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, double val)
  {
    raw.put(key, val);
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, float val)
  {
    raw.put(key, val);
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, int val)
  {
    raw.put(key, val);
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, long val)
  {
    raw.put(key, val);
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, BigDecimal val)
  {
    raw.put(key, Objects.requireNonNull(val));
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, BigInteger val)
  {
    raw.put(key, Objects.requireNonNull(val));
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, JsonNode val)
  {
    raw.set(key, strip(Objects.requireNonNull(val)));
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, SchemaBuilder val)
  {
    raw.set(key, strip(val.build()));
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(String key, String val)
  {
    raw.put(key, Objects.requireNonNull(val));
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  final <T extends SchemaBuilder> T put(ObjectNode node, String k, JsonNode v)
  {
    node.set(k, strip(v));
    return (T) this;
  }

  private JsonNode strip(JsonNode node)
  {
    if (node.isObject())
      ((ObjectNode) node).remove($SCHEMA);
    return node;
  }
}
