public class vcity
{
	private class city implements Comparable<city>
	{
		fianl int population;
		int citycnt;
		Integer avg;
		public city(int pop)
		{
			this.population = pop;
			this.citycnt = 1;
			this.avg = pop/1;
		}
	}
}