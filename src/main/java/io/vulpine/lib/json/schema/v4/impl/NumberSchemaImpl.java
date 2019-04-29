package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
  public NumberSchemaImpl defaultValue(int val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchemaImpl defaultValue(long val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchemaImpl defaultValue(double val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchemaImpl defaultValue(float val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchemaImpl defaultValue(BigInteger val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchemaImpl defaultValue(BigDecimal val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public NumberSchemaImpl maximum(double val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchemaImpl maximum(float val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchemaImpl maximum(int val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchemaImpl maximum(long val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchemaImpl maximum(BigInteger val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchemaImpl maximum(BigDecimal val)
  {
    return put(MAXIMUM, val);
  }

  @Override
  public NumberSchemaImpl removeMaximum()
  {
    return remove(MAXIMUM);
  }

  @Override
  public NumberSchemaImpl exclusiveMaximum(boolean val)
  {
    return put(EXCL_MAX, val);
  }

  @Override
  public NumberSchemaImpl removeExclusiveMaximum()
  {
    return remove(EXCL_MAX);
  }

  @Override
  public NumberSchemaImpl minimum(double val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchemaImpl minimum(float val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchemaImpl minimum(int val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchemaImpl minimum(long val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchemaImpl minimum(BigDecimal val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchemaImpl minimum(BigInteger val)
  {
    return put(MINIMUM, val);
  }

  @Override
  public NumberSchemaImpl removeMinimum()
  {
    return remove(MINIMUM);
  }

  @Override
  public NumberSchemaImpl exclusiveMinimum(boolean val)
  {
    return put(EXCL_MIN, val);
  }

  @Override
  public NumberSchemaImpl removeExclusiveMinimum()
  {
    return remove(EXCL_MIN);
  }

  @Override
  public NumberSchemaImpl multipleOf(int val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchemaImpl multipleOf(long val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchemaImpl multipleOf(float val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchemaImpl multipleOf(double val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchemaImpl multipleOf(BigInteger val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchemaImpl multipleOf(BigDecimal val)
  {
    return put(MULTIPLE, val);
  }

  @Override
  public NumberSchemaImpl removeMultipleOf()
  {
    return remove(MULTIPLE);
  }

  @Override
  public NumberSchemaImpl enumValues(Number... vals)
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
  public NumberSchemaImpl id(String id)
  {
    return (NumberSchemaImpl) super.id(id);
  }

  @Override
  public NumberSchemaImpl removeId()
  {
    return (NumberSchemaImpl) super.removeId();
  }

  @Override
  public NumberSchemaImpl $schema(String path)
  {
    return (NumberSchemaImpl) super.$schema(path);
  }

  @Override
  public NumberSchemaImpl remove$Schema()
  {
    return (NumberSchemaImpl) super.remove$Schema();
  }

  @Override
  public NumberSchemaImpl $ref(String path)
  {
    return (NumberSchemaImpl) super.$ref(path);
  }

  @Override
  public NumberSchemaImpl remove$Ref()
  {
    return (NumberSchemaImpl) super.remove$Ref();
  }

  @Override
  public NumberSchemaImpl description(String desc)
  {
    return (NumberSchemaImpl) super.description(desc);
  }

  @Override
  public NumberSchemaImpl removeDescription()
  {
    return (NumberSchemaImpl) super.removeDescription();
  }

  @Override
  public NumberSchemaImpl title(String title)
  {
    return (NumberSchemaImpl) super.title(title);
  }

  @Override
  public NumberSchemaImpl removeTitle()
  {
    return (NumberSchemaImpl) super.removeTitle();
  }

  @Override
  public NumberSchemaImpl removeDefault()
  {
    return (NumberSchemaImpl) super.removeDefault();
  }

  @Override
  public NumberSchemaImpl removeEnum()
  {
    return (NumberSchemaImpl) super.removeEnum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends NumberSchema> definition(String name)
  {
    return (UntypedChildSchema<? extends NumberSchema>) super.definition(name);
  }

  @Override
  public NumberSchemaImpl definition(String name, SchemaBuilder schema)
  {
    return (NumberSchemaImpl) super.definition(name, schema);
  }

  @Override
  public NumberSchemaImpl removeDefinition(String name)
  {
    return (NumberSchemaImpl) super.removeDefinition(name);
  }

  @Override
  public NumberSchemaImpl removeDefinitions()
  {
    return (NumberSchemaImpl) super.removeDefinitions();
  }

  @Override
  public NumberSchema defaultValue(JsonNode val)
  {
    return (NumberSchema) super.defaultValue(val);
  }
}
