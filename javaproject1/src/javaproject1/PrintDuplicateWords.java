package javaproject1;

import java.util.LinkedHashSet;

public class PrintDuplicateWords {

	public static void main(String[] args) {
		String s= "I love my place i love my india";
		String [] src= s.split("");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0; i<src.length;i++)
		{
			set.add(src[i]);
			}
		for(String word:set)
		{
			int count=0;
           for(int i=0; i<src.length;i++)
           {
        	   if(word.equals(src[i]))
        	   {
        	   count++;
        	   }
		}
	    if(count>1)
		{
		System.out.println(word+" "+count);	
		}
		// TODO Auto-generated method stub
		}
	}
}

