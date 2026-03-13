package net.mcreator.obsidianeverything.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.obsidianeverything.procedures.ObsidianAxeBlockDestroyedWithToolProcedure;

public class ObsidianAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 15000, 50f, 0, 100, TagKey.create(Registries.ITEM, ResourceLocation.parse("obsidian_everything:obsidian_axe_repair_items")));

	public ObsidianAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 19f, 11f, properties.fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		ObsidianAxeBlockDestroyedWithToolProcedure.execute(blockstate, entity);
		return retval;
	}
}