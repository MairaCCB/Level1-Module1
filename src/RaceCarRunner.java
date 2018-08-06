
public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */

		// 1. Create a RaceCar and place it in 5th position
		RaceCar r = new RaceCar("Bugatti Veyron", 5);
		// 2. Print the RaceCar's position in the race
		System.out.println("Your position in the race is " + r.getPositionInRace() + ". Let the race begin!");
		// 3. Crash the RaceCar
		r.crash();
		System.out.println("Your position in the race is " + r.getPositionInRace());
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (r.isDamaged()) {
			r.pit();
		}
		// 5. Help the car move into first place.
		while (r.getPositionInRace() > 1) {
			r.overtake();
		}
	}
}
