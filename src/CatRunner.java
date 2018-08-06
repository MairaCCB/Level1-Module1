
public class CatRunner {
	public static void main(String[] args) {
		Cat c = new Cat("Simba");

		c.meow();
		c.printName();

		while (c.getLives() > 0) {
			c.kill();
		}

	}
}
