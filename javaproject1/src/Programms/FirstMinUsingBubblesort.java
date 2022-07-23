package Programms;

public class FirstMinUsingBubblesort {
	public static void main(String[] args) {
		
	int a[]= {15,10,30,25,40};
	
  for(int i=0; i<a.length; i++)
  {
	  for (int j=0; j < a.length; j++) {
		
		  if(a[i]<a[j]) 
		  {
		  int temp=a[i];
		  a[i]=a[j];
		  a[j]=temp;
		  }
	   }
    }
	  System.out.println(a[0]+"");
	  System.out.println(a[1]+"");
  }
}

