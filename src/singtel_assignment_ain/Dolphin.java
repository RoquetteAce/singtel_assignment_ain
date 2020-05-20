package singtel_assignment_ain;

public class Dolphin implements Animal{

	@Override
	public void swim() {
		System.out.println("I am a mammal but I can swim really well");
		
	}

	@Override
	public void walk() {
		System.out.println("I cannot walk");
		
	}

	@Override
	public String sing() {
		String sing = "I am whistling";
		System.out.println(sing);
		return sing;
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly");
		
	}

	
	
}

