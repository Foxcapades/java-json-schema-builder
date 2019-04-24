package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;

public interface SchemaNode {
  /**
   * Returns a constructed JsonNode representation of the builder state.
   * <p>
   * Modification of the returned JsonNode must not modify any internal state
   * for the {@link SchemaObject}.
   *
   * @return constructed JsonNode instance.
   *
   * @since 1.0
   *
   * @deprecated will be removed in favor of the build method
   */
  @Deprecated
  default JsonNode render()
  {
    return build();
  }

  /**
   * Returns a constructed JsonNode representation of the builder state.
   *
   * Modification of the returned JsonNode must not modify any internal state
   * for the {@link SchemaObject}.
   *
   * @return constructed JsonNode instance.
   *
   * @since 1.3
   */
  @JsonValue
  JsonNode build();
}
