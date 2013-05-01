package evolve.gold.server.model.entity.living;

public abstract class Monster extends Mob {

	public abstract LivingEntity target();
	@Override
	public Aggression aggressionLevel() {
		return Aggression.A;
	}

}
