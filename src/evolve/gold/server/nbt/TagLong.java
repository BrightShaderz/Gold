package evolve.gold.server.nbt;

public class TagLong extends Tag {

	private final long data;
	
	public TagLong(String name, long data) {
		super(name);
		this.data = data;
	}
	@Override
	public Long getData() {
		return this.data;
	}

	@Override
	public TagType getType() {
		return TagType.Long;
	}

}
