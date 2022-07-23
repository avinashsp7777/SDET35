package javaproject1;

public class ReverseString {

	public static void main(String[] args) {
		// using concadination operator
		String s ="ABCD";                                                                                                                                                                                          
		String rev=" ";
		
//	int len = s.length();//26
		
//	for(int i=len-1;i>=0;i--) 
//	{
//		rev=rev+s.charAt(i);
//	}
		//System.out.println("Reversed string is:"+ rev);
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
