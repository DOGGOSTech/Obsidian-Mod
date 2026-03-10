package net.mcreator.obsidianeverything.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.obsidianeverything.procedures.ObsidianStickItemIsCraftedsmeltedProcedure;

public class ObsidianStickItem extends Item {
	public ObsidianStickItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Player entity) {
		super.onCraftedBy(itemstack, entity);
		ObsidianStickItemIsCraftedsmeltedProcedure.execute(entity);
	}
}