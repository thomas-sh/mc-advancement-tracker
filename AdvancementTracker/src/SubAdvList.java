import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.SwingWorker;


public class SubAdvList extends JScrollPane{

	//color of completed, and color of default click
	Color lightGreen = new Color(153, 255, 153);
	Color normal = new Color(4, 51, 151);


	//list of advancements
	@SuppressWarnings("unchecked")
	public SubAdvList(JList l) {

		//get a list of every advancement
		l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//add list to scrollpane
		setViewportView(l);
		
		l.setCellRenderer(new DefaultListCellRenderer() {

			@Override
			public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
				Component x = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
				
				if (value instanceof String) {

					String sub = (String) value;

					if (Advancements.getSubState(sub) == true) {
						setBackground(lightGreen);
						setForeground(Color.BLACK);
					}
					
					if (Advancements.getSubState(sub) == false) {
						setBackground(Color.WHITE);
						setForeground(Color.BLACK);
					}

					if (isSelected) {
						setBackground(normal);
						setForeground(Color.WHITE);
					}
					
					
				}
				
				

				return x;
			}

		});

	}

}
