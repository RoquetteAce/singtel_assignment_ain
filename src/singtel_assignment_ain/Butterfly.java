package singtel_assignment_ain;

public class Butterfly implements Animal{
	AnimalCounter AC = new AnimalCounter();
	private boolean amButterfly;
	String walk;
	String fly;

	public void setAmButterfly(boolean amButterfly) {
		this.amButterfly = amButterfly;
	}
	

	@Override
	public boolean walk() {
		if(amButterfly== true) {
			walk = "I can walk";
			System.out.println(walk);
		} else {
			walk="I can crawl";
			System.out.println(walk);
		}
		return true;
	}

	@Override
	public String sing() {
		String sing = "I do not make a sound";
		System.out.println(sing);
		return sing;
	}

	@Override
	public boolean fly() {
		if(amButterfly== true) {
			fly = "I am flying";
			System.out.println(fly);
			return true;
		} else {
			fly="I cannot fly";
			System.out.println(fly);
			return false;
		}
		
	}

	@Override
	public boolean swim() {
		System.out.println("I cannot swim");
		return false;
	}
	


	@Override
	public boolean canSing() {
		return false;
	}

	

}
