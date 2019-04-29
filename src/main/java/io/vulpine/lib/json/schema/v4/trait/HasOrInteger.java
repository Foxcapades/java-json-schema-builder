package io.vulpine.lib.json.schema.v4.trait;

import io.vulpine.lib.json.schema.v4.IntegerSchema;

/**
 * @param <T>
 *   Extension type
 *
 * @since 2.0
 */
public interface HasOrInteger<T extends HasOrInteger>
{
  IntegerSchema orAsInteger();
}
