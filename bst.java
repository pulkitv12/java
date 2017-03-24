import java.util.*;
import java.util.Arrays.*;
class Node
{
	int key;
	Node right;
	Node left;
	
	public  Node (int key)
	{
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

public class bst
{
	Node root;
	
	public void insert(int key)
	{
		root = insert(root,key);
	}
	
	private Node insert(Node n,int key)
	{
		if(n == null)
		{
		return   new Node(key);
		}
		if(key < n.key)
		{
			n.left = insert(n.left,key);
		}
		else
		{
			n.right = insert(n.right,key);
		}
		return n;
	}
	public boolean search(int key) throws Exception
	{
		return search(root,key);
	}
	public boolean search(Node root,int key) throws Exception
	{
		if(root == null)
			return false;
		if(root.key == key)
			return true;
		if(key < root.key)
			return search(root.left,key);
		else
			return search(root.right,key);
	}
	public int max()
	{
		if(root == null)
			return -1;
		else
			return max(root);
	}
		
	public int max(Node root)
	{
		if(root.right == null)
			return root.key;
		return max(root.right);
	}
	
	public int min()
	{
		if(root == null)
			return -1;
		else
			return min(root);
	}
	public int min(Node root)
	{
		if(root.left == null)
			return root.key;
		return min(root.left);
	}
	
	public void levelOrder()
	{
		Queue<Node> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty())
		{
			Node x = q.poll();
			System.out.println (x.key);
			q.add(root.left);
			q.add(root.right);
		}
	}
	public void generateTree(int []a)
	{
		Arrays.sort(a);
		bst x = new bst();
		balanceBST(x,a,0,a.length - 1);		
	}
	
	void balanceBST(bst x,int a[],int l,int r)
	{
		int m = (l+r)/2;
		x.insert(a[m]);
		balanceBST(x,a,l,m-1);
		balanceBST(x,a,m+1,r);
	}
	public static void main (String[] args) throws Exception
	{
		
        bst tree = new bst();
        int arr[] = {5,3,6,2,4,1};
        /*tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);*/
        //tree.levelOrder();
        tree.generateTree(arr);
        System.out.println (tree.search(50));
        System.out.println (tree.max());
        System.out.println (tree.min());
        System.out.println (tree.root.right.key);
        
	}
}