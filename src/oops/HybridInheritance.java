package oops;
class Grandfather{
	public void showG() {
		System.out.println("Hello from GrandFather");
	}
}
 class Father extends Grandfather{
	public void showF() {
		System.out.println("Hello from Father");
	}
}
class Son extends Father{
	public void showS() {
		System.out.println("Hello from Son");
	}
}
class Daughter extends Father{
	public void showD() {
		System.out.println("Hello from Daughter");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son sujoy = new Son();
		sujoy.showS();
		sujoy.showF();
		sujoy.showG();
		
	}

}
