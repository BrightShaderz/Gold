package evolve.gold.server.model.world;

//TODO: Get the blocks in the chunk and get surrounding chunks.
public class Chunk {
	
	private World world;
	private ChunkLocation location = new ChunkLocation();
	
	public Chunk() {
		
	}
	
	public Chunk(World world, ChunkLocation location) {
		this.setWorld(world);
		this.setLocation(location);
	}

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
	 * @return the location
	 */
	public ChunkLocation getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(ChunkLocation location) {
		this.location = location;
	}
}
