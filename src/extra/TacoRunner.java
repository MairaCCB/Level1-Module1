package extra;

public class TacoRunner {
	public static void main(String[] args) {
		Taco t1 = new Taco("chicken", "tomato");
		System.out.println("My taco has " + t1.getMeat() + " and " + t1.getSauce());

		t1.setMeat("cheese");
		t1.setSauce("ranch");
		System.out.println("My taco has " + t1.getMeat() + " and " + t1.getSauce());
	}
}
