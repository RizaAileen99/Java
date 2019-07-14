/**
 * @(#)TempConverter.java
 *
 *
 * @author 
 * @version 1.00 2019/4/5
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class TempConverter extends JFrame  {
	
	Container con = getContentPane(); // container
	JTextField input1 = new JTextField(10); // 1st
	JTextField input2 = new JTextField(10); // 2nd
	DecimalFormat digit = new DecimalFormat("0.00");
	
	JLabel equal = new JLabel("=");
	JLabel creator = new JLabel("Created By : Gito & Jorda");

	String list1[]= {"Celsius","Fahrenheit","Kelvin","Rankine","Reaumur"}; //1st
  	String list2[] = {"Celsius","Fahrenheit","Kelvin","Rankine","Reaumur"}; //2nd
  	JComboBox tmp1 = new JComboBox(list2);//1st
  	JComboBox tmp2 = new JComboBox(list2);//2nd
    public TempConverter() {
    	
    	
    	
    	
    }
    
    
    
    
    
    
    public static void main(String args[]){
    	TempConverter converter = new TempConverter();
    }
    
}