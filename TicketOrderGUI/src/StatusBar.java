import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
//Mary Larsen
public class StatusBar extends JComponent {
	int x = 0;
	int y = 0;
	Color tempC = Color.black;
	int calcB = 0;
	
	public void paintComponent(Graphics g) {
		g.setColor(tempC);
		g.drawRect(x, y, 350, 50);
		g.fillRect(x, y, 350, 50);
	}
	
	public void setNewValues(int tempX, int tempY, Color tempColor) {
		x = tempX;				//MAX_TICKETS
		y = tempY;				//balance
		tempC = tempColor;
		
		calcB = (x - y);
		
		//System.out.println("setNewValues method " + "x= " + x + " y= " + y + " calcB = " + calcB);
		
		repaint();	
		
	}
	
}
