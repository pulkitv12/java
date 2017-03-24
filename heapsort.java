import java.util.*;
class heapall
{
	int arr[] = new int[7];
	int i = 0;
	public void insert(int v)
	{
		if(i == 7)
			System.out.println ("out of bounds");
		else
		{
			i++;
			arr[i] = v;
			//if(j-1 > 1)
				swim(i);
		}
	}
	public void swim(int j)
	{
		if(arr[j/2] > arr[j])
			swap(arr[j/2],arr[j]);
	}
	public void printheap()
	{
		for(int x = 0 ; x < i ; x++)
			System.out.println (arr[x]);
	}
	private void swap(int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
public class heapsort
{
	public static void main (String[] args)
	{
		heapall h = new heapall();
		h.insert(7);
		h.insert(3);
		h.insert(8);
		h.insert(5);
		h.insert(1);
		h.insert(9);
		h.printheap();
	}
}