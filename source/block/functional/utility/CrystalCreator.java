package net.tslat.aoa3.block.functional.utility;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.CreativeTabsRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.utils.ItemUtil;

public class CrystalCreator extends Block {
	private Item gemstone;
	private Item crystal;

	public CrystalCreator(String name, String registryName) {
		super(Material.ROCK);
		setTranslationKey(name);
		setRegistryName("aoa3:" + registryName);
		setHardness(-1f);
		setResistance(999999999f);
		setSoundType(SoundType.GLASS);
		setCreativeTab(CreativeTabsRegister.FUNCTIONAL_BLOCKS);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && !player.getHeldItem(hand).isEmpty()) {
			ItemStack stack = player.getHeldItem(hand);

			if (stack.getItem() == gemstone) {
				player.setHeldItem(hand, ItemStack.EMPTY);

				ItemUtil.givePlayerItemOrDrop(player, new ItemStack(crystal, stack.getCount()));
				world.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundsRegister.CRYSTAL_CREATOR_USE, SoundCategory.BLOCKS, 1.0f, 1.0f);
			}
		}

		return true;
	}

	public void setConversionItems(Item gemstone, Item crystal) {
		if (this.gemstone == null) {
			this.gemstone = gemstone;
			this.crystal = crystal;
		}
	}
}
