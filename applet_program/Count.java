/*  <applet code="Count" width=300 height=300> </applet>*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Count extends Applet implements ActionListener
{
	TextField t1,t2;
	Label l1,l2,l3;
	Button b1;
	
	public void init()
	{
		t1=new TextField(15);
		t2=new TextField(15);
		l1=new Label("First String");
		l2=new Label("Second String");
		l3=new Label("no of occurances are:");
		b1=new Button("count");
		
		setLayout(new GridLayout(3,2));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l3);
		
		b1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			int count=0;
			
			int len=s1.length();
			if(len>0)
			{
				int p=s1.indexOf(s2);
				while((p)!=-1)
				{
					count++;
					p=s1.indexOf(s2,(p+1));
					
				}
				
				l3.setText("no of occurances are:"+count);
				
			}
			
		}
	}
}
