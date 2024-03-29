package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {
	public static void main(String[] args) {
		printDuplicateCharacters();
		//printDuplicateWords();
		
	}
	// print duplicates characters/numbers and remove duplicate characters/numbers
	public static void printDuplicateCharacters() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		
		// convert array to string
		char[] ch1 = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		for(Character ch:ch1) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
				
			}
			else {
				map.put(ch,1);
			}
		}
		// print the map
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character,Integer>entry:entrySet) {
			if(entry.getValue()>=1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}
	// print duplicates words and remove duplicate words
	public static void printDuplicateWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		
		String splitArr[] = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for(String ch:splitArr) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
				
			}
			else {
				map.put(ch,1);
			}
		}
		// print the map
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
		
	}
	

}
