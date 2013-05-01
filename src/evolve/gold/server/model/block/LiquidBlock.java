package evolve.gold.server.model.block;

public abstract class LiquidBlock extends Block {
	@Override
	public Boolean liquid() {
		return true;
	}
	@Override
	public Boolean solid() {
		return false;
	}
}
