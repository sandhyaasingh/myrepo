package com.tnsif.jdbc;
import java.sql.*; //2nd step
public class JDBCdemo {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/JDBCdemo";
		String username = "postgres";
		String password = "s";
		try {
			//Load the driver - 3rd step
			Class.forName("org.postgresql.Driver");
			
			//Establishing the connection - 4th step
			//connection interface
			Connection con = DriverManager.getConnection(url, username,password);
			
			//Define SQL Query - 5th step
			Statement st = con.createStatement();
			
			//Executing Query - 6th
			String query = "SELECT * FROM employee";
			
			//Proceed the Result - 7th step
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				String table = rs.getString(1) + ": " + rs.getInt(2);
				System.out.println(table);
			}
			//close the resources - 8th step
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
