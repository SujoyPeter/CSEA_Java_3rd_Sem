package oops;
interface printable{
	void print() ;
	void eat();
}
interface doable{
	void drink();
}
class ayub {
	void walk() {
		System.out.println("Hello from walk");
	}
}
class Ayush extends ayub implements printable,doable{
	public void print() {
		System.out.println("Hello");
	}
	public void eat() {
		System.out.println("Hello from eat");
	}
	public void drink() {
		System.out.println("Hello from drink");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ayush obj = new Ayush();
		obj.print();
		obj.eat();
		obj.drink();
		obj.walk();
	}

}
