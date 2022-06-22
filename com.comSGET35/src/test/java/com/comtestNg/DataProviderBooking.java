package com.comtestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBooking {
	  @Test(dataProvider="booktickets")
	 
	public void ticketBook(String src, String dst, int seatno) 
	{
		System.out.println("From"+src+"to"+dst+"seatno"+seatno); 
		
	}
   @DataProvider
	public Object[][]booktickets(){
		Object[][] objArr= new Object[3][3];
		objArr[0][0]="bangalore";
		objArr[0][1]="goa";
		objArr[0][2]=3;
		
		objArr[1][0]="banglore";
		objArr[1][1]="mangalore";
		objArr[1][2]=2;
		
		objArr[2][0]="banglore";
		objArr[2][1]="mysore";
		objArr[2][2]=4;
		return objArr;
		
	}
}
