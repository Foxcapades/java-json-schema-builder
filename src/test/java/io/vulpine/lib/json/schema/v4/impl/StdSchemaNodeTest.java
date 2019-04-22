package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdSchemaNodeTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private StdSchemaNode<?> type;

  @BeforeEach
  void setUp()
  {
    type = new StdSchemaNode<>(JSON);
  }

  @Test
  void clearDefaultValue()
  {
    type.schema.put(DEFAULT, "a");
    type.clearDefaultValue();
    assertFalse(type.schema.has(DEFAULT));
  }

  @Test
  void id()
  {
    var a = "a";
    type.id(a);
    assertTrue(type.schema.has(ID));
    assertEquals(a, type.schema.get(ID).textValue());
  }

  @Test
  void clearId()
  {
    type.schema.put(ID, "a");
    type.clearId();
    assertFalse(type.schema.has(ID));
  }

  @Test
  void $schema()
  {
    var a = "a";
    type.$schema(a);
    assertTrue(type.schema.has($SCHEMA));
    assertEquals(a, type.schema.get($SCHEMA).textValue());
  }

  @Test
  void clear$Schema()
  {
    type.schema.put($SCHEMA, "a");
    type.clear$Schema();
    assertFalse(type.schema.has($SCHEMA));
  }

  @Test
  void $ref()
  {
    var a = "a";
    type.$ref(a);
    assertTrue(type.schema.has($REF));
    assertEquals(a, type.schema.get($REF).textValue());
  }

  @Test
  void clear$Ref()
  {
    type.schema.put($REF, "a");
    type.clear$Ref();
    assertFalse(type.schema.has($REF));
  }

  @Test
  void description()
  {
    var a = "a";
    type.description(a);
    assertTrue(type.schema.has(DESC));
    assertEquals(a, type.schema.get(DESC).textValue());
  }

  @Test
  void clearDescription()
  {
    type.schema.put(DESC, "a");
    type.clearDescription();
    assertFalse(type.schema.has(DESC));
  }

  @Test
  void title()
  {
    var a = "a";
    type.title(a);
    assertTrue(type.schema.has(TITLE));
    assertEquals(a, type.schema.get(TITLE).textValue());
  }

  @Test
  void clearTitle()
  {
    type.schema.put(TITLE, "a");
    type.clearTitle();
    assertFalse(type.schema.has(TITLE));
  }

  @Test
  void render()
  {
    type.schema.put("A", "B");
    assertEquals("B", type.render().get("A").textValue());
  }

  @Test
  void clear()
  {
    type.schema.put("A", "B");
    type.clear("A");
    assertFalse(type.schema.has("A"));
  }

  @Test
  void put_bool()
  {
    type.put("A", true);
    type.put("B", false);
    assertTrue(type.schema.get("A").booleanValue());
    assertFalse(type.schema.get("B").booleanValue());
  }

  @Test
  void put_jsonNode()
  {
    type.put("A", JSON.createObjectNode().put("foo", "bar"));
    assertEquals("{\"foo\":\"bar\"}", type.schema.get("A").toString());
  }

  @Test
  void put_string()
  {
    type.put("A", "B");
    assertEquals("B", type.schema.get("A").textValue());
  }

  @Test
  void put_int()
  {
    type.put("A", Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, type.schema.get("A").intValue());
  }

  @Test
  void put_long()
  {
    type.put("A", Long.MAX_VALUE);
    assertEquals(Long.MAX_VALUE, type.schema.get("A").longValue());
  }

  @Test
  void put_bigInt()
  {
    type.put("A", BigInteger.TEN);
    assertEquals(BigInteger.TEN, type.schema.get("A").bigIntegerValue());
  }

  @Test
  void put_bigDec()
  {
    type.put("A", new BigDecimal("10"));
    assertEquals(0, new BigDecimal("10").compareTo(
      type.schema.get("A").decimalValue()));
  }

  @Test
  void put_schema()
  {
    type.put("A", new StdArrayBuilder<>(JSON));
    assertEquals("{\"type\":\"array\"}", type.schema.get("A").toString());
  }

  @Test
  void put_float()
  {
    type.put("A", Float.MAX_VALUE);
    assertEquals(Float.MAX_VALUE, type.schema.get("A").floatValue());
  }

  @Test
  void put_double()
  {
    type.put("A", Double.MAX_VALUE);
    assertEquals(Double.MAX_VALUE, type.schema.get("A").doubleValue());
  }

  @Test
  void strip$Schema()
  {
    assertEquals("{}", type.strip$Schema(JSON.createObjectNode()
      .put($SCHEMA, "a")).toString());
  }
}
