package net.justin.obsidianplusmod.item;

import net.justin.obsidianplusmod.ObsidianPlus;
import net.justin.obsidianplusmod.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ObsidianPlus.MODID);

    //makes obsidian shard item
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidianshard",
            () -> new Item(new Item.Properties()));

    //makes obsidian sword
    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(ModToolTiers.OBSIDIAN, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.OBSIDIAN, 3, -2.4f))));

    //creates obsidian pickaxe
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OBSIDIAN, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.OBSIDIAN, 1, -2.8f))));

    //creates obsidian shovel
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(ModToolTiers.OBSIDIAN, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.OBSIDIAN, 1.5f, -3.0f))));

    //create obsidian axe
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new AxeItem(ModToolTiers.OBSIDIAN, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.OBSIDIAN, 6, -3.2f))));

    //creates obsidian hoe
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(ModToolTiers.OBSIDIAN, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.OBSIDIAN, 0, -3.0f))));


    //creates beef stew
    public static final RegistryObject<Item> BEEF_STEW = ITEMS.register("beef_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BEEF_STEW)));

    //creates pork stew
    public static final RegistryObject<Item> PORK_STEW = ITEMS.register("pork_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PORK_STEW)));

    //creates chicken stew
    public static final RegistryObject<Item> CHICKEN_STEW = ITEMS.register("chicken_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHICKEN_STEW)));

    //creates cod stew
    public static final RegistryObject<Item> COD_STEW = ITEMS.register("cod_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COD_STEW)));


    //creates obsidian helmet
    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));

    //creates obsidian chestplate
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));

    //creates obsidian leggings
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));

    //creates obsidian boots
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));


    //creates darude sandstorm music disc
    public static final RegistryObject<Item> DARUDE_SANDSTORM_MUSIC_DISC = ITEMS.register("darude_sandstorm_music_disc",
            ()->new Item(new Item.Properties().jukeboxPlayable(ModSounds.DARUDE_SANDSTORM_KEY).stacksTo(1)));


    //register method
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
