package Project;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class Project_GUI_1 {
	
	/*
	 This is the main part of the project. This program will create a GUI box that will 
	 collect data from the user and process that information to
	 be put out through the console and through a database in MySQL. Before running this project, the database needs 
	 to be created in MySQL of the name specified in the code in order to make this work. Also, in the section in which
	 the code implements a username, password, and route of the local instance of the signal in MySQL, that will need to
	 be changed in order to be able to make this work. For now, the program lists the variables that will be created in
	 order to make the new box. This will be the main box that data will be input into. The textfields set up where that data 
	 will go into, while the border and buttons for the box are set up and the font will control how big and in what style
	 the text will be. The JFrame and JPanel are what create the GUI box, the text fields are where the information
	 will go, the font will make the text what font it needs to be, and the buttons will be set up in order
	 to perform specific actions. the main method will be used to call up each individual function 
	 needed in order to run this project. Before running this program, please make sure the mysql 
	 connector JAR file is attached to this program in some way, either through a path connected 
	 with the program or any other method. Also, make sure that the database is created. There will 
	 be a piece of code at the end of this program in order to create the database and table in MySQL.
	 */

	static JPanel GUI1Panel = new JPanel(new GridLayout(7, 3, 5, 30));
	
	static JTextField employeeName = new JTextField (7);
	static JTextField employeeAddress = new JTextField (7);
	static JTextField employeePhoneNumber = new JTextField (7);
	static JTextField employeeJobType = new JTextField (7);
	static JTextField employeeHoursWorked = new JTextField (7);
	static JTextField employeePay = new JTextField (7);
	static Border border1 = BorderFactory.createLineBorder(Color.BLUE, 5);
	static Font f = new Font("Times New Roman", 20, 20);
	static JButton b1 = new JButton("Search");
	static JButton b2 = new JButton("Exit");
	static JButton b3 = new JButton("Process Information");
	
	static JFrame inputScreen = new JFrame ("Insert Employee Information");
	static JTextField SearchField = new JTextField(7);
	static JButton SearchButton2 = new JButton("Search");
	static JPanel GUI2Panel = new JPanel(new GridLayout (7, 3, 5, 30));
	static JPanel GUI3Panel = new JPanel(new GridLayout (7, 3, 5, 30));
	static 	JLabel e7 = new JLabel("Search for: ");
	static String c1 = employeeName.getText();
	static String c2 = employeeAddress.getText();
	static String c3 = employeePhoneNumber.getText();
	static String c4 = employeeJobType.getText();
	static String c5 = employeeHoursWorked.getText();
	static String c6 = employeePay.getText();
	static Object o1 = null;
	static String a1 = employeeName.getText();
	static JTextArea emp1 = new JTextArea(a1);
	/*
	 This section is where the main method starts.
	 */
	
	public static void main (String args[]) {
		
		inputScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inputScreen.setSize(700,500);
		inputScreen.getContentPane();
		inputScreen.setVisible(true);
		

		EmployeeName();
		EmployeeAddress();
		EmployeePhoneNumber();
		EmployeeJob();
		EmployeeHoursWorked();
		EmployeePay();
		BottomRow();
		Action();
		Action2();
		Action3();
		SearchAction();
		
	
		inputScreen.getContentPane().add(GUI1Panel);
		GUI1Panel.setBorder(border1);
		
		
		
	}
	/*
	 * This section sets up the specification for the first row of the box, the employee's name.
	 */

	public static void EmployeeName() {
		
		JLabel e1 = new JLabel("Employee's Name:");
		e1.setFont(f);
		GUI1Panel.add(e1);
		GUI1Panel.add(employeeName);
		e1.setHorizontalAlignment(JLabel.LEFT);
		GUI1Panel.add(Box.createHorizontalStrut(5));
		
	}
	/*
	 * This section sets up the specification for the second row of the box, the employee's address.
	 */
	public static void EmployeeAddress() {
		
		JLabel e2 = new JLabel("Employee's Address:");
		e2.setFont(f);
		GUI1Panel.add(e2);
		GUI1Panel.add(employeeAddress);
		e2.setHorizontalAlignment(JLabel.LEFT);
		GUI1Panel.add(Box.createHorizontalStrut(5));
			
}
	/*
	 * This section sets up the specification for the third row of the box, the employee's phone number.
	 */
	public static void EmployeePhoneNumber() {
		
		JLabel e3 = new JLabel("Employee's Phone Number:");
		e3.setFont(f);
		GUI1Panel.add(e3);
		GUI1Panel.add(employeePhoneNumber);
		e3.setHorizontalAlignment(JLabel.LEFT);
		GUI1Panel.add(Box.createHorizontalStrut(5));
	}
	/*
	 * This section sets up the specification for the fourth row of the box, the employee's job.
	 */

	public static void EmployeeJob() {
		
		JLabel e4 = new JLabel("Employee's Job:");
		e4.setFont(f);
		GUI1Panel.add(e4);
		GUI1Panel.add(employeeJobType);
		e4.setHorizontalAlignment(JLabel.LEFT);
		GUI1Panel.add(Box.createHorizontalStrut(5));
	}
	/*
	 * This section sets up the specification for the fifth row of the box, the employee's amount of hours.
	 */

	public static void EmployeeHoursWorked() {
		
		JLabel e5 = new JLabel("Employee's Hours Worked:");
		e5.setFont(f);
		GUI1Panel.add(e5);
		GUI1Panel.add(employeeHoursWorked);
		e5.setHorizontalAlignment(JLabel.LEFT);
		GUI1Panel.add(Box.createHorizontalStrut(5));
	}
	/*
	 * This section sets up the specification for the sixth row of the box, the employee's pay.
	 */

public static void EmployeePay() {
		
		JLabel e6 = new JLabel("Employee's Pay:");
		e6.setFont(f);
		GUI1Panel.add(e6);
		GUI1Panel.add(employeePay);
		e6.setHorizontalAlignment(JLabel.LEFT);
		GUI1Panel.add(Box.createHorizontalStrut(5));
	}
/*
 * This section sets up the specification for the seventh row of the box, the buttons that will do various 
 * operations.
 */
public static void BottomRow() {
	
	b1.setFont(new Font("Times New Roman", Font.BOLD, 20));

	b2.setFont(new Font("Times New Roman", Font.BOLD, 20));

	b3.setFont(new Font("Times New Roman", Font.BOLD, 20));
	GUI1Panel.add(b1);
	GUI1Panel.add(b2);
	GUI1Panel.add(b3);

}
/*
 * This section sets up the specification for the search box. When it is called, it will open up a
 * search box that will allow searches to happen within the MySQL database.
 */
public static void SearchBox() {
	JFrame Search = new JFrame("Search");
	Search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Search.setSize(700,500);
	Search.getContentPane();
	Search.setVisible(true);

	e7.setFont(f);

	

	Search.getContentPane().add(GUI2Panel);
	GUI2Panel.add(e7);
	GUI2Panel.add(SearchField);

	GUI2Panel.add(SearchButton2);
}

/*
 * This section sets up the action that, upon clicking the search button of the main box will open up
 * the search box.
 */

public static void Action() {
	
    
    ActionListener actionListener = new ActionListener() {
       public void actionPerformed(ActionEvent event) {
          SearchBox();
          
       }
    };

    b1.addActionListener(actionListener);
    
 }
/*
 * This method will initiate a search to happen within the database.
 */
public static void SearchAction() {
	
    
    ActionListener actionListener = new ActionListener() {
       public void actionPerformed(ActionEvent event) {
    	   try {
			Connection con=DriverManager.getConnection(  
			   		"jdbc:mysql://localhost:3306/Test","root","Tdd&08047728");
			String c = SearchField.getText();
			Statement stmt = con.createStatement();
		      String query[] = {
		         "SELECT * FROM capstonedatabase5.employees", 
		         "select EmployeeName from capstonedatabase5.employees where EmployeeName like'" + c +"_'" 
		         
		      };
		      
		      for(String q : query) {
		          ResultSet r = stmt.executeQuery(q);
		          System.out.println("Names for query "+q+" are");
		          
		          while (r.next()) {
		             String name = r.getString("EmployeeName");
		             System.out.print(name+"  ");
		          }
		          System.out.println();
		       }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
          
       }
    };

    SearchButton2.addActionListener(actionListener);
 }


/*
 * This method goes for the exit button, and will close the main screen when clicked.
 */
public static void Action2() {
	
    
    ActionListener actionListener = new ActionListener() {
       public void actionPerformed(ActionEvent event) {
          inputScreen.dispose();
          
       }
    };

    b2.addActionListener(actionListener);
    
 }



/*
 * This method will send the information to the database through a connection. In this section, the
 * route, username, and password will need to be changed by the user to the specifications of server or
 * local instance used in MySQL. in order for the method to work. They will be organized in the connection 
 * con in that order.
 */
public static void Action3() {
	
    
    ActionListener actionListener = new ActionListener() {
   

	public void actionPerformed(ActionEvent event) {
    
		
		emp1.append(a1);
		String a2 = employeeAddress.getText();
		String a3 = employeePhoneNumber.getText();
		String a4 = employeeJobType.getText();
		String a5 = employeeHoursWorked.getText();
		String a6 = employeePay.getText();
        System.out.print(a1 + "\r\n" + a2 + "\r\n" + a3 + "\r\n" + a4 + "\r\n" +  a5 + "\r\n" + a6 + "\r\n");
        employeeName.setText("");
        employeeAddress.setText("");
        employeePhoneNumber.setText("");
        employeeJobType.setText("");
        employeeHoursWorked.setText("");
        employeePay.setText("");
       
        try {
        Connection con=DriverManager.getConnection(  
        		"jdbc:mysql://localhost:3306/Test","root","Tdd&08047728");  
        		 
        		Statement stmt=con.createStatement();  
        	
        		
        		String Sql = "insert into capstonedatabase5.employees" + "(EmployeeName, EmployeeAddress, EmployeePhoneNumber"
        				+ ", EmployeeJob, EmployeeHoursWorked, EmployeePay"
        				+ ")" + "values ('" + a1 + "', '" + a2 + "', '" + a3+ "', '" + a4 +"', '"+ a5+ "', '" +a6 + "');";
        		stmt.executeUpdate(Sql);
        		System.out.println("Inserted data.");
        		con.close(); 
        		}catch(Exception e){ System.out.println(e);}  
        		
	} 
      
    };

    b3.addActionListener(actionListener);
    
 

Object o1 = employeeName.getText(); employeeAddress.getText(); employeePhoneNumber.getText(); employeeJobType.getText(); employeeHoursWorked.getText(); employeePay.getText();

System.out.print(o1);

}}
/* This will be the code used in a query or script of MySQL, ran, and used to create the table in 
 * the database and the database.
 * 
 * CREATE SCHEMA `capstonedatabase5` ;
 * 
 * CREATE TABLE `capstonedatabase5`.`Employees` (
  `EmployeeName` VARCHAR(45) NOT NULL,
  `EmployeeAddress` VARCHAR(45) NULL,
  `EmployeePhoneNumber` BIGINT NULL,
  `EmployeeJob` VARCHAR(45) NULL,
  'EmployeeHoursWorked' INT NULL,
  'EmployeePay' INT NULL
  PRIMARY KEY (`EmployeeName`));
 */

