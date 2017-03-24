import java.io.*;
class abc
{
	public static void main (String[] args) throws Exception
	{
		int i=0;
		FileOutputStream fo=new FileOutputStream("C:/Users/Pulkit/Desktop/toMail.txt",true);
		fo.write("\nHeloo kaka g".getBytes());
		FileInputStream f=new FileInputStream("C:/Users/Pulkit/Desktop/toMail.txt");
			while(true)
			{
					int x=f.read();
					if(x==-1)
				break;
			System.out.print((char)x);	
			
			}
	}
}