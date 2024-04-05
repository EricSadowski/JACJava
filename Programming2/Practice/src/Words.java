// Eric Sadowski 2338165
public class Words {

	public static void main(String[] args) {
		
	System.out.println(isPalindrome("Satan oscillate my metallic sonatas"));
	
	}
	
	public static boolean isPalindrome(String input) {
		
		
		input = input.replaceAll("\\s", "");
		input = input.toLowerCase(); //converting string low case.. deleting spaces
		String reversedStr = "";
		int strLength = input.length(); //parameter int and blank character holding string
		
		for (int i = strLength; i > 0; i-- ) { // iterate loop for length of string and each time add char to reversedStr
			reversedStr += input.charAt(i-1); 
			 }

		return(input.equals(reversedStr));
			
		
	}
	
	
}
