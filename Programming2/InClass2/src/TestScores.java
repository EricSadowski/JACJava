// Eric Sadowski  2338165
//import java.util.Arrays;

public class TestScores {

	double[] scores;

	
	
	public TestScores(double[] scores) {
		this.scores = scores;
	}
	
	public double avg(TestScores obj) throws InvalidTestScore {
		double cheese = 0;
		for (int i = 0; i < obj.scores.length; i++) {
			if(obj.scores[i] > 100 || obj.scores[i] < 0) {
				throw new InvalidTestScore("Scores below zero or above 100 do not exist");
			}
			 cheese += obj.scores[i];
			 //System.out.println(obj.scores[i]);
			}
		double average = cheese / obj.scores.length;
		return average;
	}

	public static void main(String[] args) {
	
		double[] donnie = new double[5];
		donnie[0] = 66;
		donnie[1] = 76;
		donnie[2] = 101;
		donnie[3] = 87;
		donnie[4] = -5;
		
		TestScores yoda = new TestScores(donnie);
		
		
		
		try {
			System.out.println(yoda.avg(yoda));
		} catch (InvalidTestScore e) {
			System.out.println("Scores below zero or above 100 do not exist");
			//e.printStackTrace();
		}
		
	}




}
