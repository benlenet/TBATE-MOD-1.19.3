package net.bern.tbatemod.item;

import net.bern.tbatemod.TBATEMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup TBATE;
    public static void registerItemGroups() {
        TBATE = FabricItemGroup.builder(new Identifier(TBATEMod.MOD_ID, ""))
    }
}
