package stringPrograms;

import java.util.Scanner;

public class FindVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.nextLine().toLowerCase();
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'
					||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println(str.charAt(i));
			}
		}
	}

}
