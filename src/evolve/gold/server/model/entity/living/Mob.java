package evolve.gold.server.model.entity.living;

public abstract class Mob extends LivingEntity {
	public abstract int id();
	public abstract Aggression aggressionLevel();
	public abstract AIBase ai();
	public abstract short exp();
	public abstract short attackStrength();
	public abstract short attackRadius();
}
