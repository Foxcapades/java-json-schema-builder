package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.IntegerSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class IntegerSchemaImplTest
{
  public static final ObjectMapper JSON = new ObjectMapper();

  private IntegerSchema test;

  protected IntegerSchema test()
  {
    return test;
  }

  @BeforeEach
  void setUp()
  {
    test = new IntegerSchemaImpl(JSON, JSON.createObjectNode());
  }

  @Test
  void defaultValue()
  {
    assertSame(test(), test().defaultValue(1));
    assertEquals("{\"type\":\"integer\",\"default\":1}", test().toString());
  }

  @Test
  void defaultValue1()
  {
    assertSame(test(), test().defaultValue(1L));
    assertEquals("{\"type\":\"integer\",\"default\":1}", test().toString());
  }

  @Test
  void defaultValue2()
  {
    assertSame(test(), test().defaultValue(new BigInteger("1")));
    assertEquals("{\"type\":\"integer\",\"default\":1}", test().toString());
  }

  @Test
  void maximum()
  {
    assertSame(test(), test().maximum(1));
    assertEquals("{\"type\":\"integer\",\"maximum\":1}", test().toString());
  }

  @Test
  void maximum1()
  {
    assertSame(test(), test().maximum(1L));
    assertEquals("{\"type\":\"integer\",\"maximum\":1}", test().toString());
  }

  @Test
  void maximum2()
  {
    assertSame(test(), test().maximum(new BigInteger("1")));
    assertEquals("{\"type\":\"integer\",\"maximum\":1}", test().toString());
  }

  @Test
  void removeMaximum()
  {
    assertSame(test(), test().maximum(1).removeMaximum());
    assertEquals("{\"type\":\"integer\"}", test().toString());
  }

  @Test
  void exclusiveMaximum()
  {
    assertSame(test(), test().exclusiveMaximum(true));
    assertEquals("{\"type\":\"integer\",\"exclusiveMaximum\":true}", test().toString());
  }

  @Test
  void removeExclusiveMaximum()
  {
    assertSame(test(), test().exclusiveMaximum(true).removeExclusiveMaximum());
    assertEquals("{\"type\":\"integer\"}", test().toString());
  }

  @Test
  void minimum()
  {
    assertSame(test(), test().minimum(1));
    assertEquals("{\"type\":\"integer\",\"minimum\":1}", test().toString());
  }

  @Test
  void minimum1()
  {
    assertSame(test(), test().minimum(1L));
    assertEquals("{\"type\":\"integer\",\"minimum\":1}", test().toString());
  }

  @Test
  void minimum2()
  {
    assertSame(test(), test().minimum(new BigInteger("1")));
    assertEquals("{\"type\":\"integer\",\"minimum\":1}", test().toString());
  }

  @Test
  void removeMinimum()
  {
    assertSame(test(), test().minimum(1).removeMinimum());
    assertEquals("{\"type\":\"integer\"}", test().toString());
  }

  @Test
  void exclusiveMinimum()
  {
    assertSame(test(), test().exclusiveMaximum(true));
    assertEquals("{\"type\":\"integer\",\"exclusiveMaximum\":true}", test().toString());
  }

  @Test
  void removeExclusiveMinimum()
  {
    assertSame(test(), test().exclusiveMinimum(true).removeExclusiveMinimum());
    assertEquals("{\"type\":\"integer\"}", test().toString());
  }

  @Test
  void multipleOf()
  {
    assertSame(test(), test().multipleOf(1));
    assertEquals("{\"type\":\"integer\",\"multipleOf\":1}", test().toString());
  }

  @Test
  void multipleOf1()
  {
    assertSame(test(), test().multipleOf(1L));
    assertEquals("{\"type\":\"integer\",\"multipleOf\":1}", test().toString());
  }

  @Test
  void multipleOf2()
  {
    assertSame(test(), test().multipleOf(1F));
    assertEquals("{\"type\":\"integer\",\"multipleOf\":1.0}", test().toString());
  }

  @Test
  void multipleOf3()
  {
    assertSame(test(), test().multipleOf(1D));
    assertEquals("{\"type\":\"integer\",\"multipleOf\":1.0}", test().toString());
  }

  @Test
  void multipleOf4()
  {
    assertSame(test(), test().multipleOf(new BigInteger("1")));
    assertEquals("{\"type\":\"integer\",\"multipleOf\":1}", test().toString());
  }

  @Test
  void multipleOf5()
  {
    assertSame(test(), test().multipleOf(new BigDecimal("1")));
    assertEquals("{\"type\":\"integer\",\"multipleOf\":1}", test().toString());
  }

  @Test
  void removeMultipleOf()
  {
    assertSame(test(), test().multipleOf(1).removeMultipleOf());
    assertEquals("{\"type\":\"integer\"}", test().toString());
  }

  @Test
  void enumValues()
  {
    assertSame(test(), test().enumValues(1, 2, 3));
    assertEquals("{\"type\":\"integer\",\"enum\":[1,2,3]}", test().toString());
  }

  @Test
  void enumValues1()
  {
    assertSame(test(), test().enumValues(1L, 2L, 3L));
    assertEquals("{\"type\":\"integer\",\"enum\":[1,2,3]}", test().toString());
  }

  @Test
  void enumValues2()
  {
    assertSame(test(), test().enumValues(new BigInteger("1"),new BigInteger("2"),new BigInteger("3")));
    assertEquals("{\"type\":\"integer\",\"enum\":[1,2,3]}", test().toString());
  }

  @Test
  void removeEnum()
  {
    assertSame(test(), test().enumValues(1, 2, 3).removeEnum());
    assertEquals("{\"type\":\"integer\"}", test().toString());
  }
}
