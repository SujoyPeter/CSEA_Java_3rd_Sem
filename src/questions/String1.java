package questions;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sujoy";
		String ans = "";
		char ch;
		for(int i=0; i<str.length();i++) {
			ch=str.charAt(i);
			ans = ch + ans ;
		}
		System.out.println(ans);
	}

}
