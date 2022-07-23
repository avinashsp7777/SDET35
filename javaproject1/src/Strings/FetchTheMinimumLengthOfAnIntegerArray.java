package Strings;

public class FetchTheMinimumLengthOfAnIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"a","ab","Hello","welcome","Hi"};
		String minlength=s[0];
	//	System.out.println(minlength.length());
		
		for(int i=1;i<s.length;i++) {
			//System.out.println(s[i]);
			if(minlength.length()>s[i].length()) {
				minlength=s[i];
			}
		}
    for(int i=0;i<s.length;i++) {
    	if(minlength.length()==s[i].length()) {
    		System.out.println(s[i]);
    	}
    }
    	
	}

}
