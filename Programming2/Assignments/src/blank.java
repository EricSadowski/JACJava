
public class blank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(withHonors("AAADFFF"));
		
		
	}
	
	
	
	public static boolean withHonors(String grade) {
		
		//double numGrades = 0;
		//double totalA = 0;
		int totalF = 0;
		String[] gradeArr = null;
		gradeArr = grade.split("");
		
		
		for(int i=0; i < gradeArr.length; i++) {
			//numGrades++;
		}
		
		
		
		/*for(int i=0; i < gradeArr.length; i++) {
			if(gradeArr[i].equals("A")) {
				String blank = "";
				for(int e = 0; e < 7; e++) {
					blank += i;
				}
				System.out.print(blank);
			}
		} */
		
		
		
		
		for(int i=0; i < gradeArr.length; i++) {
			if(gradeArr[i].equals("F")) {
				totalF++;		
			}
		}
		
		//if((totalA/numGrades) < (1.0 / 7.0)) {
			//return false;
		
		if(grade.contains("DDDD")) {
			return false;
		}
		else if(totalF > 2) {
			return false;
		}else {
			return true;
		}
		
		
		
	}


}
