package net.justin.obsidianplusmod;

import net.justin.obsidianplusmod.block.ModBlocks;
import net.justin.obsidianplusmod.item.ModCreativeModeTabs;
import net.justin.obsidianplusmod.item.ModItems;
import net.justin.obsidianplusmod.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(ObsidianPlus.MODID)
public class ObsidianPlus {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "obsidianplusmod";

    public ObsidianPlus(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        //calls the creative mode tabs for the obsidian mod
        ModCreativeModeTabs.register(modEventBus);

        //calls obsidian item mods ("ModItems" class and "ModBlocks" class)
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        //calls mod sounds
        ModSounds.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }


    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        //add obsidian shard to ingredients tab
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.OBSIDIAN_SHARD);
        }
        //adds obsidian shard block to building blocks tab
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.OBSIDIAN_ORE);
            event.accept((ModBlocks.BLOCK_OF_OBSIDIAN_SHARD));
        }
    }

}
