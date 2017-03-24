class fun1 extends Thread
{
	int i;
	public void run()
	{
		System.out.println (getName()+"started..........");
		for(i=1;i<10;i++)
			System.out.println ("in "+getName()+":"+i);
		System.out.println (getName()+"finished..........");
	}
}
/*class fun2 extends Thread
{
	int i;
	public void run()
	{
		System.out.println ("fun2 started..........");
		for(i=1;i<10;i++)
			System.out.println ("fun2:"+i);
		System.out.println ("fun2 finished..........");
	}
}*/
class test
{
	public static void main (String[] args)
	{
	fun1 a=new fun1();
	fun1 b=new fun1();
	a.setName("fun1");
	b.setName("fun2");
	System.out.println ("Main Started..............");
	a.start();
	b.start();
	System.out.println ("Main finished.............");
	}
}