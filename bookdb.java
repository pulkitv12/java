import java.sql.*;
import java.util.*;

class book
{
	public static void main (String[] args) throws Exception
	{
		Connection con;
		Statement s;
		ResultSet rs;
		int x,bm;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/books","root","");
		s=con.createStatement();
		Scanner scn=new Scanner(System.in);
		do
		{
		System.out.printf("1.Manage Books\n2.Manage Purchases\n3.Manage Sales\n4.Search Book By Title.\n5.Search By Author.\n6.Search By Publisher\n7.Generate Order\n0.Quit\nENTER YOUR CHOICE\n");
		x=scn.nextInt();
		switch(x)
		{
		case 1:
		System.out.println ("-------------Books Menu-------------");
		System.out.println ("1.Add new Book\n2.Display Books\n3.Update price of a book\n4.Delete a book\n5.Search By Title.\n6.Back\n7.Quit\nENTER YOUR CHOICE");
			bm=scn.nextInt();
			switch(bm)
			{
				case 1:
					System.out.println ("Enter Title of Book");
					String bmt=scn.next();
					System.out.println ("Enter Author of Book");
					String bma=scn.next();
					System.out.println ("Enter Publisher of Book");
					String bmp=scn.next();
					System.out.println ("Enter Price of Book");
					int bprice=scn.nextInt();
					System.out.println ("Enter RecordLevel of Book");
					int brl=scn.nextInt();
					int bqty=0;
					s.execute("INSERT INTO `bookinfo`(`title`, `author`, `publisher`, `price`, `recordlevel`, `quantity`) VALUES ('"+bmt+"','"+bma+"','"+bmp+"',"+bprice+","+brl+","+bqty+")");
					break;
				case 2:
					rs=s.executeQuery("select * from bookinfo");
					while(rs.next()==true)
							System.out.println (rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getString(4)+"--"+rs.getString(5)+"--"+rs.getString(6)+"--"+rs.getString(7));
					break;
			}
		break;
		case 2:
		System.out.println ("-------------Purchase Menu-------------");
		System.out.println ("1.New Purchase\n2.View Purchase History\n3.Search book title in purchase\n4.Back\n5.Quit\nENTER YOUR CHOICE");
		break;
		case 3:
		System.out.println ("-------------Sales Menu-------------");
		System.out.println ("1.New Sale\n2.View Sale History\n3.Search book title in sales\n4.Back\n5.Quit\nENTER YOUR CHOICE");
		break;
		case 4:
		//srchrn(s);
		break;
		case 5:
	//	delrn(s);
		break;
		case 0:
		System.exit(0);
		}
		}while(x!=0);
	}
}