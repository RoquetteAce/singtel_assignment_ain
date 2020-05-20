package singtel_assignment_ain;

public class Chicken extends Bird{
	
	@Override
	public void walk() {
		System.out.println("I am walking");

	}

	@Override
	public String sing() {
		String sing = "Cluck, cluck";
		System.out.println(sing);
		return sing;
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly...");

	}

	@Override
	public void swim() {
		System.out.println("I am not a strong swimmer");
		
	}
}
