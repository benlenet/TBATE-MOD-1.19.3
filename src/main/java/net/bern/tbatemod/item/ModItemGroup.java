package net.bern.tbatemod.item;

import net.bern.tbatemod.TBATEMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup TBATE;
    public static void registerItemGroups() {
        TBATE = FabricItemGroup.builder(new Identifier(TBATEMod.MOD_ID, "sylvie_egg")).displayName(Text.literal("The " +
                "Beginning After The End")).icon(() -> new ItemStack(ModItems.SYLVIE_EGG)).build();

    }
}
