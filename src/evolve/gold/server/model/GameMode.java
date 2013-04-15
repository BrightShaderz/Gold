package evolve.gold.server.model;

public enum GameMode {
	
	S(0, "Survival", true),
	C(1, "Creative", true),
	H(2, "Hardcore", true),
	A(3, "Adventure", false);
	
	private int id;
	private String name;
	private Boolean allowBuild;
	
	GameMode(int id, String name, Boolean allowBuild) {
		this.id = id;
		this.name = name; 
		this.allowBuild = allowBuild;
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
	 * @return the allowBuild
	 */
	public Boolean getAllowBuild() {
		return allowBuild;
	}
}
