class racer extends Thread
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
	static int temp;
	static String stemp;
	public static void swap(racer x,racer y)
	{
					temp=x.a;
					stemp=x.getName();
					x.a=y.a;
					x.setName(y.getName());
					y.a=temp;
					y.setName(stemp);
	}
	public static void main (String[] nm) throws Exception
	{
		
		String x="monu,tonu,sonu,kanu,tanu,manu,tinu,chinu";
		nm=x.split(",");
		racer r[]=new racer[nm.length+1];
		
		for(int i=1;i<r.length;i++)
		{
			r[i]=new racer();
			r[i].setName(nm[i-1]);
		}
		for(int i=1;i<r.length;i++)
			r[i].start();
		Thread.sleep(5000);
		for(int i=1;i<r.length;i++)
			r[i].stop();
		System.out.println ("------------RESULTS------------\n");	
		for(int i=1;i<r.length;i++)
			System.out.println(r[i].getName()+"--->"+r[i].a);
		
		for(int i=1;i<r.length;i++)
			for(int j=i;j<r.length;j++)
			{
				if(r[i].a>r[j].a)
				{	
					swap(r[i],r[j]);
				}
			}
		System.out.println ("\n------------SORTED------------\n");
		for(int i=1;i<r.length;i++)
			System.out.println(r[i].getName()+"--->"+r[i].a);
		
		System.out.println ("\n------------WINNERS------------");
				for(int i=r.length-1;i>=r.length-3;i--)
					System.out.println((r.length-i)+" Positon: "+r[i].getName()+"--->"+r[i].a);
			
	}
}