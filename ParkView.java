package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Model.VıpPark;

public class ParkView extends JFrame{
	private VıpPark park;
	private JTabbedPane tabbedPane = new JTabbedPane();
	private JPanel[] tabs;
	
	public ParkView(VıpPark park) {
		this.park = park;
		
		
	}

}
