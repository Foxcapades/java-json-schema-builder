package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import io.vulpine.lib.json.schema.SchemaBuilder;
import io.vulpine.lib.json.schema.v4.lib.ChildSchema;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface ArrayChildSchema<P extends SchemaBuilder>
extends ArraySchema, ChildSchema<P>
{
  // Return Type Overrides
  @Override
  ArrayChildSchema<P> defaultValue(ArrayNode node);

  @Override
  ArrayChildSchema<P> defaultValue(String... node);

  @Override
  ArrayChildSchema<P> defaultValue(Object[] node);

  @Override
  ArrayChildSchema<P> defaultValue(boolean... node);

  @Override
  ArrayChildSchema<P> defaultValue(byte... node);

  @Override
  ArrayChildSchema<P> defaultValue(double... node);

  @Override
  ArrayChildSchema<P> defaultValue(float... node);

  @Override
  ArrayChildSchema<P> defaultValue(int... node);

  @Override
  ArrayChildSchema<P> defaultValue(long... node);

  @Override
  ArrayChildSchema<P> defaultValue(short... node);

  @Override
  ArrayChildSchema<P> defaultValue(BigInteger... node);

  @Override
  ArrayChildSchema<P> defaultValue(BigDecimal... node);

  @Override
  ArrayChildSchema<P> maxItems(BigInteger val);

  @Override
  ArrayChildSchema<P> maxItems(int val);

  @Override
  ArrayChildSchema<P> removeMaxItems();

  @Override
  ArrayChildSchema<P> minItems(BigInteger val);

  @Override
  ArrayChildSchema<P> minItems(int val);

  @Override
  ArrayChildSchema<P> removeMinItems();

  @Override
  UntypedChildSchema<? extends ArrayChildSchema<P>> additionalItems();

  @Override
  ArrayChildSchema<P> additionalItems(SchemaBuilder val);

  @Override
  ArrayChildSchema<P> removeAdditionalItems();

  @Override
  UntypedChildSchema<? extends ArrayChildSchema<P>> items();

  @Override
  SchemaSet<? extends ArrayChildSchema<P>> itemsArray();

  @Override
  ArrayChildSchema<P> items(SchemaBuilder val);

  @Override
  ArrayChildSchema<P> removeItems();

  @Override
  ArrayChildSchema<P> enumValues(ArrayNode... vals);

  @Override
  ArrayChildSchema<P> uniqueItems(boolean flag);

  @Override
  ArrayChildSchema<P> removeUniqueItems();

  @Override
  ArrayChildSchema<P> id(String id);

  @Override
  ArrayChildSchema<P> removeId();

  @Override
  ArrayChildSchema<P> $schema(String path);

  @Override
  ArrayChildSchema<P> remove$Schema();

  @Override
  ArrayChildSchema<P> $ref(String path);

  @Override
  ArrayChildSchema<P> remove$Ref();

  @Override
  ArrayChildSchema<P> description(String desc);

  @Override
  ArrayChildSchema<P> removeDescription();

  @Override
  ArrayChildSchema<P> title(String title);

  @Override
  ArrayChildSchema<P> removeTitle();

  @Override
  BooleanChildSchema<P> orAsBoolean();

  @Override
  IntegerChildSchema<P> orAsInteger();

  @Override
  NullChildSchema<P> orAsNull();

  @Override
  NumberChildSchema<P> orAsNumber();

  @Override
  ObjectChildSchema<P> orAsObject();

  @Override
  StringChildSchema<P> orAsString();

  @Override
  ArrayChildSchema<P> removeDefault();

  @Override
  ArrayChildSchema<P> removeEnum();

  @Override
  UntypedChildSchema<? extends ArrayChildSchema<P>> definition(String name);

  @Override
  ArrayChildSchema<P> definition(String name, SchemaBuilder schema);

  @Override
  ArrayChildSchema<P> removeDefinition(String name);

  @Override
  ArrayChildSchema<P> removeDefinitions();

  @Override
  ArrayChildSchema<P> defaultValue(JsonNode val);

  @Override
  UntypedChildSchema<? extends ArrayChildSchema<P>> not();

  @Override
  ArrayChildSchema<P> maxItems(long val);

  @Override
  ArrayChildSchema<P> minItems(long val);
}
