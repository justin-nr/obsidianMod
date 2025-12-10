package net.justin.obsidianplusmod.item;

import net.justin.obsidianplusmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

//creates mod tier for obsidian
public class ModToolTiers {
    public static final Tier OBSIDIAN = new ForgeTier(1267,10,3f, 20,
            ModTags.Blocks.NEEDS_OBSIDIAN_TOOL, ()-> Ingredient.of(ModItems.OBSIDIAN_SHARD.get()),
            ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL);
}
