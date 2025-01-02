package net.ArticFox.souls.items.gems;

import net.ArticFox.souls.SoulSealer;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CorruptedGems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SoulSealer.MOD_ID);

    public static final RegistryObject<Item> PURPLE_GEM = ITEMS.register("purple_gem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus); }
}
