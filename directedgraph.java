import java.util.LinkedList;
class graph
{
	private LinkedList <Integer> []adj;
	private int v;
	private int e;
	
	public graph(int v)
	{
		this.v = v;
		this.adj = new LinkedList[v];
		
		for(int i = 0; i < v ; i++)
		{
			this.adj[i] = new LinkedList <Integer>();
		}
		this.e = 0;
	}
	
	public int v()
	{
		return this.v;
	}
	public int e()
	{
		return this.e;
	}
	
	public void addEdge(int v, int w)
	{
		this.adj[i].add(w);
		this.e++;
	}
	
	void bfs(int src)
	{
		boolean []visited new boolean[v];
		LinkedList <Integer> s = new LinkedList<Integer>();
		s.add(src);
		visited[src] = true;
		
		while(s.size() != 0)
		{
			src = s.poll();
			p = src;
			Iterator<Integer> i = adj[src].listIterator();
		}
	}
}