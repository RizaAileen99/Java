import javax.swing.JOptionPane;

public class Ticket{
	
	public static void main(String args[]){
		
		int ticketNo = Integer.parseInt(JOptionPane.showInputDialog("Enter your Ticket number: "));
		int lastDigitRemoved = ticketNo/10;
		int lastDigitDropped = ticketNo%10;
		int remainder = lastDigitRemoved%7;
		
		if (lastDigitDropped == remainder){
			JOptionPane.showMessageDialog(null, "the ticket number is valid!");
		} else {
			JOptionPane.showMessageDialog(null, "the ticket number is invalid!");
		}
	}
}