package org.juggl.tutorials.inheritance.enums;

import java.io.Serializable;

public enum HttpVerbs implements Verbs {
	GET     (1),
	POST    (2),
	PUT     (3),
	PATCH   (4),
	OPTIONS (5),
	DELETE  (6);

	// SNIP

	private final int id;

	HttpVerbs(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}
}
