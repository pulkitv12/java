import java.awt.*;
import java.awt.event.*;

public class bookdbgui extends Frame implements ActionListener
{
	Button[] b=new Button[4];
	
	public bookdbgui()
	{
		setSize(400,400);
		b[0].setLabel("Add Book");
		b[1].setLabel("View Book");
		b[2].setLabel("Remove Book");
		b[3].setLabel("Search Book");
		
		b[0].addActionListener(this);
		b[1].addActionListener(this);
		b[2].addActionListener(this);
		b[3].addActionListener(this);
		
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
	}
}