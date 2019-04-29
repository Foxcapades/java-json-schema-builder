package io.vulpine.lib.json.schema;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.UntypedSchema;
import io.vulpine.lib.json.schema.v4.impl.UntypedSchemaImpl;

/**
 * JSON Schema Builder Factory
 *
 * @since 2.0
 */
public class Schema
{
  public static final
  String DRAFT_4 = "http://json-schema.org/draft-04/schema";

  private static final ObjectMapper DEF_MAP = new ObjectMapper();

  private final ObjectMapper mapper;

  public Schema() {
    this(DEF_MAP);
  }

  public Schema(ObjectMapper mapper) {
    this.mapper = mapper;
  }

  public ObjectMapper getMapper() {
    return this.mapper;
  }

  public UntypedSchema newDraft4() {
    return new UntypedSchemaImpl(mapper)
      .$schema(DRAFT_4);
  }

  public static UntypedSchema draft4() {
    return new UntypedSchemaImpl(DEF_MAP)
      .$schema(DRAFT_4);
  }
}
