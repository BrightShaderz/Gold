package evolve.gold.server.model.block;

public abstract class Block {
	public abstract int getID();
	public abstract String getName();
	public abstract Boolean liquid();
	public abstract byte getLightLevel();
}
