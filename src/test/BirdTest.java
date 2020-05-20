package test;

import org.junit.Test;

import singtel_assignment_ain.Bird;

public class BirdTest {
	
	Bird bird = new Bird();
	
	@Test
	public void birdTest() {
		System.out.println("I am a bird, I should be able to walk, fly and sing");
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
