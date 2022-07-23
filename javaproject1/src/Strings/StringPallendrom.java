package Strings;

public class StringPallendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MADAM";
		String rev="";
		 
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
			if(s.equals(rev)) {
			System.out.println("the string is pallendrom");
			}else {
				System.out.println("the string is not pallendrom");
			}
		}

	}


