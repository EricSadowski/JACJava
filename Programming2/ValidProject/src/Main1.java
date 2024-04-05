
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		
		fetchBeforeAt("yayayaya@hotmail.com");
		
		System.out.println(fetchAfterAt("yayayay@hotmail.com"));
		
		
		/*String[] fetcher = null;
		fetcher = email.split("@");
		
		System.out.println(fetcher[0]);
		
		
		//System.out.println(  isAlphaNum('?')  );
		
		/*
	char input = 'H';
	
	if(Character.isLetter(input)) {
		System.out.println("yes");
	}else if(Character.isDigit(input)) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	
		
		
	/*boolean letter = Character.isLetter('*');
	
	System.out.println(letter);
	
	boolean num = Character.isDigit('0');
	
	System.out.println(num);*/
	
	
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
	
	
	
	public static boolean isAlphaNum(char input) {
		
		if(Character.isLetter(input)) {
			return true;
		}else if(Character.isDigit(input)) {
			return true;
		}else {
			return false;
		}
		
		
	}
	

}
