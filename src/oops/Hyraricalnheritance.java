package oops;
class Animalss{
	void eat() {
		System.out.println("Eating From Animal");
	}
}
class Dogss extends Animalss{
	void bark() {
		System.out.println("Barking from Dog");
	}
}
class Cat extends Animalss{
	void meow() {
		System.out.println("Meowing From Cat");
	}
}
public class Hyraricalnheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat Casper = new Cat();
		Casper.eat();
		Casper.meow();
		Dogss Newtu = new Dogss();
		Newtu.bark();
		Newtu.eat();
	}

}
