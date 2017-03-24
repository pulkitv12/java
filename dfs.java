import java.util.LinkedList;
class dfs
	{
		private boolean []marked;
		private int count;
		
		public dfs(graph g,int s)
		{
			marked = new boolean[g.v()];
			dfspath(g,s);
		}
		
		public void dfspath(graph g,int s)
		{
			count++;
			System.out.println ("--"+s+"--");
			marked[s] = true;
			
			for(int w : g.xyz(s))
			{
				if(!marked[w])
					dfspath(g,w);
			}
		}
		
		public boolean marked(int v)
		{
			return marked[v];
		}
		
		public int count()
		{
			return count;
		}
	}
class graph
{
	private LinkedList <Integer> []adj;
	private int v;
	private int e;
	
	public graph(int v)
	{
		this.v = v;
		this.adj = new LinkedList[v];
		for(int i = 0; i < v; i++)
			this.adj[i] = new LinkedList <Integer>();
		this.e = 0;
	}
	
	public void addEdge(int v,int w)
	{
		this.adj[v].add(w);
		this.adj[w].add(v);
		this.e++;
	}
	
	public int v()
	{
		return this.v;
	}
	
	public int e()
	{
		return this.e;
	}
	
	public Iterable<Integer> xyz(int v)
	{
		return this.adj[v];
	}
	
	
	public static void main (String[] args)
	{
		graph g = new graph(4);
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
		dfs search = new dfs(g,0);
		for(int v = 0 ; v < g.v() ; v++)
		{
		//	if(search.marked(v))
				//System.out.print(v + " ");
		}
		System.out.println ();
		System.out.println (search.count());
		//System.out.println (g.xyz(2));
	}
}