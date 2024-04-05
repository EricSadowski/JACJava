import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		int[] gold = new int[2];
		ArrayList<Integer> combo2 = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<>();
		for (int num : nums) {
		    temp.add(num);
		}
						
		for (int j = 0;j<nums.length-1;j++) {							
			for (int i=0;i<temp.size()-1;i++) {
				int num = temp.get(0);
				int next = temp.get(i+1);
				int added = num + next;
				if(added == target) {
					System.out.println("Wow you found the target");
					gold[0]= num;
					gold[1]=next;
					return gold;
				}
				combo2.add(added);
			}
			System.out.println(combo2);
			temp.remove(0);
			combo2.clear();
			
 }
return gold;
		
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target = 10;
		int[] test = new int[] {1,2,3,4,6,7};

		TwoSum twoSumInstance = new TwoSum();
		
        int[] indices = twoSumInstance.twoSum(test, target);

        // Print the result
        System.out.println(Arrays.toString(indices));
		
}
}