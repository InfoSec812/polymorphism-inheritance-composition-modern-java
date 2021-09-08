package org.juggl.tutorials.inheritance.multi;

public interface Mammal {

	default void lactate() {
		System.out.println("Lactating");
	}

	default void speak() {
		System.out.println("Squeak");
	}
}
