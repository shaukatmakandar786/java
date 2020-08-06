
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MouseDemo extends JFrame implements MouseListener,MouseMotionListener
{
	
	JLabel l1,l2;
	
	
	MouseDemo(String s)
	{
		super(s);
		
		l1=new JLabel();
		l2=new JLabel();
		
		
		setLayout(new FlowLayout());
		add(l1);
		add(l2);
		
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		
	}
	
	public void mousePressed(MouseEvent e)
	{
		l1.setText("you pressed mouse");
	}
	
	public void mouseReleased(MouseEvent e)
	{
		l1.setText("you Released mouse");
	}
	public void mouseDragged(MouseEvent e)
	{
		l1.setText("you Released mouse");
	}
	public void mouseEntered(MouseEvent e)
	{
		l1.setVisible(true);
		l2.setVisible(true);
	}
	public void mouseExited(MouseEvent e)
	{
		l1.setVisible(false);
		l2.setVisible(false);
	}
	public void mouseClicked(MouseEvent e)
	{
		int  x,y;
		x=e.getX();
		y=e.getY();
		
		l2.setText(x+"          "+y);
	}
	public void mouseMoved(MouseEvent e)
	{
		int  x,y;
		x=e.getX();
		y=e.getY();
		
		l2.setText(x+"             "+y);
	}
	
	
	public static void main(String ar[])
	{
		MouseDemo x=new MouseDemo("MauseDemo Programme");
		x.setVisible(true);
		x.setSize(300,300);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
