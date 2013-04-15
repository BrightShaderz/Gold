package evolve.gold.server.model.world;

import evolve.gold.server.model.Difficulty;
import evolve.gold.server.model.Dimension;
import evolve.gold.server.model.GameMode;
import evolve.gold.server.model.world.generators.WorldGenerator;

public class World {
	
	private String name = "";
	private Difficulty difficulty = Difficulty.N;
	private Dimension dim = Dimension.O;
	private GameMode gm = GameMode.S;
	private WorldGenerator generator;
	
	public World() {
        
    }
    
    public World(final String name) {
        this.name = name;
    }
    
    public World(final String name, final WorldGenerator generator) {
        this.name = name;
        this.generator = generator;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the difficulty
	 */
	public Difficulty getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * @return the dim
	 */
	public Dimension getDim() {
		return dim;
	}

	/**
	 * @param dim the dim to set
	 */
	public void setDim(Dimension dim) {
		this.dim = dim;
	}

	/**
	 * @return the gm
	 */
	public GameMode getGm() {
		return gm;
	}

	/**
	 * @param gm the gm to set
	 */
	public void setGm(GameMode gm) {
		this.gm = gm;
	}

	/**
	 * @return the generator
	 */
	public WorldGenerator getGenerator() {
		return generator;
	}

	/**
	 * @param generator the generator to set
	 */
	public void setGenerator(WorldGenerator generator) {
		this.generator = generator;
	}
    
    
}
