package io.vulpine.lib.json.schema;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.vulpine.lib.json.schema.v4.lib.Keys.$SCHEMA;
import static org.junit.jupiter.api.Assertions.*;

class SchemaTest
{
  private ObjectMapper input;
  private Schema test;

  @BeforeEach
  void setUp()
  {
    test = new Schema(input = new ObjectMapper());
  }

  @Test
  void getMapper()
  {
    assertSame(input, test.getMapper());
  }

  @Test
  void newDraft4()
  {
    var a = test.newDraft4();
    assertNotNull(a);
    assertTrue(a.build().has($SCHEMA));
    assertEquals(Schema.DRAFT_4, a.build().get($SCHEMA).textValue());
  }

  @Test
  void draft4()
  {
    var a = test.newDraft4();
    assertNotNull(a);
    assertTrue(a.build().has($SCHEMA));
    assertEquals(Schema.DRAFT_4, a.build().get($SCHEMA).textValue());
  }
}
