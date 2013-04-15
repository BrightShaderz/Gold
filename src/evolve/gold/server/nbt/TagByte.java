package evolve.gold.server.nbt;

public class TagByte extends Tag{

	private final byte data;
	
	public TagByte(String name, byte data) {
		super(name);
		this.data = data;
	}

	@Override
	public Byte getData() {
		return this.data;
	}
	
	@Override
	public TagType getType() {
		return TagType.Byte;
	}
	
}
