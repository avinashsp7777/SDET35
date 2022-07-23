package Strings;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi hello Welcome Bye";
		String[]str=s.split(" ");
		String rev="";
		
		for(int i=str.length-1;i>=0;i--) {
			System.out.println(str[i]+"");
		}

	}

}
