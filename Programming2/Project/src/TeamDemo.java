import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamDemo {

	



	public static void main(String[] args) throws FileNotFoundException {
		
		try {
		//the scanner finds the file and a large parent array of Team objects is created
		File myFile = new File("teams.txt");

		Scanner inputFile = new Scanner(myFile);
		
		ArrayList<Teams> teamArray = new ArrayList<Teams>();
		
		for(int i = 0; i < 9; i++) {
			
			//each line is read and assigned to a String variable
			String teamName = inputFile.nextLine();
			String coachName = inputFile.nextLine();
			String dribble = inputFile.nextLine();
			String shoot = inputFile.nextLine();
			
			
			// the dribble and shoot strings are cut up by spaces and then converted to ArrayLists
			String[] dribbleA = null;
			dribbleA = dribble.split(" ");
			
			ArrayList<Double> finDribble = new ArrayList<Double>();
			for (int i1 = 0; i1<dribbleA.length; i1++) {
				finDribble.add(Double.valueOf(dribbleA[i1]));
			}
	
			String[] shootA = null;
			shootA = shoot.split(" ");
			
			ArrayList<Double> finShoot = new ArrayList<Double>();
			for (int i1 = 0; i1<shootA.length; i1++) {
				finShoot.add(Double.valueOf(shootA[i1]));
			}
			
			// a Teams object is created with the parameters from the file and added to the parent array
			Teams yo = new Teams(teamName, coachName, finDribble, finShoot); 
			
			teamArray.add(yo);

		}
		
		
		
		
		//System.out.println(teamArray); // before sort
		
		// the array is then put through a bubble sort that compares each item to the next and swaps if one is less then repeats
		// until list is sorted
		 int size = teamArray.size();
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = 0; j < size - i - 1; j++)
	                if (teamArray.get(j).finScore > teamArray.get(j + 1).finScore) {

	                    Teams temp = teamArray.get(j);
	                    teamArray.set(j, teamArray.get(j +1));
	                    teamArray.set(j+1, temp);
		
	                }
	            //System.out.println(teamArray);
	        }
	        Collections.reverse(teamArray);
	        inputFile.close();
		
	     //final display of results
		System.out.println(teamArray);
		System.out.println("Gold Medal: " + teamArray.get(0).name);
		System.out.println("Silver Medal: " + teamArray.get(1).name);
		System.out.println("Bronze Medal: " + teamArray.get(2).name);
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
