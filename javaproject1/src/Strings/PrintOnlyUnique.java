package Strings;

import java.util.LinkedHashSet;

public class PrintOnlyUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hi Hi Hello Welcome Bye";
		String []s=st.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
       for(String str:set) {
    	   int count=0;
    	   for(int i=0;i<s.length;i++) {
    		   if(str.equals(s[i])) {
    			   count++;
    			   }
    	   }
    	   if(count==1) {
    		   System.out.println(str+":"+count);
    	   }
       }
	}
	}
