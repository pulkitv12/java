import java.util.*;
import java.io.*;

class graph
{
	int v;
	LinkedList<Integer> []adj;
	boolean []visited;
	public graph(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v ; i++)
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
	
	public void dfscycle(int s,int parent)
	{
		
		visited[s] = true;
		//System.out.println(s);
		Iterator<Integer> i = adj[s].listIterator();
		System.out.println ("parent is "+parent+" control is with "+s);
		while(i.hasNext())
		{
			int n = i.next();
			System.out.println (s+" has next is "+n);
			if(visited[n] == true )//&& n != parent)
			{	
			System.out.println (s+"--->"+n);
			System.out.println("Cycle detected");
			}
			if(!visited[n])
			{
				visited[n] = true;
				dfscycle(n,s);
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
        
        g.dfscycle(2,-1);
	}
}