package evolve.gold.server.nbt;

public class TagString extends Tag {

	private final String data;
	
	public TagString(String name, String data) {
		super(name);
		this.data = data;
	}
	
	@Override
	public String getData() {
		return this.data;
	}

	@Override
	public TagType getType() {
		return TagType.String;
	}

}
