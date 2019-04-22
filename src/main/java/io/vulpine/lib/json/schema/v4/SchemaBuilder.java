package io.vulpine.lib.json.schema.v4;

public interface SchemaBuilder<T extends SchemaBuilder<T>>
extends SchemaObject<T>
{
  ArrayBuilder<? extends ArrayBuilder<?>> asArray();

  BooleanBuilder<? extends BooleanBuilder<?>> asBoolean();

  IntegerBuilder<? extends IntegerBuilder<?>> asInteger();

  NullBuilder<? extends NullBuilder<?>> asNull();

  NumberBuilder<? extends NumberBuilder<?>> asNumber();

  ObjectBuilder<? extends ObjectBuilder<?>> asObject();

  StringBuilder<? extends StringBuilder<?>> asString();

  VariableBuilder<? extends VariableBuilder<?>> allOf();

  VariableBuilder<? extends VariableBuilder<?>> anyOf();

  VariableBuilder<? extends VariableBuilder<?>> oneOf();
}
