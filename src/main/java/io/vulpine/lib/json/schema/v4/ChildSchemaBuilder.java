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
  ChildSchemaBuilder<P> removeDefaultValue();

  @Override
  ChildSchemaBuilder<P> id(String id);

  @Override
  ChildSchemaBuilder<P> removeId();

  @Override
  ChildSchemaBuilder<P> $schema(String path);

  @Override
  ChildSchemaBuilder<P> remove$Schema();

  @Override
  ChildSchemaBuilder<P> $ref(String path);

  @Override
  ChildSchemaBuilder<P> remove$Ref();

  @Override
  ChildSchemaBuilder<P> description(String desc);

  @Override
  ChildSchemaBuilder<P> removeDescription();

  @Override
  ChildSchemaBuilder<P> title(String title);

  @Override
  ChildSchemaBuilder<P> removeTitle();

  @Override
  default ChildSchemaBuilder<P> clearDefaultValue()
  {
    return removeDefaultValue();
  }

  @Override
  default ChildSchemaBuilder<P> clearId()
  {
    return removeId();
  }

  @Override
  default ChildSchemaBuilder<P> clear$Schema()
  {
    return remove$Schema();
  }

  @Override
  default ChildSchemaBuilder<P> clear$Ref()
  {
    return remove$Ref();
  }

  @Override
  default ChildSchemaBuilder<P> clearDescription()
  {
    return removeDescription();
  }

  @Override
  default ChildSchemaBuilder<P> clearTitle()
  {
    return removeTitle();
  }

  @Override
  default ChildSchemaBuilder<P> clearEnumValues()
  {
    return removeEnumValues();
  }

  @Override
  ChildSchemaBuilder<P> removeEnumValues();
}
