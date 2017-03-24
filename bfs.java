import java.util.LinkedList;
import java.io.*;
import java.util.*;
class graph
{
	private LinkedList <Integer> []adj;
	private int v;
	private int e;
	
	public graph(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		for(int i  = 0; i < v ; i++)
			this.adj[i] = new LinkedList<Integer>();
		this.e = 0;
	}
	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
		this.adj[w].add(v);
	}
	
	void bfs(int s)
	{
		boolean visited[] = new boolean[v];
		
		LinkedList <Integer>q = new LinkedList<Integer>();
		
		visited[s] = true;
		q.add(s);
		
		while(q.size() != 0)
		{
			s = q.poll();
			System.out.print (s+" ");
			
			Iterator<Integer> it = adj[s].listIterator();
			
			while(it.hasNext())
			{
				int n = it.next();
				if(!visited[n])
				{
					visited[n] = true;
					q.add(n);
				}
			}
		}
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
        
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.bfs(2);
}
}