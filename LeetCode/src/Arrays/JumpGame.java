package Arrays;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        int maxjump=0;
        for (int i=0;i<nums.length;i++){
        int currjump=i+nums[i];
            maxjump=Math.max(currjump,maxjump);
           if(maxjump>=nums.length-1) return true;
            if(maxjump==i)return false;
    }return true;
    }
}

/*Problem Statement 
 *Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

 EXPLANATION ::
 
 The only condition in which it won't be able to make out of this jump game is if Current max is equal to i , where current
 max is calculated on basis of current position and value on current position , This will only be awarded if current max is 
 greater than global max . This can be better explained with graph and flatline on the graph .  
 * 
 * 
 * 
 * 
 * 
 * 
 */
 