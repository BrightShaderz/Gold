package evolve.gold.server.nbt;

import java.util.List;

public class TagList<E extends Tag> extends Tag {
	
	private final List<E> data;
	
	public TagList(String name, List<E> data) {
		super(name);
		this.data = data;
	}

	@Override
	public List<E> getData() {
		return this.data;
	}

	@Override
	public TagType getType() {
		return TagType.List;
	}

}
