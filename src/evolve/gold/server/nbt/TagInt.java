package evolve.gold.server.nbt;

public class TagInt extends Tag {

	private final int data;
	
	public TagInt(String name, int data) {
		super(name);
		this.data = data;
	}
	@Override
	public Integer getData() {
		return this.data;
	}

	@Override
	public TagType getType() {
		return TagType.Int;
	}

}
