import java.util.Comparator;
	
class Tree implements Comparator
{
	Node root = null;
	
	class Priority 
{
	int mtime;
	int avgtime;
	
	Priority(int mt,int at)
	{
		this.mtime = mt;
		this.avgtime = at;
	}
}
class process
{
	String pname;
	int pid;
	
	process(String pname,int pid)
	{
		this.pname = pname;
		this.pid = pid;
	}
}
	class Node
	{
		Node left;
		Node right;
		Priority key;
		process p;
	
		public Node(Priority pt,process pr)
		{
			key = pt;
			p = pr;
		}
	}
	public int compare(Object x,Object y)
	{
		
		Priority o1 = (Priority)x;
		Priority o2 = (Priority)y;
		if(o1.mtime < o2.mtime)
			return -1;
		else if(o1.mtime > o2.mtime)
			return 1;
		else
			return 0;
	}		
		void insert(Priority p,process pr)
		{
			root = insert(root,p,pr);
		}
		
		Node insert(Node root,Priority key,process val)
		{
			if(root == null)
				return new Node(key,val);
			if(compare(key,root.key) == 1)
				root.right = insert(root.right,key,val);
				
			else if(compare(key,root.key) == -1)
				root.left = insert(root.left,key,val);
				
			return  root;	
		}
		
		void print()
		{
			print(root);
		}
		void print(Node root)
		{
			if(root == null)
				return;
			print(root.left);
			System.out.println (root.p.pname);
			print(root.right);
		}
		public static void main (String[] args)
		{
			Tree t = new Tree();
			Tree.Priority p1 = t.new Priority(89,4);
			Tree.Priority p2 = t.new Priority(7,9);

			Tree.process pr1 = t.new process("Process 1",154);
			Tree.process pr2 = t.new process("Process 2",134);
			
			t.insert(p1,pr1);
			t.insert(p2,pr2);
			
			t.print();
		}
	
}