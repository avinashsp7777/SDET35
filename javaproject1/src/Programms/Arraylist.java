package Programms;

import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(9);
		alist.add(6);
		alist.add(1);
		alist.add(3);
		alist.add(5);
		
		//System.out.println("sort in assending order:"+alist);
		Collections.sort(alist);
		System.out.println("sort in assending order:"+alist);
		Collections.sort(alist,Collections.reverseOrder());//Desending order
		System.out.println("sort in decending order:"+alist);
	}

}
