package evolve.gold.server.model.entity;

public class LivingEntity extends Entity {

	private Boolean onFire = false;
	private Boolean ridding = false;
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
	 * @return the ridding
	 */
	public Boolean getRidding() {
		return ridding;
	}

	/**
	 * @return the crouching
	 */
	public Boolean getCrouching() {
		return crouching;
	}
}
