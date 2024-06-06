package net.dungeons.item.gemstone;

public enum GemstoneQuality {

    ROUGH('f'),
    FLAWED('a'),
    FINE('9'),
    FLAWLESS('5'),
    PERFECT('6');

    public final char color;
    GemstoneQuality(char color) {
        this.color = color;
    }



}
