import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class components extends Frame implements ActionListener,FocusListener
{
	Button b=new Button();
	Button bb=new Button();
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	Label l1=new Label();
	Label l2=new Label();
	Label l3=new Label();
	Choice tr=new Choice();
	//b.setEnabled(false);
	public components()
	{
		setSize(300,300);
		setLayout(new GridLayout(4,2));
		b.setLabel("Add");
		b.addActionListener(this);
		bb.setLabel("Quit");
		bb.addActionListener(this);
		
		l1.setText("Name");
		l2.setText("Trade");
		l3.setText("Sem");
		
		tr.add("CSE");
		tr.add("ECE");
		tr.add("ME");
		

		t1.addFocusListener(this);
		t2.addFocusListener(this);
		t3.addFocusListener(this);
		
		add(l1);
		add(t1);
		add(l2);
		add(tr);
		add(l3);
		add(t3);
		add(b);
		add(bb);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bb)
			System.exit(0);
		else
		{
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/stuinfo","root","");
			Statement s=con.createStatement();
			s.execute("insert into students (sname,trade,sem) values ('"+t1.getText()+"','"+tr.getSelectedItem()+"','"+t3.getText()+"');");
			setTitle("Success");
			}
			catch(Exception ex)
			{
				setTitle("Error");
			}
		}
	}
	public void focusGained(FocusEvent f)
	{
		TextField tt=(TextField)f.getSource();
		tt.setBackground(Color.red);
	}
		public void focusLost(FocusEvent f)
	{
		TextField tt=(TextField)f.getSource();
		tt.setBackground(Color.white);
	}
}