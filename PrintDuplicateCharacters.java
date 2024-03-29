package stringPrograms;

import java.util.Scanner;

public class PrintDuplicateCharacters {
	
	public static void printDuplicates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			int count=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i]!=' ') {
					count++;
					ch[i]='0';
				}
			}
			//System.out.println(count);
		
		if(count>1 && ch[i]!='0') {
			System.out.println(ch[i]);
		}
		}
	}
	public static void main(String[] args) {
		printDuplicates();
	}

}
