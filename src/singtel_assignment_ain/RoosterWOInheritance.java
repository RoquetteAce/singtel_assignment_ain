package singtel_assignment_ain;

public class RoosterWOInheritance {
	Chicken chicken = new Chicken() {
		@Override
		public void walk() {
			System.out.println("I am walking");

		}

		@Override
		public void sing() {
			System.out.println("Coock-a-doodle-doo");

		}

		@Override
		public void fly() {
			System.out.println("I am not strong at flying");

		}

		@Override
		public void swim() {
			System.out.println("I am not a strong swimmer");
			
		}
	};
}
