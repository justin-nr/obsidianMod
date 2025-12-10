package net.justin.obsidianplusmod.block;

import net.justin.obsidianplusmod.ObsidianPlus;
import net.justin.obsidianplusmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ObsidianPlus.MODID);

    //creates obsidian ore
    public static final RegistryObject<Block> OBSIDIAN_ORE = registerBlock("obsidian_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of()
                            .strength(50.0f, 1200.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.AMETHYST)));

    //creates block of obsidian shard
    public static final RegistryObject<Block> BLOCK_OF_OBSIDIAN_SHARD = registerBlock("block_of_obsidian_shard",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));


    //method to register blocks
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //method to register block as item
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    //block register method
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
