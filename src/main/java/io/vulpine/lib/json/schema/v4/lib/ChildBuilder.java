package io.vulpine.lib.json.schema.v4.lib;

import io.vulpine.lib.json.schema.v4.SchemaNode;

/**
 * @param <P> parent object type
 */
public interface ChildBuilder<P extends SchemaNode>
{
  P close();
}
