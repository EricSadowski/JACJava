//Eric Sadowski 2338165

import java.util.ArrayList;

public class Teams  {
	
	
	//declaring fields for the Teams object to be contained
	String name;
	String coach;
	ArrayList<Double> dribbleScores;
	ArrayList<Double> shootScores;
	double avgD;
	double avgS;
	double finScore;
	



	//to print out all the teams an overridden toString is used
	@Override
	public String toString() {

		return "\n" + name + ", coached by " + coach + ", final score " + finScore;

	}

	// the constructor which takes 2 strings and 2 arrays as parameters
	public Teams(String name, String coach, ArrayList<Double> dribbleScores, ArrayList<Double> shootScores) {

		
		this.name = name;
		this.coach = coach;
		this.dribbleScores = dribbleScores;
		this.shootScores = shootScores;
		
		// average and fin score parameters are calculated with input parameters
		avgD = avg(dribbleScores);
		avgS = avg(shootScores);
		finScore = 0.35*avgD+0.65*avgS;
		
		
	}

	// this method finds the average of any ArrayList of doubles
	public static double avg(ArrayList<Double> score) {
		
		double total = 0;
		for(int i = 0; i < score.size(); i++) {
			
			total += score.get(i);
		}
		double average = total / score.size();
		
		return average;
	}
	

	
}
