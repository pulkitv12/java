import java.io.*;
class fh
{
	public static void show (String str) throws Exception
	{
		File r=new File(str);
		File u[]=r.listFiles();
		for(File s:u)
		{
				if(s.isDirectory())
				{
					show(s.getAbsolutePath());
				}
				else
				{
					String k[]=s.list();
					for(String g:k)
						System.out.println(g);
				}
		}
		String m[]=r.list();
		for(String y:m)
		System.out.println (y);
	}
	public static void main (String[] args) throws Exception
	{
		show("C:/Users/Pulkit/Desktop/java");
	}
}