package net.justin.obsidianplusmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;


//makes custom food properties
public class ModFoodProperties {

    //makes properties for beef stew
    public static final FoodProperties BEEF_STEW = new FoodProperties.Builder().nutrition(5).saturationModifier(.8f)
            .usingConvertsTo(Items.BOWL).build();

    //makes
    public static final FoodProperties PORK_STEW = new FoodProperties.Builder().nutrition(5).saturationModifier(.8f)
            .usingConvertsTo(Items.BOWL).build();

    //makes properties for chicken stew
    public static final FoodProperties CHICKEN_STEW = new FoodProperties.Builder().nutrition(4).saturationModifier(.6f)
            .usingConvertsTo(Items.BOWL).build();

    //makes properties for pork stew
    public static final FoodProperties COD_STEW = new FoodProperties.Builder().nutrition(2).saturationModifier(.3f)
            .usingConvertsTo(Items.BOWL).build();


}
