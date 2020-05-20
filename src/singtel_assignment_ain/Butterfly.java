package singtel_assignment_ain;

public class Butterfly implements Animal{
	
	private boolean amButterfly;
	String walk;
	String fly;
	
	public void setAmButterfly(boolean amButterfly) {
		this.amButterfly = amButterfly;
	}
	

	@Override
	public void walk() {
		if(amButterfly== true) {
			walk = "I can walk";
			System.out.println(walk);
		} else {
			walk="I can crawl";
			System.out.println(walk);
		}
		
	}

	@Override
	public String sing() {
		String sing = "I do not make a sound";
		System.out.println(sing);
		return sing;
	}

	@Override
	public void fly() {
		if(amButterfly== true) {
			fly = "I am flying";
			System.out.println(fly);
		} else {
			fly="I cannot fly";
			System.out.println(fly);
		}
		
	}

	@Override
	public void swim() {
		System.out.println("I cannot swim");
	}



}
