public class TestSort
{
	public static void main (String[] args)
	{
		int []a = {5,3,4,1,2};
		MySort s = new SelSort(a);
		s.sort(a);
		s.print(a);
	}
}