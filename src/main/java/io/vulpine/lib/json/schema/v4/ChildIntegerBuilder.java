package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P> parent type
 */
public interface ChildIntegerBuilder<P extends SchemaNode>
extends IntegerBuilder<ChildIntegerBuilder<P>>, ChildBuilder<P>
{}
