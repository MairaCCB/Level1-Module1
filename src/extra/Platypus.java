package extra;

public class Platypus {
	private String name;

	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public Platypus(String n) {
		this.name = n;
	}
}
