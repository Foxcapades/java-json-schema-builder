package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vulpine.lib.json.schema.v4.Format;
import io.vulpine.lib.json.schema.v4.StringSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class StringSchemaImplTest
{
  public static final ObjectMapper JSON = new ObjectMapper();

  private StringSchema x;

  @BeforeEach
  void setUp()
  {
    x = new StringSchemaImpl(JSON, JSON.createObjectNode());
  }

  protected StringSchema test()
  {
    return x;
  }

  @Test
  void defaultValue()
  {
    assertSame(test(), test().defaultValue("foo"));
    assertEquals("{\"type\":\"string\",\"default\":\"foo\"}", test().toString());
  }

  @Test
  void enumValue()
  {
    assertSame(test(), test().enumValues());
    assertEquals("{\"type\":\"string\"}", test().toString());
    assertSame(test(), test().enumValues("foo"));
    assertEquals("{\"type\":\"string\",\"enum\":[\"foo\"]}", test().toString());
  }

  @Test
  void pattern()
  {
    assertSame(test(), test().pattern("foo"));
    assertEquals("{\"type\":\"string\",\"pattern\":\"foo\"}", test().toString());
  }

  @Test
  void removePattern()
  {
    assertSame(test(), test().pattern("foo").removePattern());
    assertEquals("{\"type\":\"string\"}", test().toString());
  }

  @Test
  void format()
  {
    assertSame(test(), test().format(Format.URI));
    assertEquals("{\"type\":\"string\",\"format\":\"uri\"}", test().toString());
  }

  @Test
  void format_string()
  {
    assertSame(test(), test().format("foo"));
    assertEquals("{\"type\":\"string\",\"format\":\"foo\"}", test().toString());
  }

  @Test
  void removeFormat()
  {
    assertSame(test(), test().format("foo").removeFormat());
    assertEquals("{\"type\":\"string\"}", test().toString());
  }

  @Test
  void maxLength1()
  {
    assertSame(test(), test().maxLength(1));
    assertEquals("{\"type\":\"string\",\"maxLength\":1}", test().toString());
  }

  @Test
  void maxLength2()
  {
    assertSame(test(), test().maxLength(1L));
    assertEquals("{\"type\":\"string\",\"maxLength\":1}", test().toString());
  }

  @Test
  void maxLength3()
  {
    assertSame(test(), test().maxLength(new BigInteger("1")));
    assertEquals("{\"type\":\"string\",\"maxLength\":1}", test().toString());
  }

  @Test
  void removeMaxLength()
  {
    assertSame(test(), test().maxLength(1).removeMaxLength());
    assertEquals("{\"type\":\"string\"}", test().toString());
  }

  @Test
  void minLength1()
  {
    assertSame(test(), test().minLength(1));
    assertEquals("{\"type\":\"string\",\"minLength\":1}", test().toString());
  }

  @Test
  void minLength2()
  {
    assertSame(test(), test().minLength(1L));
    assertEquals("{\"type\":\"string\",\"minLength\":1}", test().toString());
  }

  @Test
  void minLength3()
  {
    assertSame(test(), test().minLength(new BigInteger("1")));
    assertEquals("{\"type\":\"string\",\"minLength\":1}", test().toString());
  }

  @Test
  void removeMinLength()
  {
    assertSame(test(), test().minLength(1).removeMinLength());
    assertEquals("{\"type\":\"string\"}", test().toString());
  }

  @Test
  void removeEnum()
  {
    assertSame(test(), test().enumValues("foo").removeEnum());
    assertEquals("{\"type\":\"string\"}", test().toString());
  }
}
