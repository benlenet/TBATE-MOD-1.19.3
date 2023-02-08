package net.bern.tbatemod.item;

import net.bern.tbatemod.TBATEMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // list of items: name cannot be capital
    public static final Item SYLVIE_ROCK = registerItem("sylvie_rock", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TBATEMod.MOD_ID, name), item);
    }
    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, SYLVIE_ROCK);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    // initializes class so that all items are properly registered
    public static void registerModItems() {
        TBATEMod.LOGGER.info("Registering Mod Items for " + TBATEMod.MOD_ID);
    }
}
