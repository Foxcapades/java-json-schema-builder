package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P>
 *   Parent object type
 *
 * @since 1.0
 */
public interface TypeArrayBuilder<P extends SchemaNode>
extends VariableBuilder<TypeArrayBuilder<P>>, ChildBuilder<P>
{}
