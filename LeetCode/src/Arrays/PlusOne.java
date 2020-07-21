package Arrays;

public class PlusOne {
	
	    public int[] plusOne(int[] digits) {
	        int carry=1;
	        int len =digits.length -1;
	        for (int i=len;i>=0;i-=1){
	            System.out.println("inside for loop ");
	            if ((digits[i]+carry)>9){
	                digits[i]=0;
	                carry=1;
	            }
	            else{
	                System.out.println("in the else block");
	                System.out.println(digits[i]+1);
	                digits[i]=digits[i]+1;
	                return digits;
	               // carry=0;
	            }
	            
	            
	        }
	        
	        if(digits[0]==0){
	            int[] resultarray = new int[digits.length +1];
	            resultarray[0]=1;
	            for (int i=1;i<resultarray.length;i++){
	                resultarray[i]=0;
	            }
	                return resultarray;
	        } return digits;
	        
	    }
	}

