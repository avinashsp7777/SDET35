package Strings;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,3,4,2,1};
     
       LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0; i<a.length;i++) {
			//System.out.println(s.charAt(i));
			set.add(a[i]);
			//System.out.println(set);
			}
		for (Integer ch:set) {
			//System.out.println(ch);
		
		int count=0;
		for(int i=0; i<a.length;i++) {
			//System.out.println(s.charAt(i));
		
			if(ch==a[i]) {
				count++;
			}
		}
			if(count>1) {
				{
			System.out.println(ch+" "+count);		
				}
			}
		}
	}
}