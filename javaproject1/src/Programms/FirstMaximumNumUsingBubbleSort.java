package Programms;

public class FirstMaximumNumUsingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,40,30,20,10};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				if(a[i]>a[j]) 
				{
				int temp=a[i];
				a[i]=a[j];                                                                   
				a[j]=temp;
					
				}
			}
			
		}
		System.out.println(a[0]+"");
}

}
