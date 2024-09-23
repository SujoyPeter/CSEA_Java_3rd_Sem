package oops;
abstract class Bike{
	abstract void run() ;
	void model() {
		System.out.println("This is a Bike");
	}
}
class BMW extends Bike{
	void run() {
		System.out.println("R-1250 GSA");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW obj = new BMW();
		obj.run();
		obj.model();
	}

}
