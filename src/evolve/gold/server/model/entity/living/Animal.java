package evolve.gold.server.model.entity.living;

import evolve.gold.server.model.entity.living.Mob;

public abstract class Animal extends Mob {

	@Override
	public Aggression aggressionLevel() {
		return Aggression.P;
	}

}
