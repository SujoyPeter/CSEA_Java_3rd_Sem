package oops;
class Animal{
	void eat() {
		System.out.println("Eating from Animal");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking from Dog");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog jimmy = new Dog();
		jimmy.bark();
		jimmy.eat();
	}

}
