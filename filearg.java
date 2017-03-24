import java.io.*;
class abc
{
	public static void main (String[] fs) throws Exception
	{
		fs=new String[3];
		fs[0]="C:/Users/Pulkit/Desktop/hi.txt";
		fs[1]="C:/Users/Pulkit/Desktop/hello.txt";
		fs[2]="C:/Users/Pulkit/Desktop/recuva serial key.txt";
		String k="C:/Users/Pulkit/Desktop/toMail.txt";
		int i=0;
		FileOutputStream fo=new FileOutputStream(k,true);
		for(String s:fs)
		{
			fo.write("\n-----------\n".getBytes());
			fo.write(("\n\n"+s+"\n\n").getBytes());
			fo.write("\n-----------\n".getBytes());
			FileInputStream f=new FileInputStream(s);
			while(true)
			{
				int x=f.read();
				
				if(x==-1)
					break;
				fo.write(x);
			}
		}
	fo.close();
	}
}