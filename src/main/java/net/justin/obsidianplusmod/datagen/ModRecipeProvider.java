package net.justin.obsidianplusmod.datagen;

import net.justin.obsidianplusmod.block.ModBlocks;
import net.justin.obsidianplusmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    //methods to create the build recipes
    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        //for shaped recipe for block of obsidian shard block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModItems.OBSIDIAN_SHARD.get())).save(pRecipeOutput);

        //for shapeless recipes of obsidian shard from block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OBSIDIAN_SHARD.get(), 9)
                .requires(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get())
                .unlockedBy(getHasName(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get()), has(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get())).save(pRecipeOutput);


        //recipe for obsidian sword
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("#")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get())).save(pRecipeOutput);

        //recipe for obsidian axe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_AXE.get())
                .pattern("AA")
                .pattern("A#")
                .pattern(" #")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get())).save(pRecipeOutput);

        //recipe for obsidian pickaxe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_PICKAXE.get())
                .pattern("AAA")
                .pattern(" # ")
                .pattern(" # ")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get())).save(pRecipeOutput);

        //recipe for obsidian shovel
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_SHOVEL.get())
                .pattern("A")
                .pattern("#")
                .pattern("#")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get())).save(pRecipeOutput);

        //recipe for obsidian hoe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_HOE.get())
                .pattern("AA")
                .pattern(" #")
                .pattern(" #")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get())).save(pRecipeOutput);

        //recipe for obsidian helmet
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModItems.OBSIDIAN_SHARD.get())).save(pRecipeOutput);

        //recipe for obsidian chestplate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModItems.OBSIDIAN_SHARD.get())).save(pRecipeOutput);

        //recipe for obsidian leggings
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModItems.OBSIDIAN_SHARD.get())).save(pRecipeOutput);

        //recipe for obsidian boots
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.OBSIDIAN_SHARD.get())
                .unlockedBy(getHasName(ModItems.OBSIDIAN_SHARD.get()), has(ModItems.OBSIDIAN_SHARD.get())).save(pRecipeOutput);


        //recipe for beef stew
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BEEF_STEW.get(), 1)
                .requires(Items.COOKED_BEEF)
                .requires(Items.BROWN_MUSHROOM)
                .requires(Items.RED_MUSHROOM)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(Items.COOKED_BEEF), has(Items.COOKED_BEEF)).save(pRecipeOutput);

        //recipe for pork stew
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PORK_STEW.get(), 1)
                .requires(Items.COOKED_PORKCHOP)
                .requires(Items.BROWN_MUSHROOM)
                .requires(Items.RED_MUSHROOM)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(Items.COOKED_PORKCHOP), has(Items.COOKED_PORKCHOP)).save(pRecipeOutput);

        //recipe for chicken stew
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHICKEN_STEW.get(), 1)
                .requires(Items.COOKED_CHICKEN)
                .requires(Items.BROWN_MUSHROOM)
                .requires(Items.RED_MUSHROOM)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(Items.COOKED_CHICKEN), has(Items.COOKED_CHICKEN)).save(pRecipeOutput);

        //recipe for cod stew
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COD_STEW.get(), 1)
                .requires(Items.COOKED_COD)
                .requires(Items.BROWN_MUSHROOM)
                .requires(Items.RED_MUSHROOM)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(Items.COOKED_COD), has(Items.COOKED_COD)).save(pRecipeOutput);
    }
}
