package Strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintThePositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String s1="";
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i=0; i<s.length();i++) 
		{
			//System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			//System.out.println(set);
		}
       for(Character ch:set) {
    	   //System.out.println(ch);
    	   
    	   int count=0;
    	   for(int i=0;i<s.length();i++) {
    		  // System.out.println(s.charAt(i));
    	   
    	   if(s.charAt(i)==ch) {
    		   count++;
    	   }
    	   }
       System.out.println(ch+":"+count);
    
	}
}
}