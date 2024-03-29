package stringPrograms;

import java.util.Scanner;

public class PrintEvenDigitCharacter {
	public static void main(String[] args) {
		printEvenDigitCharacter();
		//PrintDigitCharacter();
	}
	
	
	public static void printEvenDigitCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		
		char [] arr = str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("even digit number characters "+count);

	}
	
	
	public static void PrintDigitCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		
		char [] arr = str.toCharArray();
		
		for(int i=1;i<=arr.length-1;i++) {
			int count=0;
			for(int j=0;j<=arr.length-1;j++) {
			if(arr[i]%arr[j]==0) {
				count++;
			}
			//System.out.println(count);
		}


	}
		System.out.println(arr);
	}

}
