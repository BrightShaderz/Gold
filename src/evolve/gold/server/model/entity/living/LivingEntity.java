package evolve.gold.server.model.entity.living;

import evolve.gold.server.model.entity.Entity;

public class LivingEntity extends Entity {

	private short health;
	private short maxHealth;
	private Boolean isGod = false;
	private Boolean canDrown = false;
	private Boolean immuneToFire = false;
	private Boolean onFire = false;
	private Boolean riding = false;
	private Boolean jumping = false;
	//TODO: This might be moved to the Player class.
	private Boolean crouching = false;
	
	public LivingEntity() {
	}

	/**
	 * @return the onFire
	 */
	public Boolean getOnFire() {
		return onFire;
	}

	/**
	 * @return the riding
	 */
	public Boolean getRiding() {
		return riding;
	}

	/**
	 * @return the crouching
	 */
	public Boolean getCrouching() {
		return crouching;
	}
}
