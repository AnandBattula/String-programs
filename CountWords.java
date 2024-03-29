package stringPrograms;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		//countWords();
		noOfWords();
		
	}
	
	// approach - 1
	public static void countWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		
		int count =1;
		for(int i=0;i<=str.length()-1;i++) {
			if((str.charAt(i)==' ')&& (str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	// approach - 2
	public static void noOfWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		
		String[] ch = str.split(" ");
		int str2 = ch.length;
		System.out.println(str2);
		
		// reverse words
		String reverse = " ";
		for(int i=ch.length-1;i>=0;i--) {
			reverse = reverse+ch[i]+" ";
		}
		System.out.println(reverse);
		int s = reverse.indexOf(0);
		System.out.println(s);
		
	}
	

}
