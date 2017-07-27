package animalclass;

/*This is the child class that inherits properties 
from its parent class*/

public class Dog extends Animal {
	public Dog() {
		System.out.println("A new  animal 'dog' has been created!");
	}
	@Override
	public String sleep() {
		return "A dog sleeps...";
	}
	
	@Override
	public String eat() {
		return "A dog eats...";
	}
	public String wag() {
		return "A dog wags its tail!";
	}
	public String bark() {
		return "A dog barks 'woof' 'woof'";
	}
}
