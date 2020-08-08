/* 
<applet code="MovingTextExample" width="500" height="500"></applet>
*/

import java.applet.*;
import java.awt.*;

public class MovingTextExample extends Applet implements Runnable
{
	int x=0;
	
	public void start()
	{
		Thread t1=new Thread(this);
		t1.start();
	}
	public void run()
	{
		while(true)
		{
			if(x==500)
			{
				x=0;
			}
			else
			{
				x=x+10;
			}
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("MacTec.com",100,x);
	}
}
