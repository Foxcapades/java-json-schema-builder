package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P> parent type
 */
public interface ChildNullBuilder<P extends SchemaNode>
extends NullBuilder<ChildNullBuilder<P>>, ChildBuilder<P>
{}
