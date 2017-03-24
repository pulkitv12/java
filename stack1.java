class abc
{
	private int a[],b[];
	public abc()
	{
		a=new int [10];
		b=new int [10];
	}
	public void val()
	{
		for(int i=0;i<a.length;i++)
			a[i]=i;
	}
	public void show()
	{
		for(int i=0;i<a.length;i++)
			System.out.println (b[i]);
	}
	public void compare()
	{
		System.out.println (a==b);
	}
}
class xyz
{
	public static void main (String[] r) 
		{
			abc x=new abc();
			x.val();
			x.show();
			x.compare();
		}
}
