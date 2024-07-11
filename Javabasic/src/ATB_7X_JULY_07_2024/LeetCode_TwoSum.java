package ATB_7X_JULY_07_2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        int[] nums= {2,7,11,15};
       
        
		int[] number = twoSum(nums,9);
		String result = Arrays.toString(number);
		System.out.println(result);

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] output=null;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int t = target - nums[i];
			if (map.containsKey(t)) {
				
			output=	new int[] {map.get(t), i};
			return  output;
			}
			map.put(nums[i], i);
		}
		return nums;
	}
}


