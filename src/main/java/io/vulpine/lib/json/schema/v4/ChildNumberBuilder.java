package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P> parent type
 */
public interface ChildNumberBuilder<P extends SchemaNode>
extends NumberBuilder<ChildNumberBuilder<P>>, ChildBuilder<P>
{}