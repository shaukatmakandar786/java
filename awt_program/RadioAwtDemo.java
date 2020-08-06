
import java.awt.*;
import java.awt.event.*;

class RadioAwtDemo extends Frame implements ItemListener
{
	
	Checkbox r1,r2;
	CheckboxGroup cg;
	TextField t1;
	Label l1;
	
	RadioAwtDemo()
	{
		
		t1=new TextField();
		l1=new Label("Seleected Item:");
		cg=new CheckboxGroup();
		r1=new Checkbox("Male",cg,true);
		r2=new Checkbox("Female",cg,false);
		
		
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
			s=r1.getLabel();
			t1.setText(s);
		}
		else if(e.getSource()==r2)
		{
			s=r2.getLabel();
			t1.setText(s);
		}

	}	
	public static void main(String args[])
	{
		RadioAwtDemo x=new RadioAwtDemo();
		x.setVisible(true);
		x.setSize(300,300);
		
		
	}
	
}
