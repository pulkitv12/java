import java.awt.*;
import java.applet.*;
public class appi extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.red);
		g.drawString("Welcome",100,50);
		g.setColor(Color.blue);
		g.drawOval(80,20,100,50);
		g.setColor(Color.YELLOW);
		g.drawRect(80,20,100,50);
		g.fillArc(200,70,20,10,0,360);
	}
}