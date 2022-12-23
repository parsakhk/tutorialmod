package net.honeycomb.tutorialmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier MELON = new ForgeTier(2, 2022, 2.4f,
            3f, 82, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.MELON_SLICE));

}
