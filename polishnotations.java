import java.util.*;
class stack
{
	char arr[]=new char[20];
	int top=-1;
	
	public void push(char v)
	{
		arr[++top]=v;
	}
	public char pop()
	{
		char temp=arr[top];
		top--;
		return temp;
	}
	
	public void show()
	{
		if(top==-1)
			System.out.println ("Stack Empty");
		else
		for(int i=0;i<=top;i++)
			System.out.println(arr[i]);
	}
}
class abc
{
	public static void main(String r[])
	{
		stack s=new stack();
		s.push('(');
		Scanner ip=new Scanner(System.in);
		System.out.println ("Enter Expression");
		String x=ip.next();
		String exp=x+")";
		String pexp=new String();
		System.out.println (exp);
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='(')
				s.push('(');
			else if(exp.charAt(i)==')')
			{
				while(s.arr[s.top]!='(' && (s.arr[s.top]=='+' ||s.arr[s.top]=='-' || s.arr[s.top]=='*' || s.arr[s.top]=='/'))
				{
					pexp=pexp+s.pop();
				}
				if(s.arr[s.top]=='(')
					s.pop();
			}
			else if(exp.charAt(i)=='+' ||exp.charAt(i)=='-' || exp.charAt(i)=='*' || exp.charAt(i)=='/')
			{
				
				while(prec(s.arr[s.top])>=prec(exp.charAt(i)))
					pexp=pexp+s.pop();
				s.push(exp.charAt(i));
			}
			else
			{
				//System.out.println ("working for"+exp.charAt(i));
				pexp=pexp+exp.charAt(i);
			}
		}
		System.out.println (pexp);
	}
	
	public static int prec(char x)
	{
		if(x=='*'||x=='/')
			return 5;
		if(x=='+'||x=='-')
			return 3;
		return 0;
	}
}