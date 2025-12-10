package net.justin.obsidianplusmod.datagen;

import net.justin.obsidianplusmod.ObsidianPlus;
import net.justin.obsidianplusmod.block.ModBlocks;
import net.justin.obsidianplusmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ObsidianPlus.MODID, existingFileHelper);
    }

    //adds tags for mineable blocks with tools
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.OBSIDIAN_ORE.get())
                .add(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get());

        tag((BlockTags.NEEDS_DIAMOND_TOOL))
                .add((ModBlocks.OBSIDIAN_ORE.get()));

        tag(ModTags.Blocks.NEEDS_OBSIDIAN_TOOL)
                .add(ModBlocks.OBSIDIAN_ORE.get())
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_OBSIDIAN_TOOL);

    }
}
