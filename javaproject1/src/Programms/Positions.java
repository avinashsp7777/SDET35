package Programms;

import java.util.LinkedHashSet;

public class Positions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,2,3,7,5,5,7,7};
		 LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
         for (int i = 0; i < a.length; i++)
         {
             set.add(a[i]);
		  }
         for(Integer it:set) 
         {
        	 for (int i = 0; i < a.length; i++) 
        	 {
				if(a[i]==it) 
				{
					System.out.println(it+":"+i);
					break;
				}
			}
         }
	}

}
