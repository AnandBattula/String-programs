package stringPrograms;

import java.util.Scanner;

public class SumOfTwoStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1: ");
		String str1 = sc.next();
		System.out.println("Enter string2: ");
		String str2 = sc.next();
		
		int sum = Integer.parseInt(str1)+Integer.parseInt(str2);
		System.out.println("Sum of two strings: "+sum);
	}

}
