package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.Schema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class SchemaBuilderImplTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private ObjectNode node;

  private SchemaBuilderImpl test;

  @BeforeEach
  void setUp()
  {
    node = JSON.createObjectNode();
    test = new SchemaBuilderImpl(JSON, node);
  }

  @Test
  void build()
  {
  }

  @Test
  void jax()
  {
    assertSame(JSON, test.jax());
  }

  @Test
  void raw()
  {
    assertSame(node, test.raw());
  }

  @Test
  void copy()
  {
    node.putArray("foo");
    assertEquals(node.toString(), test.copy().toString());
  }

  @Test
  void has()
  {
    assertFalse(test.has("foo"));
    node.putArray("foo");
    assertTrue(test.has("foo"));
  }

  @Test
  void get()
  {
    var a = node.putArray("foo");
    assertSame(a, test.get("foo"));
  }

  @Test
  void putArr()
  {
    var a = test.putArr("foo");
    assertNotNull(a);
    assertTrue(node.has("foo"));
    assertTrue(node.get("foo").isArray());
    assertSame(a, node.get("foo"));
  }

  @Test
  void newArr()
  {
    var a = test.newArr();
    assertNotNull(a);
    assertTrue(a.isArray());
  }

  @Test
  void newObj()
  {
    var a = test.newObj();
    assertNotNull(a);
    assertTrue(a.isObject());
  }

  @Test
  void remove()
  {
    node.putArray("foo");
    assertNotNull(test.remove("foo"));
    assertFalse(node.has("foo"));
  }

  @Test
  void remove1()
  {
    node.putObject("foo").putArray("bar");
    node.putObject("fizz")
      .put("1", "buzz")
      .put("2", "buzz");
    assertNotNull(test.remove("foo", "bar"));
    assertEquals("{\"fizz\":{\"1\":\"buzz\",\"2\":\"buzz\"}}", test.toString());
    assertNotNull(test.remove("fizz", "1"));
    assertEquals("{\"fizz\":{\"2\":\"buzz\"}}", test.toString());
  }

  @Test
  @DisplayName("put(String, boolean)")
  void put()
  {
    assertNotNull(test.put("a", true));
    assertNotNull(test.put("b", false));
    assertEquals("{\"a\":true,\"b\":false}", test.toString());
  }

  @Test
  @DisplayName("put(String, double)")
  void put1()
  {
    var a = 3D;
    assertNotNull(test.put("a", a));
    assertTrue(node.has("a"));
    assertTrue(node.get("a").isNumber());
    assertEquals(a, node.get("a").doubleValue());
  }

  @Test
  @DisplayName("put(String, float)")
  void put2()
  {
    var a = 3F;
    assertNotNull(test.put("a", a));
    assertTrue(node.has("a"));
    assertTrue(node.get("a").isNumber());
    assertEquals(a, node.get("a").floatValue());
  }

  @Test
  @DisplayName("put(String, long)")
  void put3()
  {
    var a = 3L;
    assertNotNull(test.put("a", a));
    assertTrue(node.has("a"));
    assertTrue(node.get("a").isIntegralNumber());
    assertEquals(a, node.get("a").longValue());
  }

  @Test
  @DisplayName("put(String, BigInteger)")
  void put4()
  {
    var a = new BigInteger("3");
    assertNotNull(test.put("a", a));
    assertTrue(node.has("a"));
    assertTrue(node.get("a").isIntegralNumber());
    assertEquals(a, node.get("a").bigIntegerValue());
  }

  @Test
  @DisplayName("put(String, BigDecimal)")
  void put5()
  {
    var a = new BigDecimal("3");
    assertNotNull(test.put("a", a));
    assertTrue(node.has("a"));
    assertTrue(node.get("a").isNumber());
    assertEquals(a, node.get("a").decimalValue());
  }

  @Test
  @DisplayName("put(String, String)")
  void put6()
  {
    var a = "3";
    assertNotNull(test.put("a", a));
    assertTrue(node.has("a"));
    assertTrue(node.get("a").isTextual());
    assertEquals(a, node.get("a").textValue());
  }

  @Test
  @DisplayName("put(String, JsonNode")
  void put7()
  {
    var a = JSON.createObjectNode().put("foo", "bar");
    assertNotNull(test.put("a", a));
    assertTrue(node.has("a"));
    assertTrue(node.get("a").isObject());
    assertEquals(a, node.get("a"));
  }

  @Test
  @DisplayName("put(String, SchemaBuilder)")
  void put8()
  {
    var a = Schema.draft4().oneOf().$ref("").addArray().close();
    assertNotNull(test.put("a", a));
    assertTrue(node.has("a"));
    assertTrue(node.get("a").isObject());
    assertEquals(a.remove$Schema().build(), node.get("a"));
  }

  @Test
  @DisplayName("put(String, int)")
  void put9()
  {
    var a = 3;
    assertNotNull(test.put("a", a));
    assertTrue(node.has("a"));
    assertTrue(node.get("a").isInt());
    assertEquals(a, node.get("a").intValue());
  }

  @Test
  @DisplayName("put(String, int)")
  void put10()
  {
    var a = 3;
    assertNotNull(test.put(node.putObject("foo"), "a", new IntNode(a)));
    assertEquals("{\"foo\":{\"a\":3}}", test.toString());
  }
}
