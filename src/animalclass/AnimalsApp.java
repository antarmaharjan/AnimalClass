package animalclass;

public class AnimalsApp {

	public static void main(String[] args) {
		
		//Creating an animal object
		Animal a = new Animal();
		//Calling all methods
		print(a.eat());
		print(a.sleep());
		
		//Creating a new  dog object
		Dog d = new Dog();
		//Calling all methods
		print(d.wag());
		print(d.eat());
		print(d.sleep());
		print(d.bark());
		
		//Creating a new object fox
		Fox f=new Fox();
		//Calling the all methods
		print(f.eat());
		print(f.howl());
		print(f.sleep());
		print(f.stare());
		

		
	}
	private static void print(String s){
		System.out.println(s);
	}
}
		

	