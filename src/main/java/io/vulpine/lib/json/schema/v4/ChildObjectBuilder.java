package io.vulpine.lib.json.schema.v4;

import io.vulpine.lib.json.schema.v4.lib.ChildBuilder;

/**
 * @param <P> parent type
 */
public interface ChildObjectBuilder<P extends SchemaNode>
extends ObjectBuilder<ChildObjectBuilder<P>>, ChildBuilder<P> {}
