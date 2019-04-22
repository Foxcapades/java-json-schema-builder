package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.v4.StringBuilder;

public class StdSchemaBuilder<T extends SchemaBuilder<T>>
extends StdSchemaNode<T>
implements SchemaBuilder<T>
{
  public StdSchemaBuilder(ObjectMapper mapper) {
    super(mapper);
  }

  @Override
  public ArrayBuilder<? extends ArrayBuilder<?>> asArray() {
    return new StdArrayBuilder<>(mapper, schema.deepCopy());
  }

  @Override
  public BooleanBuilder<? extends BooleanBuilder<?>> asBoolean() {
    return new StdBooleanBuilder<>(mapper, schema.deepCopy());
  }

  @Override
  public IntegerBuilder<? extends IntegerBuilder<?>> asInteger() {
    return new StdIntegerBuilder<>(mapper, schema.deepCopy());
  }

  @Override
  public NullBuilder<? extends NullBuilder<?>> asNull() {
    return new StdNullBuilder<>(mapper, schema.deepCopy());
  }

  @Override
  public NumberBuilder<? extends NumberBuilder<?>> asNumber() {
    return new StdNumberBuilder<>(mapper, schema.deepCopy());
  }

  @Override
  public ObjectBuilder<? extends ObjectBuilder<?>> asObject() {
    return new StdObjectBuilder<>(mapper, schema.deepCopy());
  }

  @Override
  public StringBuilder<? extends StringBuilder<?>> asString() {
    return new StdStringBuilder<>(mapper, schema.deepCopy());
  }
}
