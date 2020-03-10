package net.tslat.aoa3.block.functional.utility;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.CreativeTabsRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.item.minionslab.BaseSlab;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.player.PlayerDataManager;
import net.tslat.aoa3.utils.player.PlayerUtil;

public class CreationForge extends Block {
	public CreationForge() {
		super(Material.ROCK);
		setTranslationKey("CreationForge");
		setRegistryName("aoa3:creation_forge");
		setHardness(10.0f);
		setResistance(15.0f);
		setSoundType(SoundType.STONE);
		setCreativeTab(CreativeTabsRegister.functionalBlocksTab);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && player.getHeldItem(hand).getItem() instanceof BaseSlab) {
			PlayerDataManager plData = PlayerUtil.getAdventPlayer(player);
			BaseSlab slab = (BaseSlab)player.getHeldItem(hand).getItem();

			if (plData.stats().getLevel(Enums.Skills.CREATION) >= slab.sacrificeLvl) {
				if (!player.capabilities.isCreativeMode)
					player.getHeldItem(hand).shrink(1);

				plData.stats().addXp(Enums.Skills.CREATION, slab.sacrificeXp, false, false);
				world.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundsRegister.creationForgeUse, SoundCategory.BLOCKS, 1.0f, 1.0f);
				player.inventoryContainer.detectAndSendChanges();
			}
			else {
				if (player instanceof EntityPlayerMP)
					PlayerUtil.notifyPlayerOfInsufficientLevel((EntityPlayerMP)player, Enums.Skills.CREATION, slab.sacrificeLvl);
			}
		}

		return true;
	}
}
