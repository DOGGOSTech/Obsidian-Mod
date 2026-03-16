package net.mcreator.obsidianeverything.client.renderer.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.mcreator.obsidianeverything.init.ObsidianEverythingModItems;

@EventBusSubscriber(Dist.CLIENT)
public class ObsidianArmorArmor {
	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("obsidian_everything:textures/models/armor/obsidian-armor_layer_1.png");
			}
		}, ObsidianEverythingModItems.OBSIDIAN_ARMOR_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("obsidian_everything:textures/models/armor/obsidian-armor_layer_1.png");
			}
		}, ObsidianEverythingModItems.OBSIDIAN_ARMOR_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("obsidian_everything:textures/models/armor/obsidian-armor_layer_2.png");
			}
		}, ObsidianEverythingModItems.OBSIDIAN_ARMOR_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("obsidian_everything:textures/models/armor/obsidian-armor_layer_1.png");
			}
		}, ObsidianEverythingModItems.OBSIDIAN_ARMOR_BOOTS.get());
	}
}