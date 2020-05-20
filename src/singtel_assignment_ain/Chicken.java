package singtel_assignment_ain;

public class Chicken extends Bird{
	
	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

	@Override
	public String sing() {
		String sing = "Cluck, cluck";
		System.out.println(sing);
		return sing;
	}

	@Override
	public boolean fly() {
		System.out.println("I cannot fly...");
		return false;
	}

	@Override
	public boolean swim() {
		System.out.println("I am not a strong swimmer");
		return true;
	}
	
	@Override
	public boolean canSing() {
		return true;
	}

}
