package io.vulpine.lib.json.schema.v4.trait;

import io.vulpine.lib.json.schema.v4.BooleanSchema;

/**
 * @param <T>
 *   Extension type
 *
 * @since 2.0
 */
public interface HasOrBoolean<T extends HasOrBoolean>
{
  BooleanSchema orAsBoolean();
}
