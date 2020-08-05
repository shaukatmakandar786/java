/*
<applet code="AppletRadioDemo" height=300 width=300></applet>
*/

import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppletRadioDemo extends Applet implements ItemListener
{

	JLabel l1;
	JTextField t1;
	JRadioButton r1;
	JRadioButton r2;
	ButtonGroup bg;
	
	public void init()
	{
		t1=new JTextField();
		l1=new JLabel("Seleected Item:");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		setLayout(new GridLayout(2,2));
		
		add(l1);
		add(t1);
		add(r1);
		add(r2);
		
		
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		String s;
		if(e.getSource()==r1)
		{
			s=r1.getText();
			t1.setText(s);
		}
		else if(e.getSource()==r2)
		{
			s=r2.getText();
			t1.setText(s);
		}

	}	
			
			
}	
