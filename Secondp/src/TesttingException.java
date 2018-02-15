
public class TesttingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = args[0];
			System.out.println("Your Name is"+ args[0]);
			
			if(!(name.startsWith("M"))) {
				throw new Exception ("Name should start with M");
			}
		System.out.println("Name printed.....");
			
		} catch (Exception ex) {
			
		System.out.println("Please provide your name as command line parameter." 
		+ "eg: java TestingExceptions <Your Name>");
			
		}
		
		System.out.println("I am done....");
		
		
	}
		

}
