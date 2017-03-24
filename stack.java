import java.util.*;
class stack
{
		int a[]=new int[10];
		int top=-1;
	public void push(int x)
		{
			if(top==9)
			{
				System.out.println("Stack Overflow");
			}
			else
			{
				a[++top]=x;
			}
		}
	public	int pop()
		{
			top--;
			return -1;	
		}
	public	int check()
		{
			return a[top];
		}
	public	void show()
		{
			if(top==-1)
			{
				System.out.println ("Empty");
			}
			else
			{
				for(int i=0;i<=top;i++)
				{
					System.out.println (a[i]);
				}
			}
		}
		
		public static  void main(String[]args)
		{
			stack s1=new stack();
			s1.push(74);
			s1.push(89);
			s1.push(25);
			s1.push(39);
			s1.pop();
			s1.show();
		}
}