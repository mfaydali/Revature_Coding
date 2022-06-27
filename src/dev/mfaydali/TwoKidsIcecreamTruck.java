package dev.mfaydali;

import java.util.Scanner;

//Two kids and an ice cream truck are at various positions on a line. You will be given their starting positions.
//Your task is to determine which kid will reach the truck first, assuming the truck does not move and the kids are running at equal speed.
//If the kids arrive at the same time, the truck will be allowed to move to the next corner while the kids fight over the last cone.
//
//You are given i runs in a form of k1, k2, t representing the respective positions for kid_1, kid_2, and truck.
//
//Complete the function called TwoKidsAndATruck to return the appropriate answer to each run, which will be printed on a new line.
//If kid _1 catches the truck first, print Kid 1.
//If kid_2 catches the truck first, print Kid 2.
//If both kids reach the truck at the same time, print Truck as the two kids fight and truck escapes.

public class TwoKidsIcecreamTruck {
	// declaring a new method
	public static String KidsAndTruck(int k1, int k2, int t) {
		int d1 = Math.abs(k1 - t);
		int d2 = Math.abs(k2 - t);
		if (d1 < d2) {
			return "Kid 1";
		} else if (d1 > d2) {
			return "Kid 2";
		} else {
			return "Truck";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T, k1, k2, t;
		int i = 0;
		String result = "";
		T = sc.nextInt();
		// since we don't know how many runs it will give, use while loop
		while (i < T) {
			k1 = sc.nextInt();
			k2 = sc.nextInt();
			t = sc.nextInt();
			result += KidsAndTruck(k1, k2, t) + "\n";
			i++;
		}
		System.out.println(result);

		// int sampleInput;
		// int result = -404;
		// sampleInput = sc.nextInt();

		// write your Logic here

		// OUTPUT [uncomment & modify if required]
		// System.out.println(result);

	}
}

//Sample Input
//2
//1 2 3
//1 3 2
//
//Sample Output
//Kid 2
//Truck
//
//Explanation:
//Run 1: The positions of the kids and truck are position 1, 2, and 3 respectively.
//Kid 2 will get to the truck first so we print 'Kid 2' on a new line.
//
//
//Run 2: In this run, kids 1 and 2 will reach the truck at the exact same time because each kid is 1 unit away.
//Because the truck leaves as a result of the kids fighting, we print 'Truck' on a new line.