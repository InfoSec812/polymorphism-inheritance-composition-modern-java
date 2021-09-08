package org.juggl.tutorials.inheritance.multi;

public interface Duck {

	default void layEgg() {
		System.out.println("Laid an egg");
	}

	default void speak() {
		System.out.println("Quack");
	}
}
