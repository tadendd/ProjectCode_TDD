package Project;
import javax.swing.*;
import java.awt.*;

/*
 * This part of the project was to test code from the internet. It serves no purpose to the final result of
 * project.
 */
 
public class flowLayout {
	JFrame f;  
	flowLayout(){  
	    f=new JFrame();  
	      
	    JButton b1=new JButton("1");  
	    JLabel b2=new JLabel("2");  
	    JButton b3=new JButton("3");  
	    JButton b4=new JButton("4");  
	    JButton b5=new JButton("5");  
	              
	    f.add(b1);
	    f.add(b2);
	    f.add(b3);
	    f.add(b4);
	    f.add(b5);  
	      
	    f.setLayout(new FlowLayout(FlowLayout.LEFT));  
	    //setting flow layout of right alignment  
	  
	    f.setSize(300,300);  
	    f.setVisible(true);  
	}  
	public static void main(String[] args) {  
	    new flowLayout();  

}}
