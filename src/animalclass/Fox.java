package animalclass;

/*This is the child class that inherits properties 
from its parent class*/

public class Fox extends Animal {
	public Fox() {
		System.out.println("A new animal  'fox' has been created!");
	}
	@Override
	public String sleep() {
		return "A fox sleeps...";
	}
	
	@Override
	public String eat() {
		return "A fox eats...";
	}
	public String howl() {
		return "A fox howls";
	}
	public String stare() {
		return "A fox stares if it sees the light";
	}
}