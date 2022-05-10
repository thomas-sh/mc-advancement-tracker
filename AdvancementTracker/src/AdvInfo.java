import java.awt.Component;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class AdvInfo extends JPanel {
	
	private static JLabel name;
	private static JLabel flavor;
	
	public AdvInfo() {
		
		
		//components
		name = new JLabel("Press Any Advancement", SwingConstants.CENTER);
		flavor = new JLabel("", SwingConstants.CENTER);
		
		//component settings
		name.setAlignmentX(Component.CENTER_ALIGNMENT);
		flavor.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//fonts
		Font titleFont = new Font("Lucida Grande", Font.PLAIN, 25);
		Font flavorFont = new Font("Lucida Granda", Font.ITALIC, 14);
		
		//label settings
		name.setFont(titleFont);
		flavor.setFont(flavorFont);
		
		//set box layout
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//add
		add(name);
		add(flavor);
		
		
	}
	
	public void setName(String name) {
		
		this.name.setText("<html><body style=\"text-align: center;  \">" + name + "</body></html>");
	}
	
	public void setFlavor(String flavor) {
		this.flavor.setText("<html><body style=\"text-align: center;  \">" + flavor + "</body></html>");
	}
	
	
	
}
