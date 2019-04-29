package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.Schema;
import io.vulpine.lib.json.schema.v4.ObjectSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ObjectSchemaImplTest
{
  public static final ObjectMapper JSON = new ObjectMapper();

  private ObjectSchema x;

  protected ObjectSchema test()
  {
    return x;
  }

  @BeforeEach
  void setUp()
  {
    x = new ObjectSchemaImpl(JSON, JSON.createObjectNode());
  }

  @Test
  void optionalProp1()
  {
    var a = test().optionalProperty("foo");
    assertEquals("{\"type\":\"object\"}", test().toString());
    assertSame(test(), a.close());
    assertEquals("{\"type\":\"object\",\"properties\":{\"foo\":{}}}", test().toString());
  }

  @Test
  void optionalProp2()
  {
    assertSame(test(), test().optionalProperty("foo", Schema.draft4()));
    assertEquals("{\"type\":\"object\",\"properties\":{\"foo\":{}}}", test().toString());
  }

  @Test
  void removeOptional()
  {
    assertSame(test(), test().optionalProperty("foo", Schema.draft4()).removeOptionalProperties());
    assertEquals("{\"type\":\"object\"}", test().toString());

    assertSame(test(), test()
      .optionalProperty("foo", Schema.draft4())
      .requiredProperty("bar", Schema.draft4())
      .removeOptionalProperties());
    assertEquals("{\"type\":\"object\",\"properties\":{\"bar\":{}},\"required\":[\"bar\"]}", test().toString());
  }

  @Test
  void patternProp1()
  {
    var a = test().patternProperty("foo");
    assertEquals("{\"type\":\"object\"}", test().toString());
    assertSame(test(), a.close());
    assertEquals("{\"type\":\"object\",\"patternProperties\":{\"foo\":{}}}", test().toString());
  }

  @Test
  void patternProp2()
  {
    assertSame(test(), test().patternProperty("foo", Schema.draft4()));
    assertEquals("{\"type\":\"object\",\"patternProperties\":{\"foo\":{}}}", test().toString());
  }

  @Test
  void removePattern()
  {
    assertSame(test(), test().patternProperty("foo", Schema.draft4()).removePatternProperties());
    assertEquals("{\"type\":\"object\"}", test().toString());
  }

  @Test
  void additionalProperties1()
  {
    assertSame(test(), test().additionalProperties(true));
    assertEquals("{\"type\":\"object\",\"additionalProperties\":true}", test().toString());
  }

  @Test
  void additionalProperties2()
  {
    assertSame(test(), test().additionalProperties(Schema.draft4()));
    assertEquals("{\"type\":\"object\",\"additionalProperties\":{}}", test().toString());
  }

  @Test
  void additionalProperties3()
  {
    var a = test().additionalProperties();
    assertEquals("{\"type\":\"object\"}", test().toString());
    assertSame(test(), a.close());
    assertEquals("{\"type\":\"object\",\"additionalProperties\":{}}", test().toString());
  }

  @Test
  void removeAdditionalProp()
  {
    assertSame(test(), test().additionalProperties(Schema.draft4()).removeAdditionalProperties());
    assertEquals("{\"type\":\"object\"}", test().toString());
  }

  @Test
  void maxProps1()
  {
    assertSame(test(), test().maxProperties(1));
    assertEquals("{\"type\":\"object\",\"maxProperties\":1}", test().toString());
  }

  @Test
  void maxProps2()
  {
    assertSame(test(), test().maxProperties(1L));
    assertEquals("{\"type\":\"object\",\"maxProperties\":1}", test().toString());
  }

  @Test
  void maxProps3()
  {
    assertSame(test(), test().maxProperties(new BigInteger("1")));
    assertEquals("{\"type\":\"object\",\"maxProperties\":1}", test().toString());
  }

  @Test
  void removeMaxProps()
  {
    assertSame(test(), test().maxProperties(1).removeMaxProperties());
    assertEquals("{\"type\":\"object\"}", test().toString());
  }

  @Test
  void minProps1()
  {
    assertSame(test(), test().minProperties(1));
    assertEquals("{\"type\":\"object\",\"minProperties\":1}", test().toString());
  }

  @Test
  void minProps2()
  {
    assertSame(test(), test().minProperties(1L));
    assertEquals("{\"type\":\"object\",\"minProperties\":1}", test().toString());
  }

  @Test
  void minProps3()
  {
    assertSame(test(), test().minProperties(new BigInteger("1")));
    assertEquals("{\"type\":\"object\",\"minProperties\":1}", test().toString());
  }

  @Test
  void removeMinProps()
  {
    assertSame(test(), test().minProperties(1).removeMinProperties());
    assertEquals("{\"type\":\"object\"}", test().toString());
  }

  @Test
  void enumValues1()
  {
    assertSame(test(), test().enumValues());
    assertEquals("{\"type\":\"object\"}", test().toString());
  }

  @Test
  void enumValues2()
  {
    assertSame(test(), test().enumValues(JSON.createObjectNode()));
    assertEquals("{\"type\":\"object\",\"enum\":[{}]}", test().toString());
  }

  @Test
  void removeEnum()
  {
    assertSame(test(), test().enumValues(JSON.createObjectNode()).removeEnum());
    assertEquals("{\"type\":\"object\"}", test().toString());
  }

  @Test
  void requiredProp1()
  {
    var a = test().requiredProperty("foo");
    assertEquals("{\"type\":\"object\"}", test().toString());
    assertSame(test(), a.close());
    assertEquals("{\"type\":\"object\",\"properties\":{\"foo\":{}},\"required\":[\"foo\"]}", test().toString());
  }

  @Test
  void requiredProp2()
  {
    assertSame(test(), test().requiredProperty("foo", Schema.draft4()));
    assertEquals("{\"type\":\"object\",\"properties\":{\"foo\":{}},\"required\":[\"foo\"]}", test().toString());
  }

  @Test
  void removeRequired()
  {
    assertSame(test(), test().requiredProperty("foo", Schema.draft4()).removeRequiredProperties());
    assertEquals("{\"type\":\"object\"}", test().toString());

    assertSame(test(), test().optionalProperty("foo", Schema.draft4()).removeRequiredProperties());
    assertEquals("{\"type\":\"object\",\"properties\":{\"foo\":{}}}", test().toString());

    assertSame(test(), test()
      .optionalProperty("foo", Schema.draft4())
      .requiredProperty("bar", Schema.draft4())
      .removeRequiredProperties());
    assertEquals("{\"type\":\"object\",\"properties\":{\"foo\":{}}}", test().toString());
  }
}
