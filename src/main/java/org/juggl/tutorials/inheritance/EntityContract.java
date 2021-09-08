package org.juggl.tutorials.inheritance;

import java.io.Serializable;
import java.util.UUID;

public interface EntityContract extends Serializable {

	public String getName();

	public UUID getId();

}
