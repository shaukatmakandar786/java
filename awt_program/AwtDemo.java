//check which number is different

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AwtDemo extends JFrame implements ActionListener
{
	
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	
	AwtDemo()
	{
		l1=new JLabel("enter no1");
		l2=new JLabel("enter no2");
		l3=new JLabel("ans");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		
		b1=new JButton("Max");
		b2=new JButton("Min");
		
		setLayout(new GridLayout(4,2));
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			int no1=Integer.parseInt(t1.getText());
			int no2=Integer.parseInt(t2.getText());
			if(no1>no2)
			{
				t3.setText(no1+"");
			}
			else{
				
				t3.setText(no2+"");
			}
			
		}
		else if(e.getSource()==b2)
		{
				
			int no1=Integer.parseInt(t1.getText());
			int no2=Integer.parseInt(t2.getText());
			if(no1<no2)
			{
				t3.setText(no1+"");
			}
			else{
				
				t3.setText(no2+"");
			}
			
		}
		
	}
	
	public static void main(String args[])
	{
		AwtDemo x=new AwtDemo();
		x.setVisible(true);
		x.setSize(300,300);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
