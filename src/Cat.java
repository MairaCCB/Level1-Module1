/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* Do the following things without changing the Cat class */

// Create a CatRunner class with a main method that creates a Cat object.

// 1. Make the Cat meow

// 2. Get the Cat to print it's name

// 3. Kill the Cat!

public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("MEEEEEEEOOOOOOOOWWWWWWW!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("I don't know my own name!");
		else
			System.out.println("My name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("Nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("That's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public int getLives() {
		return lives;

	}

}
