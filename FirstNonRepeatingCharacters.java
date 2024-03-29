package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacters {
	
	public static void nonRepeatingCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		// CREATE HASHMAP BECAUSE IT HAS KEYS AND VALUE PAIR MOREOVER IT DOES NOT ALLOW DUPLICATE KEYS
		Map<Character, Integer> map = new HashMap<>();
		
		boolean status = false;
		
		// iterating each and every characters
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(map.get(ch)==null) {
				map.put(ch, 1);
			}
			else {
				map.put(ch,map.get(ch)+1);
			}
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.get(ch)==1) {
				System.out.println("First non-repeating characters :"+ch);
				status = true;
				break;
			}
		}
		if(status) {
			System.out.println("There is no unique numbers in given string");
		}
	}
	public static void main(String[] args) {
		nonRepeatingCharacter();
	}

}
