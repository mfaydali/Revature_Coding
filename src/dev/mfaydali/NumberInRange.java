package dev.mfaydali;

import java.util.Scanner;

// Algorithm: Check if Number is within Range
// Gina considers all the numbers between a certain range L and R, inclusive, as her favorite numbers.
// Given an array of elements, find the number of elements in an array which is her favorite.

//Input Format
//The code provided, handles the input and stores them in variables for you.
//The first line contains 2 space-separated integers L and R.
//The second line contains an integer N, the size of the array.
//The third line contains space-separated N integers, the elements of the array A.

public class NumberInRange {
	public static int favorite(int L, int R, int N, int A[]) {

		// int result=-404;

		// L and R >> is the range

		// N >> size of the array

		// A >> integer array

		// Write Your Logic Here:

		int result = 0; // Let's count favorite numbers

		// for(int i=0; i<A.length; i++){

		// int x = A[i];

		// if(L<=x && x<=R){

		// result++;

		// }

		// }

		// for-each loop

		for (int i : A) {

			if (L <= i && i <= R)

				result++;

		}

		return result;

	}

	public static void main(String[] args) {

		// INPUT [uncomment & modify if required]

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();

		int R = sc.nextInt();

		int N = sc.nextInt();

		int A[] = new int[N];

		for (int i = 0; i < N; i++) {

			A[i] = sc.nextInt();

		}
		sc.close();

		// OUTPUT [uncomment & modify if required]

		System.out.print(favorite(L, R, N, A));

	}

}