class Node
{
	int val;
	Node left;
	Node right;
	
	Node(int v)
	{
		val = v;
		left = null;
		right = null;
	}
}

class bstnew
{
	Node root;
	
	bstnew()
	{
		root = null;
	}
	
	void insert(int key)
	{
		root = insert(root,key);
	}
	
	Node insert(Node root,int key)
	{
		if(root == null)
		{
			return new Node(key);
		}
		
		if(root.val > key)
		{
			root.left = insert(root.left,key);
		}
		
		else if(root.val < key)
		{
			root.right = insert(root.right,key);
		}
		
		return root;
	}
	
	void inorder()
	{
		inorderRec(root);
	}
	
	void inorderRec(Node root)
	{
		if(root != null)
		{
			System.out.println (root.val);
			inorderRec(root.left);
			//System.out.println (root.val);
			inorderRec(root.right);
		}
	}
	
	void search(int key)
	{
		Node s = search(root,key);
		if(s != null)
			System.out.println ("Val found is "+s.val);
		else
			System.out.println ("Val not found");
	}
	
	public Node search(Node root,int key)
	{
		if(root == null || root.val == key)
			return root;
			
		if(root.val > key)
			return search(root.left,key);
		
		return search(root.right,key);
	}
	
	public static void main (String[] args)
	{
		bstnew tree= new bstnew();
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorder();
        tree.search(50);
	}
}