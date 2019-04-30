package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.Schema;
import io.vulpine.lib.json.schema.v4.ArraySchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ArraySchemaImplTest
{
  public static final ObjectMapper JSON = new ObjectMapper();

  private ArraySchema test;

  protected ArraySchema test()
  {
    return test;
  }

  @BeforeEach
  void setUp()
  {
    test = new ArraySchemaImpl(JSON, JSON.createObjectNode());
  }

  @Test
  void defaultValue()
  {
    assertSame(test(), test().defaultValue(JSON.createArrayNode().add(1)));
    assertEquals("{\"type\":\"array\",\"default\":[1]}", test().toString());
  }

  @Test
  void defaultValue2()
  {
    assertSame(test(), test().defaultValue(1, 2, 3));
    assertEquals("{\"type\":\"array\",\"default\":[1,2,3]}", test().toString());
  }

  @Test
  void defaultValue4()
  {
    assertSame(test(), test().defaultValue(1L, 2L, 3L));
    assertEquals("{\"type\":\"array\",\"default\":[1,2,3]}", test().toString());
  }

  @Test
  void defaultValue6()
  {
    assertSame(test(), test().defaultValue(1F, 2F, 3F));
    assertEquals("{\"type\":\"array\",\"default\":[1.0,2.0,3.0]}", test().toString());
  }

  @Test
  void defaultValue8()
  {
    assertSame(test(), test().defaultValue(1D, 2D, 3D));
    assertEquals("{\"type\":\"array\",\"default\":[1.0,2.0,3.0]}", test().toString());
  }

  @Test
  void defaultValue9()
  {
    assertSame(test(), test().defaultValue(new Object[]{1D, 2, "3"}));
    assertEquals("{\"type\":\"array\",\"default\":[1.0,2,\"3\"]}", test().toString());
  }

  @Test
  void defaultValue10()
  {
    assertSame(test(), test().defaultValue("0","1"));
    assertEquals("{\"type\":\"array\",\"default\":[\"0\",\"1\"]}", test().toString());
  }

  @Test
  void defaultValue11()
  {
    assertSame(test(), test().defaultValue((byte)1, (byte)2, (byte)3));
    assertEquals("{\"type\":\"array\",\"default\":[1,2,3]}", test().toString());
  }

  @Test
  void defaultValue13()
  {
    assertSame(test(), test().defaultValue((short)1, (short)2, (short)3));
    assertEquals("{\"type\":\"array\",\"default\":[1,2,3]}", test().toString());
  }

  @Test
  void defaultValue15()
  {
    assertSame(test(), test().defaultValue(true, false));
    assertEquals("{\"type\":\"array\",\"default\":[true,false]}", test().toString());
  }

  @Test
  void defaultValue16()
  {
    assertSame(test(), test().defaultValue(new BigInteger("0"), new BigInteger("1")));
    assertEquals("{\"type\":\"array\",\"default\":[0,1]}", test().toString());
  }

  @Test
  void defaultValue17()
  {
    assertSame(test(), test().defaultValue(new BigDecimal("0"), new BigDecimal("1")));
    assertEquals("{\"type\":\"array\",\"default\":[0,1]}", test().toString());
  }

  @Test
  @DisplayName("maxItems(int)")
  void maxItems()
  {
    assertSame(test(), test().maxItems(1));
    assertEquals("{\"type\":\"array\",\"maxItems\":1}", test().toString());
  }

  @Test
  @DisplayName("maxItems(long)")
  void maxItems1()
  {
    assertSame(test(), test().maxItems(1L));
    assertEquals("{\"type\":\"array\",\"maxItems\":1}", test().toString());
  }

  @Test
  @DisplayName("maxItems(BigInteger)")
  void maxItems2()
  {
    assertSame(test(), test().maxItems(new BigInteger("1")));
    assertEquals("{\"type\":\"array\",\"maxItems\":1}", test().toString());
  }

  @Test
  void removeMaxItems()
  {
    assertSame(test(), test().maxItems(1).removeMaxItems());
    assertEquals("{\"type\":\"array\"}", test().toString());
  }

  @Test
  @DisplayName("minItems(int)")
  void minItems()
  {
    assertSame(test(), test().minItems(1));
    assertEquals("{\"type\":\"array\",\"minItems\":1}", test().toString());
  }

  @Test
  @DisplayName("minItems(long)")
  void minItems_long()
  {
    assertSame(test(), test().minItems(1L));
    assertEquals("{\"type\":\"array\",\"minItems\":1}", test().toString());
  }

  @Test
  @DisplayName("minItems(BigInteger)")
  void minItems1()
  {
    assertSame(test(), test().minItems(new BigInteger("1")));
    assertEquals("{\"type\":\"array\",\"minItems\":1}", test().toString());
  }

  @Test
  void removeMinItems()
  {
    assertSame(test(), test().minItems(1).removeMinItems());
    assertEquals("{\"type\":\"array\"}", test().toString());
  }

  @Test
  void additionalItems()
  {
    assertSame(test(), test().additionalItems().close());
    assertEquals("{\"type\":\"array\",\"additionalItems\":{}}", test().toString());
  }

  @Test
  void additionalItems1()
  {
    assertSame(test(), test().additionalItems(Schema.draft4()));
    assertEquals("{\"type\":\"array\",\"additionalItems\":{}}", test().toString());
  }

  @Test
  void removeAdditionalItems()
  {
    assertSame(test(), test().additionalItems(Schema.draft4()).removeAdditionalItems());
    assertEquals("{\"type\":\"array\"}", test().toString());
  }

  @Test
  void items()
  {
    assertSame(test(), test().items().close());
    assertEquals("{\"type\":\"array\",\"items\":{}}", test().toString());
  }

  @Test
  void itemsArray()
  {
    assertSame(test(), test().itemsArray().close());
    assertEquals("{\"type\":\"array\",\"items\":[]}", test().toString());
  }

  @Test
  void items1()
  {
    assertSame(test(), test().items(Schema.draft4()));
    assertEquals("{\"type\":\"array\",\"items\":{}}", test().toString());
  }

  @Test
  void removeItems()
  {
    assertSame(test(), test().items(Schema.draft4()).removeItems());
    assertEquals("{\"type\":\"array\"}", test().toString());
  }

  @Test
  void enumValues()
  {
    assertSame(test(), test().enumValues(JSON.createArrayNode(), JSON.createArrayNode()));
    assertEquals("{\"type\":\"array\",\"enum\":[[],[]]}", test().toString());
  }

  @Test
  void enumValues1()
  {
    assertSame(test(), test().enumValues());
    assertEquals("{\"type\":\"array\"}", test().toString());
  }

  @Test
  void removeEnum()
  {
    assertSame(test(), test().enumValues(JSON.createArrayNode(),
      JSON.createArrayNode()).removeEnum());
    assertEquals("{\"type\":\"array\"}", test().toString());
  }

  @Test
  void uniqueItems()
  {
    assertSame(test(), test().uniqueItems(true));
    assertEquals("{\"type\":\"array\",\"uniqueItems\":true}", test().toString());
  }

  @Test
  void removeUniqueItems()
  {
    assertSame(test(), test().uniqueItems(true).removeUniqueItems());
    assertEquals("{\"type\":\"array\"}", test().toString());
  }
}
