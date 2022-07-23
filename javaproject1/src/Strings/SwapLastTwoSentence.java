package Strings;

public class SwapLastTwoSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hi Hello Welcome Bye";
		String[] s= st.split(" ");
		
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		

	}

}
