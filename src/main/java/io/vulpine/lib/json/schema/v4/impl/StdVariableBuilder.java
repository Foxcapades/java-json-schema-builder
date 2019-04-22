package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.*;

@SuppressWarnings("unchecked")
class StdVariableBuilder<T extends VariableBuilder<T>>
implements VariableBuilder<T>
{
  private final ObjectNode outer;
  private final ObjectMapper mapper;
  private final ArrayNode schema;

  public StdVariableBuilder(ObjectMapper mapper, ObjectNode outer, String key)
  {
    this.mapper = mapper;
    this.outer  = outer;
    this.schema = outer.putArray(key);
  }

  @Override
  public ChildArrayBuilder<T> addArray()
  {
    return new StdChildArrayBuilder<>((T) this, mapper, schema.addObject());
  }

  @Override
  public ChildBooleanBuilder<T> addBoolean()
  {
    return new StdChildBooleanBuilder<>((T) this, mapper, schema.addObject());
  }

  @Override
  public ChildIntegerBuilder<T> addInteger()
  {
    return new StdChildIntegerBuilder<>((T) this, mapper, schema.addObject());
  }

  @Override
  public ChildNullBuilder<T> addNull()
  {
    return new StdChildNullBuilder<>((T) this, mapper, schema.addObject());
  }

  @Override
  public ChildNumberBuilder<T> addNumber()
  {
    return new StdChildNumberBuilder<>((T) this, mapper, schema.addObject());
  }

  @Override
  public ChildObjectBuilder<T> addObject()
  {
    return new StdChildObjectBuilder<>((T) this, mapper, schema.addObject());
  }

  @Override
  public ChildStringBuilder<T> addString()
  {
    return new StdChildStringBuilder<>((T) this, mapper, schema.addObject());
  }

  @Override
  public ChildSchemaBuilder<T> add()
  {
    return new StdChildSchemaBuilder<>((T) this, mapper, schema.addObject());
  }

  @Override
  public T add(SchemaObject val)
  {
    schema.add(val.render());
    return (T) this;
  }

  @Override
  public JsonNode render()
  {
    return outer.deepCopy();
  }
}
