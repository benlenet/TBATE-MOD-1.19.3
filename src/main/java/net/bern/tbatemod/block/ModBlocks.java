package net.bern.tbatemod.block;

import net.bern.tbatemod.TBATEMod;
import net.bern.tbatemod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    // duplicate this to create more blocks (use new Block instead of new ExperienceDroppingBlock)
    public static final Block SYLVIE_STONE = registerBlock("sylvie_stone",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(17, 20)), ModItemGroup.TBATE);
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TBATEMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        // registers block item
        Item item = Registry.register(Registries.ITEM, new Identifier(TBATEMod.MOD_ID, name), new BlockItem(block,
                new FabricItemSettings()));
        // adds to only one item group
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks() {
        TBATEMod.LOGGER.info("Registering ModBlocks for " + TBATEMod.MOD_ID);
    }
}
