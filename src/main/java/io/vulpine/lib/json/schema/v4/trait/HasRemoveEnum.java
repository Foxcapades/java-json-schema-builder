package io.vulpine.lib.json.schema.v4.trait;

/**
 * @param <T>
 *   Extension type
 *
 * @since 2.0
 */
public interface HasRemoveEnum<T extends HasRemoveEnum>
{
  /**
   * Removes the {@code "enum"} property from the schema.
   *
   * @return a modified instance of {@link T}
   *
   * @since 2.0
   */
  T removeEnum();
}
