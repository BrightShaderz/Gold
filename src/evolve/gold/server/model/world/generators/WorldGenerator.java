package evolve.gold.server.model.world.generators;

import evolve.gold.server.model.world.Chunk;
import evolve.gold.server.model.world.World;

public abstract class WorldGenerator {
	
	private World world;
	private long seed;
	
	public WorldGenerator(World world, long seed) {
		this.setWorld(world);
		this.setSeed(seed);
	}
	
	public abstract void generate(Chunk chunk);

	/**
	 * @return the world
	 */
	public World getWorld() {
		return world;
	}

	/**
	 * @param world the world to set
	 */
	public void setWorld(World world) {
		this.world = world;
	}

	/**
	 * @return the seed
	 */
	public long getSeed() {
		return seed;
	}

	/**
	 * @param seed the seed to set
	 */
	public void setSeed(long seed) {
		this.seed = seed;
	}
}
