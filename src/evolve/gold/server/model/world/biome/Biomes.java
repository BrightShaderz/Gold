package evolve.gold.server.model.world.biome;

public enum Biomes {
	UC("Uncalculated", -1),
	O("Ocean", 0),
	P("Plains", 1),
	D("Desert", 2),
	EH("ExtremeHills", 3),
	F("Forest", 4),
	T("Taiga", 5),
	SL("Swampland", 6),
	R("River", 7),
	H("Hell", 8),
	S("Sky", 9),
	FO("FrozenOcean", 10),
	FR("FrozenRiver", 11),
	IP("IcePlains", 12),
	IM("IceMountains", 13),
	MI("MushroomIsland", 14),
	MIS("MushroomIslandShore", 15),
	B("Beach", 16),
	DH("DesertHills", 17),
	FH("ForestHills", 18),
	TH("TaigaHills", 19),
	EHE("ExtremeHillsEdge", 20),
	J("Jungle", 21),
	JH("JungleHills", 22);
	
	private String name;
	private int id;
	
	Biomes(String name, int id) {
		this.name = name;
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
}
