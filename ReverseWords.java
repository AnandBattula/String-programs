package stringPrograms;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "i like this program very much";
		String str1[] = str.split(" ");
		String reverseWord = "";
		
		for(int i = str1.length-1;i>=0;i--) {
			reverseWord = reverseWord+ str1[i]+" ";
			
		}
		String result = reverseWord.substring(0,reverseWord.length()-1);
		System.out.println(result);
	}

}
