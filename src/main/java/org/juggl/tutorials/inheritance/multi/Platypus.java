package org.juggl.tutorials.inheritance.multi;

public class Platypus implements Duck, Mammal {

	public void speak() {
		Duck.super.speak();
	}

}
