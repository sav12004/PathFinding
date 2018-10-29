import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//chcking git update

public class Frame extends JPanel implements MouseListener 
{
	
	JFrame frame;
	
	public Frame() 
	{
		frame = new JFrame();
		frame.setTitle("Pathfinding");
		frame.getHeight();
		frame.getWidth();
		frame.getContentPane().setPreferredSize(new Dimension(700,700));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane();
		frame.pack();
		frame.setVisible(true);
		frame.add(this);
			
	}

	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		int height = this.getHeight();
		int width = this.getWidth();
		System.out.println(height);
		System.out.println(width);
		
		g.setColor(Color.GRAY);
		for (int i=0;i<height;i+=20) 
		{
			for (int j=0;j<width;j+=20) 
			{
				g.drawRect(i, j, 20, 20);
			}
		}
	}
	
	

	public static void main(String[] args) {
		new Frame();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println(x);
		System.out.println(y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}