package stringPrograms;

import java.util.Scanner;

public class CountDataTypes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		char [] ch = str.toCharArray();
		
		int letter = 0,spaces=0,numbers=0,others=0;
		for(int i=0;i<=ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				numbers++;
			}
			else if(Character.isSpace(ch[i])) {
				spaces++;
			}
			else {
				others++;
			}
		}
		System.out.println("Characters "+letter);
		System.out.println("Numbers "+numbers);
		System.out.println("Spaces "+spaces);
		System.out.println("others "+others);
	}

}
