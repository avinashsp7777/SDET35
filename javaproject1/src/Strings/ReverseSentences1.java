package Strings;

public class ReverseSentences1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hi Hello Welcome Bye";
		String[] s=st.split(" ");
	    //char[]ch=s.toCharArray()
		
		for(int i=0;i<s.length;i++) 
		{
			String st1=s[i];
		for(int j=st1.length()-1;j>=0;j--)	{
			
	 System.out.print(st1.charAt(j));
		}
     System.out.print(" ");
	}

	}
}
