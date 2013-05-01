package evolve.gold.server.model.entity.living;

public enum Aggression {
	
	P(1, "Passive", false, false),
	N(2, "Neutral", false, true),
	A(3, "Agressive", true, true);
	
	private int id;
	private String name;
	private Boolean attackOnSight;
	private Boolean counterAttacks;
	
	Aggression(int id, String name, Boolean attackOnSight, Boolean counterAttacks) {
		this.id = id;
		this.name = name;
		this.attackOnSight = attackOnSight;
		this.counterAttacks = counterAttacks;
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
	 * @return the attackOnSight
	 */
	public Boolean getAttackOnSight() {
		return attackOnSight;
	}

	/**
	 * @return the counterAttacks
	 */
	public Boolean getCounterAttacks() {
		return counterAttacks;
	}
}
