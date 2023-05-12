package celilcavus.Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Context {
	private final String User = "root";
	private final String pass = "celil123";
	private final String host = "localhost";
	private final String database = "atm";
	private final int  port = 3306;
	
	public Connection conn;
	public Statement state;
	public ResultSet set;
	
	public Context() {
		
		final String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,User,pass);
			state = conn.createStatement();
			if(conn != null)
			{
				System.out.println("Connection Completed!");
				
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception ex == " + ex.getMessage());
		}
	}
	
}
