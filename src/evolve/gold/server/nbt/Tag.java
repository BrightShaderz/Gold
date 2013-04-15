package evolve.gold.server.nbt;

public abstract class Tag {
	
	private String name;
	
	public Tag() {
		this("");
	}
	
	public Tag(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract Object getData();
	public abstract TagType getType();
}