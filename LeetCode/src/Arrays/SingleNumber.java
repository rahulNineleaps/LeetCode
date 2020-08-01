package Arrays;

public class SingleNumber {

	//butch up solution is 
	
	/*class Solution {
	    
	    // 1,1,2,2,3,3,4
	    public int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        for (int i=0;i<=nums.length-2;i+=2){
	         //   System.out.println("value at i is :: "+nums[i]+" :: value at i+1 is :"+nums[i+1]);
	            if(nums[i]!=nums[i+1]){
	                System.out.println("condition reached ");
	                return nums[i];
	            }
	           
	        }
	        if (nums.length%2==1){
	               return nums[nums.length-1];
	           }
	        else{
	        return -1;
	        
	    }}
	}*/
	
	//xor one is much better and elegant solution 
	
	
	class Solution {
	    public int singleNumber(int[] nums) {
	        int result=0;
	        for (int i=0; i<nums.length;i++){
	            result=result^nums[i];
	            
	        }return result;
	        
	    }
	}
	
}
