package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.Driver;
import Model.VıpPark;

public class DriverLogin {

	JFrame login = new JFrame("Login");
	JPanel driverPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JButton button = new JButton("Login");
	JTextField driverInfo = new JTextField(30);
	
	
	public DriverLogin() {
		//new Driver(fullName,phoneNumber);

		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setSize(600, 600);
		login.setLayout(new GridLayout(0, 1));

		login.add(new JPanel());
		login.add(new JPanel());
	

		driverPanel.add(new JLabel("Full Name and Phone Number(put space in between): "));
		driverPanel.add(driverInfo);
		
	
		buttonPanel.add(button);

		login.add(driverPanel);
		login.add(buttonPanel);
		login.add(new JPanel());
		login.add(new JPanel());
		
		
		button.addActionListener(new loginHandler());

		login.setVisible(true);

	}

	class loginHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			
			
		}

	}

}
