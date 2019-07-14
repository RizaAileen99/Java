/**
 * @(#)temp.java
 *
 *
 * @author 
 * @version 1.00 2019/3/30
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class  GITOJORDA_TEMP extends JFrame implements ItemListener {
	

	double converted, input;
	String strFr, strTo;
	
	Container con = getContentPane(); // container
	JTextField input1 = new JTextField(10); // 1st
	JTextField input2 = new JTextField(10); // 2nd
	DecimalFormat digit = new DecimalFormat("0.00");
	
	JLabel equal = new JLabel("=");
	JLabel creator = new JLabel("Created By : Gito & Jorda");
  	String[] s1 = new String[]{"Select Unit","Celsius","Fahrenheit","Kelvin","Rankine","Reaumur"}; //1st
  
  	String[] s2 = {"Select Unit","Celsius","Fahrenheit","Kelvin","Rankine","Reaumur"}; //2nd
  	JComboBox tmp1 = new JComboBox(s1);//1st
  	JComboBox tmp2 = new JComboBox(s2);//2nd
  	
  	
  	

  	 
    public GITOJORDA_TEMP() {
    	
    	 super("Temperature Converter");
    	 setVisible(true);
    	 setLocation(420,250);
    	 setSize(300,200); //width and height
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 setResizable(false);
    	 input2.setEditable(false);
    	 
    	 con.setLayout(null);
    	 con.setBackground(Color.BLACK);
    	 con=getContentPane();

    	 
    	 add(input1);
    	 input1.setBounds(20, 30, 100, 30);
    	 add(equal);
    	 equal.setBounds(140, 40, 30, 30);
    	 add(input2);
    	 input2.setBounds(180, 30, 100, 30);
    	 add(tmp1);			
    	 tmp1.setBounds(20, 60, 100, 30);		
    	 add(tmp2);
    	 tmp2.setBounds(180, 60, 100, 30);
    	 add(creator);
    	 creator.setBounds(80, 120, 150, 30);
    	 
    	 
    	 
    	 equal.setFont(equal.getFont().deriveFont(40f));
    	 equal.setForeground(Color.GREEN);
    	  
    	 tmp1.setOpaque(true);
         tmp1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
         tmp1.setBackground(Color.ORANGE);
         tmp1.setForeground(Color.BLACK);
    	 tmp2.setOpaque(true);
         tmp2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
         tmp2.setBackground(Color.ORANGE);
         tmp2.setForeground(Color.BLACK);
   	     
    	 
    	 
    	 creator.setForeground(Color.ORANGE);
    	 
		 tmp1.addItemListener(this);
		 tmp2.addItemListener(this);

		 
    }
    
     public void itemStateChanged(ItemEvent e) {
     	if(e.getSource() == tmp1 || e.getSource() == tmp2){
     		input = Double.parseDouble(input1.getText());
     		strFr = tmp1.getSelectedItem().toString();
     		strTo = tmp2.getSelectedItem().toString();
     	}
     	
     	double answer = converter(input,strFr,strTo);
     
     	String formatted = digit.format(answer);
     	input2.setText(formatted);
     	
         	
    }

    public static void main (String args[]){
    	
    	GITOJORDA_TEMP test = new GITOJORDA_TEMP();

    }
    
   	public double converter(double input,String unitFrom, String unitTo){
   		
  		
   		
   		if(unitFrom.equals("Celsius")){
   			if(unitTo.equals("Celsius")){
   				converted = input;
   			}
   			
   			if(unitTo.equals("Fahrenheit")){
   				converted = input*9/5+32;
   	
   			}
   			
   			if(unitTo.equals("Kelvin")){
   				converted = input+273.15;
   			}
   			
   			if(unitTo.equals("Rankine")){
   				converted = (input+273.15)*9/5;
   			}
   			
   			if(unitTo.equals("Reaumur")){
   				converted = input*4/5;
   			}	
   		}
   		
   		if(unitFrom.equals("Fahrenheit")){
   			
   			if(unitTo.equals("Fahrenheit")){
   				converted = input;
   			}
   			if(unitTo.equals("Celsius")){
   				converted = (input-32)*5/9;
   			}
   			
   			if(unitTo.equals("Kelvin")){
   				converted = (input+ 459.67)*5/9;
   			}
   			
   			if(unitTo.equals("Rankine")){
   				converted =  input+459.67;
   			}
   			
   			if(unitTo.equals("Reaumur")){
   				converted = (input-32)*4/9;
   			}	
   		}
   		
   		if(unitFrom.equals("Kelvin")){
   			if(unitTo.equals("Kelvin")){
   				converted = input;
   			}
   			if(unitTo.equals("Celsius")){
   				converted = input-273.15;
   			}
   			
   			if(unitTo.equals("Fahrenheit")){
   				converted = input*9/5-459.67;
   			}
   			
   			if(unitTo.equals("Rankine")){
   				converted =  input*9/5;
   			}
   			
   			if(unitTo.equals("Reaumur")){
   				converted = (input-273.15)*4/5;
   			}	
   		}
   		
  		if(unitFrom.equals("Rankine")){
  			if(unitTo.equals("Rankine")){
   				converted = input;
   			}
   			if(unitTo.equals("Celsius")){
   				converted = (input-491.67)*5/9;
   			}
   			
   			if(unitTo.equals("Fahrenheit")){
   				converted = input-459.67;
   			}
   			
   			if(unitTo.equals("Kelvin")){
   				converted =  input*5/9;
   			}
   			
   			if(unitTo.equals("Reaumur")){
   				converted = (input-491.67)*4/9;
   			}	
   		}
   		
   		if(unitFrom.equals("Reaumur")){
   			if(unitTo.equals("Reaumur")){
   				converted = input;
   			}
   			if(unitTo.equals("Celsius")){
   				converted = input*5/4;
   			}
   			
   			if(unitTo.equals("Fahrenheit")){
   				converted = input*9/4+32;
   			}
   			
   			if(unitTo.equals("Kelvin")){
   				converted =  input*5/4+273.15;
   			}
   			
   			if(unitTo.equals("Rankine")){
   				converted = input*9/4+491.67;
   			}	
   		}

   		return converted;
   		
   	}
   	
   
}


