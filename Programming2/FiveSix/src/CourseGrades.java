import java.util.Arrays;





public class CourseGrades {

	GradedActivity[] grades;
	
	
	






	public CourseGrades(GradedActivity[] grades) {
		
		this.grades = grades;
	}



	@Override
	public String toString() {
		return "CourseGrades [grades=" + Arrays.toString(grades) + "]";
	}



	public void setPassFailExam(PassFailExam exam) {
		
		grades[1] = exam;
		
	}
	
	
	public void setEssay(GradedActivity essay) {
		
		grades[2] = essay;
		
	}
	
	public void setFinalExam(FinalExam exam) {
		
		grades[3] = exam;
		
	}



	public void setLab(GradedActivity lab) {
		
		lab = grades[0];
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		GradedActivity[] grades = new GradedActivity[4];
		
		
		GradedActivity lab = new GradedActivity();
		lab.setScore(78);
		GradedActivity essay = new GradedActivity();
		essay.setScore(88);
		grades[1] = new PassFailExam(20, 5, 60);
		
		System.out.println(grades);
		
		
		
		

		
		
		
		
//		grades[0] = new GradedActivity();
		//grades[1] = new PassFailExam(10, 9, 70);
		
		

		
		
	}

}
