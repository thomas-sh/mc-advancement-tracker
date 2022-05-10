/* I am Tom
 * also known as lowercase_a
 * 
 * I wrote this program
 * 
 * It's mine, so don't take credit for it
 * 
 * I did NOT write the RelativeLayout class
 * that was written by an absolute genius
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	private static int count = 0;
	static boolean restart = false;

	public static void main(String[] args) throws FileNotFoundException {

		GUI gui = new GUI();
		
		Thread adv = new AdvThread();
		adv.setName("advancements thread");
		adv.start();
	}

}