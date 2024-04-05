import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDisplay {

	File file;
	static ArrayList<String> bigList = new ArrayList<>();
	static ArrayList<String> headList = new ArrayList<>();
	
	
	
	public FileDisplay(File file) {
		super();
		this.file = file;
	}

	

	public static void main(String[] args) throws FileNotFoundException {

		try {
		
		
		File myFile = new File("USPopulation.txt");
    	FileDisplay pop = new FileDisplay(myFile);
    	
		Scanner inputFile = new Scanner(pop.file);
    	
		
		//adds each item to array
		while (inputFile.hasNext())
    	{
    	String dis = inputFile.nextLine();
    	bigList.add(dis);
    	}
		
		//sees if biglist is bigger than 5 .. if so adds to smaller headlist
		if(bigList.size()>5) {
			headList.add(bigList.get(0));
			headList.add(bigList.get(1));
			headList.add(bigList.get(2));
			headList.add(bigList.get(3));
			headList.add(bigList.get(4));
		}
		//else it just adds each item to a small list
		else {
			for(String i: bigList) {
				headList.add(i);
			}
		}
		
		System.out.println(pop.displayContents());
		System.out.println(pop.displayHead());
		pop.displayWithLineNumbers();
		
		inputFile.close();
		
		
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	//each method is just a to string
	public String displayHead() {
		return headList.toString();
	}


	public String displayContents() {
		return bigList.toString();
	}
	
	
	//this one just prints out everything with numbers when called
	public void displayWithLineNumbers() {

		for(int i = 0; i < bigList.size(); i++) {
			
			System.out.println((i+1) + ": " + bigList.get(i));
		}
		
		
		
	}



}
