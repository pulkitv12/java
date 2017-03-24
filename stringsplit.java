class hello
{
	public static void main (String[] r)
	{
		//String x[]=new String[r.length];
		String y[];
		
		for(int i=0;i<r.length;i++)
		{
			double  sum=0;
			y=r[i].split(",");
			for(int j=0;j<y.length;j++)
			{
				sum=sum+Double.parseDouble(y[j]);
			}
			System.out.println ("Sum of"+r[i]+" is "+sum);
		}
	}
}