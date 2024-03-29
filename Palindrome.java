package stringPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next().toLowerCase();
		
		String rev = "";
		String temp = str;
		for(int i=str.length()-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(rev==temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

}
