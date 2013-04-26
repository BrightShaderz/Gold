package evolve.gold.server.model.block.impl;

import evolve.gold.server.model.block.BlockID;
import evolve.gold.server.model.block.SolidBlock;

public class Stone extends SolidBlock {

	@Override
	public Boolean hasPhysics() {
		return false;
	}

	@Override
	public Boolean isTransparent() {
		return false;
	}

	@Override
	public int getID() {
		return BlockID.Stone.getBlockID();
	}

	@Override
	public String getName() {
		return "Stone";
	}

	@Override
	public byte getLightLevel() {
		return 0;
	}

}
