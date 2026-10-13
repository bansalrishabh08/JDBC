package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/JDBC_3rd_Year";
		String username="root";
		String password="Rishabh22@#";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
//		String query=("insert into student values(103,'sachin','Lucknow')");
//		st.executeUpdate(query);
//		st.close();
//		String deleteQuery="delete from student where name='sachin'";
//		st.executeUpdate(deleteQuery);
//		st.close();
		Scanner sc=new Scanner(System.in);
//		int rollNo=sc.nextInt();
//		String name=sc.next();
//		String city=sc.next();
//		String query1="insert into student values("+rollNo+",'"+name+"','"+city+"')";
//		st.executeUpdate(query1);
//		int rollNo=sc.nextInt();
//		String name=sc.next();
//		String query2="update student set name='"+name+"' where rollNo="+rollNo;
//		st.executeUpdate(query2);
		
		String query="select * from student";
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
		System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"   "+rs.getString(3));
		}
		st.close();

	}

}
