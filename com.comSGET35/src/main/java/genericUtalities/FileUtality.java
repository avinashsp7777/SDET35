package genericUtalities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author avinash s p
 *
 */

public class FileUtality {
	public FileInputStream fs;
	/**
	 * 
	 * its is used get common data property file based on the key which you have  specified as a argument
	 * @return
	 * @throws Throwable 
	 */
	public String getProertyKeyValue(String Key) throws Throwable {
	fs = new FileInputStream("./src/test/resources/resources.properties");
	Properties pros = new Properties();
	pros.load(fs);
	String value = pros.getProperty(Key);
	return value;
	}
	public void closeProperty() throws Throwable {
		fs.close();
	}
}
