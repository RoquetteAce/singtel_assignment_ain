package test;

import org.junit.Test;

import singtel_assignment_ain.Butterfly;
import singtel_assignment_ain.Cat;
import singtel_assignment_ain.Clownfish;
import singtel_assignment_ain.Dog;
import singtel_assignment_ain.Dolphin;
import singtel_assignment_ain.Fish;
import singtel_assignment_ain.Shark;



public class AnimalTest {
	@Test
	public void ButterflyTest() {
		System.out.println("\n---Butterfly---");
		Butterfly butterfly = new Butterfly();
		butterfly.setAmButterfly(true);
		butterfly.sing();
		butterfly.fly();
		butterfly.walk();
		butterfly.swim();
		System.out.println("\n---Caterpillar---");
		butterfly.setAmButterfly(false);
		butterfly.sing();
		butterfly.fly();
		butterfly.walk();
		butterfly.swim();
		System.out.println("===");
	}
	
	@Test
	public void CatTest() {
		Cat cat = new Cat();
		System.out.println("I am a cat, I should be able to walk, sing, swim but I cannot fly");
		cat.sing();
		cat.swim();
		cat.walk();
		cat.fly();
		System.out.println("===");
	}
	
	@Test 
	public void DogTest() {
		Dog dog = new Dog();
		System.out.println("I am a dog, I should be able to walk, sing, swim but I cannot fly");
		dog.sing();
		dog.swim();
		dog.walk();
		dog.fly();
		System.out.println("===");
	}
	
	@Test 
	public void DolphinTest() {
		Dolphin dolphin = new Dolphin();
		System.out.println("I am a dog, I should be able to sing, swim but I cannot fly and walk");
		dolphin.sing();
		dolphin.swim();
		dolphin.walk();
		dolphin.fly();
		System.out.println("===");
	}
	
	@Test
	public void FishTest() {
		System.out.println("\n---Fish---");
		Fish fish = new Fish();
		fish.sing();
		fish.walk();
		fish.swim();
	}
	
	@Test
	public void ClownfishTest() {
		System.out.println("\n---Clownfish---");
		Clownfish clownfish = new Clownfish();
		clownfish.size();
		clownfish.colour();
		clownfish.behaviour();
	}
	
	@Test
	public void SharkTest() {
		System.out.println("\n---Shark---");
		Shark shark = new Shark();
		shark.size();
		shark.colour();
		shark.behaviour();
	}
}
