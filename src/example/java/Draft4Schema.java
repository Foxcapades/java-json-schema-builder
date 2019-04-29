import io.vulpine.lib.json.schema.Schema;

public class Draft4Schema
{
  public static void main(String[] args)
  {
    final var schema = Schema.draft4();
    System.out.println(
      schema.asObject()
        .id("http://json-schema.org/draft-04/schema#")
        .description("Core schema meta-schema")
        .definition("schemaArray")
          .asArray()
          .minItems(1)
          .items(schema.$ref("#"))
          .close()
        .definition("positiveInteger")
          .asInteger()
          .minimum(0)
          .close()
        .definition("positiveIntegerDefault0")
          .allOf()
          .add(
            schema.$ref("#/definitions/positiveInteger"),
            schema.asInteger().defaultValue(0)
          )
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
        .optionalProperty("maxLength", schema.$ref("#/definitions/positiveInteger"))
        .optionalProperty("minLength", schema.$ref("#/definitions/positiveIntegerDefault0"))
        .optionalProperty("pattern", schema.asString().format("regex"))
        .optionalProperty("additionalItems")
          .anyOf()

      ]
    },
        .stringArray(){
        .type("array",
        .items(){ "type("string" },
        .minItems(1,
        .uniqueItems(true
    }
  },
        .type("object",
        .properties(){
        .id(){
        .type("string"
    },
        .$schema(){
        .type("string"
    },
        .title(){
        .type("string"
    },
        .description(){
        .type("string"
    },
        .default(){},
        .multipleOf(){
        .type("number",
        .minimum(0,
        .exclusiveMinimum(true
    },
        .maximum(){
        .type("number"
    },
        .exclusiveMaximum(){
        .type("boolean",
        .default(false
    },
        .minimum(){
        .type("number"
    },
        .exclusiveMinimum(){
        .type("boolean",
        .default(false
    },
        .maxLength(){ "$ref("#/definitions/positiveInteger" },
        .minLength(){ "$ref("#/definitions/positiveIntegerDefault0" },
        .pattern(){
        .type("string",
        .format("regex"
    },
        .additionalItems(){
        .anyOf([{ "type("boolean" }, { "$ref("#" }],
        .default(){}
    },
        .items(){
        .anyOf([{ "$ref("#" }, { "$ref("#/definitions/schemaArray" }],
        .default(){}
    },
        .maxItems(){ "$ref("#/definitions/positiveInteger" },
        .minItems(){ "$ref("#/definitions/positiveIntegerDefault0" },
        .uniqueItems(){
        .type("boolean",
        .default(false
    },
        .maxProperties(){ "$ref("#/definitions/positiveInteger" },
        .minProperties(){ "$ref("#/definitions/positiveIntegerDefault0" },
        .required(){ "$ref("#/definitions/stringArray" },
        .additionalProperties(){
        .anyOf([{ "type("boolean" }, { "$ref("#" }],
        .default(){}
    },
        .definitions(){
        .type("object",
        .additionalProperties(){ "$ref("#" },
        .default(){}
    },
        .properties(){
        .type("object",
        .additionalProperties(){ "$ref("#" },
        .default(){}
    },
        .patternProperties(){
        .type("object",
        .additionalProperties(){ "$ref("#" },
        .default(){}
    },
        .dependencies(){
        .type("object",
        .additionalProperties(){
        .anyOf([{ "$ref("#" }, { "$ref("#/definitions/stringArray" }]
      }
    },
        .enum(){
        .type("array",
        .minItems(1,
        .uniqueItems(true
    },
        .type(){
        .anyOf([
      { "$ref("#/definitions/simpleTypes" },
      {
        .type("array",
        .items(){ "$ref("#/definitions/simpleTypes" },
        .minItems(1,
        .uniqueItems(true
      }
      ]
    },
        .format(){ "type("string" },
        .allOf(){ "$ref("#/definitions/schemaArray" },
        .anyOf(){ "$ref("#/definitions/schemaArray" },
        .oneOf(){ "$ref("#/definitions/schemaArray" },
        .not(){ "$ref("#" }
  },
        .dependencies(){
        .exclusiveMaximum(["maximum"],
        .exclusiveMinimum(["minimum"]
  },
        .default(){}
  }
  }
}
