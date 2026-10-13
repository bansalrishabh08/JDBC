package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class PrepareStatement {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/JDBC_3rd_Year";
		String username="root";
		String password="Rishabh22@#";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
//		ps.setInt(1,201);
//		ps.setString(2, "Rahul");
//		ps.setString(3, "Rajasthan");
//		ps.setInt(1,202);
//		ps.setString(2, "Sharma");
//		ps.setString(3, "Kosi");
//		ps.addBatch();
//		ps.setInt(1,203);
//		ps.setString(2, "JHA");
//		ps.setString(3, "Bihar");
//		ps.addBatch();
		ps.executeBatch();
		ps.close();
		

	}

}
