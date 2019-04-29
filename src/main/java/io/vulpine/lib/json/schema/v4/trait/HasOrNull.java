package io.vulpine.lib.json.schema.v4.trait;

import io.vulpine.lib.json.schema.v4.NullSchema;

/**
 * @param <T>
 *   Extension type
 *
 * @since 2.0
 */
public interface HasOrNull<T extends HasOrNull>
{
  NullSchema orAsNull();
}
