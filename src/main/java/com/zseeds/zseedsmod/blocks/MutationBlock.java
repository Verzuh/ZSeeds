package com.zseeds.zseedsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MutationBlock extends Block {

	public MutationBlock(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}