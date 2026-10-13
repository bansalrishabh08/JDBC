package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class CallStatement {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/JDBC_3rd_Year";
		String username="root";
		String password="Rishabh22@#";
		Connection con=DriverManager.getConnection(url,username,password);
		CallableStatement call=con.prepareCall("{call getRollNo(?,?)}");
		call.setString(1, "Bansal");
		call.registerOutParameter(2, Types.INTEGER);
		call.executeQuery();
		System.out.println(call.getInt(2));
		con.close();
		

	}

}
