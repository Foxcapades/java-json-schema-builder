package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P>
 *   parent type
 *
 * @since 1.0
 */
public interface ChildIntegerBuilder<P extends SchemaNode>
extends IntegerBuilder<ChildIntegerBuilder<P>>, ChildBuilder<P>
{}
