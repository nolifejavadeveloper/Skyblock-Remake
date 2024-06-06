package net.dungeons.util;

import com.google.common.collect.Lists;
import net.kyori.adventure.text.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stringify {
    public static String formatString(String str)
    {
        return str.replaceAll("&", "§");
    }

    public static List<String> createLore(String... lore)
    {
        List<String> list = new ArrayList<>(lore.length);

        for (String str : lore)
        {
            list.add(formatString(str));
        }

        return list;
    }

    public static Component create(String line)
    {
        return Component.text(formatString(line));
    }
}
