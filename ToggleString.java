package stringPrograms;

import java.util.Scanner;

public class ToggleString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder("");
		
		for(int i = 0; i <= str.length()-1; i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch <= 'Z') {
				sb.append((char)ch+32);
			}
			else if(ch >= 'a' && ch <= 'z') {
				sb.append((char)ch-32);
			}else {
				sb.append(ch);
			}
		}
		String result = sb.toString();
		System.out.println(result);
	}

}
