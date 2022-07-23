package Programms;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3,4,5};
     int b[]= {5,6,7,8};
     int count=a.length;
     
      for(int i=0;i<count;i++) 
      {
    	try 
    	{
    		System.out.println(a[i]+b[i]);
    	}
    	catch (Exception e)
      
      {
      if(a.length>b.length) 
      {
    	  System.out.println(a[i]);
  }else {
    	  System.out.println(b[i]);
  }
	}
      }
	}
}
	

