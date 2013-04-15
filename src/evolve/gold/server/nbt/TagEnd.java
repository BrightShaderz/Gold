package evolve.gold.server.nbt;

public final class TagEnd extends Tag{

	public TagEnd() {
		super();
	}
	
	@Override
	public Object getData() {
		return null;
	}

	@Override
	public TagType getType() {
		return TagType.End;
	}
	
}
