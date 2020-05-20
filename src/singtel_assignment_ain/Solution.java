package singtel_assignment_ain;


class Animal {
	void walk() {
		System.out.println("Can I walk?");
	}
	void sing() {
		System.out.println("Can I sing?");
	}
	void fly() {
		System.out.println("Can I fly?");
	}
}

class Bird extends Animal {
	@Override
	void walk() {
		System.out.println("I am walking");
	}
	@Override
	void sing() {
		System.out.println("I am singing");
	}
	@Override
	void fly() {
		System.out.println("I am flying");
	}
}

public class Solution {

	public static void main(String[] args) {
		
		//bird
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}

}
