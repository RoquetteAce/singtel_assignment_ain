package singtel_assignment_ain;

public class Bird implements Animal {

	@Override
	public void walk() {
		System.out.println("I am walking");

	}

	@Override
	public String sing() {
		String sing = "I am singing";
		System.out.println(sing);
		return sing;

	}

	@Override
	public void fly() {
		System.out.println("I am flying");

	}

	@Override
	public void swim() {
		System.out.println("I am swimming");
		
	}

}
