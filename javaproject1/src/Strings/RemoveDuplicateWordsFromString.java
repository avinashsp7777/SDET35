package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Hi Hi Hello Welcome Bye";
		String[] str= s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String word :set) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
	
		System.out.println(word+"="+count);
}
	}

}



