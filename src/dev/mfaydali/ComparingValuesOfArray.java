package dev.mfaydali;

import java.util.Scanner;

//Write a program to find the smallest integer in the array which is greater than X.
//You are given an array A having N positive integers and a positive integer X.

//Input Format
//The code provided handles the input and stores them in variables for you.
//The first line of input contains two space-separated positive integers N and X. Where N denotes the size of array A.
//The next line contains N space-separated integers of array A.

public class ComparingValuesOfArray {
	public static int smallInteger(int N, int X, int A[]) {

		// this is default OUTPUT. You can change it

		int result = 0;

		// WRITE YOUR LOGIC HERE:

		for (int i = 0; i < N; i++) {

			if (A[i] > X && (A[i] < result || result == 0)) // to find the smallest one, there can be more numbers

				result = A[i];

		}

		return result;

	}

	public static void main(String[] args) {

		// INPUT [uncomment & modify if required]

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int X = sc.nextInt();

		int A[] = new int[N];

		for (int i = 0; i < N; i++) {

			A[i] = sc.nextInt();

		}

		// OUTPUT [uncomment & modify if required]

		System.out.print(smallInteger(N, X, A));

		sc.close();

	}

}