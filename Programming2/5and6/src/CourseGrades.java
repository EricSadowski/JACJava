
public class CourseGrades {

	GradedActivity[] grades;
	
	
	






	public CourseGrades(GradedActivity[] grades) {
		
		this.grades = grades;
	}



	public void setPassFailExam(GradedActivity exam) {
		
		exam = grades[1];
		
	}
	
	public void setEssay(GradedActivity essay) {
		
		essay = grades[2];
		
	}



	public void setLab(GradedActivity lab) {
		
		lab = grades[0];
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		GradedActivity[] grades = new GradedActivity[4];
		
		

		
		
	}

}
