package login;

import java.sql.*;

public class connect 
{
	static Connection con=null;
	public static Connection get_connection() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/productdetails";
			String username="root";
			String password="root";
			
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

}
