package evolve.gold.server.model.block;

public abstract class SolidBlock extends Block {
	public abstract Boolean hasPhysics();
	public abstract Boolean isTransparent();
	@Override
	public Boolean liquid() {
		return false;
	}
}
