package oops;
class Parent {
	void PrintData() {
		System.out.println("Inside Parent");
	}
}
class Child extends Parent{
	void PrintData() {
		System.out.println("Inside Child");
	}
}
public class UpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj1 = new Child();
		obj1.PrintData();
	}

}
