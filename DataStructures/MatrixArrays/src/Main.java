import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello world!");



        System.out.println("Please enter the height and length of an array");

        int height = scanner.nextInt();
        int length = scanner.nextInt();

        try{
        Generator(height,length);}
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }


    public static void Generator(int height, int length){
        int[][] matrix = new int[length][height];
        int totalSum = 0;
        int rowTotal = 0;
        int [] rowMstr = new int[length];
        int [] colMstr = new int[height];


        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = rNum();
                totalSum = totalSum + matrix[i][j];
                rowTotal = rowTotal + matrix[i][j];
                colMstr[j] = colMstr[j] + matrix[i][j];
                System.out.printf("%d ", matrix[i][j]);
            }
            //System.out.println("Row total is: " + rowTotal);
            rowMstr[i] = rowTotal;
            rowTotal = 0;
            System.out.println();
        }
        System.out.println(totalSum);
        System.out.println(Arrays.toString(rowMstr));
        System.out.println(Arrays.toString(colMstr));
    }

    public static int rNum() {
        Random r = new Random();
        return r.nextInt(201);
    }

    public static boolean isPrime(int number){
        for(int n =2 ; n< Math.sqrt(number); n++){
            if(number % n == 0){
                return false;
            }
        }
        return number > 2 ;
    }




//    private static void findPairsOfPrime(int[][] data) {
//        for(int row=0; row< data.length ;row++){
//            for(int col= 0; col<data[row].length; col++){
//                for(int row2= row; row2< data.length; row2++){
//                    for(int col2= col + 1; col2 < data[row2].length; col2++){
//                        int val = data[row][col] + data[row2][col2];
//                        if(isPrime(val)){
//                            System.out.printf("prime sum %d of [%d, %d][%d, %d]",val, row, col, row2, col2 );
//                            System.out.println();
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//
//    private static void stdDeviation(int[][] data) {
//        double sum=0;
//        //avg = sumArray / width * height
//        double avg = sumArray(data) / (double) data.length * data[0].length;
//        for (int row = 0; row < data.length; row++) {
//            for (int col = 0; col < data[row].length; col++) {
//                sum += Math.pow(data[row][col] - avg, 2);
//            }
//        }
//
//        double v = sum / (data.length * data[0].length) - 1;
//        double std = Math.sqrt(v);
//        System.out.printf("std is %.3f \n", std);
//    }


}





//- I would like you to create a java simple app
//        - Takes the length and height of a 2D array of int
//        - give random numbers to the array between 0 and 200
//        - print the elements of the array
//        - print Sum of all the numbers
//        - print sum of each row
//        - print sum of each column
//        - find Standard deviation of array
//        - find pair of prime numbers