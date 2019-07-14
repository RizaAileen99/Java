//lez go waterbill

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class WaterBill_Gito{
	
	public static void main(String args[])
	{
		JTextArea outputArea = new JTextArea(3,10);
		JScrollPane scroll = new JScrollPane(outputArea);
		outputArea.setEditable(false);
		
		boolean codeRep = true; 
		int accNum = Integer.parseInt(JOptionPane.showInputDialog("Enter your Account Number: "));
		
		outputArea.append("WATER BILL\n");
		
		while(codeRep){
			
			String useCode =(JOptionPane.showInputDialog("Enter type of usage code: ", "H,C,or I"));
			double amount = 0;
			int additional = 0;
			String type=" ";
			
			if(useCode.substring(0,1).equals("H") || useCode.substring(0,1).equals("C") || useCode.substring(0,1).equals("I"))
			{
			
			int gallons = Integer.parseInt(JOptionPane.showInputDialog("Enter number of gallons: "));
			switch(useCode){
			
			case "H":
			{
				type = "Home Use";
				amount = 5+(gallons*0.005);
				break;
			}
			
			case "C":{
				type="Commercial Use";
				if (gallons <=4000)

					amount = 1000;
				else {
					additional=gallons-4000;
					amount = 1000+(additional*0.025);
				}
				break;
			}
				
			case "I":{
				type="Industrial Use";
				
				if(gallons<=4000){
					amount = 1000;
				}
				if(gallons>4000 && gallons<10000){
					amount = 2000;
				}
				if(gallons>=10000){
					amount=3000;
				}
				break;
			}
			
			}
			
			
			}else{
				JOptionPane.showMessageDialog(null, "ERROR! Transaction failed", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		
		
		outputArea.append("\n" + "Account number: "+ Integer.toString(accNum));
		outputArea.append("\n" + "Type of Usage: "+ type);
		outputArea.append("\n" + "Amount of money due: $"+ Double.toString(amount));
		
		JOptionPane.showMessageDialog(null, scroll);
		
		String decision = JOptionPane.showInputDialog("Do you want to finish the transaction? (y/n): ");
		
			if(decision.substring(0,1).equals("y") || decision.substring(0,1).equals("Y"))
			{
				codeRep = false;
			}
		}
		 
		 
		 System.exit(0);
	}
}