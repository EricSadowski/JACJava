import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {
      boolean check =  checkForPalindrome("wow");
      System.out.println(check);
        System.out.println(checkForPalindrome("nope"));
        System.out.println(checkForPalindrome("racecar"));
    }



    private static Character[] stack = new Character[1];
    private static int size = 0;


    public void push(Character value){
        ensureSpaceForNewElement();
        stack[size] = value;
        size++;
    }

    public Character pop(){
        if(size == 0){
            return null;
        }else{

            Character popVal = stack[size-1];
            stack[size] = null;
            size--;
            return popVal;}
    }

    private static void ensureSpaceForNewElement() {
        if(size == stack.length){
            Character[] newData = new Character[stack.length * 2];
            for(int i=0; i< stack.length; i++){
                newData[i] = stack[i];
            }
            stack =newData;
        }
    }
    public static String convertString(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();

        return str;
    }

    public static boolean checkForPalindrome(String str){

        str = convertString(str);
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < charArray.length; i++ ){
            ensureSpaceForNewElement();
            stack[size] = charArray[i];
            size++;
           // System.out.println(charArray[i]);
        }

        //System.out.println(Arrays.toString(stack));

        for(int i = size - 1; i >= 0; i-- ){
            sb.append(stack[i]);
            stack[i] = null;
        }
        size = 0;


      //  System.out.println(str);
        String reverse = sb.toString();
       // System.out.println(reverse);
        if(str.equals(reverse)){
            return true;
        }

    return false;
    }
}
