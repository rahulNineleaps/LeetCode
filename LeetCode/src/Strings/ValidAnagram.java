package Strings;

import java.util.Arrays;

public class ValidAnagram {
	class Solution {
	    public boolean isAnagram(String s, String t) {
	       char[]sarr=s.toCharArray();
	       char[]tarr=t.toCharArray();
	        Arrays.sort(sarr);
	        Arrays.sort(tarr);
	       
	        String snew= new String (sarr);
	        String tnew= new String (tarr);
	        return snew.equals(tnew);
	        
	    }
	}
}
