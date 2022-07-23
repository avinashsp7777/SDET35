package Programms;

import java.util.Iterator;

public class FirstMinWithoutBubblesortTest {

	public static void main(String[] args) {
		// first min without bubble sort
         int a[]= {10,30,15,40,25};
         int min=a[0];
         
         for (int i = 0; i < a.length; i++) {
			
        	 if(min>a[i]) {
        		 min=a[i];
        	 }
        	 }
         System.out.println(min);
      }

}
