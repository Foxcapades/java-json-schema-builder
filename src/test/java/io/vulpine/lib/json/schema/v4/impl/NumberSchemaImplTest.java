package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.NumberSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class NumberSchemaImplTest
{
  public static final ObjectMapper JSON = new ObjectMapper();

  private NumberSchema test;

  protected NumberSchema test()
  {
    return test;
  }

  @BeforeEach
  void setUp()
  {
    test = new NumberSchemaImpl(JSON, JSON.createObjectNode());
  }

  @Test
  void defaultValue()
  {
    assertSame(test(), test().defaultValue(1));
    assertEquals("{\"type\":\"number\",\"default\":1}", test().toString());
  }

  @Test
  void defaultValue1()
  {
    assertSame(test(), test().defaultValue(1L));
    assertEquals("{\"type\":\"number\",\"default\":1}", test().toString());
  }

  @Test
  void defaultValue2()
  {
    assertSame(test(), test().defaultValue(new BigInteger("1")));
    assertEquals("{\"type\":\"number\",\"default\":1}", test().toString());
  }

  @Test
  void defaultValue3()
  {
    assertSame(test(), test().defaultValue(1F));
    assertEquals("{\"type\":\"number\",\"default\":1.0}", test().toString());
  }

  @Test
  void defaultValue4()
  {
    assertSame(test(), test().defaultValue(1D));
    assertEquals("{\"type\":\"number\",\"default\":1.0}", test().toString());
  }

  @Test
  void defaultValue5()
  {
    assertSame(test(), test().defaultValue(new BigDecimal("1")));
    assertEquals("{\"type\":\"number\",\"default\":1}", test().toString());
  }

  @Test
  void maximum()
  {
    assertSame(test(), test().maximum(1));
    assertEquals("{\"type\":\"number\",\"maximum\":1}", test().toString());
  }

  @Test
  void maximum1()
  {
    assertSame(test(), test().maximum(1L));
    assertEquals("{\"type\":\"number\",\"maximum\":1}", test().toString());
  }

  @Test
  void maximum2()
  {
    assertSame(test(), test().maximum(new BigInteger("1")));
    assertEquals("{\"type\":\"number\",\"maximum\":1}", test().toString());
  }

  @Test
  void maximum3()
  {
    assertSame(test(), test().maximum(new BigDecimal("1")));
    assertEquals("{\"type\":\"number\",\"maximum\":1}", test().toString());
  }

  @Test
  void maximum4()
  {
    assertSame(test(), test().maximum(1F));
    assertEquals("{\"type\":\"number\",\"maximum\":1.0}", test().toString());
  }

  @Test
  void maximum5()
  {
    assertSame(test(), test().maximum(1D));
    assertEquals("{\"type\":\"number\",\"maximum\":1.0}", test().toString());
  }

  @Test
  void removeMaximum()
  {
    assertSame(test(), test().maximum(1).removeMaximum());
    assertEquals("{\"type\":\"number\"}", test().toString());
  }

  @Test
  void exclusiveMaximum()
  {
    assertSame(test(), test().exclusiveMaximum(true));
    assertEquals("{\"type\":\"number\",\"exclusiveMaximum\":true}", test().toString());
  }

  @Test
  void removeExclusiveMaximum()
  {
    assertSame(test(), test().exclusiveMaximum(true).removeExclusiveMaximum());
    assertEquals("{\"type\":\"number\"}", test().toString());
  }

  @Test
  void minimum()
  {
    assertSame(test(), test().minimum(1));
    assertEquals("{\"type\":\"number\",\"minimum\":1}", test().toString());
  }

  @Test
  void minimum1()
  {
    assertSame(test(), test().minimum(1L));
    assertEquals("{\"type\":\"number\",\"minimum\":1}", test().toString());
  }

  @Test
  void minimum2()
  {
    assertSame(test(), test().minimum(new BigInteger("1")));
    assertEquals("{\"type\":\"number\",\"minimum\":1}", test().toString());
  }

  @Test
  void minimum3()
  {
    assertSame(test(), test().minimum(new BigDecimal("1")));
    assertEquals("{\"type\":\"number\",\"minimum\":1}", test().toString());
  }

  @Test
  void minimum4()
  {
    assertSame(test(), test().minimum(1F));
    assertEquals("{\"type\":\"number\",\"minimum\":1.0}", test().toString());
  }

  @Test
  void minimum5()
  {
    assertSame(test(), test().minimum(1D));
    assertEquals("{\"type\":\"number\",\"minimum\":1.0}", test().toString());
  }

  @Test
  void removeMinimum()
  {
    assertSame(test(), test().minimum(1).removeMinimum());
    assertEquals("{\"type\":\"number\"}", test().toString());
  }

  @Test
  void exclusiveMinimum()
  {
    assertSame(test(), test().exclusiveMaximum(true));
    assertEquals("{\"type\":\"number\",\"exclusiveMaximum\":true}", test().toString());
  }

  @Test
  void removeExclusiveMinimum()
  {
    assertSame(test(), test().exclusiveMinimum(true).removeExclusiveMinimum());
    assertEquals("{\"type\":\"number\"}", test().toString());
  }

  @Test
  void multipleOf()
  {
    assertSame(test(), test().multipleOf(1));
    assertEquals("{\"type\":\"number\",\"multipleOf\":1}", test().toString());
  }

  @Test
  void multipleOf1()
  {
    assertSame(test(), test().multipleOf(1L));
    assertEquals("{\"type\":\"number\",\"multipleOf\":1}", test().toString());
  }

  @Test
  void multipleOf2()
  {
    assertSame(test(), test().multipleOf(1F));
    assertEquals("{\"type\":\"number\",\"multipleOf\":1.0}", test().toString());
  }

  @Test
  void multipleOf3()
  {
    assertSame(test(), test().multipleOf(1D));
    assertEquals("{\"type\":\"number\",\"multipleOf\":1.0}", test().toString());
  }

  @Test
  void multipleOf4()
  {
    assertSame(test(), test().multipleOf(new BigInteger("1")));
    assertEquals("{\"type\":\"number\",\"multipleOf\":1}", test().toString());
  }

  @Test
  void multipleOf5()
  {
    assertSame(test(), test().multipleOf(new BigDecimal("1")));
    assertEquals("{\"type\":\"number\",\"multipleOf\":1}", test().toString());
  }

  @Test
  void removeMultipleOf()
  {
    assertSame(test(), test().multipleOf(1).removeMultipleOf());
    assertEquals("{\"type\":\"number\"}", test().toString());
  }

  @Test
  void enumValues()
  {
    assertSame(test(), test().enumValues());
    assertEquals("{\"type\":\"number\"}", test().toString());
    assertSame(test(), test().enumValues(1, 2F, 3D, 4L, (byte) 5, (short) 6,
      new BigInteger("7"), new BigDecimal("8"), new AtomicInteger(9)));
    assertEquals("{\"type\":\"number\",\"enum\":[1,2.0,3.0,4,5,6,7,8,9.0]}",
      test().toString());
  }

  @Test
  void removeEnum()
  {
    assertSame(test(), test().enumValues(1, 2, 3).removeEnum());
    assertEquals("{\"type\":\"number\"}", test().toString());
  }
}
