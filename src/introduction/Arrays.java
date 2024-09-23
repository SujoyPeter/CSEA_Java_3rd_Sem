package introduction;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		arr[0]= 10;
		arr[1]= 15;
		arr[2]= 20;
		arr[3]= 25;
		arr[4]= 30;
		int arr2[] = {22,45,33,45,50};
//		for(int i =0; i<arr.length;i++) {
//			arr[i]= sc.nextInt();
//		}
//		System.out.println(arr[4]);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
