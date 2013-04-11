package evolve.gold.system.build;

public class Build {
	
	public Build() {
		this(0, 1, BuildType.AlphaBuild);
	}
	
	private int build;
	private int revision;
	private BuildType type;
	
	
	public Build(int build, int revision, BuildType type) {
		this.build = build;
		this.revision = revision;
		this.type = type;
	}

	/**
	 * @return the build
	 */
	public int getBuild() {
		return build;
	}

	/**
	 * @return the revision
	 */
	public int getRevision() {
		return revision;
	}

	/**
	 * @return the type
	 */
	public BuildType getType() {
		return type;
	}
	
	@Override
    public String toString() {
		return this.type.getIdentifier() + ":" + this.build + "." + this.revision;
	}
	
	public boolean isStable() {
        return this.type.equals(BuildType.StableBuild);
    }
}
