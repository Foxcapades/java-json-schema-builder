package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.ArrayBuilder;
import io.vulpine.lib.json.schema.v4.JsonType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdArrayBuilderTest {

  private static final ObjectMapper JSON = new ObjectMapper();
  private ArrayBuilder<? extends ArrayBuilder<?>> type;

  @BeforeEach
  void setUp()
  {
    type = new StdArrayBuilder<>(JSON, JSON.createObjectNode());
  }

  @Test
  void constructor2()
  {
    assertEquals(JsonType.ARRAY.jsonName(),
      new StdArrayBuilder(JSON, JSON.createObjectNode())
        .render().get(TYPE).asText());
  }

  @Test
  void defaultValue_arrayNode()
  {
    type.defaultValue(JSON.createArrayNode().add(1));
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(1, raw.get(0).intValue());
  }

  @Test
  void defaultValue_Integer()
  {
    type.defaultValue(2);
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(2, raw.get(0).intValue());
  }

  @Test
  void defaultValue_int()
  {
    type.defaultValue(new int[]{3, 4});
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(2, raw.size());
    assertEquals(3, raw.get(0).intValue());
    assertEquals(4, raw.get(1).intValue());
  }

  @Test
  void defaultValue_Double()
  {
    type.defaultValue(2.4D);
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(2.4D, raw.get(0).doubleValue());
  }

  @Test
  void defaultValue_double()
  {
    type.defaultValue(new double[]{2.4});
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(2.4, raw.get(0).doubleValue());
  }

  @Test
  void defaultValue_Float()
  {
    type.defaultValue(2.4F);
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(2.4F, raw.get(0).floatValue());
  }

  @Test
  void defaultValue_float()
  {
    type.defaultValue(new float[]{2.4F});
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(2.4F, raw.get(0).floatValue());
  }

  @Test
  void defaultValue_Byte()
  {
    type.defaultValue((byte) 2);
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(2, raw.get(0).intValue());
  }

  @Test
  void defaultValue_byte()
  {
    type.defaultValue(new byte[]{2});
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(2, raw.get(0).intValue());
  }

  @Test
  void defaultValue_Short()
  {
    type.defaultValue((short) 2);
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals((short) 2, raw.get(0).shortValue());
  }

  @Test
  void defaultValue_short()
  {
    type.defaultValue(new short[]{2});
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals((short) 2, raw.get(0).shortValue());
  }

  @Test
  void defaultValue_Long()
  {
    type.defaultValue(2L);
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(2L, raw.get(0).longValue());
  }

  @Test
  void defaultValue_long()
  {
    type.defaultValue(new long[]{2});
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(2L, raw.get(0).longValue());
  }

  @Test
  void defaultValue_Object()
  {
    type.defaultValue(new HashMap<String, Object>(){{put("foo", "bar");}});
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals("bar", raw.get(0).get("foo").textValue());
  }

  @Test
  void defaultValue_String()
  {
    type.defaultValue("foo");
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals("foo", raw.get(0).textValue());
  }

  @Test
  void defaultValue_BigInteger()
  {
    type.defaultValue(new BigInteger("1"));
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(new BigInteger("1"), raw.get(0).bigIntegerValue());
  }

  @Test
  void defaultValue_BigDecimal()
  {
    type.defaultValue(new BigDecimal("1"));
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(1, raw.size());
    assertEquals(new BigDecimal("1"), raw.get(0).decimalValue());
  }

  @Test
  void defaultValue_Boolean()
  {
    type.defaultValue(true, false);
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(2, raw.size());
    assertTrue(raw.get(0).booleanValue());
    assertFalse(raw.get(1).booleanValue());
  }

  @Test
  void defaultValue_boolean()
  {
    type.defaultValue(new boolean[] {true, false});
    final var raw = type.render().get(DEFAULT);
    assertTrue(raw.isArray());
    assertEquals(2, raw.size());
    assertTrue(raw.get(0).booleanValue());
    assertFalse(raw.get(1).booleanValue());
  }

  @Test
  void clearDefaultValue() //TODO: This doesn't go here.
  {
    assertNotNull(type.defaultValue(JSON.createArrayNode().add("foo")));
    assertNotNull(type.clearDefaultValue());
    assertFalse(type.render().has(DEFAULT));
  }

  @Test
  void maxItems_Integer()
  {
    assertNotNull(type.maxItems(10));
    assertEquals(10, type.render().get(MAX_ITEMS).intValue());
  }

  @Test
  void maxItems_clear()
  {
    type.maxItems(10);
    assertNotNull(type.clearMaxItems());
    assertFalse(type.render().has(MAX_ITEMS));
  }

  @Test
  void maxItems_BigInteger()
  {
    assertNotNull(type.maxItems(new BigInteger("10")));
    assertEquals(new BigInteger("10"), type.render().get(MAX_ITEMS).bigIntegerValue());
    assertThrows(NullPointerException.class, () -> type.maxItems(null));
  }

  @Test
  void removeMaxItems()
  {
    type.maxItems(10);
    assertNotNull(type.removeMaxItems());
    assertFalse(type.render().has(MAX_ITEMS));
  }


  @Test
  void minItems_int()
  {
    assertNotNull(type.minItems(10));
    assertEquals(10, type.render().get(MIN_ITEMS).intValue());
  }

  @Test
  void minItems_BigInteger()
  {
    assertNotNull(type.minItems(new BigInteger("10")));
    assertEquals(new BigInteger("10"), type.render().get(MIN_ITEMS).bigIntegerValue());
    assertThrows(NullPointerException.class, () -> type.maxItems(null));
  }

  @Test
  void minItems_clear()
  {
    type.minItems(10);
    assertNotNull(type.clearMinItems());
    assertFalse(type.render().has(MIN_ITEMS));
  }

  @Test
  void removeMinItems()
  {
    type.minItems(10);
    assertNotNull(type.removeMinItems());
    assertFalse(type.render().has(MIN_ITEMS));
  }

  @Test
  void additionalItems()
  {
    type.additionalItems().asBoolean();
    assertTrue(type.render().has(ADDTL_ITEMS));
    assertTrue(type.render().get(ADDTL_ITEMS).has(TYPE));
    assertEquals(JsonType.BOOLEAN.jsonName(), type.render().get(ADDTL_ITEMS).get(
      TYPE).textValue());
  }

  @Test
  void additionalItems_setter()
  {
    assertEquals(new StdNullBuilder(JSON).render(),
      type.additionalItems(new StdNullBuilder(JSON)).render().get(ADDTL_ITEMS));
  }

  @Test
  void removeAdditionalItems()
  {
    assertFalse(type.additionalItems()
      .asBoolean()
      .close()
      .removeAdditionalItems()
      .render()
      .has(ADDTL_ITEMS));
  }

  @Test
  void clearAdditionalItems()
  {
    assertFalse(type.additionalItems()
      .asBoolean()
      .close()
      .clearAdditionalItems()
      .render()
      .has(ADDTL_ITEMS));
  }

  @Nested
  @DisplayName("items()")
  class items {
    @Test
    @DisplayName("Does not return null")
    void nn() { assertNotNull(type.items()); }

    @Test
    void test1()
    {
      type.items().asBoolean();
      assertTrue(type.render().has(ITEMS));
      assertTrue(type.render().get(ITEMS).has(TYPE));
      assertEquals(JsonType.BOOLEAN.jsonName(), type.render().get(ITEMS).get(
        TYPE).textValue());
    }
  }

  @Nested
  @DisplayName("itemsArray()")
  class itemsArray {
    @Test
    @DisplayName("Does not return null")
    void nn()
    {
      assertNotNull(type.itemsArray());
    }

    @Test
    @DisplayName("Adds an array to the schema under the \"items\" key")
    void test1()
    {
      type.itemsArray();
      assertTrue(type.render().has(ITEMS));
      assertTrue(type.render().get(ITEMS).isArray());
    }
  }

  @Test
  void items_setter()
  {
    final var tmp = type.render();
    type.items(type);
    assertEquals(tmp, type.render().get(ITEMS));
  }

  @Test
  void clearItems()
  {
    assertFalse(type.items(new StdArrayBuilder(JSON, JSON.createObjectNode()))
      .clearItems()
      .render()
      .has(ITEMS));
  }

  @Test
  void removeItems()
  {
    assertFalse(type.items(new StdArrayBuilder(JSON, JSON.createObjectNode()))
      .removeItems()
      .render()
      .has(ITEMS));
  }

  @Test
  @DisplayName("enumValues(ArrayNode...)")
  void enumValues()
  {
    assertNotNull(type.enumValues(
      JSON.createArrayNode().add("a"),
      JSON.createArrayNode().add("b")));
    var v = type.render();
    assertTrue(v.has(ENUM));
    assertTrue(v.get(ENUM).isArray());
    assertEquals(2, v.get(ENUM).size());
    assertEquals("[\"a\"]", v.get(ENUM).get(0).toString());
    assertEquals("[\"b\"]", v.get(ENUM).get(1).toString());
  }

  @Test
  void uniqueItems()
  {
    assertNotNull(type.uniqueItems(true));
    var a = type.render();
    assertTrue(a.has(UNIQUE));
    assertTrue(a.get(UNIQUE).booleanValue());

    assertNotNull(type.uniqueItems(false));
    var b = type.render();
    assertFalse(b.get(UNIQUE).booleanValue());
  }

  @Test
  void removeUniqueItems()
  {
    type.uniqueItems(true);
    assertNotNull(type.removeUniqueItems());
    assertFalse(type.render().has(UNIQUE));
  }

  @Test
  void clearUniqueItems()
  {
    type.uniqueItems(true);
    assertNotNull(type.clearUniqueItems());
    assertFalse(type.render().has(UNIQUE));
  }
}
