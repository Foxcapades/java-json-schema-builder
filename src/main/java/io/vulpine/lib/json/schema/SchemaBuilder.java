package io.vulpine.lib.json.schema;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * @since 2.0
 */
public interface SchemaBuilder
{
  /**
   * Returns a constructed JsonNode representation of the builder state.
   * <p>
   * Modification of the returned JsonNode must not modify any internal state
   * for the {@link SchemaBuilder}.
   *
   * @return constructed JsonNode instance.
   *
   * @since 2.0
   */
  @JsonValue
  JsonNode build();
}
