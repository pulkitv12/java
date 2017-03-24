class r1 extends Thread
{
	public int a=0;
	public void run()
	{
		while(true)
			a++;
	}
}
class r2 extends Thread
{
	public int a=0;
	public void run()
	{
		while(true)
			a++;
	}
}
class test
{
	public static void main (String[] args) throws Exception
	{
		r1 x=new r1();
		r2 y=new r2();
		x.setPriority(1);
		x.start();
		y.start();
		Thread.sleep(3000);
		x.stop();
		y.stop();
		System.out.println ("racer1 travelled "+x.a);
		System.out.println ("racer2 travelled "+y.a);
	}
}