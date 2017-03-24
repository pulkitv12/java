import java.util.*;
class TrieNode
{
	Integer val;
	TrieNode []nodes = new TrieNode[26];
}
class Trie
{
	TrieNode root;
	Trie()
	{
		root = new TrieNode();
	}
	public void insert(String w, int v)
	{
		TrieNode p = root;
		for(int i = 0; i < w.length(); i++)
		{
			int index = w.charAt(i) - 'a';
			if(p.nodes[index] == null)
			{
				p.nodes[index] = new TrieNode();
				
			}
			p = p.nodes[index];
			
		}
		p.val = v;
	}
	public int print(String w)
	{
		TrieNode p = root;
		if(p == null)
			return -1;
		for(int i = 0; i < w.length(); i++)
		{
			int index = w.charAt(i) - 'a';
			if(p.nodes[index] == null)
			{
				return -1;
			}
			else
			{
				p = p.nodes[index];
			}
		}
		return p.val;
	}
	public void softdel(String w)
	{
		TrieNode t= root;
		
	}
}
class pv
{
	public static void main (String[] args)
	{
		Trie t = new Trie();
		t.insert("grow",15);
		t.insert("grofers",20);
		System.out.println (t.print("grofers"));
	}
}