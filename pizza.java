//@PAUL ANDREW C. PAULAN & TRISTAN JERICHO L. BRAVANTE

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import javax.swing.ImageIcon;
 
public class pizza extends JFrame implements ItemListener{
	
	Container c = getContentPane();
	double 	total = 0,fee,totalp;
	JCheckBox chbpizsmall = new JCheckBox("Small Php150");
	JCheckBox chbpizmed = new JCheckBox("Meduim Php180");
	JCheckBox chbpizlarge = new JCheckBox("Large Php250");
	JCheckBox chbcheese = new JCheckBox("Cheese Php 0");
	JCheckBox chbBacon = new JCheckBox("Bacon Php 50");
	JCheckBox chbPepperoni = new JCheckBox("Pepperoni Php 60");
	JCheckBox chbCola = new JCheckBox("Cola Php 35");
	JCheckBox chbIceT = new JCheckBox("Iced Tea Php 25");
	JCheckBox chbWater = new JCheckBox("Water Php 20");
	JCheckBox chbdlvr = new JCheckBox("Delivery?");
	JTextField txtprice = new JTextField (10);
	JLabel pizzasize = new JLabel("Pizza Size: ");
	JLabel Topping = new JLabel("Topping: ");
	JLabel Drink = new JLabel("Drinks: ");
	JLabel price = new JLabel(": Total Price");
	Font font = new Font("Impact",0,15);
	ButtonGroup grpsize = new ButtonGroup();
	ImageIcon icon = new ImageIcon("Pizza Icon.png");
	JLabel title = new JLabel("Pizzeria MAMAMIA");
	
	
	public pizza(){
		Image imgs = icon.getImage();
		Image trans = imgs.getScaledInstance(100,100,Image.SCALE_SMOOTH);
		icon = new ImageIcon(trans);
		title.setIcon(icon);
		setTitle("Pizzeria MAMAMIA");
		setVisible(true);
		//title.setIconImage(icon.getImage());
		setSize(450,200);
		setLocation(350,350);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grpsize.add(chbpizsmall);
		grpsize.add(chbpizmed);
		grpsize.add(chbpizlarge);
				
		//container
		c.setLayout(new FlowLayout());
		c.add(pizzasize);
		c.add(chbpizsmall); c.add(chbpizmed);
		c.add(chbpizlarge); 
		
		c.add(Topping);
		c.add(chbcheese);		
		c.add(chbBacon); c.add(chbPepperoni);
		
		c.add(Drink);
		c.add(chbCola); c.add(chbIceT);
		c.add(chbWater);
		
		c.add(chbdlvr);
		c.add(title);
			
 		//background
		c.add(chbdlvr); c.add(txtprice); c.add(price);
		//font
		pizzasize.setFont(font);	pizzasize.setForeground(Color.DARK_GRAY);
		chbpizsmall.setFont(font);	chbpizsmall.setForeground(Color.DARK_GRAY);
		chbpizmed.setFont(font);	chbpizmed.setForeground(Color.DARK_GRAY);
		chbpizlarge.setFont(font);	chbpizlarge.setForeground(Color.DARK_GRAY);
		Topping.setFont(font);		Topping.setForeground(Color.DARK_GRAY);
		chbcheese.setFont(font);	chbcheese.setForeground(Color.DARK_GRAY);
		chbBacon.setFont(font);		chbBacon.setForeground(Color.DARK_GRAY);
		chbPepperoni.setFont(font);	chbPepperoni.setForeground(Color.DARK_GRAY);
		Drink.setFont(font);		Drink.setForeground(Color.DARK_GRAY);
		chbCola.setFont(font);		chbCola.setForeground(Color.DARK_GRAY);
		chbIceT.setFont(font);		chbIceT.setForeground(Color.DARK_GRAY);
		chbWater.setFont(font);		chbWater.setForeground(Color.DARK_GRAY);
		chbdlvr.setFont(font);		chbdlvr.setForeground(Color.DARK_GRAY);
		txtprice.setFont(font);		txtprice.setForeground(Color.DARK_GRAY);
		price.setFont(font);		price.setForeground(Color.DARK_GRAY);
		chbdlvr.setFont(font);		chbdlvr.setForeground(Color.DARK_GRAY);
		title.setFont(font);		title.setForeground(Color.DARK_GRAY);
		//listeners:
		
		chbpizlarge.addItemListener(this); chbpizmed.addItemListener(this); chbpizsmall.addItemListener(this);
		
		chbcheese.addItemListener(this); chbBacon.addItemListener(this); chbPepperoni.addItemListener(this);
		
		chbCola.addItemListener(this); chbIceT.addItemListener(this); chbWater.addItemListener(this);
		
		chbdlvr.addItemListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent e){
		//Size:
		if(e.getSource() == chbpizlarge)
		{
			if (chbpizlarge.isSelected())
			{
				total = total + 250; 
				
				txtprice.setText(String.valueOf(total) +"php");
				
			}
			
			else
			{
				total = total - 250;
				
				txtprice.setText(String.valueOf(total) +"php");
			
			}
		}
		
		if(e.getSource() == chbpizmed)
		{
			if(chbpizmed.isSelected())
			{
			
				total = total + 180;
			
				txtprice.setText(String.valueOf(total) +"php");
			
			}
			
			else
			{
				total = total - 180;
				
				txtprice.setText(String.valueOf(total) +"php");
				
			}
		}
		
		if(e.getSource() == chbpizsmall)
		{
			if(chbpizsmall.isSelected())
			{
				total = total + 150;
				
				txtprice.setText(String.valueOf(total) +"php");
				
			}
			
			else
			{
				total = total - 150;
				
				txtprice.setText(String.valueOf(total) +"php");
			
			}
		}
		
		//Toppings:
	
			
		if(e.getSource() == chbBacon)
		{
			if(chbBacon.isSelected())
			{
				total = total + 50;
				
				txtprice.setText(String.valueOf(total) +"php");
				
			}
			
			else
			{
				total = total - 50;
				
				txtprice.setText(String.valueOf(total) +"php");
				
			}
		}
		
		if(e.getSource() == chbPepperoni)
		{
			if(chbPepperoni.isSelected())
			{
				total = total + 60;
					
				txtprice.setText(String.valueOf(total) +"php");
				
			}
			
			else
			{
				total = total - 60;
				
				txtprice.setText(String.valueOf(total) +"php");
			
			}
			
		}
		
		//Drinks
		if (e.getSource() == chbCola)
		{
			if(chbCola.isSelected())
			{
				total = total + 35;
				
				txtprice.setText(String.valueOf(total) +"php");
				
			}
			
			else 
			{
				total = total - 35;
				
				txtprice.setText(String.valueOf(total) +"php");
				
			}
		}
		
		if (e.getSource() == chbIceT)
		{
			if (chbIceT.isSelected())
			{
				total = total + 25;
				
				txtprice.setText(String.valueOf(total) +"php");
			
			}
			
			else 
			{
				total = total - 25;
				
				txtprice.setText(String.valueOf(total) +"php");
			
			}
		}
		
		if (e.getSource() == chbWater)
		{
			if(chbWater.isSelected())
			{
				total = total + 20;
				
				txtprice.setText(String.valueOf(total) +"php");
				
			}
			
			else
			{
				total = total - 20;
				
				txtprice.setText(String.valueOf(total) +"php");
				
			}
		}
		//misc
		if (e.getSource() == chbdlvr)
		{
			if(chbdlvr.isSelected())
			{
				totalp = total * 0.01;				
				fee = totalp;
				txtprice.setText(String.valueOf(total) +"php");
			}
			
			else
			{
				totalp = total;
				fee = totalp;
				txtprice.setText(String.valueOf(total) +"php");
			}
		}	
	}
	public static void main(String [] args){
		new pizza();
	}
	
}