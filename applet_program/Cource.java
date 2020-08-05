/*

write a java program to create an applet which contains a list of cources.Display
the selected cource in a text box.
*/








import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/*  <applet code="Cource" width=300 height=300> </applet>*/

public class Cource extends Applet implements ItemListener
{
	
	TextField t1;
	List l1;
	
	public void init()
	{
			t1=new TextField(10);
			l1=new List(3);
			l1.add("BCA");
			l1.add("BCS");
			l1.add("MCA");
			l1.add("MCS");
			
			
			add(t1);
			add(l1);
			
			l1.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==l1)
		{
			String s1=l1.getSelectedItem().toString();
			t1.setText(s1);
		}
	}
}



























