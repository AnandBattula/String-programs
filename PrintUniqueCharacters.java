package stringPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class PrintUniqueCharacters {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string : ");
		String str = sc.nextLine();
		
		HashSet<Character> unique = new HashSet<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(unique.contains(ch)==true) {
				 //this character has already occured
				unique.remove(ch);
			}
			else {
				// character not present atleast one
				unique.add(ch);
			}
		}
		if(unique.size()==0) {
			System.out.println("There is no unique characters are present");
		}
		
		for(Character ch : unique) {
			System.out.println(ch);
		}
	}

}
