import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Borders {
	
	private JLabel squareBorder = null;
	private JLabel ovalBorder = null;
	private JLabel fancyBorder = null;
	private JLabel wornSquareBorder = null;
	private JLabel wornOvalBorder = null;
	private JLabel wornFancyBorder = null;
	
	private BufferedImage squareImage;
	private BufferedImage ovalImage;
	private BufferedImage fancyImage;
	private BufferedImage wornSquareImage;
	private BufferedImage wornOvalImage;
	private BufferedImage wornFancyImage;
	
	public Borders() {
		try {
			squareImage = ImageIO.read(new File("./frames/Advancement-plain-raw.png"));
			squareBorder = new JLabel(new ImageIcon(squareImage));
		}
		catch (IOException e) {
			System.out.println("no clue where square is");
		}
		
		try {
			ovalImage = ImageIO.read(new File("./frames/Advancement-oval-raw.png"));
			ovalBorder = new JLabel(new ImageIcon(ovalImage));
		}
		catch (IOException e) {
			System.out.println("no clue where oval is");
		}
		
		try {
			fancyImage = ImageIO.read(new File("./frames/Advancement-fancy-raw.png"));
			fancyBorder = new JLabel(new ImageIcon(fancyImage));
		}
		catch (IOException e) {
			System.out.println("no clue where fancy is");
		}
		
		
		
		//worn borders
		try {
			wornSquareImage = ImageIO.read(new File("./frames/Advancement-plain-worn.png"));
			wornSquareBorder = new JLabel(new ImageIcon(wornSquareImage));
		}
		catch (IOException e) {
			System.out.println("no clue where worn square is");
		}
		
		try {
			wornOvalImage = ImageIO.read(new File("./frames/Advancement-oval-worn.png"));
			wornOvalBorder = new JLabel(new ImageIcon(wornOvalImage));
		}
		catch (IOException e) {
			System.out.println("no clue where worn oval is");
		}
		
		try {
			wornFancyImage = ImageIO.read(new File("./frames/Advancement-fancy-worn.png"));
			wornFancyBorder = new JLabel(new ImageIcon(wornFancyImage));
		}
		catch (IOException e) {
			System.out.println("no clue where worn fancy is");
		}
	}
	
	//raw methods
	public BufferedImage getSquare() {
		return squareImage;
	}
	
	public BufferedImage getOval() {
		return ovalImage;
	}
	
	public BufferedImage getFancy() {
		return fancyImage;
	}
	
	
	//worn methods
	public BufferedImage getWornSquare() {
		return wornSquareImage;
	}
	
	public BufferedImage getWornOval() {
		return wornOvalImage;
	}
	
	public BufferedImage getWornFancy() {
		return wornFancyImage;
	}
	

}
