package stringPrograms;

import java.util.Scanner;

public class SuperReducedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<sb.length(); i++) {
			if(sb.charAt(i)==sb.charAt(i-1)) {
				sb.delete(i-1,i+1);
				i = 0;
			}
			
		}
		String ans = sb.toString();
		if(sb.length()==0) {
			System.out.println("Empty String");
		}
		else {
			System.out.println(ans);
		}
	}

}
