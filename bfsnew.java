import java.util.*;
import java.io.*;
class graphn
{
	private int v;
	private int e;
	private LinkedList<Integer> []adj;
	graphn(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v ; i++)
		{
			adj[i] = new LinkedList();
		}
		this.e = 0;
	}
	
	void addEdge(int v,int w)
	{
		adj[v].add(w);
		adj[w].add(v);
		this.e++;
	}
	
	void bfs(int s)
	{
		boolean []visited = new boolean[v];
		LinkedList<Integer> q = new LinkedList<Integer>();
		visited[s] = true;
		q.add(s);
		while(q.size() != 0)
		{
			s = q.poll();
			System.out.print(s+" ");
			
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext())
			{
				int n = i.next();
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
		graphn g = new graphn(4);
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.bfs(2);
	}
}