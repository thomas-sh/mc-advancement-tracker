import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar implements ActionListener {
	
	JMenuItem changeLoc = new JMenuItem("Change File");
	
	public MenuBar() {
		
		add(changeLoc);
		
		changeLoc.addActionListener(this);
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			AdvThread.pause = true;
			

			
			AdvThread.adv.clearGot();
			AdvThread.adv.setPath();
			
			GUI.scrollAdv.repaint();
			GUI.scrollAdv.repaint();
			
			AdvThread.pause = false;
			
		}
		
		catch (Exception f) {
			System.out.println("Failed to change file");
		}
		
	}
	
	
	

}
