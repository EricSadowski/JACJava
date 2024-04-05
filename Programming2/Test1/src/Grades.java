import java.util.Scanner;

//Eric Sadowski 2338165
public class Grades {

	/*
	 * String[] names; char[] grades; double[] one; double[] two; double[] three;
	 * double[] four; double[] five;
	 * 
	 * 
	 * 
	 * public Grades(String[] names, char[] grades, double[] one, double[] two,
	 * double[] three, double[] four, double[] five) {
	 * 
	 * this.names = names; this.grades = grades; this.one = one; this.two = two;
	 * this.three = three; this.four = four; this.five = five; }
	 */


	public static void main(String[] args) {
		
		
		String[] names = new String[5];
		char[] grades = new char[5];
		double[] one = new double[4];
		double[] two = new double[4];
		double[] three = new double[4];
		double[] four = new double[4];
		double[] five = new double[4];

		
		Scanner input = new Scanner(System.in);
		

			
			
			System.out.println("Welcome teacher! Please enter data for student one");
			System.out.println("Name?");		
			names[0] = input.nextLine();
			System.out.println("Grade 1?");
			one[0] = input.nextDouble();
			if(one[0] < 0 || one[0] > 100) {
				input.close();
			}
			System.out.println("Grade 2?");
			one[1] = input.nextDouble();
			if(one[1] < 0 || one[1] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 3?");
			one[2] = input.nextDouble();
			if(one[2] < 0 || one[2] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 4?");
			one[3] = input.nextDouble();
			if(one[3] < 0 || one[3] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			input.nextLine();
			
			
			
			System.out.println("Welcome teacher! Please enter data for student two");
			System.out.println("Name?");		
			names[1] = input.nextLine();
			System.out.println("Grade 1?");
			two[0] = input.nextDouble();
			if(two[0] < 0 || two[0] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 2?");
			two[1] = input.nextDouble();
			if(two[1] < 0 || two[1] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 3?");
			two[2] = input.nextDouble();
			if(two[2] < 0 || two[2] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 4?");
			two[3] = input.nextDouble();
			if(two[3] < 0 || two[3] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			input.nextLine();
			
			
			System.out.println("Welcome teacher! Please enter data for student three");
			System.out.println("Name?");		
			names[2] = input.nextLine();
			System.out.println("Grade 1?");
			three[0] = input.nextDouble();
			if(three[0] < 0 || three[0] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 2?");
			three[1] = input.nextDouble();
			if(three[1] < 0 || three[1] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 3?");
			three[2] = input.nextDouble();
			if(three[2] < 0 || three[2] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 4?");
			three[3] = input.nextDouble();
			if(three[3] < 0 || three[3] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			input.nextLine();
			
			
			System.out.println("Welcome teacher! Please enter data for student four");
			System.out.println("Name?");		
			names[3] = input.nextLine();
			System.out.println("Grade 1?");
			four[0] = input.nextDouble();
			if(four[0] < 0 || four[0] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 2?");
			four[1] = input.nextDouble();
			if(four[1] < 0 || four[1] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 3?");
			four[2] = input.nextDouble();
			if(four[2] < 0 || four[2] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 4?");
			four[3] = input.nextDouble();
			if(four[3] < 0 || four[3] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			input.nextLine();
			
			
			System.out.println("Welcome teacher! Please enter data for student five");
			System.out.println("Name?");		
			names[4] = input.nextLine();
			System.out.println("Grade 1?");
			five[0] = input.nextDouble();
			if(five[0] < 0 || five[0] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 2?");
			five[1] = input.nextDouble();
			if(five[1] < 0 || five[1] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 3?");
			five[2] = input.nextDouble();
			if(five[2] < 0 || five[2] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			System.out.println("Grade 4?");
			five[3] = input.nextDouble();
			if(five[3] < 0 || five[3] > 100) {
				System.out.println("Invalid Input");
				input.close();
			}
			

			
			
		System.out.println("Thank you for your input!");
		
		double totalOne = 0;
		for (int i = 0; i < one.length; i++)
		{
			totalOne += one[i];
		   
		}
		double avg1 = totalOne / 4;
		
		
		
		
		double totalTwo = 0;
		for (int i = 0; i < two.length; i++)
		{
			totalTwo += two[i];
		   
		}
		double avg2 = totalTwo / 4;
		
		
		
		double totalThree = 0;
		for (int i = 0; i < three.length; i++)
		{
			totalThree += three[i];
		   
		}
		double avg3 = totalThree / 4;
		
		
		
		double totalFour = 0;
		for (int i = 0; i < four.length; i++)
		{
			totalFour += four[i];
		   
		}
		double avg4 = totalFour / 4;
		
		
		
		double totalFive = 0;
		for (int i = 0; i < five.length; i++)
		{
			totalFive += five[i];
		   
		}
		double avg5 = totalFive / 4;
		

		
		char grade1 = 0;
		char grade2 = 0;
		char grade3 = 0;
		char grade4 = 0;
		char grade5 = 0;
		
		if(avg1 <= 59) {
			grade1 = 'F';
		}else if(avg1 >= 60 && avg1 <= 69) {
			grade1= 'D';
		}else if(avg1 >= 70 && avg1 <= 79) {
			grade1= 'C';
		}else if(avg1 >= 80 && avg1 <= 89) {
			grade1= 'B';
		}else if(avg1 >= 90 && avg1 <= 100) {
			grade1= 'A';
		}
		
		if(avg2 <= 59) {
			grade2 = 'F';
		}else if(avg2 >= 60 && avg2 <= 69) {
			grade2= 'D';
		}else if(avg2 >= 70 && avg2 <= 79) {
			grade2= 'C';
		}else if(avg2 >= 80 && avg2 <= 89) {
			grade2= 'B';
		}else if(avg2 >= 90 && avg2 <= 100) {
			grade2= 'A';
		}
		
		if(avg3 <= 59) {
			grade3 = 'F';
		}else if(avg3 >= 60 && avg3 <= 69) {
			grade3= 'D';
		}else if(avg3 >= 70 && avg3 <= 79) {
			grade3= 'C';
		}else if(avg3 >= 80 && avg3 <= 89) {
			grade3= 'B';
		}else if(avg3 >= 90 && avg3 <= 100) {
			grade3= 'A';
		}
		
		if(avg4 <= 59) {
			grade4 = 'F';
		}else if(avg4 >= 60 && avg4 <= 69) {
			grade4= 'D';
		}else if(avg4 >= 70 && avg4 <= 79) {
			grade4= 'C';
		}else if(avg4 >= 80 && avg4 <= 89) {
			grade4= 'B';
		}else if(avg4 >= 90 && avg4 <= 100) {
			grade4= 'A';
		}
		
		if(avg5 <= 59) {
			grade5 = 'F';
		}else if(avg5 >= 60 && avg5 <= 69) {
			grade5= 'D';
		}else if(avg5 >= 70 && avg5 <= 79) {
			grade5= 'C';
		}else if(avg5 >= 80 && avg5 <= 89) {
			grade5= 'B';
		}else if(avg5 >= 90 && avg5 <= 100) {
			grade5= 'A';
		}

		
		System.out.println("Name of student 1: "+ names[0]);
		System.out.println("Name of student 2: "+ names[1]);
		System.out.println("Name of student 3: "+ names[2]);
		System.out.println("Name of student 4: "+ names[3]);
		System.out.println("Name of student 5: "+ names[4]);
		
		

		System.out.println("GPA of Student 1: " + avg1);
		System.out.println("GPA of Student 2: "+avg2);
		System.out.println("GPA of Student 3: "+avg3);
		System.out.println("GPA of Student 4: "+avg4);
		System.out.println("GPA of Student 5: "+avg5);
		
		System.out.println("Letter grade of student 1: " + grade1);
		System.out.println("Letter grade of student 2: " + grade2);
		System.out.println("Letter grade of student 3: " + grade3);
		System.out.println("Letter grade of student 4: " + grade4);
		System.out.println("Letter grade of student 5: " + grade5);

		
		

	}

}
