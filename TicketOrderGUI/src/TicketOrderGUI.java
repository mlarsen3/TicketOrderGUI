import java.util.Set;
//Mary Larsen
public class TicketOrderGUI {

	int ticketBalance;
	final int MAX_TICKETS = 6;
	final int MAX_ORDER = 75;
	String ErrorMsg = "";

	
	// Constructor TicketOrderGUI sets initial balance
	public TicketOrderGUI(int ticketBalance) {
		this.ticketBalance = ticketBalance;
	}

	
	// Purchase Ticket method
	public double DecreaseTicket(int b) {
		this.ErrorMsg("");
		 
		if (b < 1) {
			this.ErrorMsg("Please enter a number only.");
		} else if (b > MAX_TICKETS) {
			this.ErrorMsg(MAX_TICKETS + " is the max available per order.  " + ticketBalance + " tickets remaining.");
		} else if (b > this.ticketBalance) {
			this.ErrorMsg("There are only " + ticketBalance + " tickets remaining");
		} else {
			ticketBalance = ticketBalance - b;
			this.ErrorMsg(b + " tickets purchased " + ticketBalance + " tickets remaining.");
		}

		return ticketBalance;
	}
	
	
	private String ErrorMsg(String error) {
		return ErrorMsg = error;
	}


	// Getters & Setters

	public int getTicketBalance() {
		return ticketBalance;
	}

	public void setTicketBalance(int ticketBalance) {
		this.ticketBalance = ticketBalance;
	}

	public int getMAX_TICKETS() {
		return MAX_TICKETS;
	}

	public int getMAX_ORDER() {
		return MAX_ORDER;
	}
	
	public String getErrorMsg() {
		return ErrorMsg;
	}

}
