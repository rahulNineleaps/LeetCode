package Arrays;

public class SortColors {
/*Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 * 
 * */
	
    public void sortColors(int[] nums) {
        int ones=0;
        int twos=0;
        int curr=0;
        for (int i=0;i<nums.length;i++){
           if(nums[i]==0){
               nums[curr]=0;
               curr+=1;
           }
            if(nums[i]==1){
                ones+=1;
            }
            if(nums[i]==2){
                twos+=1;
            }
            
        }
        for (int i=curr;i<curr+ones;i++){
            nums[i]=1;
        }
        for (int i =curr+ones;i<nums.length;i++){
            nums[i]=2;
        }
        
    }
	
	
}
