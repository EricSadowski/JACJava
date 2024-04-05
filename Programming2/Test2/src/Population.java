import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Population {

	static ArrayList<Double> bigList = new ArrayList<>();
	static ArrayList<Double> bigPop = new ArrayList<>();
	static double annualAvg;
	static double smallest;
	static int smallYear;
	static double largest;
	static int largeYear;
	
	
	//method to print out a certain year
	
	public static String getYear(int index) {
		
		int tens = index + 50;
		String bing = "19" + tens;
		
		return bing;
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException {

		//catch method start
		try {
		
		File myFile = new File("USPopulation.txt");
		//finding file and setting initial average
		Scanner inputFile = new Scanner(myFile);
		double runAvg = 0;
		
		
		//adding all items to master arraylist
		while (inputFile.hasNext())
    	{
    	double num = inputFile.nextDouble();
    	bigList.add(num);
    	}
		
		//Initializing a starting value for largest and smallest
		smallest = bigList.get(1) - bigList.get(0);
		largest = bigList.get(1) - bigList.get(0);
		
		for(int i = 1; i < bigList.size(); i++) {
			
			//loop that compares one array item to last
			double avg = bigList.get(i) - bigList.get(i-1);
			System.out.println(avg);
			//adds item to total
			runAvg = avg + runAvg;
			bigPop.add(avg);
			
			//compares each year to current smallest or largest average and stores year number to a variable
			if(avg > largest) {
				largest = avg;
				largeYear = i;
			}
			
			if(avg < smallest) {
				smallest = avg;
				smallYear = i;
			}
			
		}
		
		Collections.sort(bigPop);
		
		//gets average
		annualAvg = runAvg / bigList.size();
		
		//double avg = bigList.get(1) - bigList.get(1-1);
		//System.out.println(bigList);
		
		
		System.out.println("Average annual change: " + annualAvg + " thousand");
		System.out.println("Year with greatest increase: " + getYear(largeYear) + ": " + bigPop.get(0));
		System.out.println("Year with smallest increase: "+ getYear(smallYear) + ": " + bigPop.get(bigPop.size()-1));
		
		
		
		//System.out.println(smallYear);
		//System.out.println(smallest);
		//System.out.println(largeYear);
		//System.out.println(largest);
		
		
		inputFile.close();
		
	}catch(FileNotFoundException e) {
		System.out.println(e);
	}catch(Exception e) {
		System.out.println(e);
	}
		
		
		
		
		
	}

}
