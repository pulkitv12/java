import java.util.*;
class swap
{
	public static void main(String[]args)
	{
		System.out.println("Enter Two Numbers");
		int a,b;
		Scanner ip=new Scanner(System.in);
		a=ip.nextInt();
		b=ip.nextInt();
		int temp;
		a=a+b;
		b=a-b;
		a=a-b;		
		System.out.println("Final Values are:");
		System.out.println(a);
		System.out.println(b);
	}
}
