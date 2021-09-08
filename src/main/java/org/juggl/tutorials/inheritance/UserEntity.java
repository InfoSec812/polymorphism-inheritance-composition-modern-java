package org.juggl.tutorials.inheritance;

import java.io.Serializable;
import java.util.UUID;

public class UserEntity extends AbstractEntity implements Serializable {

	// SNIP

	public static final String USER = "user";

	protected String username;

	public UserEntity(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String getName() {
		return USER;
	}

	@Override
	public UUID getId() {
		return id;
	}
}
