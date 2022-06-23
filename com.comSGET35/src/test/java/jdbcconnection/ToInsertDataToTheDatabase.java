package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ToInsertDataToTheDatabase {

	public static void main(String[] args) throws SQLException {
		//Hi
		//hello
		// TODO Auto-generated method stub
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		//connect to DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		//create statement
		Statement ststement = connection.createStatement();
		String Query = "insert into project values('TY_PROJ_002','avinash','26/05/2022','flipkart','Created','4')";
		//execute query
		int result = ststement.executeUpdate(Query);
		if(result==1) {
			System.out.println("is created");
		}else {
			System.out.println("not created");
			}
	}

}
