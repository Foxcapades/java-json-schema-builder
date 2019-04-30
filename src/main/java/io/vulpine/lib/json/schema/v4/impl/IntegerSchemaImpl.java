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

class IntegerSchemaImpl extends SchemaNodeImpl implements IntegerSchema
{
  IntegerSchemaImpl(ObjectMapper mapper, ObjectNode schema)
  {
    super(mapper, schema, JsonType.INTEGER);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public IntegerSchema defaultValue(int v)
  {
    return put(DEFAULT, v);
  }

  @Override
  public IntegerSchema defaultValue(long v)
  {
    return put(DEFAULT, v);
  }

  @Override
  public IntegerSchema defaultValue(BigInteger v)
  {
    return put(DEFAULT, v);
  }

  @Override
  public IntegerSchema maximum(int x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public IntegerSchema maximum(long x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public IntegerSchema maximum(BigInteger x)
  {
    return put(MAXIMUM, x);
  }

  @Override
  public IntegerSchema removeMaximum()
  {
    return remove(MAXIMUM);
  }

  @Override
  public IntegerSchema exclusiveMaximum(boolean f)
  {
    return put(EXCL_MAX, f);
  }

  @Override
  public IntegerSchema removeExclusiveMaximum()
  {
    return remove(EXCL_MAX);
  }

  @Override
  public IntegerSchema minimum(int x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public IntegerSchema minimum(long x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public IntegerSchema minimum(BigInteger x)
  {
    return put(MINIMUM, x);
  }

  @Override
  public IntegerSchema removeMinimum()
  {
    return remove(MINIMUM);
  }

  @Override
  public IntegerSchema exclusiveMinimum(boolean x)
  {
    return put(EXCL_MIN, x);
  }

  @Override
  public IntegerSchema removeExclusiveMinimum()
  {
    return remove(EXCL_MIN);
  }

  @Override
  public IntegerSchema multipleOf(double x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public IntegerSchema multipleOf(float x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public IntegerSchema multipleOf(int x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public IntegerSchema multipleOf(long x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public IntegerSchema multipleOf(BigInteger x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public IntegerSchema multipleOf(BigDecimal x)
  {
    return put(MULTIPLE, x);
  }

  @Override
  public IntegerSchema removeMultipleOf()
  {
    return remove(MULTIPLE);
  }

  @Override
  public IntegerSchema enumValues(int... val)
  {
    var en = enumArr();

    for (var i : val)
      en.add(i);

    return this;
  }

  @Override
  public IntegerSchema enumValues(long... val)
  {
    var en = enumArr();

    for (var l : val)
      en.add(l);

    return this;
  }

  @Override
  public IntegerSchema enumValues(BigInteger... val)
  {
    var en = enumArr();

    for (var b : val)
      en.add(b);

    return this;
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public IntegerSchema id(String id)
  {
    return (IntegerSchema) super.id(id);
  }

  @Override
  public IntegerSchema removeId()
  {
    return (IntegerSchema) super.removeId();
  }

  @Override
  public IntegerSchema $schema(String path)
  {
    return (IntegerSchema) super.$schema(path);
  }

  @Override
  public IntegerSchema remove$Schema()
  {
    return (IntegerSchema) super.remove$Schema();
  }

  @Override
  public IntegerSchema $ref(String path)
  {
    return (IntegerSchema) super.$ref(path);
  }

  @Override
  public IntegerSchema remove$Ref()
  {
    return (IntegerSchema) super.remove$Ref();
  }

  @Override
  public IntegerSchema description(String desc)
  {
    return (IntegerSchema) super.description(desc);
  }

  @Override
  public IntegerSchema removeDescription()
  {
    return (IntegerSchema) super.removeDescription();
  }

  @Override
  public IntegerSchema title(String title)
  {
    return (IntegerSchema) super.title(title);
  }

  @Override
  public IntegerSchema removeTitle()
  {
    return (IntegerSchema) super.removeTitle();
  }

  @Override
  public IntegerSchema removeDefault()
  {
    return (IntegerSchema) super.removeDefault();
  }

  @Override
  public IntegerSchema removeEnum()
  {
    return (IntegerSchema) super.removeEnum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends IntegerSchema> definition(String name)
  {
    return (UntypedChildSchema<? extends IntegerSchema>) super.definition(name);
  }

  @Override
  public IntegerSchema definition(String name, SchemaBuilder schema)
  {
    return (IntegerSchema) super.definition(name, schema);
  }

  @Override
  public IntegerSchema removeDefinition(String name)
  {
    return (IntegerSchema) super.removeDefinition(name);
  }

  @Override
  public IntegerSchema removeDefinitions()
  {
    return (IntegerSchema) super.removeDefinitions();
  }

  @Override
  public IntegerSchema defaultValue(JsonNode val)
  {
    return (IntegerSchema) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends IntegerSchema> not()
  {
    return (UntypedChildSchema<? extends IntegerSchema>) super.not();
  }
}
