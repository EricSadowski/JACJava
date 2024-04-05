
public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		smallest(20, 6, 7);
		average(12, 20, 17);
		
		System.out.println(getStart("Yoga"));
	}

	
	public static void smallest(int a, int b, int c) {
		
		if(a < b && a < c) {
			System.out.println(a);
		}
		if(b < a && b < c) {
			System.out.println(b);
		}
		if(c < a && c < b) {
			System.out.println(c);
		}
	}
	
	public static void average(int a, int b, int c) {
		
		System.out.println((a + b + c) / 3);
		
	}
	
	
	public static String getStart(String x) {
		
		String strReturn = "";
		
		int midpoint = x.length() / 2;
		for (int i = 0; i < midpoint ; i++ ) {  
			strReturn += x.charAt(i);
		}
		return strReturn;
			 
	}
	
}
