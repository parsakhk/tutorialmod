package net.honeycomb.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab PARSA_MOD = new CreativeModeTab("tutorial_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RED_MAGIC_GEM.get());
        }
    };
}
