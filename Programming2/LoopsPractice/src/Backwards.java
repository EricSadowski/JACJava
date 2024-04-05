
public class Backwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// Reverse a String
		
		
		String orgString = "Ninjas";
		String reversedStr = "";
		int strLength = orgString.length();
		
		for (int i = strLength; i > 0; i-- ) {   // i is equal to length of the word.. loop runs as long as i > 0.. each iteration -1
			 reversedStr += orgString.charAt(i-1); // adds the last char of index to the empty string and repeats
			 System.out.println(reversedStr);
		}
		System.out.println(reversedStr);
		
		
		System.out.println(orgString.charAt(strLength-1)); /* charAt takes the index value so you have to minus the length by 1 to get the
		retrieve that from the actual value.. You are calling a method on a string */
		
	}

}
