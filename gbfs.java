import java.util.*;
import java.io.*;

class graph
{
	private int v;
	private LinkedList<Integer> [] adj;
	
	public graph(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++)
			adj[i] = new LinkedList<Integer>();
	}
	
	public void addEdge(int v,int w)
	{
		adj[v].add(w);
		//adj[w].add(v);
	}
	
	public void bfs(int s)
	{
		boolean []visited = new boolean[v];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;
		queue.add(s);
		
		while(!queue.isEmpty())
		{
			s = queue.poll();
			System.out.println(s);
			
			Iterator<Integer> i = adj[s].listIterator();
			
			while(i.hasNext())
			{
				int n = i.next();
				if(!visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}	
	public static void main(String []args)
	{
		graph g = new graph(5);
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.bfs(2);
	}
}