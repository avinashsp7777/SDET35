package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ToReadDataFromDB {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		//create statement
		Statement statement = connection.createStatement();
		String Query = "insert into project values('TY_PROJ_003','yuvraj','5/05/2022','flipkart','Created','3')";
		int result = statement.executeUpdate(Query);
		if(result==1){
			System.out.println("is created");
		}else {
			System.out.println("not created");
			}
	}
}

	


