package singtel_assignment_ain;

public class Parrot extends Bird {
	String animalSound = "";
	private Animal animal;
	public void parrotSings(String ani) {
		if(ani.equalsIgnoreCase("Dog")) {
			animal = new Dog();
			animalSound = animal.sing();
		} else if (ani.equalsIgnoreCase("Rooster")) {
			animal = new Rooster();
			animalSound = animal.sing();
		} else if (ani.equalsIgnoreCase("Cat")) {
			animal = new Cat();
			animalSound = animal.sing();
		} else {
			animalSound = "Invalid option";
		}
	}
	
	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

	@Override
	public String sing() {
		//System.out.println(animalSound);
		return animalSound;
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
