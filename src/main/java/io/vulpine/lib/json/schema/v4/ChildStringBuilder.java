package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P> parent type
 *
 * @since 1.0
 */
public interface ChildStringBuilder<P extends SchemaNode>
extends StringBuilder<ChildStringBuilder<P>>, ChildBuilder<P> {}
