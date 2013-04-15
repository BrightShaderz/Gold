package evolve.gold.server.model;

public enum Difficulty {
	P(0, "Peaceful", false, true),
	E(1, "Easy", true, true),
	N(2, "Normal", true, true),
	H(3, "Hard", true, true);
	
	private int id;
	private String name;
	private Boolean spawnMobs;
	private Boolean fallDamage;
	
	Difficulty(int id, String name, Boolean spawnMobs, Boolean fallDamage){
		this.id = id;
		this.name = name;
		this.spawnMobs = spawnMobs;
		this.fallDamage = fallDamage;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the spawnMobs
	 */
	public Boolean getSpawnMobs() {
		return spawnMobs;
	}

	/**
	 * @return the fallDamage
	 */
	public Boolean getFallDamage() {
		return fallDamage;
	}
}
