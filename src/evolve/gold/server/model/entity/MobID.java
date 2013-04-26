package evolve.gold.server.model.entity;


public enum MobID {
	
	Creeper(50, "Creeper"),
	Skeleton(51, "Skeleton"),
	Spider(52, "Spider"),
	Giant(53, "Giant"),
	Zombie(54, "Zombie"),
	Slime(55, "Slime"),
	Ghast(56, "Ghast"),
	ZombiePigman(57, "ZombiePigman"),
	Enderman(58, "Enderman"),
	CaveSpider(59, "CaveSpider"),
	Silverfish(60, "SilverFish"),
	Blaze(61, "Blaze"),
	MagmaCube(62, "MagmaCube"),
	EnderDragon(63, "EnderDragon"),
	Wither(64, "Wither"),
	Bat(65, "Bat"),
	Witch(66, "Witch"),
	Pig(90, "Pig"),
	Sheep(91, "Sheep"),
	Cow(92, "Cow"),
	Chicken(93, "Chicken"),
	Squid(94, "Squid"),
	Wolf(95, "Wolf"),
	Mooshroom(96, "Mooshroom"),
	SnowGolem(97, "SnowGolem"),
	Ocelot(98, "Ocelot"),
	IronGolem(99, "IronGolem"),
	Villager(120, "Villager"),
	EnderCrystal(200, "EnderCrystal");
	
	
	private int mobID;
	private String mobName;
	
	
	private MobID(int id, String name) {
		this.mobID = id;
		this.mobName = name;
	}
	
	public static int getIDFromName(String name) {
		for(MobID m : values()){
	        if( m.mobName.equals(name)){
	            return m.mobID;
	        }
	    }
		return 0;
	}
 
	public int getMobID() {
		return this.mobID;
	}
	
	public String getMobName() {
		return this.mobName;
	}	
}
