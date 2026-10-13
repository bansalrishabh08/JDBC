package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdatation {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/JDBC_3rd_Year";
		String username="root";
		String password="Rishabh22@#";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		
		String insert="insert into student values(111,'manish','Udaipur')";
		String insert1="insert into student values(112,'manisha','Mathura')";
		String update ="update student set rollNo=113 where name='rishabh'";
		String delete ="delete from student where rollNo=103";
		st.addBatch(insert);
		st.addBatch(insert1);
		st.addBatch(update);
		st.addBatch(delete);
		
		int[] a=st.executeBatch();
		System.out.println(a.length);
		st.close();

	}

}
