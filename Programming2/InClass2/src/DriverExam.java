// Eric Sadowski  2338165
import java.util.Arrays;

public class DriverExam {

	char[] ans = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
	int correct;
	char[] test;
	int[] wrong = new int[20];
	//char[] wrongC = {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
	//char[] allowed = { 'A', 'B', 'C', 'D' };
	
	
	public DriverExam(char[] test) {

	this.test = test;
	for (int i = 0; i < ans.length; i++) {
		if(test[i] < 65 || test[i] > 68) {
			throw new IllegalArgumentException("Only A, B, C and D are valid");
		}
		else if (ans[i] == test[i]) {
            correct++;
            }else if(ans[i] != test[i]) {
            	wrong[i] = i;
            }
            	
}
	
}

	public boolean passed() {
		if(correct > 14) {
			return true;
		}else {
			return false;
		}
	}

	
	public char[] getAns() {
		return ans;
	}


	public int totalCorrect() {
		return correct;
	}

	public int totalIncorrect() {
		return 20 - correct;
	}



	public static void main(String[] args) {

		try {
		//anArrayList.add(newElement);
		
		//char[] ans = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
		char[] stu = {'B', 'C', 'A', 'A', 'C', 'C', 'A', 'C', 'C', 'D', 'B', 'C', 'D', 'C', 'C', 'C', 'C', 'C', 'C', 'C'};
		DriverExam student = new DriverExam(stu);
		
		//char[] stu = {'B', 'C', 'A', 'A', 'C', 'C', 'B', 'C', 'C', 'D', 'B', 'C', 'D', 'C', 'C', 'C', 'C', 'C', 'C', 'C'};
		char[] dingus = {'B', 'D', 'A', 'A', 'A', 'C', 'B', 'C', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
		DriverExam bing = new DriverExam(dingus);
//		char[] smartGuy = smartGuy.getAns();
//		DriverExam smart = new DriverExam(smartGuy);
		

		System.out.println(student.correct);
//		System.out.println(smart.totalCorrect());

		System.out.println(bing.totalIncorrect());
		System.out.println(bing.passed());
		System.out.println(bing.questionsMissed());

		}catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		
	}

	
	public String questionsMissed() {
		return "Questions missed: " + Arrays.toString(wrong);
	}

}
