package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P> parent type
 */
public interface ChildBooleanBuilder<P extends SchemaNode>
extends BooleanBuilder<ChildBooleanBuilder<P>>, ChildBuilder<P>
{
  @Override
  ChildBooleanBuilder<P> defaultValue(boolean val);
}
