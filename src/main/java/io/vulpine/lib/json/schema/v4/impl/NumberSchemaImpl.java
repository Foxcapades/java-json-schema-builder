package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.JsonType;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

class NumberSchemaImpl extends SchemaNodeImpl implements NumberSchema
{
  NumberSchemaImpl(ObjectMapper jax, ObjectNode raw)
  {
    super(jax, raw, JsonType.NUMBER);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface Implementation                            │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public NumberSchema defaultValue(int val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchema defaultValue(long val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchema defaultValue(double val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchema defaultValue(float val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchema defaultValue(BigInteger val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchema defaultValue(BigDecimal val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchema maximum(double val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchema maximum(float val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchema maximum(int val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchema maximum(long val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchema maximum(BigInteger val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchema maximum(BigDecimal val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchema removeMaximum()
  {
    return remove(MAXIMUM);
  }

  @Override
  public NumberSchema exclusiveMaximum(boolean val)
  {
    return put(EXCL_MAX, val);
  }

  @Override
  public NumberSchema removeExclusiveMaximum()
  {
    return remove(EXCL_MAX);
  }

  @Override
  public NumberSchema minimum(double val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchema minimum(float val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchema minimum(int val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchema minimum(long val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchema minimum(BigDecimal val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchema minimum(BigInteger val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchema removeMinimum()
  {
    return remove(MINIMUM);
  }

  @Override
  public NumberSchema exclusiveMinimum(boolean val)
  {
    return put(EXCL_MIN, val);
  }

  @Override
  public NumberSchema removeExclusiveMinimum()
  {
    return remove(EXCL_MIN);
  }

  @Override
  public NumberSchema multipleOf(int val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchema multipleOf(long val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchema multipleOf(float val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchema multipleOf(double val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchema multipleOf(BigInteger val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchema multipleOf(BigDecimal val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchema removeMultipleOf()
  {
    return remove(MULTIPLE);
  }

  @Override
  public NumberSchema enumValues(Number... vals)
  {
    // Prevent empty enum array.
    if (vals.length < 1)
      return this;

    var e = enumArr();
    for (var i : vals) {
      if (i instanceof Integer)
        e.add(i.intValue());
      else if (i instanceof Double)
        e.add(i.doubleValue());
      else if (i instanceof Long)
        e.add(i.longValue());
      else if (i instanceof Float)
        e.add(i.floatValue());
      else if (i instanceof BigInteger)
        e.add((BigInteger) i);
      else if (i instanceof BigDecimal)
        e.add((BigDecimal) i);
      else if (i instanceof Byte || i instanceof Short)
        e.add(i.intValue());
      else
        e.add(i.doubleValue());
    }

    return this;
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public NumberSchema id(String id)
  {
    return (NumberSchema) super.id(id);
  }

  @Override
  public NumberSchema removeId()
  {
    return (NumberSchema) super.removeId();
  }

  @Override
  public NumberSchema $schema(String path)
  {
    return (NumberSchema) super.$schema(path);
  }

  @Override
  public NumberSchema remove$Schema()
  {
    return (NumberSchema) super.remove$Schema();
  }

  @Override
  public NumberSchema $ref(String path)
  {
    return (NumberSchema) super.$ref(path);
  }

  @Override
  public NumberSchema remove$Ref()
  {
    return (NumberSchema) super.remove$Ref();
  }

  @Override
  public NumberSchema description(String desc)
  {
    return (NumberSchema) super.description(desc);
  }

  @Override
  public NumberSchema removeDescription()
  {
    return (NumberSchema) super.removeDescription();
  }

  @Override
  public NumberSchema title(String title)
  {
    return (NumberSchema) super.title(title);
  }

  @Override
  public NumberSchema removeTitle()
  {
    return (NumberSchema) super.removeTitle();
  }

  @Override
  public NumberSchema removeDefault()
  {
    return (NumberSchema) super.removeDefault();
  }

  @Override
  public NumberSchema removeEnum()
  {
    return (NumberSchema) super.removeEnum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends NumberSchema> definition(String name)
  {
    return (UntypedChildSchema<? extends NumberSchema>) super.definition(name);
  }

  @Override
  public NumberSchema definition(String name, SchemaBuilder schema)
  {
    return (NumberSchema) super.definition(name, schema);
  }

  @Override
  public NumberSchema removeDefinition(String name)
  {
    return (NumberSchema) super.removeDefinition(name);
  }

  @Override
  public NumberSchema removeDefinitions()
  {
    return (NumberSchema) super.removeDefinitions();
  }

  @Override
  public NumberSchema defaultValue(JsonNode val)
  {
    return (NumberSchema) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends NumberSchema> not()
  {
    return (UntypedChildSchema<? extends NumberSchema>) super.not();
  }
}
