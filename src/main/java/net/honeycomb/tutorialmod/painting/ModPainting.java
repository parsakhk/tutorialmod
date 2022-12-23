package net.honeycomb.tutorialmod.painting;

import net.honeycomb.tutorialmod.TutorialMod;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPainting {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, TutorialMod.MODID);

    public static final RegistryObject<PaintingVariant> WILLOW_FIELD = PAINTING_VARIANTS.register("willow_field",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> HONEYCOMB = PAINTING_VARIANTS.register("honey_comb",
            () -> new PaintingVariant(64, 64));

    public static void register(IEventBus bus) {
        PAINTING_VARIANTS.register(bus);
    }
}
