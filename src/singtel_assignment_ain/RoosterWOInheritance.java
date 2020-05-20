package singtel_assignment_ain;

public class RoosterWOInheritance {
	Chicken chicken = new Chicken() {
		@Override
		public void walk() {
			System.out.println("I am walking");

		}

		@Override
		public String sing() {
			String sing = "Coock-a-doodle-doo";
			System.out.println(sing);
			return sing;

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
