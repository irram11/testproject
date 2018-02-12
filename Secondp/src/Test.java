public class Test {
	
		int number;
		
		public int getNumber() {
			return number;
			}
	public void setNumber() {
		this.number = number;
	}
	
	public static void main(String a[]) {
		
		
		Test obj = new Test();
		obj.setNumber(Integer.parseInt(a[0]));
		System.out.println(obj.getNumber());
	}
	
	
	
	
	
}