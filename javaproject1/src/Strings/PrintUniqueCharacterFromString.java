package Strings;

import java.util.LinkedHashSet;

public class PrintUniqueCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String S1="";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
      for(Character ch:set) {
    	  int count=0;
    	  for(int i=0; i<s.length();i++) {
    		  
    		  if(ch==s.charAt(i)) {
    			  count++;
    		  }
    		  }
    	  if(count==1) {
    		  System.out.println(ch+" "+count);
    	  }
      }
	}
}
