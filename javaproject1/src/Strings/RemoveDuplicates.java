package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String str="WElcome";
		String s= str.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length();i++) {
			set.add(s.charAt(i));
		}
			for (Character ch:set) 
			{
				for(int i=0; i<s.length();i++) 
				{
					if(ch==s.length())
					{
						System.out.println(ch+"="+(i+1));
						 break;
					}
				}
			}
		}
}
	



