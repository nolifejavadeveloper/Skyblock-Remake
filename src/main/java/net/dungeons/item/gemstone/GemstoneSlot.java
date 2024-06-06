package net.dungeons.item.gemstone;

import javax.annotation.Nullable;

public class GemstoneSlot {
    private GemstoneSlotType type;
    private Gemstone gemstone;
    public GemstoneSlot(GemstoneSlotType type, @Nullable Gemstone applied)
    {
        this.type = type;
        this.gemstone = applied;
    }

    public GemstoneSlotType getSlotType()
    {
        return this.type;
    }

    public void setSlotType(GemstoneSlotType type)
    {
        this.type = type;
    }

    public boolean isApplicable(Gemstone gemstone)
    {
        return this.type.isApplicable(gemstone);
    }

    public Gemstone getGemstone()
    {
        return this.gemstone;
    }

    public void setGemstone(Gemstone gemstone)
    {
        this.gemstone = gemstone;
    }
}
