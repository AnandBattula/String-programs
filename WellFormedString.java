package stringPrograms;

import java.util.Scanner;
import java.util.Stack;

public class WellFormedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		
		// create a stack
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(st.empty()) {
				st.push(ch);
			}
			else if(ch=='{' || ch=='(' || ch=='[') {
				st.push(ch);
				
			}
			else if(ch=='}' && st.peek()=='{') {
				st.pop();
			}
			else if(ch==')' && st.peek()=='(') {
				st.pop();
			}
			else if(ch==']' && st.peek()=='[') {
				st.pop();
			}
		}
		if(st.empty()) {
			System.out.println("Given string is well formed and balanced!!!");
		}
		else {
			System.out.println("Given string is not well formed and balanced!!!!");
		}
	}

}
