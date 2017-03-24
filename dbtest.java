import java.sql.*;
class testdb
{
	public static void main (String[] args)throws Exception
	{
		Connection con;
		Statement s;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/","root","");
		s=con.createStatement();
	//	s.execute("create database testdb;");
		s.execute("use testdb;");
		s.execute("drop table haha");
	}
}