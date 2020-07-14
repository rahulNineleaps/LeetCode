package MAthematical;

public class PowerOfTwo {
	   public boolean isPowerOfTwo(int n) {
	        if(n==0) return false;
	      while((n&1)==0){
	    	  //right shift of the number 
	          n=n>>1;
	      }
	        if(n==1){
	            return true;
	        }else return false;
	    }
}


/*any number with base 2 will have only one 1 
 * 
 * Example 
 * 4--> 100
 * 8--> 1000
 * 16-->10000
 * 32-->100000
 *  
 * 
 * */
 

/*power of three and power of 4 by kernighan's theorem also calcualting number of set bits 
 *  
 * Need to solve these ASAP Date Fixed :: 15th July 2020 
 *  
 * URI for the following :::
 * 
 * https://leetcode.com/problems/number-of-1-bits/
 * https://leetcode.com/problems/power-of-three/
 * https://leetcode.com/problems/power-of-four/
 * https://leetcode.com/problems/powx-n/
 * 
 * */
 