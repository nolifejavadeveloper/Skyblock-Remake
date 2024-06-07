package net.dungeons.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SkyblockItem extends ItemStack {
    //constructor fix
    private SItemInstance item;
    public SkyblockItem(SItemInstance item)
    {
        this.item = item;
    }

    public SItemInstance getSkyblockItem()
    {
        return this.item;
    }

    public void setSkyblockItem(SItemInstance instance)
    {
        this.item = instance;
    }

    @Override
    public int getAmount()
    {
        return item.count;
    }

    @Override
    public void setAmount(int count)
    {
        item.count = count;
    }

    @Override
    public Material getType()
    {
        return item.material;
    }

    @Override
    public void setType(Material type)
    {
        this.item.material = type;
    }
}
