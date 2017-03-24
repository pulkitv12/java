import java.util.*;
import java.util.LinkedList;
class Node
{
	int data;
	Node left;
	Node right;
	int val;
	public Node(int key)
	{
		this.data = key;
		left = right = null;
	}
}


class bst
{
	Node root;
	void levelorder()
	{
		Queue<Integer> q = new LinkedList;
		Set<Integer> s = new Set;
		q.add(new Node(root,0));
		while(!q.isEmpty())
		{
			Node t = q.poll();
			if(!s.contains(t.val))
			{
				System.out.println (t.data);
				set.add(t.value);
			}
			if(t.left != null)
				q.add(new Node(t.left,t.value-1));
			if(t.right != null)
				q.add(new Node(t.right,t.value+1));
		}
	}
	public static void main (String []args)
	{
		
	}
}