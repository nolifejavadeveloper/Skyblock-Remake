package net.dungeons.item;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.reflections.Reflections;

import java.util.HashMap;

public class SItemRegistry {
    public static final HashMap<String, SItem> ITEM_MAP = new HashMap<>();

    public static void init()
    {
        for (Material material : Material.values())
        {
            String key = material.name();

            SItemBasic basic = new SItemBasic(material, key, Component.translatable(material.translationKey()).asComponent().toString());

            ITEM_MAP.put(key, basic);
        }

        Reflections reflections = new Reflections("net.dungeons.item.impl");

        for (Class<?> clasz : reflections.getSubTypesOf(SItem.class))
        {
            try
            {
                SItem item = (SItem) clasz.newInstance();

                ITEM_MAP.put(item.getItemID(null, null), item);
            }
            catch (Exception e)
            {
                System.out.println("Failed to init SItem!\n" + e.toString());
            }
        }
    }

    public static SItem getSItem(String id)
    {
        if (ITEM_MAP.containsKey(id))
            return ITEM_MAP.get(id);
        return null;
    }
}
