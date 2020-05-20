package test;

import org.junit.Test;

import singtel_assignment_ain.Bird;
import singtel_assignment_ain.Chicken;
import singtel_assignment_ain.Duck;
import singtel_assignment_ain.Rooster;

public class BirdTest {
	
	Bird bird = new Bird();
	
	@Test
	public void birdTest() {
		System.out.println("I am a bird, I should be able to walk, fly and sing");
		bird.walk();
		bird.fly();
		bird.sing();
		bird.swim();
		System.out.println("===");
	}
	
	@Test
	public void duckTest() {
		Duck duck = new Duck();
		System.out.println("I am a duck, I should be able to walk, fly, sing and swim");
		duck.sing();
		duck.swim();
		duck.walk();
		duck.fly();
		System.out.println("===");

	}
	
	@Test
	public void chickenTest() {
		Chicken chicken = new Chicken();
		System.out.println("I am a chicken, I should be able to walk, sing, I cannot fly and I am not a strong swimmer");
		chicken.sing();
		chicken.swim();
		chicken.walk();
		chicken.fly();
		System.out.println("===");

	}
	
	@Test
	public void roosterTest() {
		Rooster rooster = new Rooster();
		System.out.println("I am a rooster, I should be able to walk, sing, I am not very strong at flying and swimming");
		rooster.sing();
		rooster.swim();
		rooster.walk();
		rooster.fly();
		System.out.println("===");

	}
}
