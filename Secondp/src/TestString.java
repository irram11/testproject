/**
 * 
 */

/**
 * @author Ikram Abdullah
 *
 */
public class TestString {

	private static final String Kedah = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**	
		int first = 1;
		int second = 2;
		int third = 3;
		String fourth =" ali ";
		String fifth =" nadim ";
		String sixth =new String (" abu ");
		
		
		if(fourth == fifth)
			System.out.println(" Now fourth and fifth is same: " + fourth);
		else
			System.out.println(" Now fourth and fifth is same: " + fourth);

		if(fourth == sixth) 
			System.out.println(" Now fourth and sixth are not: " + fourth);
		else
			System.out.println(" Now fourth and sixth are not: " + fourth);
			
		//fourth =  second + fourth;
		System.out.println(" Now fourth is: " + fourth);
		
		fourth = (fourth.valueOf(first)).concat(fourth);						 //first + second + third + fourth;
		System.out.println(" Now fourth is: " + fourth);
		System.out.println(1+ (2+(3+ "c")));
	
		*/
		
		String sms = "Selamat datang ke Malaysia!!";
		System.out.println(" Sms Size is " + sms.length());
		System.out.println(" Text at 10th position/ 9th index : " + sms.charAt(9));
		System.out.println(" Indec of the text! : " + sms.indexOf(""));
		System.out.println(" Substring of 0 - 10 : " + sms.substring(0,10));
		System.out.println(" lower: " + sms.toLowerCase());
		System.out.println(" UPPER : " + sms.toUpperCase());

		String country = "Malaysia";
		String replace = args [0];
		
		
		if(country.equals(args[0])) {
			System.out.println("Country is Malaysia" );
			}
		else {
			
			System.out.println("Country is Not Malaysia but " + replace.trim());
			//System.out.println("Country state in Malaysia " + replace.trim() );
		}
		
		String asia = "Malaysia" ;// "Singapore";
		//String asia = "Indonesia";
		String change = args[1];
		
		if(asia.equals(args[1])) {
			System.out.println("Country is in Asia");
			System.out.println(" Welcome to " + change.trim());
			}
		else {
			
			System.out.println("Country is not in Asia ");
			System.out.println(" Welcome to " + change.trim());
		
		
		
		}
	
		
	}

}
