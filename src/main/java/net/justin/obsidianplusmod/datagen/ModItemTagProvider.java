package net.justin.obsidianplusmod.datagen;

import net.justin.obsidianplusmod.ObsidianPlus;
import net.justin.obsidianplusmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, ObsidianPlus.MODID, existingFileHelper);
    }

    //trim tags
    @Override
    protected void addTags(HolderLookup.Provider pProvider){
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.OBSIDIAN_HELMET.get())
                .add(ModItems.OBSIDIAN_CHESTPLATE.get())
                .add(ModItems.OBSIDIAN_LEGGINGS.get())
                .add(ModItems.OBSIDIAN_BOOTS.get());

    }
}
