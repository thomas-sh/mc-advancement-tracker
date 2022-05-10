
public class AdvThread extends Thread{

	static Advancements adv = new Advancements();
	static boolean pause = false;

	public void run() {

		while (true) {
			if (pause == false) {
				adv.loop();
			}
		}
	}


}
