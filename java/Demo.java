/**
 * @(#)Demo.java
 *
 *
 * @author 
 * @version 1.00 2019/5/10
 */

import java.awt.*;
import javax.swing.*;

public class Demo extends JApplet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     *
     */
     
     
    public void init() {
        // TODO start asynchronous download of heavy resources
        
    	
    }
    
    public void start() {
    	
    	
    	
    }

    public void paint(Graphics g) {
    	g.setFont(new Font("Tahoma",1,20));
        //g.drawString("Pangarap mong bahay", 50,50);
        g.drawLine(50,250,150,150);
        g.drawLine(250,250,150,150);
        
        g.drawRect(50,250,200,200);
        g.drawRect(50,350,70,100);
        g.fillOval(60,390,10,10);
        g.drawOval(125,190,45,45);
        
        g.drawLine(147,190,147,235);
        g.drawLine(125,212,170,212);
        
        
        g.setColor(Color.BLUE);
        g.fillOval(360,395,10,10);
        
        
        
       
        g.setColor(Color.YELLOW);
        g.fillArc(300,370,80,80,45,315);
   
   		
   		
        
        
        int x[] ={200,205,215,210,213,200,187,190,185,195};
        int y[] ={50,60,60,70,80,75,80,70,60,60};
        
        g.fillPolygon(x,y,10);
        
        
        
        
    }
    
    
}