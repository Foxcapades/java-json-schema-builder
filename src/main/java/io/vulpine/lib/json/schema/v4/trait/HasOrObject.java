package io.vulpine.lib.json.schema.v4.trait;

import io.vulpine.lib.json.schema.v4.ObjectSchema;

/**
 * @param <T>
 *   Extension type
 *
 * @since 2.0
 */
public interface HasOrObject<T extends HasOrObject>
{
  ObjectSchema orAsObject();
}
