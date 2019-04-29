package io.vulpine.lib.json.schema.v4.lib;

import io.vulpine.lib.json.schema.SchemaBuilder;

/**
 * @param <P> parent object type
 */
public interface ChildSchema<P extends SchemaBuilder>
{
  P close();
}
