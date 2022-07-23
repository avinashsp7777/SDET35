package Strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintUniqueCharacterUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length();i++) {
			//System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			//System.out.println(set);
			}
		for (Character ch:set) {
			//System.out.println(ch);
		
		int count=0;
		for(int i=0; i<s.length();i++) {
			//System.out.println(s.charAt(i));
		
			if(ch==s.charAt(i)) {
				count++;
			}
		}
			if(count==1) {
				{
			System.out.println(ch+" "+count);		
				}
			}
		}
	}
}


