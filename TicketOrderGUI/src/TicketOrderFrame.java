import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Container;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.BoxLayout;

//Mary Larsen
public class TicketOrderFrame extends JFrame {

	StatusBar bar = new StatusBar();

	// Create object
	TicketOrderGUI orders;

	private JLabel TextAmt = new JLabel("Enter how many tickets you'd like to purchase (1-6):");
	private JTextField orderAmt = new JTextField(10);
	private JButton purchase = new JButton("Purchase tickets");
	private JLabel balance = new JLabel();
	private JProgressBar progress = new JProgressBar();

	
	// Constructor for TicketOrderFrame 
	public TicketOrderFrame(TicketOrderGUI b) {
		orders = b;
		
		// Add click listeners
		purchaseListener p = new purchaseListener();
		purchase.addActionListener(p);
		
		// Add Box Layout 
		/*
		JFrame frame = new JFrame();
		*/
		
		JPanel controlPanel = new JPanel();
		controlPanel.setBackground(Color.lightGray);
		
		// Add Box Layout
		/*
		controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
		*/
		
		controlPanel.add(TextAmt);
		controlPanel.add(orderAmt);
		controlPanel.add(purchase);
		controlPanel.add(balance);

		// * Added for Status Bar
		controlPanel.add(progress);
		progress.setPreferredSize(new Dimension(300, 20));
		progress.setMinimum(0);
		progress.setMaximum(75);
		progress.setValue(0);
		progress.setBounds(20, 35, 260, 20);

		
		// Add Box Layout
		/*
		frame.getContentPane().add(BorderLayout.CENTER, controlPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		*/
		
		add(controlPanel);
		setSize(400, 400);
	
	}

	// Click listener for purchase button
	class purchaseListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String a = orderAmt.getText();
			int pAmt = Integer.parseInt(a);

			orders.DecreaseTicket(pAmt);

			balance.setText(orders.getErrorMsg());

			// * Added for Status Bar

			//System.out.println("this is the bal " + orders.getTicketBalance());
			//System.out.println("This is the max " + orders.MAX_ORDER);

			bar.setNewValues(orders.getMAX_ORDER(), orders.getTicketBalance(), Color.BLACK);
			progress.setValue(bar.calcB);

		}
	}

}
