// Eric Sadowski  2338165

import java.util.Arrays;

public class CourseGrades {

	GradedActivity[] grades;
	private GradedActivity lab;
	private PassFailExam exam;
	private GradedActivity essay;
	private FinalExam finalEx;
	//private GradedActivity lab;
	
	
	






	public CourseGrades(GradedActivity[] grades) {
		
		this.grades = grades;
	}



	@Override
	public String toString() {
		return "CourseGrades [grades=" + Arrays.toString(grades) + ", lab=" + lab + ", exam=" + exam + ", essay="
				+ essay + ", finalEx=" + finalEx + "]";
	}



	public void setPassFailExam(PassFailExam exam) {
		
		this.exam = exam;
		
	}
	
	public void setEssay(GradedActivity essay) {
		
		this.essay = essay;
		
	}
	
	public void setFinalExam(FinalExam finalEx) {
		this.finalEx = finalEx;
	}



	public void setLab(GradedActivity lab) {
		
		this.lab = lab;
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//CourseGrades[] grades;
		
		CourseGrades[] grades = new CourseGrades[4];
		
		GradedActivity lab1 = new GradedActivity(78);
		for (int i=0;i<4;i++)
		{
		    grades[i]= new CourseGrades(null);  // create each actual Person
		}
		
		GradedActivity lab = new GradedActivity(78);
		
		grades[0].setLab(lab);
		
		PassFailExam exam = new PassFailExam(10, 7, 70);
		
		grades[1].setPassFailExam(exam);
		
		GradedActivity essay = new GradedActivity(88);
		
		grades[2].setEssay(essay);
		
		FinalExam finExam = new FinalExam(50, 20);
		
		grades[3].setFinalExam(finExam);
		
		System.out.println(Arrays.toString(grades));
		
//		
//	      grades[0] = new GradedActivity(70);
//	      //grades[0].setLab(95);
//
//	      // The second test is a pass/fail test. The
//	      // student missed 5 out of 20 questions, and the
//	      // minimum passing grade is 60.
//	      grades[1] = new PassFailExam(10, 70);
//
//	      // The third test is the final exam. There were
//	      // 50 questions and the student missed 7.
//	      grades[2] = new FinalExam(50, 7);
//
//		
		
	}

}
