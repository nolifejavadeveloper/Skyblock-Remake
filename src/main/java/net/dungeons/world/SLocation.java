package net.dungeons.world;

public enum SLocation {
    DUNGEON_HUB("Dungeon Hub"),
    DUNGEON("Dungeon"),
    DEV("Developer"),
    NULL("NULL");

    public final String name;

    SLocation(String name)
    {
        this.name = name;
    }

    public static SLocation getDefault()
    {
        return SLocation.NULL;
    }
}
