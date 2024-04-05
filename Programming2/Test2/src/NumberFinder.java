import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberFinder {

	static ArrayList<Double> bigList = new ArrayList<>();
	static int total;
	File file;
		

		 public NumberFinder(File file) {
			 this.file = file;
			 	 
			 
	}
		 

			public File getFile() {
			return file;
		}

		public void setFile(File file) {
			this.file = file;
		}




			public static void main(String[] args) throws Exception {  
				
				try {

		    	File myFile = new File("Numbers.txt");
		    	NumberFinder numbers = new NumberFinder(myFile);
		    	
		    	Scanner inputFile = new Scanner(numbers.getFile());
		    	
		    	//adds each item to arraylist
		    	while (inputFile.hasNext())
		    	{
		    	double num = inputFile.nextDouble();
		    	bigList.add(num);
		    	}
		    	
		    	//finds the total of all numbers
		    	for(Double i : bigList) {
		    		total += i;
		    	}
		    	
		    	//finds average and sorts list smallest to largest
		    	int average = total / bigList.size();
		    	Collections.sort(bigList);
		    	System.out.println("The lowest number is : " + bigList.get(0));
		    	System.out.println("The highest number is : " + bigList.get(bigList.size() - 1));
		    	System.out.println("The file has " + bigList.size()+ " numbers");
		    	System.out.println("The Average is: " + average);
		    	
		    	System.out.println(bigList);
		    	inputFile.close();
		    	
			}catch(FileNotFoundException e) {
				System.out.println(e);
			}catch(Exception e) {
				System.out.println(e);
			}
		    
		    }  
		



}  
		
		
		