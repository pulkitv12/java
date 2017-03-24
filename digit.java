import java.util.*;
class digit
{
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		int num,n;
		int rev,s,t,sum;
		num=ip.nextInt();
		n=num;
		sum=0;
		double x=0;
		while(num!=0)
		{
			num=num/10;
			x++;
		}
		t=(int)Math.pow(10,x-1);
		rev=0;
		while(n!=0)
		{
			s=n%10;
			sum=sum+s;
			rev=rev+s*t;
			t=t/10;
			System.out.println(s);
			n=n/10;
		}
		System.out.println("Sum is "+sum);
		System.out.println("Rev is "+rev);
	}
}