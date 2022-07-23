package Strings;

public class ReverseStrigUsingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABCD";
		char[] ch=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}

	}

}
