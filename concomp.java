import java.util.*;

class graph
{
	private LinkedList<Integer> []adj;
	private int v;
	private int e;
	
	public graph(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		
		for(int i = 0; i < v; i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
		this.e = 0;
	}
	
	public void addEdge(int v, int w)
	{
		this.adj[v].add(w);
		this.adj[w].add(v);
	}
	
	public int v()
	{
		return this.v;
	}
	
	public int e()
	{
		return this.e;
	}
	
	public void dfs(int s,boolean []visited)
	{
		
		visited[s] = true;
		
			System.out.print (s+" ");
			
			ListIterator<Integer> it = adj[s].listIterator() ;
			
			while(it.hasNext())
			{
				int n = it.next();
				if(visited[n]!=true)
					dfs(n,visited);
			}
	}
	public void cc()
	{
		boolean []visited = new boolean[v];
		
		for(int i = 0 ; i < v ; i++)
		{
			if(visited[i] == false)
			{
				dfs(i,visited);
				System.out.println ();
			}
		}
	}
	
	public static void main (String[] args)
	{
		graph g = new graph(5);
		g.addEdge(1, 0);
    	g.addEdge(2, 3);
    	g.addEdge(3, 4);
 
    	System.out.println ("Following are connected components \n");
    	g.cc();
		
	}
}