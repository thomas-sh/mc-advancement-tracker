import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Advancements {

	public static ArrayList<State> got = new ArrayList<State>();

	private static String ids[]= {"story/root", "story/mine_stone", "story/upgrade_tools", "story/smelt_iron", "story/obtain_armor", "story/lava_bucket",
			"story/iron_tools", "story/deflect_arrow", "story/form_obsidian", "story/mine_diamond", "story/enter_the_nether", "story/shiny_gear", 
			"story/enchant_item", "story/cure_zombie_villager", "story/follow_ender_eye", "story/enter_the_end", "nether/root", "nether/return_to_sender", 
			"nether/find_bastion", "nether/obtain_ancient_debris", "nether/fast_travel", "nether/find_fortress", "nether/obtain_crying_obsidian", 
			"nether/distract_piglin", "nether/ride_strider", "nether/uneasy_alliance", "nether/loot_bastion", "nether/use_lodestone", 
			"nether/netherite_armor", "nether/get_wither_skull", "nether/obtain_blaze_rod", "nether/charge_respawn_anchor", "nether/explore_nether", 
			"nether/summon_wither", "nether/brew_potion", "nether/create_beacon", "nether/all_potions", "nether/create_full_beacon", "nether/all_effects", 
			"end/root", "end/kill_dragon", "end/dragon_egg", "end/enter_end_gateway", "end/respawn_dragon", "end/dragon_breath", "end/find_end_city", 
			"end/elytra", "end/levitate", "adventure/root", "adventure/voluntary_exile", "adventure/kill_a_mob", "adventure/trade", 
			"adventure/honey_block_slide", "adventure/ol_betsy", "adventure/sleep_in_bed", "adventure/hero_of_the_village", 
			"adventure/throw_trident", "adventure/shoot_arrow", "adventure/kill_all_mobs", "adventure/totem_of_undying", 
			"adventure/summon_iron_golem", "adventure/two_birds_one_arrow", "adventure/whos_the_pillager_now", "adventure/arbalistic", 
			"adventure/adventuring_time", "adventure/very_very_frightening", "adventure/sniper_duel", "adventure/bullseye", "husbandry/root", 
			"husbandry/safely_harvest_honey", "husbandry/breed_an_animal", "husbandry/tame_an_animal", "husbandry/fishy_business", 
			"husbandry/silk_touch_nest", "husbandry/plant_seed", "husbandry/bred_all_animals", "husbandry/complete_catalogue", 
			"husbandry/tactical_fishing", "husbandry/balanced_diet", "husbandry/obtain_netherite_hoe"};

	private int count = 0;

	private static Text text = new Text();

	private static String path;

	public Advancements(){

		//startup
		System.out.println("Advancements will be written out here for debugging purposes.\n"
				+ "This window can be minimized, but closing it will also close the entire program.\n"
				+ "Navigate to your advancements json file. On Windows its under APPDATA, on mac its under Application Support.\n"
				+ "I put a more advanced guide in the README.txt\n");


		File file = new File("./frames/loc.txt");
		Scanner scnr = null;
		try {
			scnr = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		if (scnr.hasNextLine() == true) {
			path = scnr.nextLine();
		}
		else {

			path = setPath();

			if (path.equals("")) {
				JOptionPane.showMessageDialog(null, "You did not pick a file, or the file you picked was corrupted");
			}
		}

	}

	public String setPath() {

		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Open the advancements json file");

		int r = fc.showSaveDialog(null);

		if (r == JFileChooser.APPROVE_OPTION) {

			FileWriter write = null;

			try {
				write = new FileWriter("./frames/loc.txt", false);  //overwrite file
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			PrintWriter printer = new PrintWriter(write);
			printer.print(fc.getSelectedFile().getAbsolutePath());
			printer.close();

			return fc.getSelectedFile().getAbsolutePath();
		}

		else {
			return "";
		}


	}

	public int loop() {

		String loc = path;
		File file = new File(loc);
		Scanner scnr;

		try {
			scnr = new Scanner(file);
			return count = Parsley(scnr);
		}
		catch (Exception e) {
			System.out.println("Invalid File");
			return -1;
		}


	}


	public static int Parsley(Scanner scnr) {


		String inp = "";  //each line of the file
		State state = new State();
		int check = 0;
		String title;


		if (inp.equals("{")) {  //skip over first "{"
			inp = scnr.nextLine();  //goto next line
		}

		while (scnr.hasNextLine()) {



			if (inp.contains("minecraft:") == true && inp.contains("recipes") == false) {

				inp = trimmer(inp);
				title = inp;
				check = checkAdv(title);

				if (check == 0) {  //if the state is true, or is not an advancement

					while (inp.contains("done") == false) {
						try {
							inp = scnr.nextLine();
						}
						catch (Exception e) {
							System.out.println("@@@@@@@@@@@@FAILED AT:    " + inp);
						}
					}

					inp = scnr.nextLine();
					inp = scnr.nextLine();

					continue;
				}

				if (check == 1) {  //if the state is false

					for (State z : got) {
						if (z.getName().equals(title) == false) {
							state.setName(title);
						}
					}


					while (inp.contains("minecraft") == false && inp.contains("textures") == false && foodCheck(inp) == false) {
						inp = scnr.nextLine();
					}

					while(inp.contains("minecraft") || inp.contains("textures") || foodCheck(inp) == true) {
						checkSub(inp, title);
						inp = scnr.nextLine();
					}
				}



				if (check == 2) {  // if it needs to be added to got arraylist
					state.setName(title);

					scnr.nextLine();
					inp = scnr.nextLine();

					if (inp.contains("minecraft") == false && inp.contains("textures") == false && foodCheck(inp) == false) {
						state.setState(true);
					}

					got.add(state);

					if (state.getState() == false) {

						while (inp.contains("minecraft") == false && inp.contains("textures") == false && foodCheck(inp) == false) {
							inp = scnr.nextLine();
						}

						while(inp.contains("minecraft") || inp.contains("textures") || foodCheck(inp) == true) {
							checkSub(inp, title);
							inp = scnr.nextLine();
						}
					}


				}



				while (inp.contains("done") == false) {
					inp = scnr.nextLine();
				}

				if (inp.contains("true")) {

					for (State c : got) {
						if (c.getName().equals(title)) {
							c.setState(true);
							System.out.println(state.getName());


							for (int i = 0; i < Text.ids.length; i++) {
								if (state.getName().equals(Text.ids[i])) {
									if (GUI.list.getSelectedIndex() == i) {
										Sprites.changeAdv(i);
									}
								}
							}

							GUI.scrollAdv.repaint();
						}

					}

				}

			}
			state = new State();
			inp = scnr.nextLine();


		}
		scnr.close();
		return (got.size());
	}


	public static int checkAdv(String line) {  //check if the line is an advancement

		for (State x : got) {
			if (x.getName().contains(line)) {
				if (x.getState() == false) {
					return 1;
				}
				else {
					return 0;
				}
			}
		}

		for (String y : ids) {
			if (y.equals(line)) {

				return 2;
			}

		}

		return 0;
	}

	public static void checkSub(String line, String title) {

		String idPart;

		idPart = trimmer(line);

		for (State a : got) {
			if (a.getName().equals(title)) {
				if (a.getSub().size() == 0) {
					a.addSub(idPart);
					GUI.subsBox.repaint();
					System.out.println("--- Added " + idPart + " to " + title);
				}
				else if (a.getSub().contains(idPart) == false){

					a.addSub(idPart);
					GUI.subsBox.repaint();
					System.out.println("--- Added " + idPart + " to " + title);
					continue;


				}
			}
		}
	}

	public static boolean foodCheck(String inp) {

		Text t = new Text();

		String[] x = t.getFoods();

		for (String y : x) {
			if (inp.contains(y) == true && inp.contains("recipes") == false && inp.contains("minecraft") == false) {
				return true;
			}
		}

		return false;
	}

	public static String trimmer(String trim) {

		int x, y;

		if (foodCheck(trim) == true) {
			x = trim.indexOf("\"");
			y = trim.indexOf("\"", x + 1);
			trim = trim.substring(x + 1, y);
			return trim;
		}

		if (trim.contains("textures")) {
			x = trim.indexOf("cat/");
			y = trim.indexOf(".");
			trim = trim.substring(x + 4, y);
			return trim;
		}

		x = trim.indexOf(":") + 1;
		y = trim.indexOf("\"", x + 1);
		trim = trim.substring(x, y);

		return trim;
	}

	public static boolean getStateState(int pos) {

		String id = "";

		id = Text.ids[pos];

		for (State x : got) {
			if (id.equals(x.getName())) {
				if (x.getState() == true) {
					return true;
				}
			}
		}


		return false;
	}

	public static boolean getSubState(String subName) {

		int count = 0;

		if (GUI.category.equals("foods")) {
			for (String x : Text.foodNames) {
				if (subName.equals(x)) {
					for (State y : got) {
						if (y.getName().equals("husbandry/balanced_diet")) {
							for (String z : y.getSub()) {
								if (z.equals(Text.foods[count])) {
									return true;
								}
							}
						}
					}
				}
				count++;
			}
		}

		else if (GUI.category.equals("cats")) {
			for (String x : Text.allCatsNames) {
				if (subName.equals(x)) {
					for (State y : got) {
						if (y.getName().equals("husbandry/complete_catalogue")) {
							for (String z : y.getSub()) {
								if (z.equals(Text.allCats[count])) {
									return true;
								}
							}
						}
					}
				}
				count++;
			}
		}

		else if (GUI.category.equals("animals")) {
			for (String x : Text.breedAllNames) {
				if (subName.equals(x)) {
					for (State y : got) {
						if (y.getName().equals("husbandry/bred_all_animals")) {
							for (String z : y.getSub()) {
								if (z.equals(Text.breedAll[count])) {
									return true;
								}
							}
						}
					}
				}
				count++;
			}
		}

		else if (GUI.category.equals("biomes")) {
			for (String x : Text.biomesNames) {
				if (subName.equals(x)) {
					for (State y : got) {
						if (y.getName().equals("adventure/adventuring_time")) {
							for (String z : y.getSub()) {
								if (z.equals(Text.biomes[count])) {
									return true;
								}
							}
						}
					}
				}
				count++;
			}
		}

		else if (GUI.category.equals("monsters")) {
			for (String x : Text.allMonsNames) {
				if (subName.equals(x)) {
					for (State y : got) {
						if (y.getName().equals("adventure/kill_all_mobs")) {
							for (String z : y.getSub()) {
								if (z.equals(Text.allMons[count])) {
									return true;
								}
							}
						}
					}
				}
				count++;
			}
		}

		else if (GUI.category.equals("nether")) {
			for (String x : Text.nethBiomesNames) {
				if (subName.equals(x)) {
					for (State y : got) {
						if (y.getName().equals("nether/explore_nether")) {
							for (String z : y.getSub()) {
								if (z.equals((Text.nethBiomes[count]))) {
									return true;
								}
							}
						}
					}
				}
				count++;
			}
		}




		return false;

	}



	static public void clearGot() {
		got.clear();
	}



}


