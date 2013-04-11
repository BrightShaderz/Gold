package evolve.gold.system.build;

public enum BuildType {
	
	AlphaBuild("Alpha Build", "A build that is not tested and is probably be unstable.", "Alpha"),
	BetaBuild("Beta Build", "A build that is tested, but unstable.", "Beta"),
	StableBuild("Stable Build", "A build that contains new features and is stable.", "Stable");
	
	
	private String name;
	private String description;
	private String identifier;
	
	private BuildType(String name, String description, String identifier) {
		this.name = name;
		this.description = description;
		this.identifier = identifier;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}
}
