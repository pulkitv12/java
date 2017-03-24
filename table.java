import java.util.*;
public class table
{
	
	public int input()
	{
		int n;
		Scanner ip=new Scanner(System.in);
		n=ip.nextInt();
		return n;
	}
	public void mul(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+n*i);
		}
	}
	public static void main (String[]args)
	{
		table t1=new table();
		t1.mul(t1.input());
	}
}