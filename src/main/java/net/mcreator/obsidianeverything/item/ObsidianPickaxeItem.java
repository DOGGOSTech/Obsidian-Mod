package net.mcreator.obsidianeverything.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.obsidianeverything.procedures.ObsidianPickaxeItemIsCraftedsmeltedProcedure;
import net.mcreator.obsidianeverything.procedures.ObsidianPickaxeBlockDestroyedWithToolProcedure;

public class ObsidianPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5000, 4f, 0, 100, TagKey.create(Registries.ITEM, ResourceLocation.parse("obsidian_everything:obsidian_pickaxe_repair_items")));

	public ObsidianPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 14f, 11f).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		ObsidianPickaxeBlockDestroyedWithToolProcedure.execute(entity);
		return retval;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Player entity) {
		super.onCraftedBy(itemstack, entity);
		ObsidianPickaxeItemIsCraftedsmeltedProcedure.execute(entity);
	}
}