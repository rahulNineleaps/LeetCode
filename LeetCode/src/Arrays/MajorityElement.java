package Arrays;

import java.util.Arrays;

//array will always contain majority element , leetcode 
public class MajorityElement {
	class Solution {
	    public int majorityElement(int[] nums) {
	        Arrays.sort(nums);
	        return (nums[nums.length/2]);
	    }
	}
	

}
