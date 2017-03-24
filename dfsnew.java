import java.util.*;
import java.io.*;
class graphdn
{
	private int v;
	private int e;
	private LinkedList<Integer> []adj;
	
	graphdn(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++)
			adj[i] = new LinkedList();
		this.e = 0;
	}
	
	void addEdge(int v,int w)
	{
		adj[v].add(w);
		adj[w].add(v);
		this.e++;
	}
	
	void dfs(int s)
	{
		boolean []visited = new boolean[v];
		dfsutil(s,visited);
	}
	
	void dfsutil(int s, boolean []visited)
	{
		visited[s] = true;
		System.out.print(s+" ");
		
		Iterator<Integer> i = adj[s].listIterator();
		
		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
			{
				visited[n] = true;
				dfsutil(n,visited);
			}
		}
	}
	
	public void cc()
	{
		boolean []visited = new boolean[v];
		for(int i = 0; i < v; i++)
		{
			if(!visited[i])
			{
				dfsutil(i,visited);
				System.out.println ();
			}
		}
	}
	public static void main (String[] args)
	{
		/*graphdn g = new graphdn(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.dfs(2);*/
        
        graphdn g = new graphdn(5);
		g.addEdge(1, 0);
    	g.addEdge(2, 3);
    	g.addEdge(3, 4);
        g.cc();

	}
}