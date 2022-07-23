package Strings;

import java.util.LinkedHashSet;

public class PrintOrderOfOccuranceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="Hi Hi Hello Welcome Bye";
		String []s=st.split(" ");
		//LinkedHashSet<String> set = new LinkedHashSet<String>();
		 for (int i=0; i<s.length;i++) {
			// set.add(s[i]);
			
		}
		 for(String st1:s)
		 {
			 for(int i=0;i<s.length;i++)
			 {
				 if(st1.equals(s[i]))
				 {
					 System.out.println(st1+"="+(i+1));
					 break;
					 }
			 }
		 }

		}

	}

