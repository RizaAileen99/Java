/**
 * @(#)PizzaParlor.java
 *
 *
 * @author 
 * @version 1.00 2019/4/9
 */

import java.awt.Container;
import javax.swing.JFrame;
//import javax.swing.JCheckBox;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;

public class PizzaParlor extends JFrame{
	Container c = new Container();
	JLabel Title = new JLabel("Pizza Parlor");
    //ImageIcon imageIcon = new ImageIcon(new ImageIcon("PizzaIcon.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
	
	
    public PizzaParlor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Title.setIcon(imageIcon);
    	Title.setBounds(0,-100,300,300);
    	
    	ImageIcon imageIcon = new ImageIcon(new ImageIcon("PizzaIcon.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

    	c.add(Title);
    	c.setLayout(null);
    	c.setBounds(0,0,300,500);
    	c.setVisible(true);

		
    }
    
    public static void main(String args[]){
    	PizzaParlor project = new PizzaParlor();
    }
    
}