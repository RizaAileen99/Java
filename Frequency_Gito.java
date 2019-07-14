import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Frequency_Gito{
	
	public static void main(String args[]){
		
		JTextArea output = new JTextArea(5,10);
		JScrollPane scroll = new JScrollPane(output);
		
		String str = JOptionPane.showInputDialog("Enter string: ");
		String lowerCase = str.toLowerCase();
		int length = lowerCase.length();
		
		char alpha;
		output.append("Letter \t Frequency\n");
		
		for(alpha='a';alpha<='z';alpha++){
			
			int frequency = 0, x;
			
			for(x=0; x<length;x++){
				char letter = lowerCase.charAt(x);
				
				if(letter == alpha){
					frequency++;
				}	
			}
			if(frequency > 0){
					output.append(alpha + " \t " + Integer.toString(frequency)+ "\n");
				}
		}
		
		JOptionPane.showMessageDialog(null,scroll);
		System.exit(0);
	}
}