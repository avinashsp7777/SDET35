package javaproject1;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="welcome to India welcome to Bangalore";
		String[] str= s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
			
		}
		for(String word :str) {
	
		System.out.println(word+" ");
}
	}
}
