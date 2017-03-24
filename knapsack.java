import java.util.*;
import java.io.*;
public class knapsack implements Comparator<knapsack>
{
	private int m = 20;
	private int p;
	private int w;
	private int pbyw;
	
	knapsack(int p,int w)
	{
		this.p = p;
		this.w = w;
		this.pbyw = p/w;
	}
	
	public int compare(knapsack k1 ,knapsack k2)
	{
		if(k1.pbyw < k2.pbyw)
			return -1;
		if(k1.pbyw > k2.pbyw)
			return 1;
		else
			return 0;
	}
	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		knapsack []k = new knapsack[3];
		for(int i = 0; i < 3 ; i++)
		{
			k[i] = new knapsack(sc.nextInt(),sc.nextInt());
		}
		
		Collections.sort(k, knapsack);
		
		for(knapsack i : k)
		{
			System.out.println (i.pbyw);
		}
	}
}