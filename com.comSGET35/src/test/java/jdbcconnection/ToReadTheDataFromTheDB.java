package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ToReadTheDataFromTheDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver driverReference = new Driver();
		DriverManager.registerDriver(driverReference);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement statements = connection.createStatement();
		String Query = "select * from project";
		ResultSet result = statements.executeQuery(Query);
		
		while(result.next()) {
			System.out.println(result.getString(1)+" "+ result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
			}
         connection.close();
	}
}
