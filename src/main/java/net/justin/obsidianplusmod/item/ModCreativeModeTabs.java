package net.justin.obsidianplusmod.item;

import net.justin.obsidianplusmod.ObsidianPlus;
import net.justin.obsidianplusmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ObsidianPlus.MODID);

    public static final RegistryObject<CreativeModeTab> OBSIDIAN_ITEMS_TAB = CREATIVE_MODE_TABS.register("obsidian_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OBSIDIAN_SHARD.get()))
                    .title(Component.translatable("creativetab.obsidianplusmod.obsidian_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //puts item in creative mode tab
                        output.accept(ModItems.OBSIDIAN_SHARD.get());

                        //puts tools in creative mode tab under items
                        output.accept(ModItems.OBSIDIAN_SWORD.get());
                        output.accept(ModItems.OBSIDIAN_AXE.get());
                        output.accept(ModItems.OBSIDIAN_PICKAXE.get());
                        output.accept(ModItems.OBSIDIAN_SHOVEL.get());
                        output.accept(ModItems.OBSIDIAN_HOE.get());

                        //puts obsidian armor in creative mode tab
                        output.accept(ModItems.OBSIDIAN_HELMET.get());
                        output.accept(ModItems.OBSIDIAN_CHESTPLATE.get());
                        output.accept(ModItems.OBSIDIAN_LEGGINGS.get());
                        output.accept(ModItems.OBSIDIAN_BOOTS.get());

                        //puts food in creative mode tab
                        output.accept(ModItems.BEEF_STEW.get());
                        output.accept(ModItems.PORK_STEW.get());
                        output.accept(ModItems.CHICKEN_STEW.get());
                        output.accept(ModItems.COD_STEW.get());

                        //puts music disc in creative mode tab
                        output.accept(ModItems.DARUDE_SANDSTORM_MUSIC_DISC.get());


                    }).build());

    public static final RegistryObject<CreativeModeTab> OBSIDIAN_BLOCKS_TAB = CREATIVE_MODE_TABS.register("obsidian_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get()))
                    .withTabsBefore(OBSIDIAN_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.obsidianplusmod.obsidian_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLOCK_OF_OBSIDIAN_SHARD.get());
                        output.accept(ModBlocks.OBSIDIAN_ORE.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
