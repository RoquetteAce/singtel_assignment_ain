package singtel_assignment_ain;

public class Dolphin implements Animal{

	@Override
	public boolean swim() {
		System.out.println("I am a mammal but I can swim really well");
		return true;
	}

	@Override
	public boolean walk() {
		System.out.println("I cannot walk");
		return false;
	}

	@Override
	public String sing() {
		String sing = "I am whistling";
		System.out.println(sing);
		return sing;
	}

	@Override
	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
	}

	@Override
	public boolean canSing() {
		// TODO Auto-generated method stub
		return true;
	}

	
	
}

