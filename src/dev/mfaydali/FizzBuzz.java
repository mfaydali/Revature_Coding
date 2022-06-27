package dev.mfaydali;

import java.util.Scanner;

//You are given a number N. In order from 1 to N (inclusive), print each number.
//If the number is divisible by 3, replace it with "Fizz". If it is divisible by 5, replace it with "Buzz". If divisible by both, print "FizzBuzz".

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// start here
		for (int i = 1; i < N + 1; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}