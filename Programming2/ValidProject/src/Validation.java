public class Validation {

	public static void main(String[] args) {
		
		
		
	//System.out.println(isAlphaNum('D'));
	//System.out.println(isSpecialChar('_', false));	
	//System.out.println(singleAtSign("userna@me@domain.com"));
	//System.out.println(isAlphaNum('h'));
	//System.out.println(isPrefix("to.b.cc"));
	//System.out.println(isDomain(".x"));
	System.out.println(isEmail("user-name.yul@fak.email.com"));
	System.out.println(isUsername ("-UFFFF2"));
	
		
	String pass1 = "htetH1-ab";
	String allCaps = "AHHHHHHHHHHHHH";
	String s = "Bingb.onpartrol-6!";
	String myEmail = "d@d";
	String domain = "h-9.9.he.c9a";

	
	System.out.println(safePassword(pass1));
	
	
	System.out.println(hasNumber(allCaps));
	System.out.println(isPrefixChar('.'));
	//System.out.println(singleAtSign(myEmail));
	//System.out.println(isDomain(domain));
	//System.out.println(isEmail(myEmail));
	
	}
	
	public static boolean isAlphaNum(char input) {
		
		//using built in methods to check a char input
		if( Character.isLetter(input) || Character.isDigit(input) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isSpecialChar (char inputChar, boolean isUnderscoreOK) {

		if ( inputChar == '-' || inputChar == '.' ) {
			return true;
		}
		else if ( inputChar == '_' && isUnderscoreOK ) {
			return true;
		}
		else return false;	
		}
	// does a string have a number in it method vv
	public static boolean hasNumber(String input) {
		
		char[] chars = input.toCharArray(); //create an array of chars from input
	    for(char c : chars){
	         if(Character.isDigit(c)){ //check each one to see if it is a digit
	            return true; //if so return true
	         }
	      }
	     return false; //otherwise false
	}
	
	
	public static boolean singleAtSign (String emailAddress) {
		int index = 0;
		for ( int i = 0; i < emailAddress.length(); i++ ) {
			if ( emailAddress.charAt(i) == '@' ) {
				index += 1;
			}
		}
		if ( index == 1 ) {
			return true;
		}
		else return false;
	}
	
	public static boolean isPrefixChar(char inputChar) {
		boolean isAlphaNum = isAlphaNum(inputChar);
		boolean isSpecialChar = isSpecialChar( inputChar, true );
		return isAlphaNum || isSpecialChar;		
	}
	
	public static boolean isDomainChar(char inputChar) {
		boolean isAlphaNum = isAlphaNum(inputChar);
		boolean isSpecialChar = isSpecialChar( inputChar, false );
		return isAlphaNum || isSpecialChar;
	}
	
	// method to check whether a underscore/periods/dashes is followed by another underscore/periods/dashes
	public static boolean reSpecial(String input) {
		
		if(input.contains("..") || input.contains(".-") || input.contains("-.") || input.contains("._") || input.contains("_.") 
				|| input.contains("--") || input.contains("-_") || input.contains("_-") || input.contains("__")) {
			return true;  // 9 possible cases of repeat symbols
		}else {
			return false;
		}
	}
	
	public static String fetchBeforeAt(String email) {
		String[] fetcher = null;
		fetcher = email.split("@"); //splitting email in half with an at
		
		return fetcher[0]; //returning first part... ** fetch after the same only its [1]
	}
	
	public static String fetchAfterAt(String email) {
		String[] fetcher = null;
		fetcher = email.split("@");
		
		return fetcher[1];
	}
	
	public static boolean isPrefix(String input) {
		if ( input == null || input.length() < 1 || !isAlphaNum(input.charAt(0)) || !isAlphaNum(input.charAt(input.length() - 1)) ) {
			return false; // ^^ starting point of minimums before running the code
		}
		
		if (reSpecial(input)) {	// This method checks for repeat .. -- etc
			return false;
		}
		
		for (int i = 0; i < input.length(); i++){ //checking if each character is valid in the prefix
		    char check = input.charAt(i);
		    if(!isPrefixChar(check)) {
		    	return false;
		    }
		    
		} return true;

		
		
	} 

	public static boolean isDomain(String input) {
		// split the string based on the last occurrence of a period
		int lastIndex = input.lastIndexOf('.');
		if ( lastIndex == -1 ) {
			return false;
		}
		else {
			String firstPortion = input.substring(0,lastIndex);
			String secondPortion = input.substring(lastIndex+1);
			int firstPortionLength = firstPortion.length();
			int secondPortionLength = secondPortion.length();
			// no character in firstPortion / last character of firstPortion is not a alphanumeric character / secondPortion has less than 2 characters 
			if ( firstPortion == null || firstPortionLength < 1 || !isAlphaNum(firstPortion.charAt(firstPortionLength - 1)) || secondPortionLength <2 ) {
				return false;
			} 
			else {
				for (int f = 0;  f < firstPortionLength-1; f++ ) {
					for (int s = 0; s < secondPortionLength; s++) {
						// characters of firstPortion are not alphanumeric characters nor special characters(underscore is not allowed)
						if ( !isDomainChar(firstPortion.charAt(f)) ) {
							return false;
						}
						// A period or dash in the firstPortion is not followed by 1 alphanumeric characters
						if ( isSpecialChar(firstPortion.charAt(f),false) && !isAlphaNum(firstPortion.charAt(f + 1)) ) {
							return false;
						}
						// characters of secondPortion are not letters
						if ( !Character.isLetter(secondPortion.charAt(s)) ) {
							return false;
						}
					}
				} return true;
			}
		}
			
		
		
		
	} 

	public static boolean isEmail(String input) {
		if( !singleAtSign(input) || reSpecial(input) ) {
			return false;
		}
		
		String prefix = fetchBeforeAt(input);
		String domain = fetchAfterAt(input);
		
		if( !isPrefix(prefix) || !isDomain(domain) ) {
			return false;
		}
		return true;	
	}
	
	public static String isUsername(String input) {
		if ( input == null || input.length() <1 || input.length() > 7 || reSpecial(input) || !isSpecialChar(input.charAt(0),false) ) {
			return "";
		}
		else {
			for (int i = 1;  i < input.length(); i++ ) {
				char check = input.charAt(i);
				if (  !isDomainChar(check)  && check != '!'  ) {
					return "";
				}
			}
		}
		return input.toLowerCase();
		
	}
	
	public static boolean safePassword(String input) {
		if ( input == null || input.length() <7 || input.length() > 15 || reSpecial(input) || !hasCaps(input) || !hasLow(input)
				|| !hasNumber(input) ) { return false; // checking the basic parameters of the password using custom methods
			
		}
		for (int i = 0; i < input.length(); i++){ //checking if there is a special character like a cherry on top
		    char check = input.charAt(i);
		    if( isSpecialChar(check, true)) {
		    	return true; //if so it's a good password
		    }
		    
		} 
		return false; //otherwise it's too basic
			
	}
	// 2 very similar methods to check if there are caps and low characters
	public static boolean hasCaps(String input) {
		
		String comper = input.toLowerCase(); // make clone of input string in lowercase
		if(comper.equals(input)) {
			return false; // if it is the exact same as the input it has no caps
		}else {
			return true; // if it is different it has caps
		}				 // hasLow is exactly the same but reversed
		
	}
	
	public static boolean hasLow(String input) {
		
		String comper = input.toUpperCase();
		if(comper.equals(input)) {
			return false;
		}else {
			return true;
		}
		
	}
	
		   
		   
	
	
	
}
