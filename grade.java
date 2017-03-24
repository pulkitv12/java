import java.util.*;
class grade
{
	public static void main(String[]args)
	{
		Scanner ip=new Scanner(System.in);
		int marks;
		marks=ip.nextInt();
		if(marks>90)
			System.out.println ("Grade A+");
		else if(marks>80)
			System.out.println ("Grade A");
		else if(marks>70)
			System.out.println ("Grade B+");
		else if(marks>60)
			System.out.println ("Grade B");
		else if(marks>50)
			System.out.println ("Grade C");
		else
			System.out.println ("Fail");
	}
}