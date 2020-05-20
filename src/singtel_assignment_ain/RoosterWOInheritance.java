package singtel_assignment_ain;

public class RoosterWOInheritance {
	Chicken chicken = new Chicken() {
		@Override
		public boolean walk() {
			System.out.println("I am walking");
			return true;
		}

		@Override
		public String sing() {
			String sing = "Cock-a-doodle-doo";
			System.out.println(sing);
			return sing;

		}

		@Override
		public boolean fly() {
			System.out.println("I am not strong at flying");
			return true;
		}

		@Override
		public boolean swim() {
			System.out.println("I am not a strong swimmer");
			return true;
		}
		
		@Override
		public boolean canSing() {
			// TODO Auto-generated method stub
			return true;
		}
	};
}
