package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class first_JDBC_program {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		//1. load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// 2.establish connection between java and DB
		String url="jdbc:mysql://localhost:3306/JDBC_3rd_Year";
		String username="root";
		String password="Rishabh22@#";
		Connection con=DriverManager.getConnection(url,username,password);
		
		
		// 3.create object of any class 
		       Statement st=con.createStatement();
		       //int n =st.executeUpdate("create database JDBC_3rd_Year");
		       //System.out.println(n);
//		      int n1= st.executeUpdate("create table student (rollno int,name varchar(20),city varchar(20))");
//		      System.out.println(n1);
		       
		       con.close();
		       
		
		
		
	}

}
// java se data base connection ke liye 5 steps 
// 1.load and register the driver
// 2.establish connection between java and DB
// 3.create object of any class 
// 4.execute query
// 5.close connection
