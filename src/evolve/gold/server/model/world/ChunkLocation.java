package evolve.gold.server.model.world;

//TODO: Get world X & Z of the Chunk and add methods to load and save the chunk using NBT
public class ChunkLocation {
	
	private int x;
	private int z;
	
	public ChunkLocation() {
		
	}
	
	public ChunkLocation(int x, int z) {
		this.x = x;
		this.z = z;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the z
	 */
	public int getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(int z) {
		this.z = z;
	}	
}
