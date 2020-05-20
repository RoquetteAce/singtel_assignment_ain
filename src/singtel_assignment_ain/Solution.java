package singtel_assignment_ain;


public class Solution {

	public static void main(String[] args) {
		
		//bird
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		//duck
		Duck duck = new Duck();
		duck.sing();
		duck.swim();
		
		//chicken
		Chicken chicken = new Chicken();
		chicken.sing();
		chicken.fly();
		
		//rooster
		Rooster rooster = new Rooster();
		rooster.sing();
		
		//rooster without inheritance, it uses anonymous inner classes instead
		RoosterWOInheritance roosterWOInheritance = new RoosterWOInheritance();
		roosterWOInheritance.chicken.sing();
	}

}
