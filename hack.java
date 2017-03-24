import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

class Solution 
{

    public static void main(String[] args) throws Exception 
    {
          
          
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            double y=sc.nextDouble();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s;
            s=br.readLine();
           // s=sc.next();
            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
          
    }
}