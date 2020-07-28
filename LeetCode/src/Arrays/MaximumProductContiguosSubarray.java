package Arrays;

public class MaximumProductContiguosSubarray {

	
	class Solution {
	    public int maxProduct(int[] nums) {
	        if(nums==null || nums.length==0) return 0;
	        int localmax=nums[0];
	        int localmin=nums[0];
	        int globalmax=nums[0];
	        for (int i=1;i<nums.length;i++){
	            int temp=localmax;
	             localmax=Math.max(Math.max(nums[i]*localmax,nums[i]*localmin),nums[i]);
	             localmin=Math.min(Math.min(nums[i]*temp,nums[i]*localmin),nums[i]);
	            
	            if(localmax>globalmax){
	                globalmax=localmax;
	            }            
	            
	        }
	        return globalmax;
	        
	    }
	}
}
