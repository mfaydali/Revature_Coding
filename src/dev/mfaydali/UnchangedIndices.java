package dev.mfaydali;

import java.util.Arrays;
import java.util.Scanner;

//You need to find the number of elements from array A whose positions/indices in the array do not change even after sorting the array in ascending order.
//You are given an unsorted array A of size N. Sort the array in an ascending order.

//Input Format
//The code provided handles the input and stores them in variables for you.
//The first line contains a single integer, N, denoting the number of elements in the array.
//The next line contains N space-separated integers, representing array elements.

public class UnchangedIndices {
	public static int unchangedIndex(int N, int A[]) {

		// this is default OUTPUT. You can change it

		// int result=-404;

		// count the number of arrays whose positions does not change after sorting

		// N >> size of the array

		// A >> integer array

		// result = number of the indexes whose positions remains unchanged

		// WRITE YOUR LOGIC HERE:

		int result = 0;

		int temp_A[] = new int[N];

		for (int i = 0; i < N; i++) {

			temp_A[i] = A[i]; // copy the original array to temp array

		}

		// sort the original array

		Arrays.sort(A);

		// now we can compare the original to temp Array to see how many positions
		// changed

		for (int i = 0; i < N; i++) {

			if (A[i] == temp_A[i])

				result += 1;

		}

		return result;

	}

	public static void main(String[] args) {

		// INPUT [uncomment & modify if required]

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A[] = new int[N];

		for (int i = 0; i < N; i++) {

			A[i] = sc.nextInt();

		}

		// OUTPUT [uncomment & modify if required]

		System.out.print(unchangedIndex(N, A));

		sc.close();

	}

}