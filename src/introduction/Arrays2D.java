package introduction;

import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr= new int[3][3];
//		arr[0][0]=1;
//		arr[0][1]=2;
//		arr[0][2]=3;
//		arr[1][0]=4;
//		arr[1][1]=5;
//		arr[1][2]=6;
//		arr[2][0]=7;
//		arr[2][1]=8;
//		arr[2][2]=9;
//		int arr[][] = {{1,2,3},{4,5,6},{6,7,8}};
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}	
			System.out.println();
		}
	}
}
