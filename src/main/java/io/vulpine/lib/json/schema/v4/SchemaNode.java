package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;

public interface SchemaNode {
  /**
   * Returns a constructed JsonNode representation of the builder state.
   *
   * Modification of the returned JsonNode must not modify any internal state
   * for the {@link SchemaObject}.
   *
   * @return constructed JsonNode instance.
   */
  JsonNode render();
}
