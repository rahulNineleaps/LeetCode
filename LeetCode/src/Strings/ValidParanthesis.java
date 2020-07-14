package Strings;

import java.util.Stack;

public class ValidParanthesis {
	  public boolean isValid(String s) {
	        Stack<Character>stack= new Stack<Character>();
	        for (int i=0;i<s.length();i++){
	            if(s.charAt(i)=='(' || (s.charAt(i)=='{')  ||  (s.charAt(i)=='['))
	            {
	            stack.push(s.charAt(i));
	                System.out.println("pushed");
	            }
	            else{
	                if(stack.isEmpty()) return false;
	                if(s.charAt(i)==')' && stack.pop()!='('){
	                    return false;
	                }
	                if(s.charAt(i)=='}' && stack.pop()!='{'){
	                    return false;
	                }
	                if(s.charAt(i)==']' && stack.pop()!='['){
	                    return false;
	                }
	            
	            }
	        }
	        return stack.isEmpty();
	    }
}


/* too easy , not giving explanation */
