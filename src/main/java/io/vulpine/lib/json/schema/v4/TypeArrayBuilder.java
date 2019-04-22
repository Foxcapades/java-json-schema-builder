package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P>
 *   Parent object type
 */
public interface TypeArrayBuilder<P extends SchemaNode>
extends SchemaNode, ChildBuilder<P>
{
  ChildArrayBuilder<TypeArrayBuilder<P>> addArray();

  ChildBooleanBuilder<TypeArrayBuilder<P>> addBoolean();

  ChildIntegerBuilder<TypeArrayBuilder<P>> addInteger();

  ChildNullBuilder<TypeArrayBuilder<P>> addNull();

  ChildNumberBuilder<TypeArrayBuilder<P>> addNumber();

  ChildObjectBuilder<TypeArrayBuilder<P>> addObject();

  ChildStringBuilder<TypeArrayBuilder<P>> addString();

  TypeArrayBuilder<P> add(SchemaObject val);
}
