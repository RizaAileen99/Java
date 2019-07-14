
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Frequency_Paul{

public static void main (String args[])
{
    JTextArea output = new JTextArea(5,5);
    JScrollPane scrollbar = new JScrollPane(output);
    
    String text = JOptionPane.showInputDialog("Enter string: ");
    text=text.toLowerCase();
    int length = text.length();
    char letter;

    output.append("Letters\t  Frequency\n");

    int cntr = 0;
    for(char l ='a'; l<='z'; l++)
    {
        cntr = 0;
        for(int j=0; j<length; j++)
        {
            letter = text.charAt(j);
            if(letter==l)
                cntr++;
        }
        if(cntr!=0)
        {
             output.append(l+"\t"+Integer.toString(cntr)+"\n");
        }
     }
     
     JOptionPane.showMessageDialog(null,output);
     System.exit(0);
    }

  }