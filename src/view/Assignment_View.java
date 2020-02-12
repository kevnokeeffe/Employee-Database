package view;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Assignment_View extends JFrame{
	
	// Create the view elements and define them
	JLabel labelHeader = new JLabel("Database");
	JLabel labelPPSn = new JLabel("PPSn: ");
	JLabel labelDOB = new JLabel("DOB: ");
	JLabel labelName = new JLabel("Name: ");
	JLabel labelAddress = new JLabel("Address: ");
	JLabel labe1Salary = new JLabel("Salary: ");
	JLabel labe1Gender = new JLabel("Gender: ");
	JTextField textPPSn=new JTextField(20);
	JTextField textDOB=new JTextField(20);
	JTextField textName=new JTextField(20);
	JTextField textAddress=new JTextField(20);
	JTextField textSalary=new JTextField(20);
	JTextField textGender=new JTextField(20);
	JButton previous = new JButton("Previous");
	JButton next = new JButton("Next");
	JButton clear = new JButton("clear");
	JButton add = new JButton("Add");
	JButton delete = new JButton("Delete");
	JButton update = new JButton("Update");	
	
	public Assignment_View(){
		//create interface
		JPanel assignmentPanel = new JPanel();
		
		//close application on x click
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set application size
		this.setSize(600, 600);
		
		//displayed components
		assignmentPanel.add(labelHeader);
		assignmentPanel.add(labelPPSn);
		assignmentPanel.add(textPPSn);
		assignmentPanel.add(labelDOB);
		assignmentPanel.add(textDOB);
		assignmentPanel.add(labelName);
		assignmentPanel.add(textName);
		assignmentPanel.add(labelAddress);
		assignmentPanel.add(textAddress);
		assignmentPanel.add(labe1Salary);
		assignmentPanel.add(textSalary);
		assignmentPanel.add(labe1Gender);
		assignmentPanel.add(textGender);
		
		//adds assignmentPpanel to JFrame
		this.add(assignmentPanel);
		this.setVisible(true);  
	}
		
		//error message when invalid inputs
		public void displayErrorMessage(String errorMessage) {
			JOptionPane.showMessageDialog(this, errorMessage);
		}
}
