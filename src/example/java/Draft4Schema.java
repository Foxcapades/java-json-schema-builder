import io.vulpine.lib.json.schema.Schema;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.TreeNode;

public class Draft4Schema
{
  public static void main(String[] args)
  {
    final var schema = Schema.draft4();
    final var json = new ObjectMapper();
    final var posInt = Schema.draft4().$ref("#/definitions/positiveInteger");
    final var posIntDef0 = schema.$ref("#/definitions/positiveIntegerDefault0");
    System.out.println(
      schema.asObject()
        .id("http://json-schema.org/draft-04/schema#")
        .description("Core schema meta-schema")
        .definition("schemaArray")
          .asArray()
          .minItems(1)
          .items(Schema.draft4().$ref("#"))
          .close()
        .definition("positiveInteger")
          .asInteger()
          .minimum(0)
          .close()
        .definition("positiveIntegerDefault0")
          .allOf()
          .add(posInt, schema.asInteger().defaultValue(0))
          .close()
        .definition("simpleTypes")
          .asString()
          .enumValues(
            "array",
            "boolean",
            "integer",
            "null",
            "number",
            "object",
            "string"
          )
          .close()
        .definition("stringArray")
          .asArray()
          .items(schema.asString())
          .minItems(1)
          .uniqueItems(true)
          .close()
        .optionalProperty("id", schema.asString())
        .optionalProperty("$schema", schema.asString())
        .optionalProperty("title", schema.asString())
        .optionalProperty("description", schema.asString())
        .optionalProperty("default", schema)
        .optionalProperty("multipleOf")
          .asNumber()
          .minimum(0)
          .exclusiveMinimum(true)
          .close()
        .optionalProperty("maximum", schema.asNumber())
        .optionalProperty("exclusiveMaximum")
          .asBoolean()
          .defaultValue(false)
          .close()
        .optionalProperty("minimum", schema.asNumber())
        .optionalProperty("exclusiveMinimum")
          .asBoolean()
          .defaultValue(false)
          .close()
        .optionalProperty("maxLength", posInt)
        .optionalProperty("minLength", posIntDef0)
        .optionalProperty("pattern", schema.asString().format("regex"))
        .optionalProperty("additionalItems")
          .anyOf()
          .add(schema.asBoolean(), schema.$ref("#"))
          .defaultValue(json.createObjectNode())
          .close()
        .optionalProperty("items")
          .anyOf()
          .add(schema, schema.$ref("#/definitions/schemaArray"))
          .defaultValue(json.createObjectNode())
          .close()
        .optionalProperty("maxItems", posInt)
        .optionalProperty("minItems", posIntDef0)
        .optionalProperty("uniqueItems", schema.asBoolean().defaultValue(false))
        .optionalProperty("maxProperties", posInt)
        .optionalProperty("minProperties", posIntDef0)
        .optionalProperty("required", Schema.draft4().$ref("#/definitions/stringArray"))
        .optionalProperty("additionalProperties")
          .anyOf()
          .add(schema.asBoolean(), Schema.draft4().$ref("#"))
          .defaultValue(json.createObjectNode())
          .close()
        .optionalProperty("definitions")
          .asObject()
          .additionalProperties(Schema.draft4().$ref("#"))
          .defaultValue(json.createObjectNode())
          .close()
        .optionalProperty("properties")
          .asObject()
          .additionalProperties(Schema.draft4().$ref("#"))
          .defaultValue(json.createObjectNode())
          .close()
        .optionalProperty("patternProperties")
          .asObject()
          .additionalProperties(Schema.draft4().$ref("#"))
          .defaultValue(json.createObjectNode())
          .close()
        .optionalProperty("dependencies")
          .asObject()
          .additionalProperties()
            .anyOf()
            .add(Schema.draft4().$ref("#"), Schema.draft4().$ref("#/definitions/stringArray"))
            .close()
          .close()
        .optionalProperty("enum")
          .asArray()
          .minItems(1)
          .uniqueItems(true)
          .close()
        .optionalProperty("type")
          .anyOf()
          .add(Schema.draft4().$ref("#/definitions/simpleTypes"))
          .addArray()
            .items(Schema.draft4().$ref("#/definitions/simpleTypes"))
            .minItems(1)
            .uniqueItems(true)
            .close()
          .close()
        .optionalProperty("format", schema.asString())
        .optionalProperty("allOf", Schema.draft4().$ref("#/definitions/schemaArray"))
        .optionalProperty("anyOf", Schema.draft4().$ref("#/definitions/schemaArray"))
        .optionalProperty("oneOf", Schema.draft4().$ref("#/definitions/schemaArray"))
        .optionalProperty("not",   Schema.draft4().$ref("#"))
      }
  },
        .dependencies(){
        .exclusiveMaximum(["maximum"],
        .exclusiveMinimum(["minimum"]
  },
        .default(){}
  }
  }
}
