package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.Schema;
import io.vulpine.lib.json.schema.v4.lib.SchemaNodeArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

abstract class SchemaNodeArrayTest<X extends SchemaNodeArray>
{
  public static final ObjectMapper JSON = new ObjectMapper();

  private X x;

  protected X test()
  {
    return x;
  }

  protected abstract X newTest();

  protected String wrap(String in)
  {
    return "[" + in + "]";
  }

  @BeforeEach
  void setUp()
  {
    x = newTest();
  }

  @Test
  void addArray()
  {
    assertNotNull(test().addArray().close());
    assertEquals(wrap("{\"type\":\"array\"}"), test().toString());
  }

  @Test
  void addBoolean()
  {
    assertNotNull(test().addBoolean().close());
    assertEquals(wrap("{\"type\":\"boolean\"}"), test().toString());
  }

  @Test
  void addInteger()
  {
    assertNotNull(test().addInteger().close());
    assertEquals(wrap("{\"type\":\"integer\"}"), test().toString());
  }

  @Test
  void addNull()
  {
    assertNotNull(test().addNull().close());
    assertEquals(wrap("{\"type\":\"null\"}"), test().toString());
  }

  @Test
  void addNumber()
  {
    assertNotNull(test().addNumber().close());
    assertEquals(wrap("{\"type\":\"number\"}"), test().toString());
  }

  @Test
  void addObject()
  {
    assertNotNull(test().addObject().close());
    assertEquals(wrap("{\"type\":\"object\"}"), test().toString());
  }

  @Test
  void addString()
  {
    assertNotNull(test().addString().close());
    assertEquals(wrap("{\"type\":\"string\"}"), test().toString());
  }

  @Test
  void add()
  {
    assertNotNull(test().add().close());
    assertEquals(wrap("{}"), test().toString());
  }

  @Test
  void add1()
  {
    assertNotNull(test().add(Schema.draft4(), Schema.draft4()));
    assertEquals(wrap("{},{}"), test().toString());
  }

}
