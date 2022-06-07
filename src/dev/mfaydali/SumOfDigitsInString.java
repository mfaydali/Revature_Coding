package dev.mfaydali;

import java.util.Scanner;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int sum = 0;
		for (int i = 0; i < str.length(); i++)
		{
			char a = str.charAt(i);
			if (Character.isDigit(a))
			{
				int b = Integer.parseInt(String.valueOf(a));
				sum = sum + b;
			}
		}
		if (sum == 0)
		{
			System.out.println(-1);
		}
		else
			System.out.println(sum);
	}
}