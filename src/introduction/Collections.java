package introduction;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> su = new ArrayList<>();
		su.add("Mango");
		su.add("Apple");
		su.add("Banana");
//		System.out.println(su);
//		System.out.println(su.get(1));
		su.set(0, "Pineapple");
		su.set(1, "Orange");
//		System.out.println(su);
		su.add("Water Melon");
		for(int i = 0; i<su.size();i++) {
			System.out.println(su.get(i));
		}
	}

}
