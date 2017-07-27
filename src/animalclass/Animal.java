package animalclass;

/*
 * This is the parent class. Also called the super class or base class
 */
public class Animal {
	public Animal() {
		System.out.println("An animal has been created!");
	}
	public String sleep() {
		return "An animal sleeps...";
	}
	public String eat() {
		return "An animal eats...";
	}
}