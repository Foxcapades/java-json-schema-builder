package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;
import io.vulpine.lib.json.schema.v4.lib.SchemaNodeArray;

/**
 * @since 2.0
 */
public interface SchemaSet<P extends SchemaBuilder>
extends
  SchemaBuilder,
  ChildSchema<P>,
  SchemaNodeArray<SchemaSet<P>>
{
  // Return type override
  @Override
  SchemaSet<P> add(SchemaBuilder... vals);
}
