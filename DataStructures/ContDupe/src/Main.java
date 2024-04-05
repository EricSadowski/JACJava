import java.util.*;

public class Main {
    public static void main(String[] args) {

    int[] yoga = {1, 2, 3};
    int[] beach = {1, 2, 1, 3};
    int[] bench = {1, 2, 1, 3, 4, 6, 3, 3, 3, 3, 1, 1 , 1 ,1 ,1 };
    int[] quad = {1, 2, 4, 6, 3};



    System.out.println(containsDuplicate(yoga));
    System.out.println(containsDuplicate(beach));
    System.out.println(containsDuplicate(quad));
    System.out.println(containsDuplicate(bench));


    System.out.println(Arrays.toString(frequencyOf(bench)));


    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for(int i : nums){
            if(hashset.add(i) == false){
                return true;
            };
            hashset.add(i);
        }
        return false;
    }

    public static int[] frequencyOf(int[] arr){
        HashMap<Integer, Integer> countMap
                = new HashMap<>();

        for (int c : arr) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            }
            else {
                countMap.put(c, 1);
            }
        }

        int maxValueInMap = (Collections.max(countMap.values()));

        // Iterate through HashMap
        for (Map.Entry<Integer, Integer> entry :
                countMap.entrySet()) {

            if (entry.getValue() == maxValueInMap) {

                // Print the key with max value
                return new int[] {entry.getKey(), entry.getValue()};
            }
        }
        return new int[]{0};
    }
}



