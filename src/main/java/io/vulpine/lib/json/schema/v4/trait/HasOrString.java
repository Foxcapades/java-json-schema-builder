package io.vulpine.lib.json.schema.v4.trait;

import io.vulpine.lib.json.schema.v4.StringSchema;

/**
 * @param <T>
 *   Extension type
 *
 * @since 2.0
 */
public interface HasOrString<T extends HasOrString>
{
  StringSchema orAsString();
}
