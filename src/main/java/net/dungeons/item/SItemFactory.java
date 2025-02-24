package net.dungeons.item;

import net.dungeons.player.DungeonsPlayer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SItemFactory {
    public static SItemInstance createInstance(SItem item, DungeonsPlayer player)
    {
        SItemInstance instance = new SItemInstance();

        //Skyblock Data
        instance.name = item.getItemName(player, null);
        instance.itemId = item.getItemID(player, null);
        instance.uuid = item.getUUID();
        instance.unique = item.isUnique(null);
        instance.reforge = item.getReforge(player, null);
        instance.dungeonized = item.isDungeonized(player, null);
        instance.baseItem = item;
        instance.stats = item.getStats(player, null);
        instance.stars = item.getStars(player, null);
        instance.rarity = item.getItemRarity(player, null);
        instance.enchantments = item.getEnchantments(player, null);

        //Minecraft data
        instance.material = item.getMaterial(player, null);
        instance.count = item.getCount(player, null);
        instance.texture = item.getTexture(player, null);

        //misc

        return instance;
    }

    public static SkyblockItem convertItemToSkyblock(ItemStack itemOriginal, DungeonsPlayer player)
    {
        Material material = itemOriginal.getType();

        SItem item = SItemRegistry.getSItem(material.name());

        if (item == null)
            return null;

        SItemInstance instance = createInstance(item, player);

        instance.count = itemOriginal.getAmount();

        return ItemGenerator.generateItem(item, player);
    }
}
