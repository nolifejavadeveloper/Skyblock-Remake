package net.dungeons.item.enchant.impl;

import net.dungeons.item.enchant.EnchantModifierType;
import net.dungeons.item.enchant.Enchantment;
import net.dungeons.item.enchant.EnchantmentType;
import net.dungeons.item.enchant.IDamageEnchant;

public class SharpnessEnchant extends Enchantment implements IDamageEnchant {
    public SharpnessEnchant(int level)
    {
        super(level);
    }

    @Override
    public boolean isMultiplicative()
    {
        return false;
    }

    @Override
    public double getModifier()
    {
        return this.getLevel() * 0.15;
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }

    @Override
    public EnchantmentType getEnchantmentType() {
        return EnchantmentType.NORMAL;
    }

    @Override
    public EnchantModifierType getModifierType() {
        return EnchantModifierType.DAMAGE;
    }
}
