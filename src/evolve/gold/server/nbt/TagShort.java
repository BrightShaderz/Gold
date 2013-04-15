package evolve.gold.server.nbt;

public class TagShort extends Tag {

	private final short data;
	
	public TagShort(String name, short data) {
		super(name);
		this.data = data;
	}
	
	@Override
	public Short getData() {
		return this.data;
	}

	@Override
	public TagType getType() {
		return TagType.Short;
	}

}
