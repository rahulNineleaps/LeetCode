package Arrays;

public class StockBuyAndSell {
	class Solution {
	    public int maxProfit(int[] prices) {
	        if (prices==null|| prices.length==0) return 0;
	        int result=0;
	        int min=Integer.MAX_VALUE;
	        int max=Integer.MIN_VALUE;
	        
	        
	        for (int i=0;i<prices.length;i++){
	            if (prices[i]<min){
	                min=prices[i];
	            }
	            else {
	               max= Math.max(max, prices[i]-min);
	            }
	        }
	        if (max<0)
	            return 0;
	        else return max;
	        
	    }
	}
}
