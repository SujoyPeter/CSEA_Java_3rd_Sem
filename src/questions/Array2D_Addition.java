package questions;

public class Array2D_Addition {
public static void main(String [] args) {
	int arr[][]= {{1,2,3},{4,5,6},{6,7,8}};
	int arr1[][]= {{10,11,12},{13,14,15},{16,17,18}};
	int arr2[][]= new int[3][3];
	for(int i =0; i<arr.length;i++) {
		for (int j=0; j<arr.length;j++) {
			arr2[i][j]=arr[i][j]+ arr1[i][j];
			System.out.print(arr2[i][j] + " ");
		}
		System.out.println();
	}
	}
}
