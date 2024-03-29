package stringPrograms;

import java.util.Scanner;

public class EvenLengthWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		for(String s:str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}
	}

}
