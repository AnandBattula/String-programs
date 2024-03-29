package stringPrograms;

import java.util.Scanner;

public class CompareTwoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1: ");
		String str1 = sc.next();
		System.out.println("Enter string2: ");
		String str2 = sc.next();
		boolean isCompare = false;
		
		for(int i=0;i<str2.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				isCompare = false;
				break;
			}
			isCompare =true;
		}
		System.out.println(isCompare);
		
	}

}
