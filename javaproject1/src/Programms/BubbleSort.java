package Programms;

public class BubbleSort {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] a= {10,20,15,25,14};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++) {
				if(a[i]>a[j+1]) {
				int temp=a[i];
				a[i]=a[j+1];
				a[j+1]=temp;
				}
					 
			}
		}
		System.out.println("the sorted array is:" );
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		}
		

	}


