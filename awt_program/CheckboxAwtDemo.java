
import java.awt.*;
import java.awt.event.*;

class CheckboxAwtDemo extends Frame implements ItemListener
{
	
	Checkbox c1,c2,c3;
	TextField t1;
	Label l1;
	
	CheckboxAwtDemo()
	{
		c1=new Checkbox("PHP");
		c2=new Checkbox("Java");
		c3=new Checkbox("Syspro",false);
		t1=new TextField(20);
		l1=new Label("Selected Item:");
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
			s1=t1.getText();
			s2=c1.getLabel();
			s3=s1+" "+s2;
			t1.setText(s3);
		}
		else if(e.getSource()==c2)
		{
			s1=t1.getText();
			s2=c2.getLabel();
			s3=s1+" "+s2;
			t1.setText(s3);
		}
		else if(e.getSource()==c3)
		{
			s1=t1.getText();
			s2=c3.getLabel();
			s3=s1+" "+s2;
			t1.setText(s3);		
		}
	}	
	public static void main(String args[])
	{
		CheckboxAwtDemo x=new CheckboxAwtDemo();
		x.setVisible(true);
		x.setSize(300,300);
		//x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
