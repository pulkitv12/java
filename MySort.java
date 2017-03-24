public abstract class MySort
{
	protected int []arr;
	protected void swap(int []arr,int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y] ;
		arr[y] = temp;
	}
	
	protected void print(int []arr)
	{
		for(int i = 0; i < arr.length ; i++)
			System.out.println (arr[i]);
	}
	protected abstract void sort(int []arr);
}