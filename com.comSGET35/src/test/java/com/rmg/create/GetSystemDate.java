package com.rmg.create;

import java.util.Date;

public class GetSystemDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
	    String dateAndTime = date.toString();
	   String yyyy = dateAndTime.split(" ")[5];
	   String dd = dateAndTime.split(" ")[2];
	  int mm = date.getMonth()+1;
	   
	   
	  String finalformat = yyyy+" "+" "+dd+" "+mm;
	    System.out.println(finalformat);
		
	}

}
