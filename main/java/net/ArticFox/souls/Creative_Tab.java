package net.ArticFox.souls;

import net.ArticFox.souls.blocks.BuildingBlocks;
import net.ArticFox.souls.blocks.GemBlocks;
import net.ArticFox.souls.blocks.ModOres;
import net.ArticFox.souls.items.gems.CorruptedGems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Creative_Tab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SoulSealer.MOD_ID);

    public static  final RegistryObject<CreativeModeTab> SOUL_SEALER = CREATIVE_MODE_TABS.register("soul_sealer" ,
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CorruptedGems.PURPLE_GEM.get()))
            .title(Component.translatable("creativetab.soul_sealer"))
            .displayItems((itemDisplayParameters, output) -> {
               output.accept(CorruptedGems.PURPLE_GEM.get());
                output.accept(GemBlocks.PURPLE_GEM_BLOCK.get());
                output.accept(BuildingBlocks.SOUL_STONE.get());
                output.accept(BuildingBlocks.CHISELED_SOUL_STONE.get());
                output.accept(BuildingBlocks.SPIRIT_GLASS.get());
                output.accept(ModOres.SOUL_STEEL_ORE.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
