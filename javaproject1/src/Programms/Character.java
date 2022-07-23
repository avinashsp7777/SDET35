package Programms;

import java.util.ArrayList;
import java.util.Collections;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("A");
		alist.add("C");
		alist.add("B");
		alist.add("F");
		alist.add("Z");
		
		Collections.sort(alist);
		System.out.println("sort in assending:"+alist);
		
		//sort in decending order
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("sort in reverse order"+alist);

	}

}
