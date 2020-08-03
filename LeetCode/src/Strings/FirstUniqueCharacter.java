package Strings;

import java.util.HashMap;

public class FirstUniqueCharacter {
	class Solution {
	    public int firstUniqChar(String s) {
	        if (s.length()==0)return -1;
	        HashMap<Character,Integer> check=new HashMap<Character,Integer>();
	        for (int i=0;i<s.length();i++){
	            if(!check.containsKey(s.charAt(i))){
	                check.put(s.charAt(i),1);
	            }else check.put(s.charAt(i),100);
	        }
	        
	        for (int j=0;j<s.length();j++){
	            if(check.get(s.charAt(j))==1){
	                return j;
	            }
	        }
	        return -1;
	    }
	}
}
