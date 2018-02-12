
public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		StringBuilder study = new StringBuilder("I am Studying Java");
		System.out.println(" Character Size is " + study.length());
		System.out.println(" Print first 3 character : " + study.substring(0,4));
		System.out.println(" Print last 3 character : " +(study.substring(study.length()-3)));
		System.out.println(" Print last 3 character : " + study.substring(5,14).toUpperCase());
		System.out.println(" Print last 3 character : " +(study.substring(study.length()-14)));	
	
		*/
		
		StringBuilder study = new StringBuilder(args[0]);
		String constant = "studying";
		
		System.out.println(" String given " + study + " with length: "+ study.length());
		System.out.println(" First 3 : " + study.substring(0,3));
		System.out.println(" Last 3 : " +(study.substring(study.length()-3)));
	
		int startOfConstant = study.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println(" Given string : " + (study.substring(startOfConstant, endOfConstant)));
		

		study.insert((study.indexOf("am")+2), " irram ");
		System.out.println(" After insert: " + study);
		study.delete(study.indexOf("am"), study.indexOf("am") + 2);
		System.out.println(" After Delete: " + study);
	/**	
		StringBuilder study2 = new StringBuilder(args[0]);
		System.out.println(study == study2);
		StringBuilder study3 = (study.insert((study.indexOf, b));
		*/
		study = null;
		
		
		
				
		
	}
	
	
	

}
