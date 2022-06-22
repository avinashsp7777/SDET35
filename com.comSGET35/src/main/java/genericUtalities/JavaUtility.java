package genericUtalities;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author avinash s p
 * 
 */

public class JavaUtility {
	/**
	 * its used to generate random number
	 * @return
	 */
public int getRandomNumber() {
	Random random = new Random();
	int randNum = random.nextInt(1000);
	return randNum;
}
/**
 * its used to get systemDateAndTime in IST format
 * @return
 */
public String getSystemDateAndTimeInIstformat() {
	Date date = new Date();
	return date.toString();
}
/**
 * its used to get system date and time in reqiired format
 * @return
 */
 public String getSystemDateAndTimeInFormat() {
	Date date = new Date();
    String dateAndTime = date.toString();
   String yyyy = dateAndTime.split(" ")[5];
   String dd = dateAndTime.split(" ")[2];
  int mm = date.getMonth()+1;
   
   
  String finalformat = yyyy+" "+" "+dd+" "+mm;
    return (finalformat);
	
	}

}
