package Arrays;
//there are different ways of solving this problem , divide and conquer method , Kadanes Algorithm , 
//Kadane's algorithm is the most effective and efficient one 
public class MaximumSubArray {

	
	 public int maxSubArray(int[] nums) {
	        if (nums==null) return 0;
	        int localMax=nums[0];
	        int globalMax=nums[0];
	        for (int i=1;i<nums.length;i++){
	            localMax=Math.max(localMax+nums[i],nums[i]);
	            if(localMax>globalMax){
	                globalMax=localMax;}
	        }
	        return globalMax;
	        
	    }
}
