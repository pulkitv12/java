import java.io.*;
class student implements Serializable
{
	int roll;
	int sem;
	String name;
	public student(int r,int s,String n)
	{
		roll=r;
		sem=s;
		name=n;
	}
}
class xyz
{
	public static void main (String[] args) throws Exception
	{
		student s=new student(431,5,"Pulkit");
		FileOutputStream fos=new FileOutputStream("C:/Users/Pulkit/Desktop/magnet.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fos);
		oo.writeObject(s);
	}
}