package dev.mfaydali;

import java.util.Scanner;

//Find the encrypted string for a given text.
//
//The input text is encrypted by the following rule:
//Every character is replaced by two digits.
//For example, ‘A’ is replaced by 01, ‘B’ is replaced by  02, and so on up till ‘Z’, which is replaced by 26.
//
//Input Format
//The code provided handles the input and stores them in variables for you.
//The first line of the input contains a string S representing the input text.

//Sample Input
//ABC       -- denotes string S
//
//Output Format
//The output contains a single numeric string (string format) representing the encrypted string.
//
//Sample Output
//010203
//
//Explanation
//Here, the given text is ABC.
//A is replaced with 01, B is replaced with 02, and C is replaced with 03.
//Hence the output is: 010203.

public class CeaserCipher {
	public static String cipher(String S) {

		// convert String to upperCase

		S = S.toUpperCase();

		// this is default OUTPUT. You can change it

		// empty String

		String result = "";

		// WRITE YOUR LOGIC HERE:

		// loop through String to encrpyt

		for (int i = 0; i < S.length(); i++) {

			// find ascii value of character and subsract from it

			// Because upperCase starts from 65

			int ascii = ((S.charAt(i))) - 64;

			if (ascii >= 1 && ascii < 10) {

				result += ("0" + ascii + "");

			} else {

				result += (ascii + "");

			}

		}

		// For optimizing code, You are free to make changes to "return type",
		// "variables" and "Libraries".

		return result;

	}

	public static void main(String[] args) {

		// INPUT [uncomment & modify if required]

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		// OUTPUT [uncomment & modify if required]

		System.out.print(cipher(S));

		sc.close();

	}

}