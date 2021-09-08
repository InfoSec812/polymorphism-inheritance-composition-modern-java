package org.juggl.tutorials.inheritance;

import java.util.Random;

public class AdminUser extends UserEntity implements Administrator {

	private final String adminKey;
	public static final String ADMIN = "admin";

	public AdminUser(String username) {
		super(username);
		this.adminKey = generateAdminKey();
	}

	public String adminKey() {
		return this.adminKey;
	}

	private String generateAdminKey() {
		int leftLimit = 65; // letter 'a'
		int rightLimit = 90; // letter 'z'
		int targetStringLength = 24;
		Random random = new Random();

		return random.ints(leftLimit, rightLimit + 1)
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}
}
