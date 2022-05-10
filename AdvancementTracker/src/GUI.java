import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUI {
	
	//declarations
	private static int position = 0;
	private static JLabel advName = null;
	private static JLabel spec = null;
	private static Text text = new Text();
	
	static JList list;
	static JPanel subsBox;
	static String category = "";
	static AdvList scrollAdv;
	
	
	public GUI() {
		
		//frame and panels
		JFrame f = new JFrame("Advancement Tracker");
		JPanel main = new JPanel();
		AdvInfo info = new AdvInfo();
		subsBox = new JPanel();
		
		//lists and scrolls
		DefaultListModel allSubs = new DefaultListModel();
		list = new JList(text.getAllNames());
		JList subs = new JList(allSubs);
		SubAdvList scrollSubs = new SubAdvList(subs);
		scrollAdv = new AdvList(list);
		
		//components
		Sprites icon = new Sprites();
		
		//ugly stuff
		RelativeLayout relative = new RelativeLayout(RelativeLayout.Y_AXIS);
		Dimension minimum = new Dimension(325, 650);
		
		//subsBox
		subsBox.setBorder(BorderFactory.createTitledBorder (BorderFactory.createEmptyBorder(), "Additional Info", TitledBorder.CENTER, TitledBorder.TOP));
		subsBox.add(scrollSubs);
		subsBox.setVisible(false);
		subsBox.repaint();
		
		//menu
		MenuBar menubar = new MenuBar();
		
		
		//settings for relative
		relative.setFill(true);
		
		//settings for main
		main.setLayout(relative);
		
		//add to main
		main.add(Box.createVerticalBox(), new Float(1));
		main.add(icon, new Float(3));
		main.add(info, new Float(2));
		main.add(subsBox);
		//main.add(Box.createVerticalBox(), new Float(1));
		main.add(scrollAdv, new Float(5));
		
		//fun with frames
		f.setJMenuBar(menubar);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(main);
		f.setMinimumSize(minimum);
		f.setSize(minimum);
		f.setVisible(true);
		
		
		
		
		
		//listeners!!!
		list.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                	position = list.getSelectedIndex();
                	
                	info.setName(text.getName(position));
                	info.setFlavor(text.getFlavor(position));
                	
                	icon.changeAdv(position);
                	
                	if (position == 32 || position == 58 || position == 64 || position == 75 || position == 76 || position == 78) {
                		subsBox.setVisible(true);
                	}
                	else {
                		subsBox.setVisible(false);
                	}
                	
                	if (position == 32) {
                		allSubs.clear();
                		for (String x : text.getNethBiomesNames()) {
                			allSubs.addElement(x);
                			category = "nether";
                		}
                	}
                	
                	if (position == 58) {
                		allSubs.clear();
                		for (String x : text.getAllMonsNames()) {
                			allSubs.addElement(x);
                			category = "monsters";
                		}
                	}
                	
                	if (position == 64) {
                		allSubs.clear();
                		for (String x : text.getBiomesNames()) {
                			allSubs.addElement(x);
                			category = "biomes";
                		}
                	}
                	
                	if (position == 75) {
                		allSubs.clear();
                		for (String x : text.getBreedAllNames()) {
                			allSubs.addElement(x);
                			category = "animals";
                		}
                	}
                	
                	if (position == 76) {
                		allSubs.clear();
                		for (String x : text.getAllCatsNames()) {
                			allSubs.addElement(x);
                			category = "cats";
                		}
                	}
                	
                	if (position == 78) {
                		allSubs.clear();
                		for (String x : text.getFoodNames()) {
                			allSubs.addElement(x);
                			category = "foods";
                		}
                	}
                }
            }
        });
		

		
		
		
	}
	
	
}
