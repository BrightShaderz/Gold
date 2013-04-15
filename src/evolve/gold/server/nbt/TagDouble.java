package evolve.gold.server.nbt;

public class TagDouble extends Tag {

	private final double data;
	
	public TagDouble(String name, double data) {
		super(name);
		this.data = data;
	}
	
	@Override
	public Double getData() {
		return this.data;
	}

	@Override
	public TagType getType() {
		return TagType.Double;
	}

}
