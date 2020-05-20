package singtel_assignment_ain;

public class Duck extends Bird{

	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

	@Override
	public String sing() {
		String sing = "Quack, quack";
		System.out.println(sing);
		return sing;
	}

	@Override
	public boolean fly() {
		System.out.println("I am flying");
		return true;
	}

	@Override
	public boolean swim() {
		System.out.println("I am swimming");
		return true;
	}
	
	@Override
	public boolean canSing() {
		// TODO Auto-generated method stub
		return true;
	}


}
