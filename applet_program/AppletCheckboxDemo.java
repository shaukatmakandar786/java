/*
<applet code="AppletCheckboxDemo" height=300 width=300></applet>
*/

import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppletCheckboxDemo extends Applet implements ItemListener
{
	JLabel l1;
	JTextField t1;
	JCheckBox c1,c2,c3;
	
	public void init()
	{
		l1=new JLabel("Selected Item:");
		t1=new JTextField(15);
		c1=new JCheckBox("java");
		c2=new JCheckBox("php");
		c3=new JCheckBox("c++");
		
		setLayout(new FlowLayout());
		add(l1);add(t1);
		add(c1);add(c2);add(c3);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);	
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		String s1,s2,s3;
		if(e.getSource()==c1)
		{
			s1=t1.getText();
			s2=c1.getText();
			s3=s1+" "+s2;
			t1.setText(s3);
			
		}
		else if(e.getSource()==c2)
		{
			s1=t1.getText();
			s2=c2.getText();
			s3=s1+" "+s2;
			t1.setText(s3);
		}
		else if(e.getSource()==c3)
		{
			s1=t1.getText();
			s2=c3.getText();
			s3=s1+" "+s2;
			t1.setText(s3);
		}
	}
	
}
