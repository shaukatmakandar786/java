
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


/*  <applet code="MouseDemo" width=300 height=300> </applet>*/

public class MouseDemo extends Applet implements MouseMotionListener
{
	
	TextField t1;
	
	
	public void init()
	{
			t1=new TextField(10);
			
			
			
			add(t1);
			
			
			this.addMouseMotionListener(this);
			
			
	}
	
	public void mouseMoved(MouseEvent e)
	{
		
			int  x,y;
			x=e.getX();
			y=e.getY();
		
			t1.setText(x+"          "+y);
		
	}
	
	public void mouseDragged(MouseEvent e)
	{
		
		
	}
}
