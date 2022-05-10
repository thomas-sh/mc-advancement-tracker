import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class Sprites extends JPanel {

	private static BufferedImage sprites;
	private static BufferedImage advBuff;
	private static JLabel advLab = null;
	private static BufferedImage borderBuff;
	private static JLabel borderLab = null;

	private static Text text = new Text();
	private static Rectangle thirtytwo = new Rectangle(32, 32);

	private static Borders borders = new Borders();

	private static int frame = 1;


	public Sprites() {

		//get the border
		borderBuff = borders.getSquare();
		borderLab = new JLabel(new ImageIcon(borderBuff));
		borderLab = scaledImage(borderLab, 100, 100);


		//get the sprite sheet
		try {
			sprites = ImageIO.read(new File("./frames/sprites.png"));
			advBuff = sprites;
			advBuff = cropImage(28*32, 13*32);
			advLab = new JLabel(new ImageIcon(advBuff));
			advLab = scaledImage(advLab, 64, 64);
		} catch (IOException e) {
			System.out.println("no clue where the sprites are");
		}

		//set panel layout to overlay
		setLayout(new OverlayLayout(this));

		//set label, and THEN the border
		advLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		advLab.setAlignmentY(JLabel.CENTER_ALIGNMENT);
		borderLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		borderLab.setAlignmentY(JLabel.CENTER_ALIGNMENT);

		//add to panel
		add(advLab);
		add(borderLab);

	}

	//resize the image to my liking!
	public static JLabel scaledImage(JLabel start, int w, int h) {

		ImageIcon img = (ImageIcon) start.getIcon();
		Image size = img.getImage();
		Image resized = size.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
		JLabel end = new JLabel(new ImageIcon(resized));

		return end;
	}

	//crop spritesheet to one specific rectangle
	public static BufferedImage cropImage(int x, int y) {
		BufferedImage dest = sprites.getSubimage(x, y, 32, 32);
		return dest;
	}

	public static void changeAdv(int position) {
		BufferedImage x = cropImage(text.getCoordX(position), text.getCoordY(position));
		JLabel tempIcon = new JLabel(new ImageIcon(x));
		JLabel squ, ova, fan;
		tempIcon = scaledImage(tempIcon, 64, 64);
		advLab.setIcon(tempIcon.getIcon());

		if ((text.getBorders(position) == 1)) {
			if (Advancements.getStateState(position) == true) {
				squ = new JLabel(new ImageIcon(borders.getWornSquare()));
			}
			else {
				squ = new JLabel(new ImageIcon(borders.getSquare()));
			}
			squ = scaledImage(squ, 100, 100);
			borderLab.setIcon(squ.getIcon());
			frame = 1;
		}

		if ((text.getBorders(position) == 2)) {
			if (Advancements.getStateState(position) == true) {
				ova = new JLabel(new ImageIcon(borders.getWornOval()));
			}
			else {
				ova = new JLabel(new ImageIcon(borders.getOval()));
			}
			ova = scaledImage(ova, 100, 100);
			borderLab.setIcon(ova.getIcon());
			frame = 2;
		}

		if ((text.getBorders(position) == 3)) {
			if (Advancements.getStateState(position) == true) {
				fan = new JLabel(new ImageIcon(borders.getWornFancy()));
			}
			else {
				fan = new JLabel(new ImageIcon(borders.getFancy()));
			}
			fan = scaledImage(fan, 100, 100);
			borderLab.setIcon(fan.getIcon());
			frame = 3;
		}

	}

}
