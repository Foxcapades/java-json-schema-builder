package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.impl.StdSchemaBuilder;

public class Draft4
{
  public static final
  String META_SCHEMA = "http://json-schema.org/draft-04/schema";

  private final ObjectMapper mapper;

  public Draft4() {
    this(new ObjectMapper());
  }

  public Draft4(ObjectMapper mapper) {
    this.mapper = mapper;
  }

  public ObjectMapper getMapper() {
    return this.mapper;
  }

  public SchemaBuilder<? extends SchemaBuilder<?>> builder() {
    return new StdSchemaBuilder<>(mapper).$schema(META_SCHEMA);
  }

  public static SchemaBuilder<? extends SchemaBuilder<?>> newBuilder() {
    return new Draft4().builder();
  }
}
