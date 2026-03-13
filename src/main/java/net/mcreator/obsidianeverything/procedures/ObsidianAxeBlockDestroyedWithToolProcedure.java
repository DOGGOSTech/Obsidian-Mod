package net.mcreator.obsidianeverything.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

public class ObsidianAxeBlockDestroyedWithToolProcedure {
	public static void execute(BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (blockstate.is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))) {
			if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
				AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("obsidian_everything:chop_tree_with_obsidian_axe"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}