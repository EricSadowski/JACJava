// Eric Sadowski  2338165
import java.util.Arrays;
//import java.util.Collections;

public class ArrayOperations {

	
	public static double getTotal(int[] input) {
		
		double total = 0;
		for (int i = 0; i < input.length; i++) {
			total += input[i];
		}
		return total;		
	}
	
	public static double getTotal(double[] input) {
		
		double total = 0;
		for (int i = 0; i < input.length; i++) {
			total += input[i];
		}
		return total;		
	}
	public static double getTotal(float[] input) {
		
		double total = 0;
		for (int i = 0; i < input.length; i++) {
			total += input[i];
		}
		return total;		
	}
	
	public static double getTotal(long[] input) {
		
		double total = 0;
		for (int i = 0; i < input.length; i++) {
			total += input[i];
		}
		return total;		
	}
	
	public static double getAverage(int[] input) {
		
//		double total = 0;
//		for (int i = 0; i < input.length; i++) {
//			total += input[i];
//		}
//		return (total / input.length);	
		
		return getTotal(input) /input.length;
	}
	
	public static double getAverage(double[] input) {
		
		return getTotal(input) /input.length;	
	}
	
	public static double getAverage(float[] input) {
		
		return getTotal(input) /input.length;
	}
	
	public static double getAverage(long[] input) {
		
		return getTotal(input) /input.length;	
	}
	
	public static double getHighest(int[] input) {
		
        Arrays.sort(input);
		return input[input.length - 1];
	}
	
	public static double getHighest(double[] input) {
		
        Arrays.sort(input);
		return input[input.length - 1];
	}
	
	public static double getHighest(float[] input) {
		
        Arrays.sort(input);
		return input[input.length - 1];
	}
	
	public static double getHighest(long[] input) {
		
        Arrays.sort(input);
		return input[input.length - 1];
	}
	
	public static double getLowest(int[] input) {
		
        Arrays.sort(input);
		return input[0];
	}
	
	public static double getLowest(double[] input) {
		
        Arrays.sort(input);
		return input[0];
	}
	public static double getLowest(float[] input) {
		
        Arrays.sort(input);
		return input[0];
	}
	public static double getLowest(long[] input) {
		
        Arrays.sort(input);
		return input[0];
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr = { 5, 2, 1, 8, 10, 3 };
		
		double[] arr2 = { 25, 2, 60, 8, 10, 13 };
		
		float[] arr3 = { 15, 12, 1, 1002, 14, 63 };
		
		long[] arr4 = { 15, 12323, 1233, 1002, 143333, 63 };
		
		int[] arr5 = { 5, 2, 1, 8, 10, 3 };
		
		System.out.println(getTotal(arr));
		
		System.out.println(getLowest(arr2));
		
		System.out.println(getAverage(arr3));
		
		System.out.println(getTotal(arr4));
		
		System.out.println(getAverage(arr5));
		
		
		
		

	}

}
