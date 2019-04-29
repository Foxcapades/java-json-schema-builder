package io.vulpine.lib.json.schema.v4.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vulpine.lib.json.schema.Schema;
import io.vulpine.lib.json.schema.v4.SchemaNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static io.vulpine.lib.json.schema.v4.lib.Keys.TYPE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class NodeBaseTest
{
  public static final ObjectMapper JSON = new ObjectMapper();

  static SchemaNode[] impls() {
    return new SchemaNode[]{
      new ArrayChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new ArraySchemaImpl(JSON, JSON.createObjectNode()),
      new BooleanChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new BooleanSchemaImpl(JSON, JSON.createObjectNode()),
      new IntegerChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new IntegerSchemaImpl(JSON, JSON.createObjectNode()),
      new MultiChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), "", null),
      new MultiSchemaImpl(JSON, JSON.createObjectNode(), ""),
      new NullChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new NullSchemaImpl(JSON, JSON.createObjectNode()),
      new NumberChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new NumberSchemaImpl(JSON, JSON.createObjectNode()),
      new ObjectChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new ObjectSchemaImpl(JSON, JSON.createObjectNode()),
      new StringChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new StringSchemaImpl(JSON, JSON.createObjectNode()),
      new UntypedChildSchemaImpl<>(null, JSON, JSON.createObjectNode(), null),
      new UntypedSchemaImpl(JSON, JSON.createObjectNode()),
    };
  }

  @ParameterizedTest
  @MethodSource("impls")
  void id(SchemaNode test)
  {
    assertNotNull(test.id("foo"));
    assertEquals("{\"id\":\"foo\"}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void removeId(SchemaNode test)
  {
    assertNotNull(test.id("foo").removeId());
    assertEquals("{}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void title(SchemaNode test)
  {
    assertNotNull(test.title("foo"));
    assertEquals("{\"title\":\"foo\"}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void removeTitle(SchemaNode test)
  {
    assertNotNull(test.title("foo").removeTitle());
    assertEquals("{}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void description(SchemaNode test)
  {
    assertNotNull(test.description("foo"));
    assertEquals("{\"description\":\"foo\"}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void removeDescription(SchemaNode test)
  {
    assertNotNull(test.description("foo").removeDescription());
    assertEquals("{}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void $schema(SchemaNode test)
  {
    assertNotNull(test.$schema("foo"));
    assertEquals("{\"$schema\":\"foo\"}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void remove$Schema(SchemaNode test)
  {
    assertNotNull(test.$schema("foo").remove$Schema());
    assertEquals("{}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void $ref(SchemaNode test)
  {
    assertNotNull(test.$ref("foo"));
    assertEquals("{\"$ref\":\"foo\"}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void remove$Ref(SchemaNode test)
  {
    assertNotNull(test.$ref("foo").remove$Ref());
    assertEquals("{}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void defaultValue(SchemaNode test)
  {
    assertNotNull(test.defaultValue(JSON.createArrayNode()));
    assertEquals("{\"default\":[]}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void removeDefault(SchemaNode test)
  {
    assertNotNull(test.defaultValue(JSON.createArrayNode()).removeDefault());
    assertEquals("{}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void definition1(SchemaNode test)
  {
    assertNotNull(test.definition("foo").close());
    assertEquals("{\"definitions\":{\"foo\":{}}}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void definition2(SchemaNode test)
  {
    assertNotNull(test.definition("foo", Schema.draft4()));
    assertEquals("{\"definitions\":{\"foo\":{}}}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void removeDefinition(SchemaNode test)
  {
    assertNotNull(test.definition("foo", Schema.draft4())
      .definition("bar", Schema.draft4()).removeDefinition("foo"));
    assertEquals("{\"definitions\":{\"bar\":{}}}", stripNoise(test.build()));
  }

  @ParameterizedTest
  @MethodSource("impls")
  void removeDefinitions(SchemaNode test)
  {
    assertNotNull(test.definition("foo", Schema.draft4()).removeDefinitions());
    assertEquals("{}", stripNoise(test.build()));
  }

  /**
   * Removes expected intentional noise from comparison json
   */
  private static String stripNoise(JsonNode node)
  {
    if (node.isObject())
      ((ObjectNode) node).remove(TYPE);
    return node.toString();
  }
}
