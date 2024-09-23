package oops;
class Test1{
	public void method() {
		System.out.println("Inside Test 1");
	}
}
class Test2 extends Test1 {
	@Override
	public void method() {
		System.out.println("Inside Test 2");
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 cse =  new Test2();
		cse.method();
		Test2 c = (Test2)cse;
		c.method();
	}

}
