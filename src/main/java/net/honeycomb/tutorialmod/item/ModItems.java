package net.honeycomb.tutorialmod.item;

import net.honeycomb.tutorialmod.TutorialMod;
import net.honeycomb.tutorialmod.item.custom.CarbonatedTurasiem;
import net.honeycomb.tutorialmod.item.foods.ModFoods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> RED_MAGIC_GEM = ITEMS.register("magic_red_gem",
            () -> new Item(new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().tab(ModItemGroups.PARSA_MOD).food(ModFoods.ORANGE)));

    public static final RegistryObject<Item> CARBONATED_TURASIEM = ITEMS.register("carbonated_turasiem",
            () -> new CarbonatedTurasiem(new Item.Properties().tab(ModItemGroups.PARSA_MOD).fireResistant()));

    public static final RegistryObject<Item> MELON_SWORD = ITEMS.register("melon_sword",
            () -> new SwordItem(ModTiers.MELON, 4, 3f,
                    new Item.Properties().tab(ModItemGroups.PARSA_MOD)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
