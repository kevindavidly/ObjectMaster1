package com.codingdojo.objectmaster1;

public class HumanTest {
	public static void main(String[] args) {
		Human ninja = new Human("Naruto");
		Human samurai = new Human("Ryu");
		Human wizard = new Human("Matt");
		
		wizard.attack(ninja);
		samurai.attack(ninja);
		ninja.attack(samurai);
}
}