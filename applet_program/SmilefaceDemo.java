/* <applet code="SmilefaceDemo" width="600" height="600">  </applet>*/

import java.applet.*;
import java.awt.*;
public class SmilefaceDemo extends Applet implements Runnable
{
	int x=-180;
	
	public void start()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			if(x==-180)
			{
				x=180;
			}
			else
			{
				x=-180;
			}
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.drawOval(50,50,500,500);
		g.fillOval(130,150,100,100);
		g.fillOval(400,150,100,100);
		g.drawLine(300,120,300,300);
		g.drawArc(130,340,340,120,0,x);

		
	}
}
