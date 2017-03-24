import java.io.*;
import java.util.*;
class graph
{
	private int v;
	private LinkedList<Integer> []adj;
	public boolean []visited;
	public graph(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
		visited = new boolean[v];
	}
	
	public void addEdge(int v,int w)
	{
		adj[v].add(w);
		//adj[w].add(v);
	}
	
	public void dfs(int s)
	{
		visited[s] = true;
		System.out.println(s);
		Iterator<Integer> i = adj[s].listIterator();
		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
			{
				visited[n] = true;
				dfs(n);
			}
		}
	}
	
	public static void main(String []args)
	{
		graph g = new graph(4);
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.dfs(2);
	}
}