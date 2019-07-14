 			 
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;

public class GITOJORDA_PIZZA implements ItemListener{
	JFrame frame = new JFrame(); 
    JLabel header = new JLabel("Pizza Parlor"); 
    	
    JTextField price = new JTextField();
    DecimalFormat digit = new DecimalFormat("0.00");
    
    JLabel sizes = new JLabel("Pizza Size"); 
    JLabel toppings = new JLabel("Toppings"); 
    JLabel drinks = new JLabel("Drinks"); 
    JLabel total = new JLabel("Total Price:"); 
    JLabel creators = new JLabel("Created by: Gito & Jorda"); 
    	
    JCheckBox small = new JCheckBox("Small Php 150");
	JCheckBox medium = new JCheckBox("Medium Php 180");
	JCheckBox large = new JCheckBox("Large Php 250");
	
	JCheckBox cheese = new JCheckBox("Cheese Php 0");
	JCheckBox bacon = new JCheckBox("Bacon Php 50");
	JCheckBox pepperoni = new JCheckBox("Pepperoni Php 60");
	
	JCheckBox cola = new JCheckBox("Cola Php 35");
	JCheckBox tea = new JCheckBox("Iced Tea Php 25");
	JCheckBox water = new JCheckBox("Water Php 20");
    	
    JCheckBox delivery = new JCheckBox("For Delivery?");
    
    ImageIcon imageIcon = new ImageIcon("PizzaIcon.png");

    
	public GITOJORDA_PIZZA(){
		
		Image image = imageIcon.getImage(); 
		Image transform = image.getScaledInstance(100, 100,Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(transform);
		header.setIcon(imageIcon);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(null);
    	frame.setBounds(0,0,350,600);
    	frame.getContentPane().setBackground(Color.BLACK);
    	frame.setVisible(true);
    	price.setEditable(false);
    	
    	price.setBounds(170,490,100,20);
    	frame.add(price);
    	
    	//header
    	header.setBounds(30,-100,300,300);
		header.setForeground(Color.WHITE);
		header.setFont(new Font("Courier",1,22));
		frame.add(header);
		//sizes
		sizes.setBounds(0,0,300,300);
		sizes.setForeground(Color.WHITE);
		sizes.setFont(new Font("Courier",1,20));
		frame.add(sizes);
		
		//toppings
		toppings.setBounds(0,150,100,150);
		toppings.setForeground(Color.WHITE);
		toppings.setFont(new Font("Courier",1,20));
		frame.add(toppings);
		
		//drinks
		drinks.setBounds(0,230,100,150);
		drinks.setForeground(Color.WHITE);
		drinks.setFont(new Font("Courier",1,20));
		frame.add(drinks);
		
		//total
    	total.setBounds(0,350,300,300);
		total.setForeground(Color.WHITE);
		total.setFont(new Font("Courier",1,20));
		frame.add(total);
		
		//creator
    	creators.setBounds(0,500,300,100);
		creators.setForeground(Color.WHITE);
		creators.setFont(new Font("Courier",1,15));
		frame.add(creators);
		
		//group1
		ButtonGroup grp1 = new ButtonGroup();
		small.setBounds(0,170,100,20);
		small.setForeground(Color.WHITE);
		small.setBackground(Color.BLACK);
		small.setFont(new Font("Arial",1,10));
		grp1.add(small);
		medium.setBounds(100,170,120,20);
		medium.setForeground(Color.WHITE);
		medium.setBackground(Color.BLACK);
		medium.setFont(new Font("Arial",1,10));
		grp1.add(medium);
		large.setBounds(215,170,120,20);
		large.setForeground(Color.WHITE);
		large.setBackground(Color.BLACK);
		large.setFont(new Font("Arial",1,10));
		grp1.add(large);
		
		frame.add(small);
		frame.add(medium);
		frame.add(large);
		
		
		cheese.setBounds(0,250,100,20);
		cheese.setForeground(Color.WHITE);
		cheese.setBackground(Color.BLACK);
		cheese.setFont(new Font("Arial",1,10));
		
		bacon.setBounds(100,250,120,20);
		bacon.setForeground(Color.WHITE);
		bacon.setBackground(Color.BLACK);
		bacon.setFont(new Font("Arial",1,10));
		
		pepperoni.setBounds(215,250,120,20);
		pepperoni.setForeground(Color.WHITE);
		pepperoni.setBackground(Color.BLACK);
		pepperoni.setFont(new Font("Arial",1,10));
		
		
		frame.add(cheese);
		frame.add(bacon);
		frame.add(pepperoni);
		
		
		
		cola.setBounds(0,330,100,20);
		cola.setForeground(Color.WHITE);
		cola.setBackground(Color.BLACK);
		cola.setFont(new Font("Arial",1,10));
		
		tea.setBounds(100,330,120,20);
		tea.setForeground(Color.WHITE);
		tea.setBackground(Color.BLACK);
		tea.setFont(new Font("Arial",1,10));
		
		water.setBounds(215,330,120,20);
		water.setForeground(Color.WHITE);
		water.setBackground(Color.BLACK);
		water.setFont(new Font("Arial",1,10));
		
		
		frame.add(cola);
		frame.add(tea);
		frame.add(water);
		
		delivery.setBounds(0,400,200,50);
		delivery.setForeground(Color.WHITE);
		delivery.setBackground(Color.BLACK);
		delivery.setFont(new Font("Courier",1,20));
		frame.add(delivery);
		
		small.addItemListener(this);
		medium.addItemListener(this);
		large.addItemListener(this);
		
		cheese.addItemListener(this);
		bacon.addItemListener(this);
		pepperoni.addItemListener(this);
		
		cola.addItemListener(this);
		tea.addItemListener(this);
		water.addItemListener(this);
		
		delivery.addItemListener(this);
	}
	
	int pizzaP = 0;
	int che,bac,pep,col,te,wat;
	double fee;
	double tP = 0;
	
	public void itemStateChanged(ItemEvent e){
		
		if(e.getItem() == small){
			pizzaP=150;
		} else if(e.getItem() == medium){
			pizzaP=180;
		} else if(e.getItem() == large){
			pizzaP=250;
		}
		
		if(cheese.isSelected()){
				che = 0;	
		}else{
			che=0;
		}
		
		if(bacon.isSelected()){
			bac = 50;	
		}else{
			bac=0;
		}
		
		if(pepperoni.isSelected()){
			pep = 60;	
		}else{
			pep=0;
		}
		
		if(cola.isSelected()){
				col = 35;	
		}else{
			col=0;
		}
		
		if(tea.isSelected()){
			te = 25;	
		}else{
			te=0;
		}
		
		if(water.isSelected()){
			wat = 20;	
		}else{
			wat=0;
		}
		
		if(delivery.isSelected()){
			tP = (pizzaP + che + bac + pep + col + te + wat);
			fee = tP*(.01);	
			tP=tP+fee;
		}else{
			tP = (pizzaP + che + bac + pep + col + te + wat);
		}
		
		
		
		String formatted = digit.format(tP);
     	
		price.setText(formatted);
	}

  	public static void main(String args[]) {
  	
  		GITOJORDA_PIZZA pizza = new GITOJORDA_PIZZA();

  }

}