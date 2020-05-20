package singtel_assignment_ain;

public class Cat implements Animal {

	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

	@Override
	public String sing() {
		String sing = "Meow";
		System.out.println(sing);
		return sing;
	}

	@Override
	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
	}

	@Override
	public boolean swim() {
		System.out.println("I am swimming");
		return true;
	}

	@Override
	public boolean canSing() {

		return true;
	}


}
