package singtel_assignment_ain;

public class Fish implements Animal {

	@Override
	public void walk() {
		System.out.println("I cannot walk");

	}

	@Override
	public String sing() {
		String sing = "I do not sing";
		System.out.println(sing);
		return sing;
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly");

	}

	@Override
	public void swim() {
		System.out.println("I am swimming");

	}
	
	public void size() {
		System.out.println("Am I big or small?");
	}
	
	public void colour() {
		System.out.println("What colour am I?");
	}
	
	public void behaviour() {
		System.out.println("What do I usually do?");
	}

}
