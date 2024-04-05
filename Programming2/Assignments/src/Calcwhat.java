import java.util.Arrays;

public class Calcwhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Bobby My name is bob mcbobby bobby and i like bobby";
		String searchFor = "bobby";
		str = str.toLowerCase();
		
	    		String[] checkForBobby;
	    	    // Declaring an empty string array
	    	    String[] stringToArr = null;
	    	    
	    	    
	    	    checkForBobby = new String[1];
	    	    checkForBobby[0] = searchFor;
	    	    System.out.println(checkForBobby[0]);

	    	    // Converting using String.split() method with whitespace as a delimiter
	    	    stringToArr = str.split(" ");
	    	    
	    	    System.out.println(stringToArr[2]);
	   
	    	    int noBobbys = 0;
	    	    
	    	    System.out.println(checkForBobby[0]);
	    	    System.out.println(stringToArr[0]);
	    	    
	    	    if(checkForBobby[0].equals(stringToArr[0])){
	    	    	System.out.println("yes");
	    	    }
	    	    
	    	    
	    	    // Printing the converted string array
	    	    for (int i = 0; i < stringToArr.length; i++) {
	    	      if(checkForBobby[0].equals(stringToArr[i])) {
	    	    	  noBobbys++;
	    	    	  
	    	      }
	    	    }
	    	    
	    	    System.out.println(noBobbys);
		
		
		
		
		/*
		//int wordLength = searchFor.length();
		if(0 <= (str.indexOf(" " + searchFor) || str.indexOf(" " + searchFor + " ") || str.indexOf(searchFor + " "))) {
			
			
			
				
				
			
			
			
			
			
		}
		
		
		int isFound = str.indexOf(" " + searchFor);
		isFound = str.indexOf(" " + searchFor + " ");
		isFound = str.indexOf(searchFor + " ");
		
		System.out.println(isFound);
		//int shaveTotal = isFound + (wordLength + 1);
		//int newSize = str.length() - shaveTotal;
		
		*/
		
		
		
	}

}
