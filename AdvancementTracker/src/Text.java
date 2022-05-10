import java.util.ArrayList;

public class Text {
	
	static String[] foods = {"apple", "baked_potato", "beetroot", "beetroot_soup", "bread", "carrot", "chorus_fruit", "cooked_chicken", "cooked_cod", "cooked_mutton", "cooked_porkchop", "cooked_rabbit", "cooked_salmon", "cookie", "dried_kelp", "enchanted_golden_apple", "golden_apple", "golden_carrot", "honey_bottle", "melon_slice", "mushroom_stew", "poisonous_potato", "potato", "pufferfish", "pumpkin_pie", "rabbit_stew", "beef", "chicken", "cod", "mutton", "porkchop", "rabbit", "salmon", "rotten_flesh", "spider_eye", "cooked_beef", "suspicious_stew", "sweet_berries", "tropical_fish"};
	static String[] foodNames = {"Apple", "Baked Potato", "Beetroot", "Beetroot Soup", "Bread", "Carrot", "Chorus Fruit", "Cooked Chicken", "Cooked Cod", "Cooked Mutton", "Cooked Porkchop", "Cooked Rabbit", "Cooked Salmon", "Cookie", "Dried Kelp", "Enchanted Golden Apple", "Golden Apple", "Golden Carrot", "Honey Bottle", "Melon Slice", "Mushroom Stew", "Poisonous Potato", "Potato", "Pufferfish", "Pumpkin Pie", "Rabbit Stew", "Raw Beef", "Raw Chicken", "Raw Cod", "Raw Mutton", "Raw Porkchop", "Raw Rabbit", "Raw Salmon", "Rotten Flesh", "Spider Eye", "Steak", "Suspicious Stew", "Sweet Berries", "Tropical Fish"};
	
	static String[] biomes = {"badlands", "badlands_plateau", "bamboo_jungle", "bamboo_jungle_hills", "beach", "birch_forest", "birch_forest_hills", "cold_ocean", "dark_forest", "deep_cold_ocean", "deep_frozen_ocean", "deep_lukewarm_ocean", "desert", "desert_hills", "forest", "frozen_river", "giant_tree_taiga", "giant_tree_taiga_hills", "jungle", "jungle_edge", "jungle_hills", "lukewarm_ocean", "mountains", "mushroom_field_shore", "mushroom_fields", "plains", "river", "savanna", "savanna_plateau", "snowy_beach", "snowy_mountains", "snowy_taiga", "snowy_taiga_hills", "snowy_tundra", "stone_shore", "swamp", "taiga", "taiga_hills", "warm_ocean", "wooded_badlands_plateau", "wooded_hills", "wooded_mountains"};
	static String[] biomesNames = {"Badlands", "Badlands Plateau", "Bamboo Jungle", "Bamboo Jungle Hills", "Beach", "Birch Forest", "Birch Forest Hills", "Cold Ocean", "Dark Forest", "Deep Cold Ocean", "Deep Frozen Ocean", "Deep Lukewarm Ocean", "Desert", "Desert Hills", "Forest", "Frozen River", "Giant Tree Taiga", "Giant Tree Taiga Hills", "Jungle", "Jungle Edge", "Jungle Hills", "Lukewarm Ocean", "Mountains", "Mushroom Field Shore", "Mushroom Fields", "Plains", "River", "Savanna", "Savanna Plateau", "Snowy Beach", "Snowy Mountains", "Snowy Taiga", "Snowy Taiga Hills", "Snowy Tundra", "Stone Shore", "Swamp", "Taiga", "Taiga Hills", "Warm Ocean", "Wooded Badlands Plateau", "Wooded Hills", "Wooded Mountains"};
	
	static String[] nethBiomes = {"basalt_deltas", "crimson_forest", "nether_wastes", "soul_sand_valley", "warped_forest"};
	static String[] nethBiomesNames = {"Basalt Deltas", "Crimson Forest", "Nether Wastes", "Soul Sand Valley", "Warped Forest"};
	
	static String[] allMons = {"blaze", "cave_spider", "creeper", "drowned", "elder_guardian", "ender_dragon", "enderman", "endermite", "evoker", "ghast", "guardian", "hoglin", "husk", "magma_cube", "phantom", "piglin", "piglin_brute", "pillager", "ravager", "shulker", "silverfish", "skeleton", "slime", "spider", "stray", "vex", "vindicator", "witch", "wither", "wither_skeleton", "zoglin", "zombie", "zombie_villager", "zombified_piglin"};
	static String[] allMonsNames = {"Blaze", "Cave Spider", "Creeper", "Drowned", "Elder Guardian", "Ender Dragon", "Enderman", "Endermite", "Evoker", "Ghast", "Guardian", "Hoglin", "Husk", "Magma Cube", "Phantom", "Piglin", "Piglin Brute", "Pillager", "Ravager", "Shulker", "Silverfish", "Skeleton", "Slime", "Spider", "Stray", "Vex", "Vindicator", "Witch", "Wither", "Wither Skeleton", "Zoglin", "Zombie", "Zombie Villager", "Zombified Piglin"};
	
	static String[] breedAll = {"bee", "cat", "chicken", "cow", "donkey", "fox", "hoglin", "horse", "llama", "mooshroom", "mule", "ocelot", "panda", "pig", "rabbit", "sheep", "strider", "turtle", "wolf"};
	static String[] breedAllNames = {"Bee", "Cat", "Chicken", "Cow", "Donkey", "Fox", "Hoglin", "Horse", "Llama", "Mooshroom", "Mule", "Ocelot", "Panda", "Pig", "Rabbit", "Sheep", "Strider", "Turtle", "Wolf"};
	
	static String[] allCats = {"all_black", "british_shorthair", "calico", "jellie", "persian", "ragdoll", "red", "siamese", "tabby", "black", "white"};
	static String[] allCatsNames = {"Black", "British Shorthair", "Calico", "Jellie", "Persian", "Ragdoll", "Red", "Siamese", "Tabby", "Tuxedo", "White"};
	
	private int[] xs = {640, 160, 32, 896, 480, 320, 736, 960, 288, 608, 480, 128, 352, 160, 384, 704, 704, 416, 576, 160, 320, 768, 128, 800, 992, 96, 704, 928, 448, 224, 448, 448, 416, 64, 832, 352, 352, 352, 288, 704, 128, 576, 672, 608, 32, 416, 224, 256, 320, 96, 640, 640, 320, 416, 480, 96, 608, 992, 576, 768, 576, 416, 416, 416, 96, 608, 576, 96, 992, 896, 608, 800, 448, 992, 608, 160, 896, 704, 768, 288};
	private int[] ys = {960, 3584, 3584, 3488, 2496, 3136, 3552, 2496, 3360, 3488, 3552, 2496, 3552, 3200, 3552, 3168, 1344, 3552, 256, 128, 3552, 3360, 192, 3488, 192, 3136, 1216, 192, 128, 960, 640, 192, 128, 352, 1376, 3584, 3136, 3584, 3136, 3168, 960, 3168, 3488, 3168, 3136, 896, 2496, 3520, 3552, 2464, 3616, 3488, 96, 2368, 3168, 2464, 1696, 1248, 3616, 3616, 3392, 2368, 2368, 2368, 2496, 1696, 1248, 192, 3232, 32, 3200, 3552, 3552, 32, 3200, 3136, 1664, 1664, 3168, 128};
	
	private int[] borders = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, /*done with minecraft*/ 1, 3, 1, 1, 3, 1, 1, 1, 1, 3, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 3, 2, 3, /*done with nether*/ 1, 1, 2, 1, 2, 2, 1, 2, 3, /*done with end*/ 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 3, 2, 2, 3, 1, 3, 3, 1, 3, 3, /*done with adventure*/ 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 3, 3 /*done with husbandry*/};
	
	static String ids[]= {"story/root", "story/mine_stone", "story/upgrade_tools", "story/smelt_iron", "story/obtain_armor", "story/lava_bucket",
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
	
	private String names[] = {"Minecraft", "Stone Age", "Getting an Upgrade", "Acquire Hardware", "Suit Up", "Hot Stuff", "Isn't It Iron Pick", 
			"Not Today, Thank You", "Ice Bucket Challenge", "Diamonds!", "We Need to Go Deeper", "Cover Me With Diamonds", "Enchanter", "Zombie Doctor", 
			"Eye Spy", "The End?", "Nether", "Return to Sender", "Those Were the Days", "Hidden in the Depths", "Subspace Bubble", "A Terrible Fortress", 
			"Who is Cutting Onions?", "Oh Shiny", "This Boat Has Legs", "Uneasy Alliance", "War Pigs", "Country Lode, Take Me Home", "Cover Me in Debris", 
			"Spooky Scary Skeleton", "Into Fire", "Not Quite \"Nine\" Lives", "Hot Tourist Destinations", "Withering Heights", "Local Brewery", 
			"Bring Home the Beacon", "A Furious Cocktail", "Beaconator", "How Did We Get Here?", "The End", "Free the End", "The Next Generation", 
			"Remote Getaway", "The End... Again...", "You Need a Mint", "The City at the End of the Game", "Sky's the Limit", "Great View From Up Here", 
			"Adventure", "Voluntary Exile", "Monster Hunter", "What a Deal!", "Sticky Situation", "Ol' Betsy", "Sweet Dreams", "Hero of the Village", 
			"A Throwaway Joke", "Take Aim", "Monsters Hunted", "Postmortal", "Hired Help", "Two Birds, One Arrow", "Who's the Pillager Now?", "Arbalistic", 
			"Adventuring Time", "Very Very Frightening", "Sniper Duel", "Bullseye", "Husbandry", "Bee Our Guest", "The Parrots and the Bats", 
			"Best Friends Forever", "Fishy Business", "Total Beelocation", "A Seedy Place", "Two by Two", "A Complete Catalogue", "Tactical Fishing", 
			"A Balanced Diet", "Serious Dedication"};
	
	
	private String flavor[] = {"The heart and story of the game", "Mine stone with your new pickaxe", "Construct a better pickaxe", "Smelt an iron ingot", 
			"Protect yourself with a piece of iron armor", "Fill a bucket with lava", "Upgrade your pickaxe", "Deflect a projectile with a shield", 
			"Obtain a block of obsidian", "Acquire diamonds", "Build, light and enter a Nether Portal", "Diamond armor saves lives", 
			"Enchant an item at an Enchanting Table", "Weaken and then cure a Zombie Villager", "Follow an Eye of Ender", "Enter the End Portal", 
			"Bring summer clothes", "Destroy a Ghast with a fireball", "Enter a Bastion Remnant", "Obtain Ancient Debris", 
			"Use the Nether to travel 7 km in the Overworld", "Break your way into a Nether Fortress", "Obtain Crying Obsidian", 
			"Distract Piglins with gold", "Ride a Strider with a Warped Fungus on a Stick", 
			"Rescue a Ghast from the Nether, bring it safely home to the Overworld... and then kill it", "Loot a chest in a Bastion Remnant", 
			"Use a compass on Lodestone", "Get a full suit of Netherite armor", "Obtain a Wither Skeleton's skull", "Relieve a Blaze of its rod", 
			"Charge a Respawn Anchor to the maximum", "Explore all Nether biomes", "Summon the Wither", "Brew a potion", "Construct and place a beacon", 
			"Have every potion effect applied at the same time", "Bring a beacon to full power", "Have every effect applied at the same time", 
			"Or the beginning?", "Good luck", "Hold the Dragon Egg", "Escape the island", "Respawn the Ender Dragon", 
			"Collect dragon's breath in a glass bottle", "Go on in, what could happen?", "Find elytra", 
			"Levitate up 50 blocks from the attacks of a Shulker", "Adventure, exploration, and combat", 
			"Kill a raid captain . Maybe consider staying away from villages for the time being...", "Kill any hostile monster", 
			"Successfully trade with a Villager", "Jump into a Honey Block to break your fall", "Shoot a crossbow", 
			"Sleep in a bed to change your respawn point", "Successfully defend a village from a raid", 
			"Throw a trident at something. Note: Throwing away your only weapon is not a good idea.", "Shoot something with an arrow", 
			"Kill one of every hostile monster", "Use a Totem of Undying to cheat death", "Summon an Iron Golem to help defend a village", 
			"Kill two Phantoms with a piercing arrow", "Give a Pillager a taste of their own medicine", "Kill five unique mobs with one crossbow shot", 
			"Discover every biome", "Strike a Villager with lightning", "Kill a Skeleton from at least 50 meters away", 
			"Hit the bullseye of a Target block from at least 30 meters away", "The world is full of friends and food", 
			"Use a Campfire to collect Honey from a Beehive using a Bottle without aggravating the bees", "Breed two animals together", "Tame an animal", 
			"Catch a fish", "Move a Bee Nest , with 3 bees inside, using Silk Touch", "Plant a seed and watch it grow", "Breed all the animals!", 
			"Tame all cat variants!", "Catch a fish... without a fishing rod!", "Eat everything that is edible, even if it's not good for you", 
			"Use a Netherite ingot to upgrade a hoe , and then reevaluate your life choices"};
	
	
	private String actual[] = {"Have a crafting table in your inventory.", 
			"Have cobblestone or blackstone in your inventory, both in the #stone_tool_materials tag.", 
			"Have a stone pickaxe in your inventory.", "Have an iron ingot in your inventory.", 
			"Have any type of iron armor in your inventory.", "Have a lava bucket in your inventory.", 
			"Have an iron pickaxe in your inventory.", "—", "Have a block of obsidian in your inventory.", "Have a diamond in your inventory.", 
			"Enter the Nether .", "Have any type of diamond armor in your inventory.", "Insert an item in an enchantment table, then apply an enchantment.", 
			"Throw a splash potion of Weakness at a zombie villager, feed it a golden apple , and wait for it to be cured .", "Enter a stronghold .", 
			"Enter the End dimension.", "Enter the Nether dimension.", "Kill a ghast using a ghast fireball .", "—", 
			"Have ancient debris in your inventory.", "Use the Nether to travel between 2 points in the Overworld with a minimum horizontal distance of 7000 blocks between each other, 875 blocks in the Nether.", 
			"Enter a nether fortress .", "Have crying obsidian in your inventory.", 
			"Give a piglin one of these 22 gold-related items in the #piglin_loved entity tag while not wearing any golden armor. If this advancement is attempted while the player is wearing golden armor but piglin(s) are still aggressive toward them, the advancement does not trigger. Other gold-related items, if any, may be used, but are ignored for this advancement and by the piglin.", 
			"Boost a strider with a warped fungus on a stick .", "Kill a ghast while in the Overworld.", "Open a chest in a bastion remnant .", 
			"Use a compass on a lodestone .", "Have a full set of netherite armor in your inventory.", "Have a wither skeleton skull in your inventory.", 
			"Have a blaze rod in your inventory.", "—", 
			"Visit all of these 5 biomes . The advancement is only for Nether biomes. Other biomes, if any, may also be visited, but are ignored for this advancement.", 
			"—", "Pick up an item from a brewing stand potion slot. This does not need to be a potion. Water bottles or even glass bottles can also trigger this advancement.", 
			"Be within a 20×20×14 cuboid centered on a beacon block when it realizes it has become powered.", 
			"Have all of these 13 potion effects applied to the player at the same time. Beacon effects also count for the purposes of this advancement. Other potion effects , if any, may be applied to the player, but are ignored for this advancement.", 
			"Be within a 20×20×14 cuboid centered on a beacon block when it realizes it is being powered by a size 4 pyramid.", 
			"Have all of these 26 effects applied to the player at the same time. Beacon effects also count for the purposes of this advancement. Other status effects , if any, may be applied to the player, but are ignored for this advancement. Note: This is a hidden advancement, meaning that it can be viewed by the player only after completing it.", 
			"Enter the End dimension.", "Kill the ender dragon .", "Have a dragon egg in your inventory.", 
			"Throw an ender pearl through or walk into an end gateway .", "Summon an ender dragon using end crystals .", 
			"Have a bottle of dragon's breath in your inventory.", "Enter an end city .", "Have a pair of elytra in your inventory.", 
			"Move a distance of 50 blocks with the Levitation effect applied.", "Kill any entity , or be killed by any entity .", 
			"Kill an entity in the #raiders entity tag wearing an ominous banner.", 
			"Kill one of these 34 mobs . Other mobs, if any, may be killed, but are ignored for this advancement.", 
			"Take an item from a villager or wandering trader's trading output slot, and put it in your inventory.", 
			"Collide on a vertical side of a honey block when in air.", "—", 
			"Lie down in a bed . The advancement is granted as soon as the player is in the bed, even if the player does not successfully sleep.", 
			"Note: This is a hidden advancement, meaning that it can be viewed by the player only after completing it.", 
			"Hit an entity with a thrown trident.", "Using a bow or a crossbow, shoot an entity with an arrow , tipped arrow , or spectral arrow .", 
			"Kill each of these 34 mobs . Other mobs, if any, may be killed, but are ignored for this advancement.", 
			"Activate a totem of undying by taking fatal damage.", "Summon an iron golem .", "Use a crossbow enchanted with Piercing to kill two phantoms .", 
			"Kill a pillager with a crossbow.", "Note: This is a hidden advancement, meaning that it can be viewed by the player only after completing it.", 
			"Visit all of these 42 biomes . The advancement is only for Overworld biomes. Other biomes, if any, may also be visited, but are ignored for this advancement.", 
			"Hit a villager with lightning created by a trident with the Channeling enchantment.", 
			"Kill a skeleton with a projectile while being at least 50 blocks away horizontally.", 
			"Be at least 30 blocks away when the center of a target is shot with a projectile horizontally by the player.", 
			"Eat one of these 39 foods . Other foods, if any, can be eaten, but are ignored for this advancement.", 
			"Use a bottle on a beehive or bee nest while not angering the bees inside.", "—", "—", "Use a fishing rod to catch a fish.", "—", 
			"Plant one of these 5 crops . Other crops and plants, if any, can be planted, but are ignored for this advancement.", 
			"Breed pairs of each of these 19 mobs . A trader llama does not count as a llama , and a mule must be the result of breeding a horse and a donkey for this advancement as they are not breed-able together. Other breed-able mobs, if any, can be bred, but are ignored for this advancement.", 
			"Tame each of these 11 cat variants . Other cat variants, if any, can be tamed, but are ignored for this advancement.", 
			"Use a water bucket to pick up a fish or axolotl‌ [ upcoming: 1.17 ] .", 
			"Eat each of these 39 foods . Other foods, if any, can be eaten, but are ignored for this advancement.", 
			"Have a netherite hoe in your inventory."};
		
	public Text() {
		
	}
	
	public String getName(int pos) {
		return names[pos];
	}
	
	
	public int getCoordX(int pos) {
		return xs[pos];
	}
	
	public int getCoordY(int pos) {
		return ys[pos];
	}
	
	public String[] getAllNames() {
		return names;
	}
	
	public String getFlavor(int pos) {
		return flavor[pos];
	}
	
	public int getBorders(int pos) {
		return borders[pos];
	}
	
	
	
	
	public String[] getFoods() {
		return foods;
	}

	public String[] getFoodNames() {
		return foodNames;
	}

	public String[] getBiomes() {
		return biomes;
	}

	public String[] getBiomesNames() {
		return biomesNames;
	}

	public String[] getNethBiomes() {
		return nethBiomes;
	}

	public String[] getNethBiomesNames() {
		return nethBiomesNames;
	}

	public String[] getAllMons() {
		return allMons;
	}

	public String[] getAllMonsNames() {
		return allMonsNames;
	}

	public String[] getBreedAll() {
		return breedAll;
	}

	public String[] getBreedAllNames() {
		return breedAllNames;
	}

	public String[] getAllCats() {
		return allCats;
	}

	public String[] getAllCatsNames() {
		return allCatsNames;
	}
	
	
	
	
}
