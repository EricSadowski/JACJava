// Eric Sadowski 2338165
public class Calculate {

	public static void main(String[] args) {
		
		
		System.out.println(countOccurrences("yoda", "If yoda was the govyoda of caliyoda"));

	}

	
	
	
	public static double areaCircle(int radius) {
		double area = Math.PI * (radius * radius); //used math pi for highest accuracy
		return area; 
	}
	
	public static int areaRect(int length, int width) {
		int area = length * width; 
		return area; 
	}
	
	public static int areaSquare(int side) {
		int area = side * side;
		return area; 
	}
	
	public static double areaTriangle(int base, int height) {
		double area = base * height / 2;
		return area; 
	}
	
	public static int areaTrap(int baseTop, int baseBottom, int height) {
		int area = (int) (height * ((baseTop + baseBottom)* 0.5)); //most calculation heavy. typecast to int at end rounding down
		return area; 
	}
	
	public static int areaPar(int length, int width) {
		int area = length * width;
		return area; 
	}
	
	public static int countWord(String searchFor, String str) {
		str = str.toLowerCase();
		searchFor = searchFor.toLowerCase();
	    String[] stringToArr = null;
	    int found = 0; // declare variables and change to lower case
		
		stringToArr = str.split(" "); // append 2nd input to array.. split by " "
		
	    for (int i = 0; i < stringToArr.length; i++) {
  	      if(searchFor.equals(stringToArr[i])) { // for each iteration compare searchFor to str array and if found + 1
  	    	  found++;
  	    	  
  	      }
  	    }
	    
	    return found;
	    
		}
	



public static int countOccurrences(String str1,String str2){
    int count = 0;
    int index = 0;
    while(index != -1){ 
        index = str1.indexOf(str2, index);
        if(index != -1){
            count++;
            index += str2.length();
        }
    }
    return count;
}
	
}