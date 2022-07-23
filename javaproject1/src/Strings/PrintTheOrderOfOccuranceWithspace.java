package Strings;

import java.util.LinkedHashSet;

public class PrintTheOrderOfOccuranceWithspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st =" hello ";
		String s= st.trim();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=s.length()-1;i>=0;i--) {
			set.add(s.charAt(i));
		}
        for(Character ch : set) {
        	for(int i=s.length()-1;i>=0;i--)
        	{
        		if(ch==s.charAt(i)) {
        			System.out.println(ch+":"+(i+1));
        			break;
        		}
        	}
        }
	}

}
