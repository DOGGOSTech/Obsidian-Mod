/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.obsidianeverything.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.obsidianeverything.item.ObsidianSwordItem;
import net.mcreator.obsidianeverything.item.ObsidianStickItem;
import net.mcreator.obsidianeverything.item.ObsidianPickaxeItem;
import net.mcreator.obsidianeverything.item.ObsidianAxeItem;
import net.mcreator.obsidianeverything.ObsidianEverythingMod;

import java.util.function.Function;

public class ObsidianEverythingModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ObsidianEverythingMod.MODID);
	public static final DeferredItem<Item> OBSIDIAN_SWORD;
	public static final DeferredItem<Item> OBSIDIAN_STICK;
	public static final DeferredItem<Item> OBSIDIAN_PICKAXE;
	public static final DeferredItem<Item> OBSIDIAN_AXE;
	static {
		OBSIDIAN_SWORD = register("obsidian_sword", ObsidianSwordItem::new);
		OBSIDIAN_STICK = register("obsidian_stick", ObsidianStickItem::new);
		OBSIDIAN_PICKAXE = register("obsidian_pickaxe", ObsidianPickaxeItem::new);
		OBSIDIAN_AXE = register("obsidian_axe", ObsidianAxeItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}