package evolve.gold.server.nbt;

public abstract class Tag {
	
	private String name;
	
	public Tag(String name) {
		this.name = name;
	}
	
	public abstract TagType getType();
	
	public String getName() {
		return this.name;
	}
}