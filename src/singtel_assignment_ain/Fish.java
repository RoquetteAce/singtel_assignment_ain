package singtel_assignment_ain;

public class Fish implements Animal {

	@Override
	public boolean walk() {
		System.out.println("I cannot walk");
		return false;
	}

	@Override
	public String sing() {
		String sing = "I do not sing";
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
	
	
	public void size() {
		System.out.println("Am I big or small?");
	}
	
	public void colour() {
		System.out.println("What colour am I?");
	}
	
	public void behaviour() {
		System.out.println("What do I usually do?");
	}

	@Override
	public boolean canSing() {
		// TODO Auto-generated method stub
		return false;
	}


	

}
