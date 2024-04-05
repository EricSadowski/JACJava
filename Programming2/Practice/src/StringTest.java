
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		String a = "Apple";
		String b = a;
		String c = c;
		
		if (a == c) {
			
			System.out.println("Equal");
		}
		
		
		
	    int wordLength = c.length();
	    
	    System.out.println(wordLength);
		
		double getRandom = Math.floor(Math.random() * wordLength);
		int randomInt = (int) getRandom;
		
		System.out.println(randomInt);
		
		char randomChar = (char) randomInt;
		
		System.out.println(randomChar);
		
		
		*/
		
		
		
		String strInput = args[0];
		
		String str = strInput;
		
		str = str.toLowerCase();
		
		int index = (int)(Math.random() * str.length());
		
		char c = str.charAt(index);
		
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
            
		
		
		
		
        
		/*if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
		
		
		*/
		
	}

}
