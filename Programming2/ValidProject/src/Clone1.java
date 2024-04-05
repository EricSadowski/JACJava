public class Clone1 {

	public static void main(String[] args) {
		
		
		
	//System.out.println(isSpecialChar('_', false));	
	//System.out.println(singleAtSign("userna@me@domain.com"));
	//System.out.println(isAlphaNum('h'));
		
	String s = "Bingb.onpartrol-6!";
	String myEmail = "weeewoo@weewoo.oj";
	String domain = "h-9.9.he.ca";

	
	System.out.println(isPrefix(s));
	System.out.println(singleAtSign(myEmail));
	System.out.println(isDomain(domain));
	System.out.println(isEmail(myEmail));
	
	}
	
	public static boolean isAlphaNum(char input) {
		
		if(Character.isLetter(input)) {
			return true;
		}else if(Character.isDigit(input)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isSpecialChar (char inputChar, boolean isUnderscoreOK) {
		if (inputChar == '-' || inputChar == '.' ) {
			return true;
		}
		else if (inputChar == '_' && isUnderscoreOK) {
			return true;
		}
		else return false;	
		}

	public static boolean singleAtSign (String emailAddress) {
		int index = 0;
		for (int i = 0; i < emailAddress.length(); i++) {
			if (emailAddress.charAt(i) == '@') {
				index += 1;
			}
		}
		if (index == 1) {
			return true;
		}
		else return false;
	}
	
	public static boolean isPrefixChar(char inputChar) {
		boolean isAlphaNum = isAlphaNum(inputChar);
		boolean isSpecialChar = isSpecialChar(inputChar, true);
		return isAlphaNum || isSpecialChar;		
	}
	
	public static boolean isDomainChar(char inputChar) {
		boolean isAlphaNum = isAlphaNum(inputChar);
		boolean isSpecialChar = isSpecialChar(inputChar, false);
		return isAlphaNum || isSpecialChar;
	}
	
	
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
		fetcher = email.split("@");
		
		return fetcher[0];
	}
	
	public static String fetchAfterAt(String email) {
		String[] fetcher = null;
		fetcher = email.split("@");
		
		return fetcher[1];
	}
	
	
	
	
	public static boolean isPrefix(String input) {
		if( input == null || input.length() < 1 || !isAlphaNum(input.charAt(0)) || !isAlphaNum(input.charAt(input.length() - 1)) ) {
			return false;
		}
		
		if(reSpecial(input)) {	// This method checks for repeat .. -- etc
			return false;
		}
		
		for (int i = 0; i < input.length(); i++){ //checking if each character is valid in the prefix
		    char check = input.charAt(i);
		    if(!isPrefixChar(check)) {
		    	return false;
		    }
		    
		} return true;

		
		
		
		/*
		
		for(int i = 1; i < input.length() - 1; i++) {
			if ( !isAlphaNum(input.charAt(i)) && !isSpecialChar(input.charAt(i),true) ) {
				return false;
			}
			if ( isSpecialChar(input.charAt(i),true) && !isAlphaNum(input.charAt(i + 1)) ) {		
				return false;
			}						
		} return true; */
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
						if ( !isAlphaNum(firstPortion.charAt(f)) && !isSpecialChar(firstPortion.charAt(f),false) ) {
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
		
		if(!singleAtSign(input)) {
			return false;
		}if(reSpecial(input)) {
			return false;
		}
		
		String prefix = fetchBeforeAt(input);
		String domain = fetchAfterAt(input);
		
		if(!isPrefix(prefix)) {
			return false;
		}
		if(!isDomain(domain)) {
			return false;
		}
		
		
		
		
			return true;
		
	}

}
