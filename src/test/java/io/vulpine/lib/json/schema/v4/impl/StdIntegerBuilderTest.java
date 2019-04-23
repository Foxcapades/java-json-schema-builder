package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.IntegerBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdIntegerBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private ObjectNode raw;
  private IntegerBuilder<?> test;

  @BeforeEach
  void setUp()
  {
    raw = JSON.createObjectNode();
    test = new StdIntegerBuilder<>(JSON, raw);
  }

  @Test
  void defaultValue_int()
  {
    test.defaultValue(1);
    assertTrue(raw.has(DEFAULT));
    assertEquals(1, raw.get(DEFAULT).intValue());
  }

  @Test
  void defaultValue_bigInt()
  {
    test.defaultValue(new BigInteger("1"));
    assertTrue(raw.has(DEFAULT));
    assertEquals(new BigInteger("1"), raw.get(DEFAULT).bigIntegerValue());
  }

  @Test
  @DisplayName("maximum(int)")
  void maximum_int()
  {
    test.maximum(1);
    assertTrue(raw.has(MAXIMUM));
    assertEquals(1, raw.get(MAXIMUM).intValue());
  }

  @Test
  @DisplayName("maximum(long)")
  void maximum_long()
  {
    test.maximum(1L);
    assertTrue(raw.has(MAXIMUM));
    assertEquals(1L, raw.get(MAXIMUM).longValue());
  }

  @Test
  @DisplayName("maximum(BigInteger)")
  void maximum_bigInt()
  {
    test.maximum(new BigInteger("1"));
    assertTrue(raw.has(MAXIMUM));
    assertEquals(new BigInteger("1"), raw.get(MAXIMUM).bigIntegerValue());
  }

  @Test
  void clearMaximum()
  {
    raw.put(MAXIMUM, 1);
    test.clearMaximum();
    assertFalse(raw.has(MAXIMUM));
  }

  @Test
  void exclusiveMaximum()
  {
    test.exclusiveMaximum(true);
    assertTrue(raw.has(EXCL_MAX));
    assertTrue(raw.get(EXCL_MAX).booleanValue());

    test.exclusiveMaximum(false);
    assertTrue(raw.has(EXCL_MAX));
    assertFalse(raw.get(EXCL_MAX).booleanValue());
  }

  @Test
  void clearExclusiveMaximum()
  {
    raw.put(EXCL_MAX, true);
    test.clearExclusiveMaximum();
    assertFalse(raw.has(EXCL_MAX));
  }

  @Test
  @DisplayName("minimum(int)")
  void minimum_int()
  {
    test.minimum(1);
    assertTrue(raw.has(MINIMUM));
    assertEquals(1, raw.get(MINIMUM).intValue());
  }

  @Test
  @DisplayName("minimum(long)")
  void minimum_long()
  {
    test.minimum(1L);
    assertTrue(raw.has(MINIMUM));
    assertEquals(1L, raw.get(MINIMUM).longValue());
  }

  @Test
  @DisplayName("minimum(BigInteger)")
  void minimum_bigInt()
  {
    test.minimum(new BigInteger("1"));
    assertTrue(raw.has(MINIMUM));
    assertEquals(new BigInteger("1"), raw.get(MINIMUM).bigIntegerValue());
  }

  @Test
  void clearMinimum()
  {
    raw.put(MINIMUM, 1);
    test.clearMinimum();
    assertFalse(raw.has(MINIMUM));
  }

  @Test
  void exclusiveMinimum()
  {
    test.exclusiveMinimum(true);
    assertTrue(raw.has(EXCL_MIN));
    assertTrue(raw.get(EXCL_MIN).booleanValue());

    test.exclusiveMinimum(false);
    assertTrue(raw.has(EXCL_MIN));
    assertFalse(raw.get(EXCL_MIN).booleanValue());
  }

  @Test
  void clearExclusiveMinimum()
  {
    raw.put(EXCL_MIN, true);
    test.clearExclusiveMinimum();
    assertFalse(raw.has(EXCL_MIN));
  }

  @Test
  void multipleOf_byte()
  {
    test.multipleOf((byte) 1);
    assertTrue(raw.has(MULTIPLE));
    assertEquals(1, raw.get(MULTIPLE).intValue());
  }

  @Test
  void multipleOf_short()
  {
    test.multipleOf((short) 1);
    assertTrue(raw.has(MULTIPLE));
    assertEquals(1, raw.get(MULTIPLE).intValue());
  }

  @Test
  void multipleOf_int()
  {
    test.multipleOf(1);
    assertTrue(raw.has(MULTIPLE));
    assertEquals(1, raw.get(MULTIPLE).intValue());
  }

  @Test
  void multipleOf_long()
  {
    test.multipleOf(1L);
    assertTrue(raw.has(MULTIPLE));
    assertEquals(1L, raw.get(MULTIPLE).longValue());
  }

  @Test
  void multipleOf_float()
  {
    test.multipleOf(1F);
    assertTrue(raw.has(MULTIPLE));
    assertEquals(1F, raw.get(MULTIPLE).floatValue());
  }

  @Test
  void multipleOf_double()
  {
    test.multipleOf(1D);
    assertTrue(raw.has(MULTIPLE));
    assertEquals(1L, raw.get(MULTIPLE).doubleValue());
  }

  @Test
  void multipleOf_bigInt()
  {
    test.multipleOf(new BigInteger("1"));
    assertTrue(raw.has(MULTIPLE));
    assertEquals(new BigInteger("1"), raw.get(MULTIPLE).bigIntegerValue());
  }

  @Test
  void multipleOf_bigDec()
  {
    test.multipleOf(new BigDecimal("1"));
    assertTrue(raw.has(MULTIPLE));
    assertEquals(new BigDecimal("1"), raw.get(MULTIPLE).decimalValue());
  }

  @Test
  void clearMultipleOf()
  {
    raw.put(MULTIPLE, 1);
    test.clearMultipleOf();
    assertFalse(raw.has(MULTIPLE));
  }

  @Test
  @DisplayName("enumValues(int... vals)")
  void enumValues1()
  {
    test.enumValues(3, 2, 1);
    assertTrue(raw.has(ENUM));
    assertTrue(raw.get(ENUM).isArray());
    assertEquals(3, raw.get(ENUM).size());
    assertEquals(3, raw.get(ENUM).get(0).intValue());
    assertEquals(2, raw.get(ENUM).get(1).intValue());
    assertEquals(1, raw.get(ENUM).get(2).intValue());
  }

  @Test
  @DisplayName("enumValues(long... vals)")
  void enumValues2()
  {
    test.enumValues(3L, 2L, 1L);
    assertTrue(raw.has(ENUM));
    assertTrue(raw.get(ENUM).isArray());
    assertEquals(3, raw.get(ENUM).size());
    assertEquals(3L, raw.get(ENUM).get(0).longValue());
    assertEquals(2L, raw.get(ENUM).get(1).longValue());
    assertEquals(1L, raw.get(ENUM).get(2).longValue());
  }

  @Test
  @DisplayName("enumValues(BigInteger... vals)")
  void enumValues3()
  {
    test.enumValues(new BigInteger("3"), new BigInteger("2"),
      new BigInteger("1"));
    assertTrue(raw.has(ENUM));
    assertTrue(raw.get(ENUM).isArray());
    assertEquals(3, raw.get(ENUM).size());
    assertEquals(new BigInteger("3"), raw.get(ENUM).get(0).bigIntegerValue());
    assertEquals(new BigInteger("2"), raw.get(ENUM).get(1).bigIntegerValue());
    assertEquals(new BigInteger("1"), raw.get(ENUM).get(2).bigIntegerValue());
  }
}
