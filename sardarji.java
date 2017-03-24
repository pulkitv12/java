import java.applet.*;
import java.awt.*;
public class sardarji extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(180,50,90,110);
		g.drawArc(198,85,17,8,0,360);
		g.fillArc(204,86,6,6,0,360);
		g.fillArc(243,86,6,6,0,360);
		g.drawArc(237,85,17,8,0,360);
		g.fillArc(218,95,15,25,-140,100);
		g.drawArc(215,130,20,10,-172,180);
	}
}