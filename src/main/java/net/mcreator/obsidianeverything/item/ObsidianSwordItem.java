package net.mcreator.obsidianeverything.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.obsidianeverything.procedures.ObsidianSwordToolInHandTickProcedure;
import net.mcreator.obsidianeverything.procedures.ObsidianSwordLivingEntityIsHitWithToolProcedure;

public class ObsidianSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 100, 35f, 0, 100, TagKey.create(Registries.ITEM, ResourceLocation.parse("obsidian_everything:obsidian_sword_repair_items")));

	public ObsidianSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 24f, 26f).fireResistant());
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		ObsidianSwordLivingEntityIsHitWithToolProcedure.execute(sourceentity);
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Player entity) {
		super.onCraftedBy(itemstack, entity);
		ObsidianSwordToolInHandTickProcedure.execute(entity);
	}
}