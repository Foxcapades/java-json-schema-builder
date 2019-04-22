package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.JsonType;
import io.vulpine.lib.json.schema.v4.NullBuilder;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;

class StdNullBuilder<T extends NullBuilder<T>>
extends StdSchemaNode<T>
implements NullBuilder<T>
{
  public StdNullBuilder(ObjectMapper mapper) {
    super(mapper);
    this.schema.put(TYPE, JsonType.NULL.jsonName());
  }

  protected StdNullBuilder(ObjectMapper mapper, ObjectNode schema) {
    super(mapper, schema);
    this.schema.put(TYPE, JsonType.NULL.jsonName());
  }
}
