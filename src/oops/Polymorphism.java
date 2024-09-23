package oops;

public class Polymorphism {
public static int add(int a, int b) {
	return a+b;
}
public static int add(int a, int b, int c) {
	return a+b+c;
}
public static double add(double a, double b) {
	return  a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(4.0,5.5));
	}

}
