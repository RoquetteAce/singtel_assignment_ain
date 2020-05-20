package singtel_assignment_ain;

public class Duck extends Bird{

	@Override
	public void walk() {
		System.out.println("I am walking");

	}

	@Override
	public void sing() {
		System.out.println("Quack, quack");

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
