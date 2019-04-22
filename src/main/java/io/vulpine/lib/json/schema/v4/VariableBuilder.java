package io.vulpine.lib.json.schema.v4;

public interface VariableBuilder<T extends VariableBuilder<T>>
extends SchemaNode
{
  ChildArrayBuilder<T> addArray();

  ChildBooleanBuilder<T> addBoolean();

  ChildIntegerBuilder<T> addInteger();

  ChildNullBuilder<T> addNull();

  ChildNumberBuilder<T> addNumber();

  ChildObjectBuilder<T> addObject();

  ChildStringBuilder<T> addString();

  ChildSchemaBuilder<T> add();

  T add(SchemaObject val);
}
