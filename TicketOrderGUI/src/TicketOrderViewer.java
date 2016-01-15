import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
//Mary Larsen
public class TicketOrderViewer {

	public static void main(String[] args) {

		TicketOrderGUI m1 = new TicketOrderGUI(75); // declare and pass 75

		JFrame frame = new TicketOrderFrame(m1); 	// declare and pass 75

		JComponent C1 = new StatusBar();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		// Box Layout
		/*
		frame.pack();
		*/
	}

}
