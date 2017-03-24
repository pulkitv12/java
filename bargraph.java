import java.applet.*;
import java.awt.*;
public class bargraph extends Applet
{
	public void paint(Graphics g)
	{
		int a[]={40,82,64,25,37,76,61,48};
		int x=85;
		g.drawLine(75,50,75,250);
		g.drawLine(75,150,425,150);
		for(int i=0;i<a.length;i++)
		{
			x=x+30;
			Color c=new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
			g.setColor(c);
			g.fillRect(x,150-a[i],20,a[i]);
		}
	}
}