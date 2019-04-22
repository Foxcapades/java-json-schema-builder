package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P> parent type
 */
public interface ChildSchemaBuilder<P extends SchemaNode>
extends SchemaObject<ChildSchemaBuilder<P>>, ChildBuilder<P>
{
  ChildArrayBuilder<P> asArray();
  ChildBooleanBuilder<P> asBoolean();
  ChildIntegerBuilder<P> asInteger();
  ChildNullBuilder<P> asNull();
  ChildNumberBuilder<P> asNumber();
  ChildObjectBuilder<P> asObject();
  ChildStringBuilder<P> asString();

  @Override
  ChildSchemaBuilder<P> clearDefaultValue();

  @Override
  ChildSchemaBuilder<P> id(String id);

  @Override
  ChildSchemaBuilder<P> clearId();

  @Override
  ChildSchemaBuilder<P> $schema(String path);

  @Override
  ChildSchemaBuilder<P> clear$Schema();

  @Override
  ChildSchemaBuilder<P> $ref(String path);

  @Override
  ChildSchemaBuilder<P> clear$Ref();

  @Override
  ChildSchemaBuilder<P> description(String desc);

  @Override
  ChildSchemaBuilder<P> clearDescription();

  @Override
  ChildSchemaBuilder<P> title(String title);

  @Override
  ChildSchemaBuilder<P> clearTitle();
}
