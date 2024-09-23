package introduction;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int data = 100/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("Inside Finally");
		}
		System.out.println("Rest of Code");
	}

}
