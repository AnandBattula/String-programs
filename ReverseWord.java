package stringPrograms;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		String spiltArray [] = str.split(" ");
		
		for(int i=spiltArray.length-1;i>=0;i--) {
			System.out.print(spiltArray[i]+" ");
		}
	}

}
