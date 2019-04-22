package io.vulpine.lib.json.schema.v4;

/**
 * @param <T>
 *   Extension type
 */
public interface BooleanBuilder<T extends BooleanBuilder<T>> extends SchemaObject<T>
{
  T defaultValue(boolean val);
}
