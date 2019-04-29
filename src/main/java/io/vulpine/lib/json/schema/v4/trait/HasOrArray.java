package io.vulpine.lib.json.schema.v4.trait;

import io.vulpine.lib.json.schema.v4.ArraySchema;

/**
 * @param <T>
 *   Extension type
 *
 * @since 2.0
 */
public interface HasOrArray<T extends HasOrArray>
{
  ArraySchema orAsArray();
}
