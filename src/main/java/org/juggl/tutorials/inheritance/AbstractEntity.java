package org.juggl.tutorials.inheritance;

import java.util.UUID;

public abstract class AbstractEntity implements EntityContract {

	public UUID id = UUID.randomUUID();

}
