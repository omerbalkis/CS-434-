package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import Model.Driver;
import Model.Vehicle;
import Model.VıpPark;

public class ParkView extends JFrame {
	private JTabbedPane tabbedPane = new JTabbedPane();
	private JPanel[] tabs;
	private ArrayList<VıpPark> parks = new ArrayList<VıpPark>();

	JPanel outerPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JPanel centerPanel = new JPanel();

	public ParkView() {
		this.parks = GUImain.parks;
		tabs = new JPanel[parks.size()];
		init();
	}

	private void init() {
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);

		for (int i = 0; i < tabs.length; i++) {
			JPanel outerPanel = new JPanel();
			outerPanel.setLayout(new BorderLayout());
			this.outerPanel = outerPanel;

			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new GridLayout(1, 3));
			this.buttonPanel = buttonPanel;

			JPanel centerPanel = new JPanel();
			centerPanel.setLayout(new GridLayout(5, parks.get(i).getCapacity()));
			this.centerPanel = centerPanel;

			JButton parkCar = new JButton("Park Car");
			parkCar.addActionListener(new parkCarListener());

			JButton parkMotor = new JButton("Park Motorcycle");
			// handler

			JButton parkVehicle = new JButton("Park Vehicle");
			// handler

			buttonPanel.add(parkCar, BorderLayout.NORTH);
			buttonPanel.add(parkMotor, BorderLayout.NORTH);
			buttonPanel.add(parkVehicle, BorderLayout.NORTH);

			// creates JButtons depending on the current park's occupancy
			for (int j = 0; j < parks.get(i).getOccupancy(); j++) {
				if (parks.get(i).isFull()) {
					centerPanel.add(new JButton("Full"));
				} else {
					centerPanel.add(new JButton(parks.get(i).getVehicles().get(j).getPlate()));
				}
			}

			// creates JButtons for empty parking spots
			for (int k = 0; k < parks.get(i).getCapacity() - parks.get(i).getOccupancy(); k++) {
				centerPanel.add(new JLabel("Empty"));
			}

			outerPanel.add(buttonPanel, BorderLayout.NORTH);
			outerPanel.add(centerPanel, BorderLayout.CENTER);
			tabs[i] = outerPanel;
		}

		for (int i = 0; i < parks.size(); i++) {
			tabbedPane.addTab(parks.get(i).getAddress().name(), tabs[i]);
			tabbedPane.setVisible(true);
		}

		this.add(tabbedPane);
		this.setVisible(true);
	}

	public void updateParkView() {
		int index = tabbedPane.getSelectedIndex();

		for (int j = 0; j < parks.get(index).getOccupancy(); j++) {
			centerPanel.add(new JButton(parks.get(index).getVehicles().get(j).getPlate()));
			centerPanel.revalidate();
		}

		for (int k = 0; k < parks.get(index).getCapacity() - parks.get(index).getOccupancy(); k++) {
			centerPanel.add(new JLabel("Empty"));
			centerPanel.revalidate();
		}

	}

	public class parkCarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int index = tabbedPane.getSelectedIndex();

			for (int i = 0; i < DriverLogin.vehicles.size(); i++) {
				parks.get(index).addVehicle(DriverLogin.vehicles.get(i));
			}

			String message = "This park is full";
			if (parks.get(index).isFull()) {
				JOptionPane.showMessageDialog(null, message);
			} else {
				System.out.println("ELSE GİRDİ");
				outerPanel.remove(centerPanel);
				System.out.println("REMOVE ETTİ");
				outerPanel.revalidate();
//				for (int i = 0; i < parks.get(index).getCapacity(); i++) {
//					centerPanel.removeAll();
//					centerPanel.revalidate();
//					updateParkView();
//				}

				tabs[index] = outerPanel;
				tabs[index].revalidate();
				tabs[index].repaint();

			}

		}

	}

}
