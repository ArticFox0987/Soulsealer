package net.ArticFox.souls.blocks;

import net.ArticFox.souls.SoulSealer;
import net.ArticFox.souls.items.gems.CorruptedGems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BuildingBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SoulSealer.MOD_ID);

    public static final RegistryObject<Block> SOUL_STONE = registerBlock("soul_stone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_SOUL_STONE = registerBlock("chiseled_soul_stone", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK)));
    public static final RegistryObject<Block> SPIRIT_GLASS = registerBlock("spirit_glass", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return CorruptedGems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
