package javaproject1;

import java.util.LinkedHashSet;

public class NumOfOccuranceOfEachChar {

	public static void main(String[] args) {
		String s ="India";
		//to add allthe charactere in to set type collection
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			}
		// compare each and every element of character with all elements of string
		for(char ch:set)
		{
			int count=0;
			for (int i=0;i<s.length();i++)
			{
				if (ch==s.charAt(i))
				{
					count++;
			}
		}
		System.out.println(ch+" "+count);
	}

}
}
