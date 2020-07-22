package Arrays;

import java.util.HashMap;

public class ContiguousSubarraySum {
public int subarraySum(int[] nums, int k) {
        /*Explanation pending 
         * 
         * */
        HashMap<Integer,Integer> check= new HashMap<Integer, Integer>();
        int result=0;
        int currsum=0;
        check.put(0,1);
        for (int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if (check.containsKey(currsum-k)){
                int count=check.get(currsum-k);
                result+=count;
            }
            
                check.put(currsum,check.getOrDefault(currsum, 0) + 1);
            }
        return result;
        }
}
