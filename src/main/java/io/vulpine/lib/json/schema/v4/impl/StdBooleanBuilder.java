package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.BooleanBuilder;
import io.vulpine.lib.json.schema.v4.JsonType;

import static io.vulpine.lib.json.schema.v4.lib.Keys.DEFAULT;
import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;

class StdBooleanBuilder<T extends BooleanBuilder<T>>
extends StdSchemaNode<T>
implements BooleanBuilder<T>
{
  StdBooleanBuilder(ObjectMapper mapper)
  {
    super(mapper);
    this.schema.put(TYPE, JsonType.BOOLEAN.jsonName());
  }

  StdBooleanBuilder(ObjectMapper mapper, ObjectNode schema)
  {
    super(mapper, schema);
    this.schema.put(TYPE, JsonType.BOOLEAN.jsonName());
  }

  @Override
  public T defaultValue(boolean val)
  {
    return put(DEFAULT, val);
  }
}
