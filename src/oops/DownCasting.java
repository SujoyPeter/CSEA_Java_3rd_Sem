package oops;
class Parents{
	String name;
	void showMessage() {
		System.out.println("Inside Parent");
	}
}
class Childs extends Parents{
	int age;
	void showMessage() {
		System.out.println("Inside Child");
	}
}
public class DownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p = new Childs();
		p.name = "Shubham";
		
//		Childs c = new Parents();
		Childs c = (Childs)p;
		c.age =18;
		System.out.println(c.name);
		System.out.println(c.age);
		c.showMessage();
	}

}
