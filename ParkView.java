package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

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
		
			JPanel centerPanel = new JPanel();
			centerPanel.setLayout(new GridLayout(5, parks.get(i).getCapacity()));

		
			for (int j = 0; j < parks.get(i).getOccupancy(); j++) {
				if (parks.get(i).isFull()) {
					JLabel full = new JLabel("Full");
					full.setBackground(Color.RED);
					centerPanel.add(full);
				} else {
					centerPanel.add(new JLabel(parks.get(i).getVehicles().get(j).getPlate()));
				}
			}

			
			for (int k = 0; k < parks.get(i).getCapacity() - parks.get(i).getOccupancy(); k++) {
				JLabel empty = new JLabel("Empty");
				empty.setBackground(Color.GREEN);
				centerPanel.add(empty);
			}

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

}
