package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.*;

import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;

class StringSchemaImpl
extends SchemaNodeImpl
implements StringSchema
{
  StringSchemaImpl(ObjectMapper jax, ObjectNode raw)
  {
    super(jax, raw, JsonType.STRING);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Interface implementations                           │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public StringSchemaImpl defaultValue(String val)
  {
    return put(DEFAULT, val);
  }

  @Override
  public StringSchemaImpl maxLength(int val)
  {
    return put(MAX_LENGTH, val);
  }

  @Override
  public StringSchemaImpl maxLength(long val)
  {
    return put(MAX_LENGTH, val);
  }

  @Override
  public StringSchemaImpl maxLength(BigInteger val)
  {
    return put(MAX_LENGTH, val);
  }

  @Override
  public StringSchemaImpl removeMaxLength()
  {
    return remove(MAX_LENGTH);
  }

  @Override
  public StringSchemaImpl minLength(int val)
  {
    return put(MIN_LENGTH, val);
  }

  @Override
  public StringSchemaImpl minLength(long val)
  {
    return put(MIN_LENGTH, val);
  }

  @Override
  public StringSchemaImpl minLength(BigInteger val)
  {
    return put(MIN_LENGTH, val);
  }

  @Override
  public StringSchema removeMinLength()
  {
    return remove(MIN_LENGTH);
  }

  @Override
  public StringSchema pattern(String pattern)
  {
    return put(PATTERN, pattern);
  }

  @Override
  public StringSchema removePattern()
  {
    return remove(PATTERN);
  }

  @Override
  public StringSchema enumValues(String... vals)
  {
    if (vals.length < 1)
      return this;

    final var e = enumArr();
    for (var v : vals)
      e.add(v);
    return this;
  }

  @Override
  public StringSchema format(Format format)
  {
    return put(FORMAT, format.jsonValue());
  }

  @Override
  public StringSchema format(String format)
  {
    return put(FORMAT, format);
  }

  @Override
  public StringSchema removeFormat()
  {
    return remove(FORMAT);
  }

  // ┌─────────────────────────────────────────────────────┐
  // │                                                     │
  // │ Return type overrides                               │
  // │                                                     │
  // └─────────────────────────────────────────────────────┘

  @Override
  public StringSchema id(String id)
  {
    return (StringSchema) super.id(id);
  }

  @Override
  public StringSchema removeId()
  {
    return (StringSchema) super.removeId();
  }

  @Override
  public StringSchema $schema(String path)
  {
    return (StringSchema) super.$schema(path);
  }

  @Override
  public StringSchema remove$Schema()
  {
    return (StringSchema) super.remove$Schema();
  }

  @Override
  public StringSchema $ref(String path)
  {
    return (StringSchema) super.$ref(path);
  }

  @Override
  public StringSchema remove$Ref()
  {
    return (StringSchema) super.remove$Ref();
  }

  @Override
  public StringSchema description(String desc)
  {
    return (StringSchema) super.description(desc);
  }

  @Override
  public StringSchema removeDescription()
  {
    return (StringSchema) super.removeDescription();
  }

  @Override
  public StringSchema title(String title)
  {
    return (StringSchema) super.title(title);
  }

  @Override
  public StringSchema removeTitle()
  {
    return (StringSchema) super.removeTitle();
  }

  @Override
  public StringSchema removeDefault()
  {
    return (StringSchema) super.removeDefault();
  }

  @Override
  public StringSchema removeEnum()
  {
    return (StringSchema) super.removeEnum();
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends StringSchema> definition(String name)
  {
    return (UntypedChildSchema<? extends StringSchema>) super.definition(name);
  }

  @Override
  public StringSchema definition(String name, SchemaBuilder schema)
  {
    return (StringSchema) super.definition(name, schema);
  }

  @Override
  public StringSchema removeDefinition(String name)
  {
    return (StringSchema) super.removeDefinition(name);
  }

  @Override
  public StringSchema removeDefinitions()
  {
    return (StringSchema) super.removeDefinitions();
  }

  @Override
  public StringSchema defaultValue(JsonNode val)
  {
    return (StringSchema) super.defaultValue(val);
  }

  @Override
  @SuppressWarnings("unchecked")
  public UntypedChildSchema<? extends StringSchema> not()
  {
    return (UntypedChildSchema<? extends StringSchema>) super.not();
  }
}
