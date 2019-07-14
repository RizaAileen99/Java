/**
 * @(#)GITOJORDA_CALC.java
 *
 *
 * @author 
 * @version 1.00 2019/3/30
 */
//import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*; 
import javax.swing. JFrame;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
//import java.awt.Container; 


public class GITOJORDA_CALC extends JFrame implements ActionListener {
	
	Container c; 
	
	String str1,str2,str3,str4,str5;
	int d;
	double n;
	double answer;
	DecimalFormat digit = new DecimalFormat("0.00");
	JLabel lblCreators = new JLabel("Creators: Gito & Jorda");  
	JTextField tf = new JTextField(10);
	
	boolean pressedEqual =false;

	JButton btnClear = new JButton("C");
	JButton btnDiv = new JButton("/");
	JButton btnMul = new JButton("x");
	JButton btnSign = new JButton("+/-");
	JButton btnAdd = new JButton("+");
	JButton btnSub = new JButton("-");
	JButton btnEquals = new JButton("=");
	JButton btnPercent = new JButton("%");
	JButton btnDec = new JButton(".");
	JButton btnZero = new JButton("0");
	JButton btn7 = new JButton("7");
	JButton btn4 = new JButton("4");
	JButton btn1 = new JButton("1");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	
	JLabel lblName = new JLabel("Creators: Gito & Jorda");  
	
	
    public GITOJORDA_CALC() {
    	super("Calculator");
    	setLocation(300,300); 
    	setBounds(450,300,250,425);  
    	setResizable(false); 
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	c=getContentPane();
    	c.setLayout(null);
    	c.setBackground(Color.BLACK);
    	
    	lblName.setForeground(Color.WHITE);
    	lblName.setBounds(55,325,200,100);
    	add(lblName);
    	
    	//JTextField tf = new JTextField(10);
   		add(tf);
    	tf.setBounds(10, 20, 225, 40);
    	tf.setHorizontalAlignment(JTextField.RIGHT);
    	//to disable keyboard
    	tf.setFocusable(false);
    	
    	add(btnClear);
    	btnClear.setBounds(10, 80, 50, 40);
    	btnClear.setBackground(Color.ORANGE);
    	add(btnDiv);
    	btnDiv.setBounds(65, 80, 50, 40);
    	btnDiv.setBackground(Color.ORANGE);
    	add(btnMul);
    	btnMul.setBounds(120, 80, 50, 40);
    	btnMul.setBackground(Color.ORANGE);
    	
    	add(btn7);
    	btn7.setBounds(10, 140, 50, 40);
    	btn7.setBackground(Color.WHITE);
    		
    	add(btn8);
    	btn8.setBounds(65, 140, 50, 40);
    	btn8.setBackground(Color.WHITE);
    	add(btn9);
    	btn9.setBounds(120, 140, 50, 40);
    	btn9.setBackground(Color.WHITE);
    	add(btn4);
    	btn4.setBounds(10, 200, 50, 40);
    	btn4.setBackground(Color.WHITE);
    	add(btn5);
    	btn5.setBounds(65, 200, 50, 40);
    	btn5.setBackground(Color.WHITE);
    	add(btn6);
    	btn6.setBounds(120, 200, 50, 40);
    	btn6.setBackground(Color.WHITE);
    	add(btn1);
    	btn1.setBounds(10, 260, 50, 40);
    	btn1.setBackground(Color.WHITE);
    	add(btn2);
    	btn2.setBounds(65, 260, 50, 40);
    	btn2.setBackground(Color.WHITE);
    	add(btn3);
    	btn3.setBounds(120, 260, 50, 40);
    	btn3.setBackground(Color.WHITE);
    	add(btnPercent);
    	btnPercent.setBounds(10, 320, 50, 40);
    	btnPercent.setBackground(Color.ORANGE);
    	add(btnZero);
    	btnZero.setBounds(65, 320, 50, 40);
    	btnZero.setBackground(Color.WHITE);
    	add(btnDec);
    	btnDec.setBounds(120, 320, 50, 40);
    	btnDec.setBackground(Color.ORANGE);
    	add(btnSign);
    	btnSign.setBounds(175, 80, 50, 40);
    	btnSign.setBackground(Color.ORANGE);
    	add(btnSub);
    	btnSub.setBounds(175, 140, 50, 40);
    	btnSub.setBackground(Color.ORANGE);
    	add(btnAdd);
    	btnAdd.setBounds(175, 200, 50, 40);
    	btnAdd.setBackground(Color.ORANGE);
    	add(btnEquals);
    	btnEquals.setBounds(175, 260, 50, 100);
    	btnEquals.setBackground(Color.ORANGE);
    	
    	btn1.addActionListener(this);
    	btn2.addActionListener(this);
    	btn3.addActionListener(this);
    	btn4.addActionListener(this);
    	btn5.addActionListener(this);
    	btn6.addActionListener(this);
    	btn7.addActionListener(this);
    	btn8.addActionListener(this);
    	btn9.addActionListener(this);
    	btnZero.addActionListener(this);
    	
    	btnClear.addActionListener(this);
    	btnDiv.addActionListener(this);
    	btnMul.addActionListener(this);
    	btnSign.addActionListener(this);
    	btnSub.addActionListener(this);
    	btnAdd.addActionListener(this);
    	btnPercent.addActionListener(this);
    	btnDec.addActionListener(this);
    	btnEquals.addActionListener(this);
    	
    }

    
    public static void main(String args[]){
    	GITOJORDA_CALC calculator = new GITOJORDA_CALC();
    }
    
    public void actionPerformed(ActionEvent e){
    	
    	if(e.getSource()==btnZero)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "0";
           		str5 = str3+str4;
            	tf.setText(str5);
            	 pressedEqual=false; //
        	} else{
        	
            str3 = tf.getText();
            str4 = "0";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        
        if(e.getSource()==btn1)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "1";
            	str5 = str3+str4;
            	tf.setText(str5);
            	 pressedEqual=false; //
        	}else{
        	
            str3 = tf.getText();
            str4 = "1";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        if(e.getSource()==btn2)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "2";
            	str5 = str3+str4;
            	tf.setText(str5);
            	pressedEqual=false;
        	}else{
     
            str3 = tf.getText();
            str4 = "2";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        if(e.getSource()==btn3)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "3";
            	str5 = str3+str4;
            	tf.setText(str5);
            	pressedEqual=false;
        	}else{
            str3 = tf.getText();
            str4 = "3";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        if(e.getSource()==btn4)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "4";
            	str5 = str3+str4;
            	tf.setText(str5);
            	pressedEqual=false;
        	}else{
            str3 = tf.getText();
            str4 = "4";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        if(e.getSource()==btn5)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "5";
            	str5 = str3+str4;
            	tf.setText(str5);
            	pressedEqual=false;
        	}else{
            str3 = tf.getText();
            str4 = "5";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        if(e.getSource()==btn6)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "6";
            	str5 = str3+str4;
            	tf.setText(str5);
            	pressedEqual=false;
        	}else{
            str3 = tf.getText();
            str4 = "6";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        if(e.getSource()==btn7)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "7";
            	str5 = str3+str4;
            	tf.setText(str5);
            	pressedEqual=false;
        	}else{
            str3 = tf.getText();
            str4 = "7";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        if(e.getSource()==btn8)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "8";
            	str5 = str3+str4;
            	tf.setText(str5);
            	pressedEqual=false;
        	}else{
            str3 = tf.getText();
            str4 = "8";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        if(e.getSource()==btn9)
        {
        	if(pressedEqual==true){
        		str3 = "";
            	str4 = "9";
            	str5 = str3+str4;
            	tf.setText(str5);
            	pressedEqual=false;
        	}else{
            str3 = tf.getText();
            str4 = "9";
            str5 = str3+str4;
            tf.setText(str5);
        	}
        }
        if(e.getSource()== btnDec)
        {
              str3 = tf.getText();
              if (str3.indexOf(".")==-1){
                  tf.setText(str3+".");
              } else{
                   tf.setText(str3);
               		 
              } 
        }
        if(e.getSource()==btnAdd)
        {
            str1 = tf.getText();
            tf.setText("");
            d=1;
        }
        if(e.getSource()==btnSub)
        {
            str1 = tf.getText();
            tf.setText("");
            d=2;
 
        }
        if(e.getSource()==btnMul)
        {
            str1 = tf.getText();
            tf.setText("");
            d=3;
        }
        if(e.getSource()==btnDiv)
        {
            str1 = tf.getText();
            tf.setText("");
            d=4;
        }
        if(e.getSource()==btnPercent)
        {
            str1 = tf.getText();
            if (str1.equals("")){
        		str1="0";
        	}
        	
            answer = Double.parseDouble(str1)/100;
            tf.setText(Double.toString(answer));
 
        }
        if(e.getSource()==btnSign)
        {
            str1 = tf.getText();
            if (str1.equals("")){
        		tf.setText("");
        	}else{
        		
            str1 = Double.toString(Double.parseDouble(str1)*(-1));
            tf.setText(str1);
        	}
 
        }
        
        if(e.getSource()==btnEquals)
        {
        	pressedEqual=true;
        	str2 = tf.getText();
        	if (str1.equals("") && str2.equals("")){
        		str1="0";
        		str2="0";
        		System.out.println(str1); 
        		System.out.print(str2); 
        	}
        	
        	if (str2.equals("")){
        		//str1="0";
        		str2=str1;
        		//System.out.println(str1); 
        		//System.out.print(str2); 
        	}
        	
        	if (str1.indexOf(".")==(str1.length()-1)){
        		str1+="0";
        		//System.out.print(str1); 
        	}
        	
            
            
            if(d==1) // for addition  
            {
				//double x = Double.parseDouble(str1);		used for debugging lol
				//double y = Double.parseDouble(str2);
                tf.setText(String.valueOf((Double.parseDouble(str1)+Double.parseDouble(str2))));
                //System.out.println(String.valueOf(x));	used for debugging lol
                //System.out.println(String.valueOf(y));
            }
            else
            if(d==2) // for subtraction
            {
                
                tf.setText(String.valueOf(digit.format(Double.parseDouble(str1)-Double.parseDouble(str2))));
            }
            else
            if(d==3) //for multiplication
            {
                
                tf.setText(String.valueOf(digit.format(Double.parseDouble(str1)*Double.parseDouble(str2))));
            }
            if(d==4) // for division
            {
                try
                {
                    int p=Integer.parseInt(str2);
                    if(p!=0)
                    {
                                        
                    tf.setText(String.valueOf(digit.format(Double.parseDouble(str1)/Double.parseDouble(str2))));
                     }
                     else
                        tf.setText("infinite");
 
                }
                catch(Exception i){}
            }
            
        }
        if(e.getSource()==btnClear)
        {
            tf.setText("");
            pressedEqual=false;
        }
        
    }
}