package org.juggl.tutorials.inheritance;

import org.juggl.tutorials.inheritance.multi.Platypus;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<EntityContract> users = new ArrayList<>();

		users.add(new AdminUser("Diana"));
		users.add(new UserEntity("James"));
		users.add(new AdminUser("Billy"));
		users.add(new AdminUser("Eve"));
		users.add(new UserEntity("Emily"));

		for(var user: users) {
			if (user instanceof AdminUser a) {
				System.out.println("%s is an admin with key %s".formatted(a.getUsername(), a.adminKey()));
			} else if (user instanceof UserEntity e) {
				System.out.println("%s is not an admin user.".formatted(e.getUsername()));
			} else {
				System.out.println("HOW DID WE GET HERE?!?!");
			}
		}

		Platypus duckMammal = new Platypus();

		duckMammal.lactate();
		duckMammal.layEgg();
		duckMammal.speak();
	}
}
