import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class AdvList extends JScrollPane{

	//color of completed, and color of default click
	Color lightGreen = new Color(153, 255, 153);
	Color normal = new Color(4, 51, 151);


	//list of advancements
	@SuppressWarnings("unchecked")
	public AdvList(JList l) {

		//get a list of every advancement
		l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//add list to scrollpane
		setViewportView(l);

		l.setCellRenderer(new DefaultListCellRenderer() {

			@Override
			public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
				Component x = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

				if (value instanceof String) {

					int pos = index;

					if (Advancements.getStateState(pos) == true) {
						setBackground(lightGreen);
						setForeground(Color.BLACK);
					}
					
					if (Advancements.getStateState(pos) == false) {
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
