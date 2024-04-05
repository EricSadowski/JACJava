
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCount {

	static ArrayList<String> bigList = new ArrayList<>();
	static int totalLetters;
		

		    public static void main(String[] args) throws Exception {  

		    	File myFile = new File("source.txt");
		    	Scanner inputFile = new Scanner(myFile);
		    	//System.out.println(inputFile.nextLine());
		    	
		    	while (inputFile.hasNext())
		    	{
		    	String str = inputFile.nextLine();
		    	String newstr = str.replace('-', ' ');
		    	System.out.println(newstr);
		    	String arr1[] = newstr.split(" ");
		    	for (int i = 0; i < arr1.length; i++) {
		    		bigList.add(arr1[i]);
		    	}
		    	}
		    	for(String i : bigList) {
		    		totalLetters += i.length();
		    	}
		    	int averageL = totalLetters / bigList.size();
		    	
		    	System.out.println("The file has " + bigList.size()+ " words");
		    	System.out.println("Average word size is: " + averageL);
		    	
		    	System.out.println(bigList);
		    	inputFile.close();
		    
		    }  
		



}  
		
		
		
		
	


