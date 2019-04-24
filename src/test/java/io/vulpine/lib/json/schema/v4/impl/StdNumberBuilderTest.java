package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.JsonType;
import io.vulpine.lib.json.schema.v4.NumberBuilder;
import io.vulpine.lib.json.schema.v4.lib.Keys;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdNumberBuilderTest {
  private static final ObjectMapper JSON = new ObjectMapper();

  private ObjectNode raw;
  private NumberBuilder<?> type;

  @BeforeEach
  void setUp() {
    raw  = JSON.createObjectNode();
    type = new StdNumberBuilder(JSON, raw);
  }

  @Test
  void constructor1() {
    assertEquals(JsonType.NUMBER.jsonName(),
      new StdNumberBuilder(JSON).build().get(Keys.TYPE).asText());
  }

  @Test
  void constructor2() {
    assertEquals(JsonType.NUMBER.jsonName(),
      new StdNumberBuilder(JSON, JSON.createObjectNode())
        .build()
        .get(Keys.TYPE)
        .asText());
  }

  @Test
  void defaultValue_byte() {
    assertEquals(3, type.defaultValue((byte) 3)
      .build().get(Keys.DEFAULT).asInt());
  }

  @Test
  void defaultValue_short() {
    assertEquals(3, type.defaultValue((short) 3)
      .build().get(Keys.DEFAULT).asInt());
  }

  @Test
  void defaultValue_int() {
    assertEquals(3, type.defaultValue(3)
      .build().get(Keys.DEFAULT).asInt());
  }

  @Test
  void defaultValue_long() {
    assertEquals(3L, type.defaultValue(3L)
      .build().get(Keys.DEFAULT).asLong());
  }

  @Test
  void defaultValue_float() {
    assertEquals(3F, type.defaultValue(3F)
      .build().get(Keys.DEFAULT).floatValue());
  }

  @Test
  void defaultValue_double() {
    assertEquals(3D, type.defaultValue(3D)
      .build().get(Keys.DEFAULT).doubleValue());
  }

  @Test
  void defaultValue_bigInt() {
    assertEquals(new BigInteger("1"), type.defaultValue(new BigInteger("1"))
      .build().get(Keys.DEFAULT).bigIntegerValue());
  }

  @Test
  void defaultValue_bigDec() {
    assertEquals(new BigDecimal("1"), type.defaultValue(new BigDecimal("1"))
      .build().get(Keys.DEFAULT).decimalValue());
  }

  @Test
  void maximum_byte() {
    assertEquals(3, type.maximum((byte) 3)
      .build().get(Keys.MAXIMUM).intValue());
  }

  @Test
  void maximum_short() {
    assertEquals(3, type.maximum((short) 3)
      .build().get(Keys.MAXIMUM).intValue());
  }

  @Test
  void maximum_int() {
    assertEquals(3, type.maximum(3)
      .build().get(Keys.MAXIMUM).intValue());
  }

  @Test
  void maximum_long() {
    assertEquals(3L, type.maximum(3L)
      .build().get(Keys.MAXIMUM).longValue());
  }

  @Test
  void maximum_float() {
    assertEquals(3F, type.maximum(3F)
      .build().get(Keys.MAXIMUM).floatValue());
  }

  @Test
  void maximum_double() {
    assertEquals(3D, type.maximum(3D)
      .build().get(Keys.MAXIMUM).doubleValue());
  }

  @Test
  void maximum_bigInt() {
    assertEquals(new BigInteger("3"), type.maximum(new BigInteger("3"))
      .build().get(Keys.MAXIMUM).bigIntegerValue());
  }

  @Test
  void maximum_bigDec() {
    assertEquals(new BigDecimal("3"), type.maximum(new BigDecimal("3"))
      .build().get(Keys.MAXIMUM).decimalValue());
  }

  @Test
  void clearMaximum() {
    assertFalse(type.maximum(3).clearMaximum().build().has(Keys.MAXIMUM));
  }

  @Test
  void removeMaximum() {
    assertFalse(type.maximum(3).removeMaximum().build().has(Keys.MAXIMUM));
  }

  @Test
  void exclusiveMaximum() {
    assertTrue(type.exclusiveMaximum(true).build().get(EXCL_MAX).asBoolean());
    assertFalse(type.exclusiveMaximum(false).build().get(EXCL_MAX).asBoolean());
  }

  @Test
  void removeExclusiveMaximum() {
    assertFalse(type.exclusiveMaximum(true).removeExclusiveMaximum()
      .build().has(EXCL_MAX));
  }

  @Test
  void clearExclusiveMaximum() {
    assertFalse(type.exclusiveMaximum(true).clearExclusiveMaximum()
      .build().has(EXCL_MAX));
  }

  @Test
  void minimum_byte() {
    assertEquals(3, type.minimum((byte) 3)
      .build().get(Keys.MINIMUM).intValue());
  }

  @Test
  void minimum_short() {
    assertEquals(3, type.minimum((short) 3)
      .build().get(Keys.MINIMUM).intValue());
  }

  @Test
  void minimum_int() {
    assertEquals(3, type.minimum(3)
      .build().get(Keys.MINIMUM).intValue());
  }

  @Test
  void minimum_long() {
    assertEquals(3L, type.minimum(3L)
      .build().get(Keys.MINIMUM).longValue());
  }

  @Test
  void minimum_float() {
    assertEquals(3F, type.minimum(3F)
      .build().get(Keys.MINIMUM).floatValue());
  }

  @Test
  void minimum_double() {
    assertEquals(3D, type.minimum(3D)
      .build().get(Keys.MINIMUM).doubleValue());
  }

  @Test
  void minimum_bigInt() {
    assertEquals(new BigInteger("4"), type.minimum(new BigInteger("4"))
      .build().get(Keys.MINIMUM).bigIntegerValue());
  }

  @Test
  void minimum_bigDec() {
    assertEquals(new BigDecimal("4"), type.minimum(new BigDecimal("4"))
      .build().get(Keys.MINIMUM).decimalValue());
  }

  @Test
  void removeMinimum() {
    assertFalse(type.minimum(3).removeMinimum().build().has(Keys.MINIMUM));
  }

  @Test
  void clearMinimum() {
    assertFalse(type.minimum(3).clearMinimum().build().has(Keys.MINIMUM));
  }

  @Test
  void exclusiveMinimum() {
    assertTrue(type.exclusiveMinimum(true).build().get(EXCL_MIN).asBoolean());
    assertFalse(type.exclusiveMinimum(false).build().get(EXCL_MIN).asBoolean());
  }

  @Test
  void removeExclusiveMinimum() {
    assertFalse(type.exclusiveMinimum(true).removeExclusiveMinimum()
      .build().has(EXCL_MIN));
  }

  @Test
  void clearExclusiveMinimum() {
    assertFalse(type.exclusiveMinimum(true).clearExclusiveMinimum()
      .build().has(EXCL_MIN));
  }

  @Test
  void multipleOf_byte() {
    assertEquals(3, type.multipleOf((byte) 3)
      .build().get(Keys.MULTIPLE).intValue());
  }

  @Test
  void multipleOf_short() {
    assertEquals(3, type.multipleOf((short) 3)
      .build().get(Keys.MULTIPLE).intValue());
  }

  @Test
  void multipleOf_int() {
    assertEquals(3, type.multipleOf(3)
      .build().get(Keys.MULTIPLE).intValue());
  }

  @Test
  void multipleOf_long() {
    assertEquals(3L, type.multipleOf(3L)
      .build().get(Keys.MULTIPLE).longValue());
  }

  @Test
  void multipleOf_float() {
    assertEquals(3F, type.multipleOf(3F)
      .build().get(Keys.MULTIPLE).floatValue());
  }

  @Test
  void multipleOf_double() {
    assertEquals(3D, type.multipleOf(3D)
      .build().get(Keys.MULTIPLE).doubleValue());
  }

  @Test
  void multipleOf_bigInt() {
    assertEquals(new BigInteger("4"), type.multipleOf(new BigInteger("4"))
      .build().get(Keys.MULTIPLE).bigIntegerValue());
  }

  @Test
  void multipleOf_bigDec() {
    assertEquals(new BigDecimal("4"), type.multipleOf(new BigDecimal("4"))
      .build().get(Keys.MULTIPLE).decimalValue());
  }

  @Test
  void removeMultipleOf() {
    assertFalse(type.multipleOf(3)
      .removeMultipleOf()
      .build()
      .has(Keys.MULTIPLE));
  }

  @Test
  void clearMultipleOf() {
    assertFalse(type.multipleOf(3)
      .clearMultipleOf()
      .build()
      .has(Keys.MULTIPLE));
  }

  @Test
  @DisplayName("enumValue(Number...)")
  void enumValue()
  {
    type.enumValues((byte) 1, (short) 2, 3, 4L, 5F, 6D, new BigInteger("7"),
      new BigDecimal("8"), new AtomicInteger(9));

    assertEquals(9, raw.get(ENUM).size());
    assertEquals(1, raw.get(ENUM).get(0).intValue());
    assertEquals(2, raw.get(ENUM).get(1).intValue());
    assertEquals(3, raw.get(ENUM).get(2).intValue());
    assertEquals(4L, raw.get(ENUM).get(3).longValue());
    assertEquals(5F, raw.get(ENUM).get(4).floatValue());
    assertEquals(6D, raw.get(ENUM).get(5).doubleValue());
    assertEquals(new BigInteger("7"), raw.get(ENUM).get(6).bigIntegerValue());
    assertEquals(new BigDecimal("8"), raw.get(ENUM).get(7).decimalValue());
    assertEquals(9D, raw.get(ENUM).get(8).doubleValue());
  }
}
