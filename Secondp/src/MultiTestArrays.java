import java.util.Arrays;

/**
 * 
 */

/**
 * @author Ikram Abdullah
 * this class test java arrays
 */
public class MultiTestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
															// TODO Auto-generated method stub
															//double salaries[] = {100, 150, 160, 170, 180, 200, 220.22};
															//for(int i=0; i <= salaries.length; i++) {
															//	System.out.println("Salary of " + i + " is " + salaries[i]);
															//	}
		
		String course_subjects[][]= new String [3][5];
		course_subjects[0][0] = "CS-Math" ;
		course_subjects[0][1] = "CS-English" ;
		course_subjects[1][0] = "AC-Accounting" ;
		course_subjects[1][1] = "Ac-Bahasa Melayu" ;
		
		
		String course_subjects2 [][] = {{ "CS-Math" , "CS-English" , "AC-Accounting" ,"Ac-Bahasa Melayu" }};
		
		
		for (int i = 0; i < course_subjects.length; i++) {
			for (int j = 0; j < course_subjects[i].length; j++) {
			System.out.println( " Course of " + i + " Subject of " + j + " is " + course_subjects [i] [j]);
			}
			
		}
		
															/**	int i =0;
															for (double sal:salaries) {
															System.out.println(" Salary of "+ i + " is " + sal);
															i++;
															 		*/
		}
	
}
