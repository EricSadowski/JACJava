
public class VowelsChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String strInput = args[0];
		
		String str = strInput.toLowerCase(); // lower case so not checking a and A
		
		// generate random index
		int index = (int)(Math.random() * str.length() );
		
		char c = str.charAt(index); // D.R.Y
		
		System.out.print("is the character " + strInput.charAt(index) + " at index " + index + " a vowel? ");
		
		
		if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.print("Yes, it is!");
		}else {
			System.out.print("No, it is not a vowel");
		}


		
		
		
	}

}
