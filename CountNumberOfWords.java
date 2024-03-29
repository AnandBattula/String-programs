package stringPrograms;

import java.util.Scanner;

public class CountNumberOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		String [] arr = str.split(" ");
		int s = arr.length;
		System.out.println(s);
		
	/*	
		int count = 0;
		if(str.charAt(0)!=' ') {
			count++;
		}
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);*/
	}

}
