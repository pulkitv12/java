class capsize
{
	public static void main (String[] args)
	{
		double a[] = {9.8,10.0,19.6,8.2,12.2,13.6};
		double  b = 58.3;
		double  cap;
		double  temp = a[0];
		int i = 0;
		while(i < 6)
		{
			if(a[i] < temp)
				temp = a[i];
			i++;
		}
		System.out.println (temp);
	}
}