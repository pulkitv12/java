class redblacktree
{
	Node root = null;
	class Node
	{
		Node left;
		Node right;
		int key;
		boolean color;
		
		public Node(int key)
		{
			this.key = key;
			left = right = null;
		}
	}
	
	public void insert(int key)
	{
		root = insert(root,key);
	}
	
	private Node insert(Node root,int key)
	{
		if(root null)
			return new Node(key);
		if(key < root.key)
			root.left = insert(root.left,key);
		else if(key >root.key)
			root.right = insert(root.right,key);
	}
}