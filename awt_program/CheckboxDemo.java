
//Enter two numbers in two text box and print max or min in another text box

/*

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MaxMin extends JFrame implements ActionListener
{
	
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	
	
	
	MaxMin(String s)
	{
		super(s);
		
		l1=new JLabel("Enter no1");
		l2=new JLabel("Enter no2");
		l3=new JLabel("Ans");
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		
		b1=new JButton("Max");
		b2=new JButton("Min");
		
		
		setLayout(new GridLayout(4,2));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int a,b;
		if(e.getSource()==b1)
		{
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			if(a>b)
			{
				t3.setText(a+"");
			}
			else
			{
				t3.setText(b+"");
			}
		}
		else{
			
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			if(a<b)
			{
				t3.setText(a+"");
			}
			else
			{
				t3.setText(b+"");
			}
		}
	}
	
	public static void main(String ar[])
	{
		MaxMin x=new MaxMin("MaxMin Programme");
		x.setVisible(true);
		x.setSize(300,300);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

*/

/* write a programe which contain 3 checkbox (php,java,syspro)
and display the selected item in the textbox    */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CheckBoxDemo extends JFrame implements ItemListener
{
	
	JCheckBox c1,c2,c3;
	JTextField t1;
	JLabel l1;
	
	CheckBoxDemo()
	{
		c1=new JCheckBox("PHP");
		c2=new JCheckBox("Java");
		c3=new JCheckBox("Syspro");
		t1=new JTextField(15);
		l1=new JLabel("Selected Item:");
		
		setLayout(new FlowLayout());
		
		add(l1);
		add(t1);
		add(c1);
		add(c2);
		add(c3);
		
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		String s1,s2,s3;
		if(e.getSource()==c1)
		{
			s1=c1.getText();
			t1.setText(s1);
		}
		else if(e.getSource()==c2)
		{
			s2=t1.getText();
			s1=c2.getText();
			s3=s1+" "+s2;
			t1.setText(s3);
		}
		else if(e.getSource()==c3)
		{
			s2=t1.getText();
			s1=c3.getText();
			s3=s1+" "+s2;
			t1.setText(s3);
		}
	}	
	public static void main(String args[])
	{
		CheckBoxDemo x=new CheckBoxDemo();
		x.setVisible(true);
		x.setSize(300,300);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}



/* write a programe which contain 2 radio button (male,female)
and display the selected item in textbox    */

/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JRadioButtonDemo extends JFrame implements ItemListener
{
	
	JRadioButton r1,r2;
	ButtonGroup bg;
	JTextField t1;
	JLabel l1;
	
	JRadioButtonDemo()
	{
		
		t1=new JTextField();
		l1=new JLabel("Seleected Item:");
		r1=new JRadioButton("Male",false);
		r2=new JRadioButton("Female");
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		setLayout(new GridLayout());
		
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
	public static void main(String args[])
	{
		JRadioButtonDemo x=new JRadioButtonDemo();
		x.setVisible(true);
		x.setSize(300,300);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
*/

/*
write a awt programe to print Welcome to T.Y. B.Sc. Computer science
with Times new Roman Font face and size is 16 in red color.
when we click on the button then text color should be change in blue color */

/*

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Demo extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1;
	
	Demo()
	{
		l1=new JLabel("Welcome to T.Y. B.Sc. Computer science");
		b1=new JButton("Blue");
		
		Font f=new Font("Times new Roman",Font.BOLD,16);
		l1.setForeground(Color.red);
		l1.setFont(f);
		setLayout(new GridLayout());
		
		add(l1);
		add(b1);
		
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			l1.setForeground(Color.blue);
		}
	}
	public static void main(String args[])
	{
		Demo x=new Demo();
		x.setVisible(true);
		x.setSize(300,300);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}


*/
