package Arrays;

public class ProductOfArrayExceptSelf {
	class Solution {
	    public int[] productExceptSelf(int[] nums) {
	        //checking len
	        int len=nums.length;
	        
	        //creating left array
	        int[]left=new int[len];
	        left[0]=1;//initializing first pos
	        //creating right array
	        int[]right=new int[len];
	        right[len-1]=1;//initializing last pos
	        
	        int []result=new int[len];
	        
	        int product =1;
	        for(int i=1;i<len;i++){
	            product=product*nums[i-1];
	            left[i]=product;
	        }
	  
	        
	       
	        product=1;
	        //stupid me , instead of giving j>=0 , I was giving j<=0
	        for (int j=len-2;j>=0;j--){
	            product=product*nums[j+1];
	            right[j]=product;
	        }
	        
	        for (int i=0;i<len;i++){
	            result[i]=left[i]*right[i];
	        }
	        
	        return result;
	    }
	}
}
