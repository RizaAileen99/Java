/**
 * @(#)GITOJORDA_CALC.java
 *
 *
 * @author 
 * @version 1.00 2019/3/30
 */
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*; 
import javax.swing. JFrame;
//import java.awt.Container; 


public class GITOJORDA_CALC extends JFrame {
	
	Container c; 
	
	JLabel lblCreators = new JLabel("Creators: Gito & Jorda");  

	JButton btnClear = new JButton("C");
	JButton btnDiv = new JButton("/");
	JButton btnMul = new JButton("x");
	JButton btnSign = new JButton("+/-");
	JButton btnAdd = new JButton("+");
	JButton btnSub = new JButton("-");
	JButton btnEquals = new JButton("=");
	JButton btnPercent = new JButton("%");
	JButton btnDec = new JButton(".");
	JButton btn0 = new JButton("0");
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
    	//setLocation(300,300); 
    	setBounds(500,100,250,425);  
    	setResizable(false); 
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	c=getContentPane();
    	c.setLayout(null);
    	c.setBackground(Color.BLACK);
    	
    	lblName.setForeground(Color.WHITE);
    	lblName.setBounds(55,325,200,100);
    	add(lblName);
    	
    	JTextField tf = new JTextField(10);
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
    	add(btn0);
    	btn0.setBounds(65, 320, 50, 40);
    	btn0.setBackground(Color.WHITE);
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
    }

    
    public static void main(String args[]){
    	GITOJORDA_CALC calculator = new GITOJORDA_CALC();
    }
    
}