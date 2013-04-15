package evolve.gold.server.nbt;

public class TagIntArray extends Tag {

	private final int[] data;
	
	public TagIntArray(String name, int[] data) {
		super(name);
		this.data = data;
	}
	@Override
	public int[] getData() {
		return this.data;
	}

	@Override
	public TagType getType() {
		return TagType.IntArray;
	}

}
