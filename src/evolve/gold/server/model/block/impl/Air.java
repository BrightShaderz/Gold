package evolve.gold.server.model.block.impl;

import evolve.gold.server.model.block.Block;
import evolve.gold.server.model.block.BlockID;

public class Air extends Block {

	@Override
	public int getID() {
		return BlockID.Air.getBlockID();
	}

	@Override
	public String getName() {
		return "Air";
	}

	@Override
	public Boolean liquid() {
		return false;
	}

	@Override
	public byte getLightLevel() {
		return 0;
	}

	@Override
	public Boolean solid() {
		return false;
	}

}
