import java.sql.*;
import java.util.*;
class abc
{
	public static void addr(Statement s,String nm,int rn,int sem) throws Exception
	{
		s.execute("insert into students (sname,rollno,sem) values ('"+nm+"',1410991431,5);");
	}
	public static void disp(Statement s) throws Exception
	{
		ResultSet rs=s.executeQuery("select * from students;");
		while(rs.next()==true)
			System.out.println (rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	}
	public static void srchn(Statement s) throws Exception
	{
		ResultSet rs=s.executeQuery("select * from students where sname='pulkitg';");
		while(rs.next()==true)
			System.out.println (rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3));
	}
	public static void srchrn(Statement s) throws Exception
	{
		ResultSet rs=s.executeQuery("select * from students where rollno=1410991431;");
		while(rs.next()==true)
			System.out.println (rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3));
	}
	public static void delrn(Statement s) throws Exception
	{
		s.executeUpdate("delete from students where rollno=1410991431;");
	}
	public static void main (String[] args) throws Exception
	{
		Connection con;
		Statement s;
		ResultSet rs;
		int x;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/stuinfo","root","");
		s=con.createStatement();
		Scanner scn=new Scanner(System.in);
		do
		{
		System.out.printf("1.Add New Record\n2.Display All Records\n3.Search By Name\n4.Search By RollNo.\n5.Delete By Roll No.\n0.Quit\nENTER YOUR CHOICE\n");
		x=scn.nextInt();
		switch(x)
		{
		case 1:
		addr(s,"Pulkit",1410991431,5);
		break;
		case 2:
		disp(s);
		break;
		case 3:
		srchn(s);
		break;
		case 4:
		srchrn(s);
		break;
		case 5:
		delrn(s);
		break;
		case 0:
		System.exit(0);
		}
		}while(x!=0);
	//	Runtime.getRuntime().exec( "command /c cls" ) ;
		con.close();
		System.out.println ("BYE BYE.....");
	}
}