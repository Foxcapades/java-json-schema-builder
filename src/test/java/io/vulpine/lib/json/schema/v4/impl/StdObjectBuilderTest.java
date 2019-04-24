package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.v4.Draft4;
import io.vulpine.lib.json.schema.v4.JsonType;
import io.vulpine.lib.json.schema.v4.ObjectBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static io.vulpine.lib.json.schema.v4.lib.Keys.*;
import static org.junit.jupiter.api.Assertions.*;

class StdObjectBuilderTest
{
  private static final ObjectMapper JSON = new ObjectMapper();

  private ObjectNode raw;
  private ObjectBuilder<?> test;

  @BeforeEach
  void setUp()
  {
    raw = JSON.createObjectNode();
    test = new StdObjectBuilder<>(JSON, raw);
  }

  @Test
  void optionalProperty_builder()
  {
    var a = test.optionalProperty("test");
    assertTrue(raw.has(PROPS));
    assertTrue(raw.get(PROPS).has("test"));
    assertTrue(raw.get(PROPS).get("test").isObject());
    assertNotNull(a);
  }

  @Test
  void optionalProperty_setter()
  {
    var a = JSON.createObjectNode().put("foo", "bar");
    assertNotNull(test.optionalProperty("test",
      new StdObjectBuilder<>(JSON, a)));
    assertTrue(raw.get(PROPS).has("test"));
    assertEquals(a, raw.get(PROPS).get("test"));
  }

  @Test
  void clearOptionalProperties_when_required_are_present()
  {
    test.optionalProperty("foo");
    test.requiredProperty("bar");
    assertNotNull(test.clearOptionalProperties());

    // Didn't remove "properties"
    assertTrue(raw.has(PROPS));

    // Still has required prop
    assertTrue(raw.get(PROPS).has("bar"));
  }

  @Test
  void removeOptionalProperties_when_required_are_present()
  {
    test.optionalProperty("foo");
    test.requiredProperty("bar");
    assertNotNull(test.removeOptionalProperties());

    // Didn't remove "properties"
    assertTrue(raw.has(PROPS));

    // Still has required prop
    assertTrue(raw.get(PROPS).has("bar"));
  }

  @Test
  void removeOptionalProperties_when_required_are_not_present()
  {
    test.optionalProperty("foo");
    test.removeOptionalProperties();

    assertFalse(raw.has(PROPS));
  }

  @Test
  void clearOptionalProperties_when_required_are_not_present()
  {
    test.optionalProperty("foo");
    test.clearOptionalProperties();

    assertFalse(raw.has(PROPS));
  }

  @Test
  void requiredProperty_builder()
  {
    var a = test.requiredProperty("test");
    // Appended missing props
    assertTrue(raw.has(REQ));
    assertTrue(raw.has(PROPS));

    // "properties"
    assertTrue(raw.get(PROPS).has("test"));
    assertTrue(raw.get(PROPS).get("test").isObject());

    // "required"
    assertEquals(1, raw.get(REQ).size());
    assertEquals("test", raw.get(REQ).get(0).textValue());

    // return val
    assertNotNull(a);
  }

  @Test
  void requiredProperty_setter()
  {
    var a = JSON.createObjectNode().put("foo", "bar");
    assertNotNull(test.requiredProperty("test",
      new StdObjectBuilder<>(JSON, a)));

    // Appended missing props
    assertTrue(raw.has(REQ));
    assertTrue(raw.has(PROPS));

    // "properties"
    assertTrue(raw.get(PROPS).has("test"));
    assertEquals(a, raw.get(PROPS).get("test"));

    // "required"
    assertEquals(1, raw.get(REQ).size());
    assertEquals("test", raw.get(REQ).get(0).textValue());

    // return val
    assertNotNull(a);
  }

  @Nested
  @DisplayName("removeRequiredProperties()")
  class clearRequiredProperties
  {
    @Nested
    @DisplayName("When no properties are present")
    class noProps
    {
      @Test
      @DisplayName("does not return a null value")
      void a()
      {
        assertNotNull(test.removeRequiredProperties());
      }

      @Test
      @DisplayName("does not return a null value")
      void a1()
      {
        assertNotNull(test.clearRequiredProperties());
      }

      @Test
      @DisplayName("does not cause a dangling \"" + REQ + "\" array")
      void b()
      {
        assertFalse(test.removeRequiredProperties().build().has(REQ));
      }

      @Test
      @DisplayName("does not cause a dangling \"" + REQ + "\" array")
      void b1()
      {
        assertFalse(test.clearRequiredProperties().build().has(REQ));
      }

      @Test
      @DisplayName("does not cause a dangling \"" + PROPS + "\" object")
      void c()
      {
        assertFalse(test.removeRequiredProperties().build().has(PROPS));
      }

      @Test
      @DisplayName("does not cause a dangling \"" + PROPS + "\" object")
      void c1()
      {
        assertFalse(test.clearRequiredProperties().build().has(PROPS));
      }
    }

    @Test
    @DisplayName("When both optional and required properties are present")
    void when_optionals_present()
    {
      test.optionalProperty("foo");
      test.requiredProperty("bar");
      test.removeRequiredProperties();

      // didn't remove req props
      assertFalse(raw.has(REQ));
      assertTrue(raw.has(PROPS));

      // correctly trimmed the props object
      assertEquals(1, raw.get(PROPS).size());
      assertTrue(raw.get(PROPS).has("foo"));
    }

    @Test
    @DisplayName("When only required properties are present")
    void removeRequiredProperties_when_optionals_not_present()
    {
      test.requiredProperty("bar");
      assertNotNull(test.removeRequiredProperties());

      // removed empty blocks
      assertFalse(raw.has(REQ));
      assertFalse(raw.has(PROPS));

      // Extra call to hit a weird block of code meant to prevent the creation of
      // the required array just before removing it.
      test.removeRequiredProperties();
    }

    @Test
    @DisplayName("When only required properties are present")
    void clearRequiredProperties_when_optionals_not_present()
    {
      test.requiredProperty("bar");
      assertNotNull(test.clearRequiredProperties());

      // removed empty blocks
      assertFalse(raw.has(REQ));
      assertFalse(raw.has(PROPS));

      // Extra call to hit a weird block of code meant to prevent the creation of
      // the required array just before removing it.
      test.clearRequiredProperties();
    }
  }

  @Test
  void patternProperty_builder()
  {
    var a = test.patternProperty("test");

    assertTrue(raw.has(PATT_PROPS));
    assertTrue(raw.get(PATT_PROPS).has("test"));
    assertTrue(raw.get(PATT_PROPS).get("test").isObject());

    // return value
    assertNotNull(a);

    test.patternProperty("foo");
    assertEquals(2, raw.get(PATT_PROPS).size());
  }

  @Test
  void patternProperty_setter()
  {
    var a = JSON.createObjectNode();
    var b = test.patternProperty("test", new StdArrayBuilder(JSON, a));

    assertTrue(raw.has(PATT_PROPS));
    assertTrue(raw.get(PATT_PROPS).has("test"));
    assertEquals(a, raw.get(PATT_PROPS).get("test"));

    // return value
    assertNotNull(b);
  }

  @Nested
  @DisplayName("removePatternProperties()")
  class clearPatternProperties
  {
    @BeforeEach
    void setUp()
    {
      raw.set(PATT_PROPS,
        JSON.createObjectNode().set(PATT_PROPS, JSON.createObjectNode()));
    }

    @Test
    @DisplayName("Removes the \"patternProperties\" property from the schema builder")
    void removeProp()
    {
      assertTrue(raw.has(PATT_PROPS));
      assertNotNull(test.removePatternProperties());
      assertFalse(raw.has(PATT_PROPS));
    }

    @Test
    @DisplayName("Removes the \"patternProperties\" property from the schema builder")
    void clearProp()
    {
      assertTrue(raw.has(PATT_PROPS));
      assertNotNull(test.clearPatternProperties());
      assertFalse(raw.has(PATT_PROPS));
    }
  }

  @Nested
  @DisplayName("additionalProperties()")
  class additionalProperties_builder
  {
    @Test
    void additionalProperties()
    {
      assertNotNull(test.additionalProperties().asArray());
      assertTrue(raw.has(ADDTL_PROPS));
      assertTrue(raw.get(ADDTL_PROPS).has(TYPE));
      assertEquals(JsonType.ARRAY.jsonName(),
        raw.get(ADDTL_PROPS).get(TYPE).textValue());
    }
  }

  @Nested
  @DisplayName("additionalProperties(SchemaObject)")
  class additionalProperties_setter
  {
    @Test
    void additionalProperties()
    {
      assertNotNull(test.additionalProperties(new StdArrayBuilder(JSON,
        JSON.createObjectNode())));

      assertTrue(raw.has(ADDTL_PROPS));
      assertTrue(raw.get(ADDTL_PROPS).has(TYPE));
      assertEquals(JsonType.ARRAY.jsonName(),
        raw.get(ADDTL_PROPS).get(TYPE).textValue());
    }
  }

  @Nested
  @DisplayName("additionalProperties(boolean)")
  class additionalProperties_flag
  {
    @Test
    void additionalProperties()
    {
      assertNotNull(test.additionalProperties(false));
      assertTrue(raw.has(ADDTL_PROPS));
      assertFalse(raw.get(ADDTL_PROPS).booleanValue());
    }
  }

  @Test
  void clearAdditionalProperties()
  {
    raw.put(ADDTL_PROPS, false);
    assertNotNull(test.clearAdditionalProperties());
    assertFalse(raw.has(ADDTL_PROPS));
  }

  @Test
  void removeAdditionalProperties()
  {
    raw.put(ADDTL_PROPS, false);
    assertNotNull(test.removeAdditionalProperties());
    assertFalse(raw.has(ADDTL_PROPS));
  }

  @Test
  @DisplayName("enumValues(ObjectNode...)")
  void enumValues()
  {
    var a = JSON.createObjectNode().put("foo", "bar");
    var b = JSON.createObjectNode().put("fizz", "buzz");

    assertNotNull(test.enumValues(a, b));
    assertTrue(raw.has(ENUM));
    assertEquals(2, raw.get(ENUM).size());
    assertEquals(a, raw.get(ENUM).get(0));
    assertEquals(b, raw.get(ENUM).get(1));
  }

  @Test
  void maxProperties_int()
  {
    assertNotNull(test.maxProperties(3));
    assertTrue(raw.has(MAX_PROPS));
    assertEquals(3, raw.get(MAX_PROPS).intValue());
  }

  @Test
  void maxProperties_long()
  {
    assertNotNull(test.maxProperties(3L));
    assertTrue(raw.has(MAX_PROPS));
    assertEquals(3L, raw.get(MAX_PROPS).longValue());
  }

  @Test
  void maxProperties_bigInt()
  {
    assertNotNull(test.maxProperties(new BigInteger("3")));
    assertTrue(raw.has(MAX_PROPS));
    assertEquals(new BigInteger("3"), raw.get(MAX_PROPS).bigIntegerValue());
  }

  @Test
  void clearMaxProperties()
  {
    raw.put(MAX_PROPS, 1);
    assertNotNull(test.clearMaxProperties());
    assertFalse(raw.has(MAX_PROPS));
  }

  @Test
  void removeMaxProperties()
  {
    raw.put(MAX_PROPS, 1);
    assertNotNull(test.removeMaxProperties());
    assertFalse(raw.has(MAX_PROPS));
  }

  @Test
  void minProperties_int()
  {
    assertNotNull(test.minProperties(3));
    assertTrue(raw.has(MIN_PROPS));
    assertEquals(3, raw.get(MIN_PROPS).intValue());
  }

  @Test
  void minProperties_long()
  {
    assertNotNull(test.minProperties(3L));
    assertTrue(raw.has(MIN_PROPS));
    assertEquals(3L, raw.get(MIN_PROPS).longValue());
  }

  @Test
  void minProperties_bigInt()
  {
    assertNotNull(test.minProperties(new BigInteger("3")));
    assertTrue(raw.has(MIN_PROPS));
    assertEquals(new BigInteger("3"), raw.get(MIN_PROPS).bigIntegerValue());
  }

  @Test
  void clearMinProperties()
  {
    raw.put(MIN_PROPS, 1);
    assertNotNull(test.clearMinProperties());
    assertFalse(raw.has(MIN_PROPS));
  }

  @Test
  void removeMinProperties()
  {
    raw.put(MIN_PROPS, 1);
    assertNotNull(test.removeMinProperties());
    assertFalse(raw.has(MIN_PROPS));
  }

  @Test
  void definition_builder()
  {
    assertFalse(raw.has(DEFINITIONS));

    var a = test.definition("test");

    assertTrue(raw.has(DEFINITIONS));
    assertTrue(raw.get(DEFINITIONS).has("test"));
    assertTrue(raw.get(DEFINITIONS).get("test").isObject());
    assertEquals(1, raw.get(DEFINITIONS).size());
    assertNotNull(a);
  }

  @Test
  void definition_setter()
  {
    assertFalse(raw.has(DEFINITIONS));

    var a = test.definition("test", Draft4.newBuilder());

    assertTrue(raw.has(DEFINITIONS));
    assertTrue(raw.get(DEFINITIONS).has("test"));
    assertTrue(raw.get(DEFINITIONS).get("test").isObject());
    assertEquals(1, raw.get(DEFINITIONS).size());
    assertNotNull(a);
  }

  @Nested
  @DisplayName("removeDefinition(String)")
  class clearDefinition {
    @Test
    @DisplayName("Does not return null")
    void a() {
      assertNotNull(test.removeDefinition("foo"));
    }

    @Test
    @DisplayName("Does not return null")
    void a1() {
      assertNotNull(test.clearDefinition("foo"));
    }

    @Test
    @DisplayName("When 1 unrelated definition is present")
    void b()
    {
      test.definition("foo");
      test.removeDefinition("bar");

      var a = test.build();

      assertTrue(a.has(DEFINITIONS));
      assertTrue(a.get(DEFINITIONS).has("foo"));
    }

    @Test
    @DisplayName("When 1 unrelated definition is present")
    void b1()
    {
      test.definition("foo");
      test.clearDefinition("bar");

      var a = test.build();

      assertTrue(a.has(DEFINITIONS));
      assertTrue(a.get(DEFINITIONS).has("foo"));
    }

    @Test
    @DisplayName("When 1 related definition is present")
    void c()
    {
      test.definition("foo");
      test.removeDefinition("foo");

      var a = test.build();

      assertFalse(a.has(DEFINITIONS));
    }

    @Test
    @DisplayName("When 1 related definition is present")
    void c1()
    {
      test.definition("foo");
      test.clearDefinition("foo");

      var a = test.build();

      assertFalse(a.has(DEFINITIONS));
    }

    @Test
    @DisplayName("When 2 definitions are present")
    void d()
    {
      test.definition("foo");
      test.definition("bar");
      test.removeDefinition("bar");

      var a = test.build();

      assertTrue(a.has(DEFINITIONS));
      assertTrue(a.get(DEFINITIONS).has("foo"));
      assertEquals(1, a.get(DEFINITIONS).size());
    }

    @Test
    @DisplayName("When 2 definitions are present")
    void d1()
    {
      test.definition("foo");
      test.definition("bar");
      test.clearDefinition("bar");

      var a = test.build();

      assertTrue(a.has(DEFINITIONS));
      assertTrue(a.get(DEFINITIONS).has("foo"));
      assertEquals(1, a.get(DEFINITIONS).size());
    }
  }

  @Test
  void clearDefinitions()
  {
    test.definition("test");
    assertNotNull(test.clearDefinitions());
    assertFalse(test.build().has(DEFINITIONS));
  }

  @Test
  void removeDefinitions()
  {
    test.definition("test");
    assertNotNull(test.removeDefinitions());
    assertFalse(test.build().has(DEFINITIONS));
  }
}
