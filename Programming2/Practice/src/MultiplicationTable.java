
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int rows = 6, cols = 5;
		for (int r = 1; r <= rows; r++) {
			for (int c=1; c <= cols; c++) {
				System.out.print((r*c) + "\t");
				System.out.print(rows);
			}
			System.out.println();
		}
		
	}

}
