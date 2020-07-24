package Arrays;

import java.util.HashMap;

public class ContainsDuplicate2 {
	class Solution {
	    public boolean containsNearbyDuplicate(int[] nums, int k) {
	        HashMap<Integer,Integer> check= new HashMap<Integer,Integer>();
	        
	        if (nums==null) return false;
	       // boolean result=true;
	        
	        for (int i=0;i<nums.length;i++){
	            if (check.containsKey(nums[i])){
	               // int pos=check.get(nums[i]);
	               if(i-check.get(nums[i])<=k){
	               return true;
	           }
	            }
	            check.put(nums[i],i);
	        } return false;
	        
	        
	        
	    }
	}

}
