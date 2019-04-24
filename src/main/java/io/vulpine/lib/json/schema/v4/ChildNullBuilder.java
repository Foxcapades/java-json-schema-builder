package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P> parent type
 *
 * @since 1.0
 */
public interface ChildNullBuilder<P extends SchemaNode>
extends NullBuilder<ChildNullBuilder<P>>, ChildBuilder<P>
{}
