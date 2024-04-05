
public class TestScores {
	
	double grade1;
	double grade2;
	double grade3;
	
	
	
	public TestScores(double a, double b, double c){
		
		grade1 = a;
		grade2 = b;
		grade3 = c;

		
	}


	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}


	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}


	public double getGrade3() {
		return grade3;
	}


	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}
	
	public double gradeAvg() {
		double average = (grade1 + grade2 + grade3) / 3;
		System.out.printf("%.2f%n", average);
		return average;
	}


	public static void main(String[] args) {
		
		System.out.println("Please enter 3 test scores");
		TestScores eric = new TestScores(89, 93, 0);
		eric.gradeAvg();
		
		
		
	}

}
