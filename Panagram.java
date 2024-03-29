package stringPrograms;

public class Panagram {
	
	public static void main(String[] args) {
		
		
		String str1 = "an ball call do eat fox git hat ice juice kite long man noon omg quick  rest test undo veda wife xerox yes zwer";
		
		
		if(str1.length()<26){
			System.out.println("not anagram");
		}
		else {
			for(char ch='a';ch<='z';ch++) {
				if(str1.indexOf(ch)<0) {
					System.out.println("panagram");
				}
			}
		}

}
	}
