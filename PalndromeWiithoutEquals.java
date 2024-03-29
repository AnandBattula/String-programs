package stringPrograms;

import java.util.Scanner;

public class PalndromeWiithoutEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a original string: ");
		String str = sc.next();
		String rev = " ";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse string "+rev);
		
		// to check palindrome without using equals method
		boolean isCompare = true;
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)!=rev.charAt(i)) {
				isCompare = true;
				//System.out.println("palindrome");
				break;
			
			//else {
			//	System.out.println("not palindrome");
			}
			isCompare = false;
		}
		System.out.println(isCompare);
		
		
	}

}
