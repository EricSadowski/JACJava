
public class WordGun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String tester = "hahaha";

		String word = args[0];
		
		// Output words as many times as it has characters

		int countDown = word.length();
		while(countDown > 0) {
			System.out.println(countDown + ". " + word);
			countDown--;
		}
		
		System.out.println(tester.length());
		
		int countUp = 0;
		while(countUp < word.length()) {
			countUp++;
			System.out.println((countUp) + ". " + word);
			
		}
		
		
		
		/*
		int countDown = word.length();
		while(countDown-- > 0) {
			System.out.println(countDown + ". " + word);
			//countDown--;
		} */
		
	}

}
