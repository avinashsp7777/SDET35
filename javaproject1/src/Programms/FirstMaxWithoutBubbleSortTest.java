package Programms;

public class FirstMaxWithoutBubbleSortTest {

	public static void main(String[] args) {
		// fiest maximum without bubble sort
		int a[]= {15,20,10,25,30};
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
       System.out.println(max);
	}

}
