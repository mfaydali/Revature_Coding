package dev.mfaydali;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxofThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Please enter the element");

		int a[]=new int[size]; // we need create integer array with the "size" that specified.

		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();

		Arrays.sort(a);
		System.out.print("The second largest number: "+a[size-2]);
	}
}




//		int array[] = {10, 20, 25, 63, 96, 57};
//		int size = array.length;
//		Arrays.sort(array);
//		System.out.println("sorted Array ::"+Arrays.toString(array));
//		int res = array[size-2];
//		System.out.println("2nd largest element is ::"+res);
//	}
//}


// Find the second max number of array
//		int max = 0, second_max = 0, temp, numbers;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("How many numbers do you want to enter?");
//		numbers = scanner.nextInt();
//		System.out.println("Enter numbers:");
//
//		for (int i = 0; i < numbers; i++) {
//			if (i == 0) {
//				max = scanner.nextInt();
//			} else {
//				temp = scanner.nextInt();
//				if (temp > max) {
//					second_max = max;
//					max = temp;
//				} else if (temp > second_max) {
//					second_max = temp;
//				}
//			}
//		}
//		scanner.close();
//		System.out.println("Second max number is :" + second_max);
//	}
//}