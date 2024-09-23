package oops;
class Animals {
	void eat() {
		System.out.println("Eating from Animal");
	}
}
class Dogs extends Animal{
	void bark() {
		System.out.println("Bark from Dog");
	}
	void breed() {
		System.out.println("Breed from Dog");
	}
}
class Pups extends Dogs{
	void weep() {
		System.out.println("Weeping from Pups");
	}

}
public class Multilevelnheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pups newton = new Pups();
		newton.weep();
		newton.bark();
		newton.eat();
		newton.breed();
	}

}
