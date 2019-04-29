package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.Schema;
import io.vulpine.lib.json.schema.v4.UntypedSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UntypedSchemaImplTest
{
  public static final ObjectMapper JSON = new ObjectMapper();

  private UntypedSchema test;

  protected UntypedSchema test()
  {
    return test;
  }

  @BeforeEach
  void setUp()
  {
    test = new UntypedSchemaImpl(JSON, JSON.createObjectNode());
  }

  @Test
  void asArray()
  {
    var a = test().asArray();
    assertNotNull(a);
    assertEquals("{\"type\":\"array\"}", a.toString());
  }

  @Test
  void asBoolean()
  {
    var a = test().asBoolean();
    assertNotNull(a);
    assertEquals("{\"type\":\"boolean\"}", a.toString());
  }

  @Test
  void asInteger()
  {
    var a = test().asInteger();
    assertNotNull(a);
    assertEquals("{\"type\":\"integer\"}", a.toString());
  }

  @Test
  void asNull()
  {
    var a = test().asNull();
    assertNotNull(a);
    assertEquals("{\"type\":\"null\"}", a.toString());
  }

  @Test
  void asNumber()
  {
    var a = test().asNumber();
    assertNotNull(a);
    assertEquals("{\"type\":\"number\"}", a.toString());
  }

  @Test
  void asObject()
  {
    var a = test().asObject();
    assertNotNull(a);
    assertEquals("{\"type\":\"object\"}", a.toString());
  }

  @Test
  void asString()
  {
    var a = test().asString();
    assertNotNull(a);
    assertEquals("{\"type\":\"string\"}", a.toString());
  }

  @Test
  void allOf()
  {
    var a = test().allOf();
    assertNotNull(a);
    assertEquals("{}", a.toString());
    var b = test().allOf().add(Schema.draft4());
    assertNotNull(b);
    assertEquals("{\"allOf\":[{}]}", b.toString());
  }

  @Test
  void anyOf()
  {
    var a = test().anyOf();
    assertNotNull(a);
    assertEquals("{}", a.toString());
    var b = test().anyOf().add(Schema.draft4());
    assertNotNull(b);
    assertEquals("{\"anyOf\":[{}]}", b.toString());
  }

  @Test
  void oneOf()
  {
    var a = test().oneOf();
    assertNotNull(a);
    assertEquals("{}", a.toString());
    var b = test().oneOf().add(Schema.draft4());
    assertNotNull(b);
    assertEquals("{\"oneOf\":[{}]}", b.toString());
  }

  @Test
  void not()
  {
    var a = test().not();
    assertNotNull(a);
    assertEquals("{}", a.toString());
    var b = test().not().add(Schema.draft4());
    assertNotNull(b);
    assertEquals("{\"not\":[{}]}", b.toString());
  }
}
