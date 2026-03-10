package net.mcreator.obsidianeverything.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ObsidianAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 100, 250f, 0, 100, TagKey.create(Registries.ITEM, ResourceLocation.parse("obsidian_everything:obsidian_axe_repair_items")));

	public ObsidianAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 19f, 11f, properties.fireResistant());
	}
}