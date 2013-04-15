package evolve.gold.server.model;

public enum Dimension {
	N(-1, "The Nether"),
	O(0, "Overworld"),
	E(1, "The End");
	
	private int id;
	private String name;
	
	Dimension(int id, String name) {
		this.id = id;
		this.name = name;
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
}
