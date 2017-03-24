class except
{
	public static void main (String[] x) 
	{
		int skip=0,pro=0;
		double sum=0,avg=0;
			//String x[]={"38","49","ten"};
				for(int i=0;i<x.length;i++)
				{
					try
					{
						double num=Double.parseDouble(x[i]);
						System.out.println ("processing"+x[i]+"-----OK");
						sum=sum+num;
					}
					catch(NumberFormatException ex)
					{
						System.out.println ("processing"+x[i]+"-----FAIL");
						skip++;
					}
				}
				pro=x.length-skip;
				avg=sum/pro;
		System.out.println("Total values processed "+pro+" skipped "+skip);
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+avg);
	}
}