package evolve.gold.server.nbt;

public class TagFloat extends Tag {

	private final float data;
	
	public TagFloat(String name, float data) {
		super(name);
		this.data = data;
	}
	@Override
	public Float getData() {
		return this.data;
	}

	@Override
	public TagType getType() {
		return TagType.Float;
	}

}
