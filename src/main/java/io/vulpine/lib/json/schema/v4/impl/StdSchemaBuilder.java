package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.*;
import io.vulpine.lib.json.schema.v4.StringBuilder;
import io.vulpine.lib.json.schema.v4.lib.Keys;

public class StdSchemaBuilder<T extends SchemaBuilder<T>>
extends StdSchemaObject<T>
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

  @Override
  public VariableBuilder<? extends VariableBuilder<?>> allOf()
  {
    return new StdVariableBuilder<>(mapper, schema.deepCopy(), Keys.ALL_OF);
  }

  @Override
  public VariableBuilder<? extends VariableBuilder<?>> anyOf()
  {
    return new StdVariableBuilder<>(mapper, schema.deepCopy(), Keys.ANY_OF);
  }

  @Override
  public VariableBuilder<? extends VariableBuilder<?>> oneOf()
  {
    return new StdVariableBuilder<>(mapper, schema.deepCopy(), Keys.ONE_OF);
  }
}
