package stringPrograms;

import java.util.Scanner;

public class SumOfTwoEvenStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter string2: ");
		String str2 = sc.nextLine();
		
		String a = "";
		String b = "";
		
		System.out.println("Even numbers of string1.....");
		for(String s1 : str1.split(" ")) {
			if(s1.length()%2==0) {
				System.out.println(s1);
			}
			a=a+s1;
		}
		System.out.println("Even numbers of string2.....");

		for(String s2 : str2.split(" ")) {
			if(s2.length()%2==0) {
				System.out.println(s2);
			}
			b=b+s2;
		}
		int sum = Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println(sum);
	}

}
