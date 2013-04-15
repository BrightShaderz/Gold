package evolve.gold.server.nbt;

public class TagByteArray extends Tag {

	private final byte[] data;
	
	public TagByteArray(String name, byte[] data) {
		super(name);
		this.data = data;
	}
	@Override
	public byte[] getData() {
		return this.data;
	}

	@Override
	public TagType getType() {
		return TagType.ByteArray;
	}

}
