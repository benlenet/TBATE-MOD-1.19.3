package net.bern.tbatemod.item.custom;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DawnBalladMaterial implements ToolMaterial {
    public static final DawnBalladMaterial INSTANCE = new DawnBalladMaterial();
    @Override
    public int getDurability() {
        return 2555;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10;
    }

    @Override
    public float getAttackDamage() {
        return 0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}

