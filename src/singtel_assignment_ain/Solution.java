package singtel_assignment_ain;


public class Solution {

	public static void main(String[] args) {
		
		//bird
		System.out.println("---Bird---");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		//duck
		System.out.println("\n---Duck---");
		Duck duck = new Duck();
		duck.sing();
		duck.swim();
		
		//chicken
		System.out.println("\n---Chicken---");
		Chicken chicken = new Chicken();
		chicken.sing();
		chicken.fly();
		
		//rooster
		System.out.println("\n---Rooster with inheritance---");
		Rooster rooster = new Rooster();
		rooster.sing();
		
		//rooster without inheritance, it uses anonymous inner class instead
		System.out.println("\n---Rooster with anonymous inner class---");
		RoosterWOInheritance roosterWOInheritance = new RoosterWOInheritance();
		roosterWOInheritance.chicken.sing();
		
		//Parrot
		System.out.println("\n---Parrots making different sounds---");
		Parrot parrot = new Parrot();
		//Parrot living with a dog
		parrot.parrotSings("Dog");
		parrot.sing();
		//Parrot living with a cat
		parrot.parrotSings("Cat");
		parrot.sing();
		//Parrot living with a Rooster
		parrot.parrotSings("Rooster");
		parrot.sing();
	}

}
