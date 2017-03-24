import java.util.*;
class person
{
	private int age;
	private String name;
	private String gender;
	public person()
	{
		System.out.println ("Hi this is person");
		name=null;
		gender=null;
		age=0;
	}
	public person(String nm,String g,int a)
	{
		System.out.println ("Hi this is person");
		name=nm;
		gender=g;
		age=a;
	}
	public void inputp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Gender");
		gender=sc.next();
		System.out.println("Enter Age");
		age=sc.nextInt();
	}
	public void disp()
	{
		System.out.println ("Name"+name);
		System.out.println ("Gender"+gender);
		System.out.println ("Age"+age);
	}
}
class student extends person
{
	private int rollno;
	private String trade;
	private int sem;
	public student()
	{
		System.out.println ("Hi this is student");
		rollno=0;
		trade=null;
		sem=0;
	}
	public student(int r,String t,int s,String nm,String g,int a)
	{
		//System.out.println ("Hi this is Student");
		super(nm,g,a);
		rollno=r;
		trade=t;
		sem=s;
	}
	public void inputs()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno");
		rollno=sc.nextInt();
		System.out.println("Enter Trade");
		trade=sc.next();
		System.out.println("Enter Sem");
		sem=sc.nextInt();
	}
	public void disps()
	{
		super.disp();
		System.out.println ("RollNo."+rollno);
		System.out.println ("Trade"+trade);
		System.out.println ("Sem"+sem);
	}
}
class scholar extends student
{
	private int amt;
	private String pname;
	public scholar()
	{
		System.out.println ("Hi this is scholar");
		amt=20;
		pname="rocket0";
	}
}
class abc
{
	public static void main (String[] args) 
	{
		person p,p1;
		p=new person();
		scholar s=new scholar();
		s.disp();
		p=s;
		s=(scholar)p;
	}
}