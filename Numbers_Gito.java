import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Numbers_Gito{
	
	public static void main(String args[])
	{
		JTextArea outputArea = new JTextArea(5,10);
		JScrollPane scroll = new JScrollPane(outputArea);
		
		outputArea.setEditable(false);
		
		int num,sum=0,square;
		
		num= Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
		outputArea.append("Even Numbers: ");
		for(int i=1;i<=num;i++)
		{
			
			if(i%2==0)
			{
				outputArea.append(Integer.toString(i) + " ");
			}
			
			else 
			{
				sum	= sum + i;
			}	
		}
		outputArea.append("\n" + "Sum of Odd Numbers: " + Integer.toString(sum));
		outputArea.append("\n" + "Number \t Square");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				square = 0;
				square = i*i;
				outputArea.append("\n" + Integer.toString(i) + "\t" +  Integer.toString(square));
			}	
		}
		
		JOptionPane.showMessageDialog(null, scroll);
		System.exit(0);
	
	}
}