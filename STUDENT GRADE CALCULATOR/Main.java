import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner s = new Scanner(System.in);

		        System.out.print("Enter the number of subjects: ");
		        int numOfSubjects = s.nextInt();

		        int totalMarks = 0;
		        for (int i = 1; i <= numOfSubjects; i++) {
		            System.out.print("Enter marks obtained in subject " + i + ": ");
		            int marks = s.nextInt();
					if(marks>100 || marks<0)
					{
						System.out.println("Invalid Mark ! Enter correct Mark Again");
						i--;
					}
		            totalMarks += marks;
		        }

		        double averagePercentage = (double) totalMarks / numOfSubjects;

		        char grade;
		        if (averagePercentage >= 90) {
		            grade = 'A';
		        } else if (averagePercentage >= 80) {
		            grade = 'B';
		        } else if (averagePercentage >= 70) {
		            grade = 'C';
		        } else if (averagePercentage >= 60) {
		            grade = 'D';
		        } else {
		            grade = 'F';
		        }

		        System.out.println("\nTotal Marks: " + totalMarks);
		        System.out.println("Average Percentage: " + averagePercentage + "%");
		        System.out.println("Grade: " + grade);

		        s.close();
		    

	}

}
