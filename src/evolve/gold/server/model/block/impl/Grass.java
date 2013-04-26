package evolve.gold.server.model.block.impl;

import evolve.gold.server.model.block.BlockID;
import evolve.gold.server.model.block.SolidBlock;

public class Grass extends SolidBlock {

	@Override
	public Boolean hasPhysics() {
		return true;
	}

	@Override
	public Boolean isTransparent() {
		return false;
	}

	@Override
	public int getID() {
		return BlockID.Glass.getBlockID();
	}

	@Override
	public String getName() {
		return "Grass";
	}

	@Override
	public byte getLightLevel() {
		return 0;
	}

}
