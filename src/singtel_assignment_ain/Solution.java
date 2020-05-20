package singtel_assignment_ain;


public class Solution {
	
	public static void main(String[] args) {
		//bird
		System.out.println("---Bird---");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		//duck
		System.out.println("\n---Duck---");
		Duck duck = new Duck();
		duck.sing();
		duck.swim();
		
		//chicken
		System.out.println("\n---Chicken---");
		Chicken chicken = new Chicken();
		chicken.sing();
		chicken.fly();
		
		//rooster
		System.out.println("\n---Rooster with inheritance---");
		Rooster rooster = new Rooster();
		rooster.sing();
		
		//rooster without inheritance, it uses anonymous inner class instead
		System.out.println("\n---Rooster with anonymous inner class---");
		RoosterWOInheritance roosterWOInheritance = new RoosterWOInheritance();
		roosterWOInheritance.chicken.sing();
		
		//Parrot
		System.out.println("\n---Parrots making different sounds---");
		Parrot parrot = new Parrot();
		//Parrot living with a dog
		parrot.parrotSings("Dog");
		parrot.sing();
		//Parrot living with a cat
		parrot.parrotSings("Cat");
		parrot.sing();
		//Parrot living with a Rooster
		parrot.parrotSings("Rooster");
		parrot.sing();
		
		//Fish
		System.out.println("\n---Fish---");
		Fish fish = new Fish();
		fish.sing();
		fish.walk();
		fish.swim();
		
		//Shark
		System.out.println("\n---Shark---");
		Shark shark = new Shark();
		shark.size();
		shark.colour();
		shark.behaviour();
		
		//Clownfish
		System.out.println("\n---Clownfish---");
		Clownfish clownfish = new Clownfish();
		clownfish.size();
		clownfish.colour();
		clownfish.behaviour();

		
		//Dolphin
		System.out.println("\n---Dolphin---");
		Dolphin dolphin = new Dolphin();
		dolphin.swim();

		
		System.out.println("\n---Butterfly---");
		Butterfly butterfly = new Butterfly();
		butterfly.setAmButterfly(true);
		butterfly.sing();
		butterfly.fly();
		butterfly.walk();
		butterfly.swim();
		System.out.println("\n---Caterpillar---");
		butterfly.setAmButterfly(false);
		butterfly.sing();
		butterfly.fly();
		butterfly.walk();
		butterfly.swim();
		
		Animal[] animals = new Animal[]{
				 new Duck(),
				 new Chicken(),
				 new Rooster(),
				 new Parrot(),
				 new Shark(),
				 new Clownfish(),
				 new Dolphin(),
				 new Dog(),
				 new Butterfly(),
				 new Cat()
		};
		
		int walkCounter = 0, flyCounter = 0, swimCounter = 0, singCounter = 0;
		
		for(Animal a : animals) {
			if(a.walk() == true) {
				walkCounter++;
			}if(a.fly() == true) {
				flyCounter++;
			}if(a.swim() == true) {
				swimCounter++;
			}if(a.canSing() == true) {
				singCounter++;
			}
		}
		
		
		System.out.println("Animals that can walk: > " + walkCounter);
		System.out.println("Animals that can walk: Butterfly, Cat, Chicken, Dog, Parrot, Rooster, Duck");
		System.out.println("Animals that can fly: > " + flyCounter);
		System.out.println("Animals that can fly: Butterfly, Parrot, Rooster");
		System.out.println("Animals that can swim: > " + swimCounter);
		System.out.println("Animals that can swim: Duck, Dog, Cat, Shark, Clownfish, Chicken, Rooster, Dolphin, Parrot");
		System.out.println("Animals that can sing: > " + singCounter);
		System.out.println("Animals that can sing: Cat, Chicken, Dog, Dolphin, Duck, Parrot, Rooster");
	}

}
