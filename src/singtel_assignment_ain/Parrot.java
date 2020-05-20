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
	public void walk() {
		System.out.println("I am walking");

	}

	@Override
	public String sing() {
		//System.out.println(animalSound);
		return animalSound;
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
